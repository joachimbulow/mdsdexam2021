package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.ExTwentyOneGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExTwentyOneParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'none'", "'='", "'<'", "'>'", "'<='", "'>='", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'", "'.'", "'if'", "'then'", "'else'", "'new'"
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

    	public void setGrammarAccess(ExTwentyOneGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalExTwentyOne.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:54:1: ( ruleProgram EOF )
            // InternalExTwentyOne.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalExTwentyOne.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalExTwentyOne.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalExTwentyOne.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalExTwentyOne.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalExTwentyOne.g:69:3: ( rule__Program__Group__0 )
            // InternalExTwentyOne.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDeclaration"
    // InternalExTwentyOne.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:79:1: ( ruleDeclaration EOF )
            // InternalExTwentyOne.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalExTwentyOne.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalExTwentyOne.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalExTwentyOne.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalExTwentyOne.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalExTwentyOne.g:94:3: ( rule__Declaration__Alternatives )
            // InternalExTwentyOne.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleParameter"
    // InternalExTwentyOne.g:103:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:104:1: ( ruleParameter EOF )
            // InternalExTwentyOne.g:105:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalExTwentyOne.g:112:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:116:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalExTwentyOne.g:117:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalExTwentyOne.g:117:2: ( ( rule__Parameter__Group__0 ) )
            // InternalExTwentyOne.g:118:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalExTwentyOne.g:119:3: ( rule__Parameter__Group__0 )
            // InternalExTwentyOne.g:119:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleFunction"
    // InternalExTwentyOne.g:128:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:129:1: ( ruleFunction EOF )
            // InternalExTwentyOne.g:130:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalExTwentyOne.g:137:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:141:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalExTwentyOne.g:142:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalExTwentyOne.g:142:2: ( ( rule__Function__Group__0 ) )
            // InternalExTwentyOne.g:143:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalExTwentyOne.g:144:3: ( rule__Function__Group__0 )
            // InternalExTwentyOne.g:144:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleLambda"
    // InternalExTwentyOne.g:153:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:154:1: ( ruleLambda EOF )
            // InternalExTwentyOne.g:155:1: ruleLambda EOF
            {
             before(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getLambdaRule()); 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalExTwentyOne.g:162:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:166:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalExTwentyOne.g:167:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalExTwentyOne.g:167:2: ( ( rule__Lambda__Group__0 ) )
            // InternalExTwentyOne.g:168:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalExTwentyOne.g:169:3: ( rule__Lambda__Group__0 )
            // InternalExTwentyOne.g:169:4: rule__Lambda__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getGroup()); 

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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleInput"
    // InternalExTwentyOne.g:178:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:179:1: ( ruleInput EOF )
            // InternalExTwentyOne.g:180:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalExTwentyOne.g:187:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:191:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalExTwentyOne.g:192:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalExTwentyOne.g:192:2: ( ( rule__Input__Group__0 ) )
            // InternalExTwentyOne.g:193:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalExTwentyOne.g:194:3: ( rule__Input__Group__0 )
            // InternalExTwentyOne.g:194:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleNode"
    // InternalExTwentyOne.g:203:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:204:1: ( ruleNode EOF )
            // InternalExTwentyOne.g:205:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalExTwentyOne.g:212:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:216:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalExTwentyOne.g:217:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalExTwentyOne.g:217:2: ( ( rule__Node__Group__0 ) )
            // InternalExTwentyOne.g:218:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalExTwentyOne.g:219:3: ( rule__Node__Group__0 )
            // InternalExTwentyOne.g:219:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleStream"
    // InternalExTwentyOne.g:228:1: entryRuleStream : ruleStream EOF ;
    public final void entryRuleStream() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:229:1: ( ruleStream EOF )
            // InternalExTwentyOne.g:230:1: ruleStream EOF
            {
             before(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_1);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getStreamRule()); 
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
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // InternalExTwentyOne.g:237:1: ruleStream : ( ( rule__Stream__Group__0 ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:241:2: ( ( ( rule__Stream__Group__0 ) ) )
            // InternalExTwentyOne.g:242:2: ( ( rule__Stream__Group__0 ) )
            {
            // InternalExTwentyOne.g:242:2: ( ( rule__Stream__Group__0 ) )
            // InternalExTwentyOne.g:243:3: ( rule__Stream__Group__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup()); 
            // InternalExTwentyOne.g:244:3: ( rule__Stream__Group__0 )
            // InternalExTwentyOne.g:244:4: rule__Stream__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup()); 

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
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleElement"
    // InternalExTwentyOne.g:253:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:254:1: ( ruleElement EOF )
            // InternalExTwentyOne.g:255:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalExTwentyOne.g:262:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:266:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalExTwentyOne.g:267:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalExTwentyOne.g:267:2: ( ( rule__Element__Alternatives ) )
            // InternalExTwentyOne.g:268:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalExTwentyOne.g:269:3: ( rule__Element__Alternatives )
            // InternalExTwentyOne.g:269:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDataDecl"
    // InternalExTwentyOne.g:278:1: entryRuleDataDecl : ruleDataDecl EOF ;
    public final void entryRuleDataDecl() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:279:1: ( ruleDataDecl EOF )
            // InternalExTwentyOne.g:280:1: ruleDataDecl EOF
            {
             before(grammarAccess.getDataDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleDataDecl();

            state._fsp--;

             after(grammarAccess.getDataDeclRule()); 
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
    // $ANTLR end "entryRuleDataDecl"


    // $ANTLR start "ruleDataDecl"
    // InternalExTwentyOne.g:287:1: ruleDataDecl : ( ( rule__DataDecl__Group__0 ) ) ;
    public final void ruleDataDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:291:2: ( ( ( rule__DataDecl__Group__0 ) ) )
            // InternalExTwentyOne.g:292:2: ( ( rule__DataDecl__Group__0 ) )
            {
            // InternalExTwentyOne.g:292:2: ( ( rule__DataDecl__Group__0 ) )
            // InternalExTwentyOne.g:293:3: ( rule__DataDecl__Group__0 )
            {
             before(grammarAccess.getDataDeclAccess().getGroup()); 
            // InternalExTwentyOne.g:294:3: ( rule__DataDecl__Group__0 )
            // InternalExTwentyOne.g:294:4: rule__DataDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleDataDecl"


    // $ANTLR start "entryRuleType"
    // InternalExTwentyOne.g:303:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:304:1: ( ruleType EOF )
            // InternalExTwentyOne.g:305:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalExTwentyOne.g:312:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:316:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalExTwentyOne.g:317:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalExTwentyOne.g:317:2: ( ( rule__Type__Alternatives ) )
            // InternalExTwentyOne.g:318:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalExTwentyOne.g:319:3: ( rule__Type__Alternatives )
            // InternalExTwentyOne.g:319:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExp"
    // InternalExTwentyOne.g:328:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:329:1: ( ruleExp EOF )
            // InternalExTwentyOne.g:330:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalExTwentyOne.g:337:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:341:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalExTwentyOne.g:342:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalExTwentyOne.g:342:2: ( ( rule__Exp__Group__0 ) )
            // InternalExTwentyOne.g:343:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalExTwentyOne.g:344:3: ( rule__Exp__Group__0 )
            // InternalExTwentyOne.g:344:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleLogicExp"
    // InternalExTwentyOne.g:353:1: entryRuleLogicExp : ruleLogicExp EOF ;
    public final void entryRuleLogicExp() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:354:1: ( ruleLogicExp EOF )
            // InternalExTwentyOne.g:355:1: ruleLogicExp EOF
            {
             before(grammarAccess.getLogicExpRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicExp();

            state._fsp--;

             after(grammarAccess.getLogicExpRule()); 
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
    // $ANTLR end "entryRuleLogicExp"


    // $ANTLR start "ruleLogicExp"
    // InternalExTwentyOne.g:362:1: ruleLogicExp : ( ( rule__LogicExp__Group__0 ) ) ;
    public final void ruleLogicExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:366:2: ( ( ( rule__LogicExp__Group__0 ) ) )
            // InternalExTwentyOne.g:367:2: ( ( rule__LogicExp__Group__0 ) )
            {
            // InternalExTwentyOne.g:367:2: ( ( rule__LogicExp__Group__0 ) )
            // InternalExTwentyOne.g:368:3: ( rule__LogicExp__Group__0 )
            {
             before(grammarAccess.getLogicExpAccess().getGroup()); 
            // InternalExTwentyOne.g:369:3: ( rule__LogicExp__Group__0 )
            // InternalExTwentyOne.g:369:4: rule__LogicExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getGroup()); 

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
    // $ANTLR end "ruleLogicExp"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalExTwentyOne.g:377:1: rule__Declaration__Alternatives : ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:381:1: ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 31:
                {
                alt1=4;
                }
                break;
            case 35:
                {
                alt1=5;
                }
                break;
            case 20:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalExTwentyOne.g:382:2: ( ruleFunction )
                    {
                    // InternalExTwentyOne.g:382:2: ( ruleFunction )
                    // InternalExTwentyOne.g:383:3: ruleFunction
                    {
                     before(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:388:2: ( ruleInput )
                    {
                    // InternalExTwentyOne.g:388:2: ( ruleInput )
                    // InternalExTwentyOne.g:389:3: ruleInput
                    {
                     before(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:394:2: ( ruleNode )
                    {
                    // InternalExTwentyOne.g:394:2: ( ruleNode )
                    // InternalExTwentyOne.g:395:3: ruleNode
                    {
                     before(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:400:2: ( ruleStream )
                    {
                    // InternalExTwentyOne.g:400:2: ( ruleStream )
                    // InternalExTwentyOne.g:401:3: ruleStream
                    {
                     before(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStream();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:406:2: ( ruleDataDecl )
                    {
                    // InternalExTwentyOne.g:406:2: ( ruleDataDecl )
                    // InternalExTwentyOne.g:407:3: ruleDataDecl
                    {
                     before(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDataDecl();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExTwentyOne.g:412:2: ( ruleParameter )
                    {
                    // InternalExTwentyOne.g:412:2: ( ruleParameter )
                    // InternalExTwentyOne.g:413:3: ruleParameter
                    {
                     before(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Node__Alternatives_4"
    // InternalExTwentyOne.g:422:1: rule__Node__Alternatives_4 : ( ( ( rule__Node__FunctionAssignment_4_0 ) ) | ( ( rule__Node__LambdaAssignment_4_1 ) ) );
    public final void rule__Node__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:426:1: ( ( ( rule__Node__FunctionAssignment_4_0 ) ) | ( ( rule__Node__LambdaAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExTwentyOne.g:427:2: ( ( rule__Node__FunctionAssignment_4_0 ) )
                    {
                    // InternalExTwentyOne.g:427:2: ( ( rule__Node__FunctionAssignment_4_0 ) )
                    // InternalExTwentyOne.g:428:3: ( rule__Node__FunctionAssignment_4_0 )
                    {
                     before(grammarAccess.getNodeAccess().getFunctionAssignment_4_0()); 
                    // InternalExTwentyOne.g:429:3: ( rule__Node__FunctionAssignment_4_0 )
                    // InternalExTwentyOne.g:429:4: rule__Node__FunctionAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__FunctionAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getFunctionAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:433:2: ( ( rule__Node__LambdaAssignment_4_1 ) )
                    {
                    // InternalExTwentyOne.g:433:2: ( ( rule__Node__LambdaAssignment_4_1 ) )
                    // InternalExTwentyOne.g:434:3: ( rule__Node__LambdaAssignment_4_1 )
                    {
                     before(grammarAccess.getNodeAccess().getLambdaAssignment_4_1()); 
                    // InternalExTwentyOne.g:435:3: ( rule__Node__LambdaAssignment_4_1 )
                    // InternalExTwentyOne.g:435:4: rule__Node__LambdaAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__LambdaAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getLambdaAssignment_4_1()); 

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
    // $ANTLR end "rule__Node__Alternatives_4"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalExTwentyOne.g:443:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:447:1: ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 34:
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
                    // InternalExTwentyOne.g:448:2: ( ( rule__Element__Group_0__0 ) )
                    {
                    // InternalExTwentyOne.g:448:2: ( ( rule__Element__Group_0__0 ) )
                    // InternalExTwentyOne.g:449:3: ( rule__Element__Group_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_0()); 
                    // InternalExTwentyOne.g:450:3: ( rule__Element__Group_0__0 )
                    // InternalExTwentyOne.g:450:4: rule__Element__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:454:2: ( ( rule__Element__Group_1__0 ) )
                    {
                    // InternalExTwentyOne.g:454:2: ( ( rule__Element__Group_1__0 ) )
                    // InternalExTwentyOne.g:455:3: ( rule__Element__Group_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1()); 
                    // InternalExTwentyOne.g:456:3: ( rule__Element__Group_1__0 )
                    // InternalExTwentyOne.g:456:4: rule__Element__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:460:2: ( ( rule__Element__Group_2__0 ) )
                    {
                    // InternalExTwentyOne.g:460:2: ( ( rule__Element__Group_2__0 ) )
                    // InternalExTwentyOne.g:461:3: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // InternalExTwentyOne.g:462:3: ( rule__Element__Group_2__0 )
                    // InternalExTwentyOne.g:462:4: rule__Element__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Element__Alternatives_1_1"
    // InternalExTwentyOne.g:470:1: rule__Element__Alternatives_1_1 : ( ( ( rule__Element__NodeAssignment_1_1_0 ) ) | ( ruleLambda ) );
    public final void rule__Element__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:474:1: ( ( ( rule__Element__NodeAssignment_1_1_0 ) ) | ( ruleLambda ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExTwentyOne.g:475:2: ( ( rule__Element__NodeAssignment_1_1_0 ) )
                    {
                    // InternalExTwentyOne.g:475:2: ( ( rule__Element__NodeAssignment_1_1_0 ) )
                    // InternalExTwentyOne.g:476:3: ( rule__Element__NodeAssignment_1_1_0 )
                    {
                     before(grammarAccess.getElementAccess().getNodeAssignment_1_1_0()); 
                    // InternalExTwentyOne.g:477:3: ( rule__Element__NodeAssignment_1_1_0 )
                    // InternalExTwentyOne.g:477:4: rule__Element__NodeAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__NodeAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getNodeAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:481:2: ( ruleLambda )
                    {
                    // InternalExTwentyOne.g:481:2: ( ruleLambda )
                    // InternalExTwentyOne.g:482:3: ruleLambda
                    {
                     before(grammarAccess.getElementAccess().getLambdaParserRuleCall_1_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLambda();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLambdaParserRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__Element__Alternatives_1_1"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalExTwentyOne.g:491:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:495:1: ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
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
                    // InternalExTwentyOne.g:496:2: ( 'int' )
                    {
                    // InternalExTwentyOne.g:496:2: ( 'int' )
                    // InternalExTwentyOne.g:497:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:502:2: ( 'string' )
                    {
                    // InternalExTwentyOne.g:502:2: ( 'string' )
                    // InternalExTwentyOne.g:503:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:508:2: ( RULE_ID )
                    {
                    // InternalExTwentyOne.g:508:2: ( RULE_ID )
                    // InternalExTwentyOne.g:509:3: RULE_ID
                    {
                     before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Exp__Alternatives_2_1"
    // InternalExTwentyOne.g:518:1: rule__Exp__Alternatives_2_1 : ( ( ( rule__Exp__Group_2_1_0__0 ) ) | ( ( rule__Exp__Group_2_1_1__0 ) ) | ( ( rule__Exp__Group_2_1_2__0 ) ) | ( ( rule__Exp__Group_2_1_3__0 ) ) | ( ( rule__Exp__Group_2_1_4__0 ) ) | ( ( rule__Exp__Group_2_1_5__0 ) ) | ( ( rule__Exp__Group_2_1_6__0 ) ) | ( 'none' ) | ( ( rule__Exp__Group_2_1_8__0 ) ) | ( ( rule__Exp__Group_2_1_9__0 ) ) );
    public final void rule__Exp__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:522:1: ( ( ( rule__Exp__Group_2_1_0__0 ) ) | ( ( rule__Exp__Group_2_1_1__0 ) ) | ( ( rule__Exp__Group_2_1_2__0 ) ) | ( ( rule__Exp__Group_2_1_3__0 ) ) | ( ( rule__Exp__Group_2_1_4__0 ) ) | ( ( rule__Exp__Group_2_1_5__0 ) ) | ( ( rule__Exp__Group_2_1_6__0 ) ) | ( 'none' ) | ( ( rule__Exp__Group_2_1_8__0 ) ) | ( ( rule__Exp__Group_2_1_9__0 ) ) )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt6=1;
                }
                break;
            case 37:
                {
                alt6=2;
                }
                break;
            case 38:
                {
                alt6=3;
                }
                break;
            case 39:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 40:
                {
                alt6=6;
                }
                break;
            case RULE_ID:
                {
                alt6=7;
                }
                break;
            case 13:
                {
                alt6=8;
                }
                break;
            case 44:
                {
                alt6=9;
                }
                break;
            case 47:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalExTwentyOne.g:523:2: ( ( rule__Exp__Group_2_1_0__0 ) )
                    {
                    // InternalExTwentyOne.g:523:2: ( ( rule__Exp__Group_2_1_0__0 ) )
                    // InternalExTwentyOne.g:524:3: ( rule__Exp__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_2_1_0()); 
                    // InternalExTwentyOne.g:525:3: ( rule__Exp__Group_2_1_0__0 )
                    // InternalExTwentyOne.g:525:4: rule__Exp__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:529:2: ( ( rule__Exp__Group_2_1_1__0 ) )
                    {
                    // InternalExTwentyOne.g:529:2: ( ( rule__Exp__Group_2_1_1__0 ) )
                    // InternalExTwentyOne.g:530:3: ( rule__Exp__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_2_1_1()); 
                    // InternalExTwentyOne.g:531:3: ( rule__Exp__Group_2_1_1__0 )
                    // InternalExTwentyOne.g:531:4: rule__Exp__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_2_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:535:2: ( ( rule__Exp__Group_2_1_2__0 ) )
                    {
                    // InternalExTwentyOne.g:535:2: ( ( rule__Exp__Group_2_1_2__0 ) )
                    // InternalExTwentyOne.g:536:3: ( rule__Exp__Group_2_1_2__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_2_1_2()); 
                    // InternalExTwentyOne.g:537:3: ( rule__Exp__Group_2_1_2__0 )
                    // InternalExTwentyOne.g:537:4: rule__Exp__Group_2_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_2_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_2_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:541:2: ( ( rule__Exp__Group_2_1_3__0 ) )
                    {
                    // InternalExTwentyOne.g:541:2: ( ( rule__Exp__Group_2_1_3__0 ) )
                    // InternalExTwentyOne.g:542:3: ( rule__Exp__Group_2_1_3__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_2_1_3()); 
                    // InternalExTwentyOne.g:543:3: ( rule__Exp__Group_2_1_3__0 )
                    // InternalExTwentyOne.g:543:4: rule__Exp__Group_2_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_2_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_2_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:547:2: ( ( rule__Exp__Group_2_1_4__0 ) )
                    {
                    // InternalExTwentyOne.g:547:2: ( ( rule__Exp__Group_2_1_4__0 ) )
                    // InternalExTwentyOne.g:548:3: ( rule__Exp__Group_2_1_4__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_2_1_4()); 
                    // InternalExTwentyOne.g:549:3: ( rule__Exp__Group_2_1_4__0 )
                    // InternalExTwentyOne.g:549:4: rule__Exp__Group_2_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_2_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_2_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExTwentyOne.g:553:2: ( ( rule__Exp__Group_2_1_5__0 ) )
                    {
                    // InternalExTwentyOne.g:553:2: ( ( rule__Exp__Group_2_1_5__0 ) )
                    // InternalExTwentyOne.g:554:3: ( rule__Exp__Group_2_1_5__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_2_1_5()); 
                    // InternalExTwentyOne.g:555:3: ( rule__Exp__Group_2_1_5__0 )
                    // InternalExTwentyOne.g:555:4: rule__Exp__Group_2_1_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_2_1_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_2_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalExTwentyOne.g:559:2: ( ( rule__Exp__Group_2_1_6__0 ) )
                    {
                    // InternalExTwentyOne.g:559:2: ( ( rule__Exp__Group_2_1_6__0 ) )
                    // InternalExTwentyOne.g:560:3: ( rule__Exp__Group_2_1_6__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_2_1_6()); 
                    // InternalExTwentyOne.g:561:3: ( rule__Exp__Group_2_1_6__0 )
                    // InternalExTwentyOne.g:561:4: rule__Exp__Group_2_1_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_2_1_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_2_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalExTwentyOne.g:565:2: ( 'none' )
                    {
                    // InternalExTwentyOne.g:565:2: ( 'none' )
                    // InternalExTwentyOne.g:566:3: 'none'
                    {
                     before(grammarAccess.getExpAccess().getNoneKeyword_2_1_7()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExpAccess().getNoneKeyword_2_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalExTwentyOne.g:571:2: ( ( rule__Exp__Group_2_1_8__0 ) )
                    {
                    // InternalExTwentyOne.g:571:2: ( ( rule__Exp__Group_2_1_8__0 ) )
                    // InternalExTwentyOne.g:572:3: ( rule__Exp__Group_2_1_8__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_2_1_8()); 
                    // InternalExTwentyOne.g:573:3: ( rule__Exp__Group_2_1_8__0 )
                    // InternalExTwentyOne.g:573:4: rule__Exp__Group_2_1_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_2_1_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_2_1_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalExTwentyOne.g:577:2: ( ( rule__Exp__Group_2_1_9__0 ) )
                    {
                    // InternalExTwentyOne.g:577:2: ( ( rule__Exp__Group_2_1_9__0 ) )
                    // InternalExTwentyOne.g:578:3: ( rule__Exp__Group_2_1_9__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_2_1_9()); 
                    // InternalExTwentyOne.g:579:3: ( rule__Exp__Group_2_1_9__0 )
                    // InternalExTwentyOne.g:579:4: rule__Exp__Group_2_1_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_2_1_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_2_1_9()); 

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
    // $ANTLR end "rule__Exp__Alternatives_2_1"


    // $ANTLR start "rule__LogicExp__Alternatives_1"
    // InternalExTwentyOne.g:587:1: rule__LogicExp__Alternatives_1 : ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__LogicExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:591:1: ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalExTwentyOne.g:592:2: ( '=' )
                    {
                    // InternalExTwentyOne.g:592:2: ( '=' )
                    // InternalExTwentyOne.g:593:3: '='
                    {
                     before(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:598:2: ( '<' )
                    {
                    // InternalExTwentyOne.g:598:2: ( '<' )
                    // InternalExTwentyOne.g:599:3: '<'
                    {
                     before(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:604:2: ( '>' )
                    {
                    // InternalExTwentyOne.g:604:2: ( '>' )
                    // InternalExTwentyOne.g:605:3: '>'
                    {
                     before(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:610:2: ( '<=' )
                    {
                    // InternalExTwentyOne.g:610:2: ( '<=' )
                    // InternalExTwentyOne.g:611:3: '<='
                    {
                     before(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:616:2: ( '>=' )
                    {
                    // InternalExTwentyOne.g:616:2: ( '>=' )
                    // InternalExTwentyOne.g:617:3: '>='
                    {
                     before(grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4()); 

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
    // $ANTLR end "rule__LogicExp__Alternatives_1"


    // $ANTLR start "rule__Program__Group__0"
    // InternalExTwentyOne.g:626:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:630:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalExTwentyOne.g:631:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalExTwentyOne.g:638:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:642:1: ( ( 'program' ) )
            // InternalExTwentyOne.g:643:1: ( 'program' )
            {
            // InternalExTwentyOne.g:643:1: ( 'program' )
            // InternalExTwentyOne.g:644:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalExTwentyOne.g:653:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:657:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalExTwentyOne.g:658:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalExTwentyOne.g:665:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:669:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:670:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:670:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalExTwentyOne.g:671:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:672:2: ( rule__Program__NameAssignment_1 )
            // InternalExTwentyOne.g:672:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalExTwentyOne.g:680:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:684:1: ( rule__Program__Group__2__Impl )
            // InternalExTwentyOne.g:685:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalExTwentyOne.g:691:1: rule__Program__Group__2__Impl : ( ( rule__Program__DeclarationsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:695:1: ( ( ( rule__Program__DeclarationsAssignment_2 )* ) )
            // InternalExTwentyOne.g:696:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            {
            // InternalExTwentyOne.g:696:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            // InternalExTwentyOne.g:697:2: ( rule__Program__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getDeclarationsAssignment_2()); 
            // InternalExTwentyOne.g:698:2: ( rule__Program__DeclarationsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20||LA8_0==22||(LA8_0>=27 && LA8_0<=28)||LA8_0==31||LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExTwentyOne.g:698:3: rule__Program__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getDeclarationsAssignment_2()); 

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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalExTwentyOne.g:707:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:711:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalExTwentyOne.g:712:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalExTwentyOne.g:719:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:723:1: ( ( 'parameter' ) )
            // InternalExTwentyOne.g:724:1: ( 'parameter' )
            {
            // InternalExTwentyOne.g:724:1: ( 'parameter' )
            // InternalExTwentyOne.g:725:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalExTwentyOne.g:734:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:738:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalExTwentyOne.g:739:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalExTwentyOne.g:746:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:750:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:751:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:751:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalExTwentyOne.g:752:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:753:2: ( rule__Parameter__NameAssignment_1 )
            // InternalExTwentyOne.g:753:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalExTwentyOne.g:761:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:765:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalExTwentyOne.g:766:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalExTwentyOne.g:773:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:777:1: ( ( ':' ) )
            // InternalExTwentyOne.g:778:1: ( ':' )
            {
            // InternalExTwentyOne.g:778:1: ( ':' )
            // InternalExTwentyOne.g:779:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalExTwentyOne.g:788:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:792:1: ( rule__Parameter__Group__3__Impl )
            // InternalExTwentyOne.g:793:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalExTwentyOne.g:799:1: rule__Parameter__Group__3__Impl : ( ruleType ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:803:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:804:1: ( ruleType )
            {
            // InternalExTwentyOne.g:804:1: ( ruleType )
            // InternalExTwentyOne.g:805:2: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeParserRuleCall_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalExTwentyOne.g:815:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:819:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalExTwentyOne.g:820:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalExTwentyOne.g:827:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:831:1: ( ( () ) )
            // InternalExTwentyOne.g:832:1: ( () )
            {
            // InternalExTwentyOne.g:832:1: ( () )
            // InternalExTwentyOne.g:833:2: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // InternalExTwentyOne.g:834:2: ()
            // InternalExTwentyOne.g:834:3: 
            {
            }

             after(grammarAccess.getFunctionAccess().getFunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalExTwentyOne.g:842:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:846:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalExTwentyOne.g:847:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalExTwentyOne.g:854:1: rule__Function__Group__1__Impl : ( 'function' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:858:1: ( ( 'function' ) )
            // InternalExTwentyOne.g:859:1: ( 'function' )
            {
            // InternalExTwentyOne.g:859:1: ( 'function' )
            // InternalExTwentyOne.g:860:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 

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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalExTwentyOne.g:869:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:873:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalExTwentyOne.g:874:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalExTwentyOne.g:881:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:885:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:886:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:886:1: ( ( rule__Function__NameAssignment_2 ) )
            // InternalExTwentyOne.g:887:2: ( rule__Function__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:888:2: ( rule__Function__NameAssignment_2 )
            // InternalExTwentyOne.g:888:3: rule__Function__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalExTwentyOne.g:896:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:900:1: ( rule__Function__Group__3__Impl )
            // InternalExTwentyOne.g:901:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__3__Impl();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalExTwentyOne.g:907:1: rule__Function__Group__3__Impl : ( ( rule__Function__LambdaAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:911:1: ( ( ( rule__Function__LambdaAssignment_3 ) ) )
            // InternalExTwentyOne.g:912:1: ( ( rule__Function__LambdaAssignment_3 ) )
            {
            // InternalExTwentyOne.g:912:1: ( ( rule__Function__LambdaAssignment_3 ) )
            // InternalExTwentyOne.g:913:2: ( rule__Function__LambdaAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getLambdaAssignment_3()); 
            // InternalExTwentyOne.g:914:2: ( rule__Function__LambdaAssignment_3 )
            // InternalExTwentyOne.g:914:3: rule__Function__LambdaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__LambdaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getLambdaAssignment_3()); 

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
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Lambda__Group__0"
    // InternalExTwentyOne.g:923:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:927:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalExTwentyOne.g:928:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Lambda__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__1();

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
    // $ANTLR end "rule__Lambda__Group__0"


    // $ANTLR start "rule__Lambda__Group__0__Impl"
    // InternalExTwentyOne.g:935:1: rule__Lambda__Group__0__Impl : ( () ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:939:1: ( ( () ) )
            // InternalExTwentyOne.g:940:1: ( () )
            {
            // InternalExTwentyOne.g:940:1: ( () )
            // InternalExTwentyOne.g:941:2: ()
            {
             before(grammarAccess.getLambdaAccess().getLambdaAction_0()); 
            // InternalExTwentyOne.g:942:2: ()
            // InternalExTwentyOne.g:942:3: 
            {
            }

             after(grammarAccess.getLambdaAccess().getLambdaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__0__Impl"


    // $ANTLR start "rule__Lambda__Group__1"
    // InternalExTwentyOne.g:950:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:954:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalExTwentyOne.g:955:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Lambda__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__2();

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
    // $ANTLR end "rule__Lambda__Group__1"


    // $ANTLR start "rule__Lambda__Group__1__Impl"
    // InternalExTwentyOne.g:962:1: rule__Lambda__Group__1__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:966:1: ( ( '(' ) )
            // InternalExTwentyOne.g:967:1: ( '(' )
            {
            // InternalExTwentyOne.g:967:1: ( '(' )
            // InternalExTwentyOne.g:968:2: '('
            {
             before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Lambda__Group__1__Impl"


    // $ANTLR start "rule__Lambda__Group__2"
    // InternalExTwentyOne.g:977:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:981:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalExTwentyOne.g:982:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Lambda__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__3();

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
    // $ANTLR end "rule__Lambda__Group__2"


    // $ANTLR start "rule__Lambda__Group__2__Impl"
    // InternalExTwentyOne.g:989:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__NameAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:993:1: ( ( ( rule__Lambda__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:994:1: ( ( rule__Lambda__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:994:1: ( ( rule__Lambda__NameAssignment_2 ) )
            // InternalExTwentyOne.g:995:2: ( rule__Lambda__NameAssignment_2 )
            {
             before(grammarAccess.getLambdaAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:996:2: ( rule__Lambda__NameAssignment_2 )
            // InternalExTwentyOne.g:996:3: rule__Lambda__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Lambda__Group__2__Impl"


    // $ANTLR start "rule__Lambda__Group__3"
    // InternalExTwentyOne.g:1004:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1008:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalExTwentyOne.g:1009:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Lambda__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__4();

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
    // $ANTLR end "rule__Lambda__Group__3"


    // $ANTLR start "rule__Lambda__Group__3__Impl"
    // InternalExTwentyOne.g:1016:1: rule__Lambda__Group__3__Impl : ( ':' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1020:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1021:1: ( ':' )
            {
            // InternalExTwentyOne.g:1021:1: ( ':' )
            // InternalExTwentyOne.g:1022:2: ':'
            {
             before(grammarAccess.getLambdaAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Lambda__Group__3__Impl"


    // $ANTLR start "rule__Lambda__Group__4"
    // InternalExTwentyOne.g:1031:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1035:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalExTwentyOne.g:1036:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Lambda__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__5();

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
    // $ANTLR end "rule__Lambda__Group__4"


    // $ANTLR start "rule__Lambda__Group__4__Impl"
    // InternalExTwentyOne.g:1043:1: rule__Lambda__Group__4__Impl : ( ruleType ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1047:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1048:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1048:1: ( ruleType )
            // InternalExTwentyOne.g:1049:2: ruleType
            {
             before(grammarAccess.getLambdaAccess().getTypeParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getTypeParserRuleCall_4()); 

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
    // $ANTLR end "rule__Lambda__Group__4__Impl"


    // $ANTLR start "rule__Lambda__Group__5"
    // InternalExTwentyOne.g:1058:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl rule__Lambda__Group__6 ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1062:1: ( rule__Lambda__Group__5__Impl rule__Lambda__Group__6 )
            // InternalExTwentyOne.g:1063:2: rule__Lambda__Group__5__Impl rule__Lambda__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Lambda__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__6();

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
    // $ANTLR end "rule__Lambda__Group__5"


    // $ANTLR start "rule__Lambda__Group__5__Impl"
    // InternalExTwentyOne.g:1070:1: rule__Lambda__Group__5__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1074:1: ( ( ')' ) )
            // InternalExTwentyOne.g:1075:1: ( ')' )
            {
            // InternalExTwentyOne.g:1075:1: ( ')' )
            // InternalExTwentyOne.g:1076:2: ')'
            {
             before(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Lambda__Group__5__Impl"


    // $ANTLR start "rule__Lambda__Group__6"
    // InternalExTwentyOne.g:1085:1: rule__Lambda__Group__6 : rule__Lambda__Group__6__Impl rule__Lambda__Group__7 ;
    public final void rule__Lambda__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1089:1: ( rule__Lambda__Group__6__Impl rule__Lambda__Group__7 )
            // InternalExTwentyOne.g:1090:2: rule__Lambda__Group__6__Impl rule__Lambda__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Lambda__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__7();

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
    // $ANTLR end "rule__Lambda__Group__6"


    // $ANTLR start "rule__Lambda__Group__6__Impl"
    // InternalExTwentyOne.g:1097:1: rule__Lambda__Group__6__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1101:1: ( ( '{' ) )
            // InternalExTwentyOne.g:1102:1: ( '{' )
            {
            // InternalExTwentyOne.g:1102:1: ( '{' )
            // InternalExTwentyOne.g:1103:2: '{'
            {
             before(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Lambda__Group__6__Impl"


    // $ANTLR start "rule__Lambda__Group__7"
    // InternalExTwentyOne.g:1112:1: rule__Lambda__Group__7 : rule__Lambda__Group__7__Impl rule__Lambda__Group__8 ;
    public final void rule__Lambda__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1116:1: ( rule__Lambda__Group__7__Impl rule__Lambda__Group__8 )
            // InternalExTwentyOne.g:1117:2: rule__Lambda__Group__7__Impl rule__Lambda__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Lambda__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__8();

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
    // $ANTLR end "rule__Lambda__Group__7"


    // $ANTLR start "rule__Lambda__Group__7__Impl"
    // InternalExTwentyOne.g:1124:1: rule__Lambda__Group__7__Impl : ( ( rule__Lambda__LambdaExpAssignment_7 ) ) ;
    public final void rule__Lambda__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1128:1: ( ( ( rule__Lambda__LambdaExpAssignment_7 ) ) )
            // InternalExTwentyOne.g:1129:1: ( ( rule__Lambda__LambdaExpAssignment_7 ) )
            {
            // InternalExTwentyOne.g:1129:1: ( ( rule__Lambda__LambdaExpAssignment_7 ) )
            // InternalExTwentyOne.g:1130:2: ( rule__Lambda__LambdaExpAssignment_7 )
            {
             before(grammarAccess.getLambdaAccess().getLambdaExpAssignment_7()); 
            // InternalExTwentyOne.g:1131:2: ( rule__Lambda__LambdaExpAssignment_7 )
            // InternalExTwentyOne.g:1131:3: rule__Lambda__LambdaExpAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__LambdaExpAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getLambdaExpAssignment_7()); 

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
    // $ANTLR end "rule__Lambda__Group__7__Impl"


    // $ANTLR start "rule__Lambda__Group__8"
    // InternalExTwentyOne.g:1139:1: rule__Lambda__Group__8 : rule__Lambda__Group__8__Impl ;
    public final void rule__Lambda__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1143:1: ( rule__Lambda__Group__8__Impl )
            // InternalExTwentyOne.g:1144:2: rule__Lambda__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__8__Impl();

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
    // $ANTLR end "rule__Lambda__Group__8"


    // $ANTLR start "rule__Lambda__Group__8__Impl"
    // InternalExTwentyOne.g:1150:1: rule__Lambda__Group__8__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1154:1: ( ( '}' ) )
            // InternalExTwentyOne.g:1155:1: ( '}' )
            {
            // InternalExTwentyOne.g:1155:1: ( '}' )
            // InternalExTwentyOne.g:1156:2: '}'
            {
             before(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Lambda__Group__8__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalExTwentyOne.g:1166:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1170:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalExTwentyOne.g:1171:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

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
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalExTwentyOne.g:1178:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1182:1: ( ( () ) )
            // InternalExTwentyOne.g:1183:1: ( () )
            {
            // InternalExTwentyOne.g:1183:1: ( () )
            // InternalExTwentyOne.g:1184:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalExTwentyOne.g:1185:2: ()
            // InternalExTwentyOne.g:1185:3: 
            {
            }

             after(grammarAccess.getInputAccess().getInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalExTwentyOne.g:1193:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1197:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalExTwentyOne.g:1198:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

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
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalExTwentyOne.g:1205:1: rule__Input__Group__1__Impl : ( 'input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1209:1: ( ( 'input' ) )
            // InternalExTwentyOne.g:1210:1: ( 'input' )
            {
            // InternalExTwentyOne.g:1210:1: ( 'input' )
            // InternalExTwentyOne.g:1211:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_1()); 

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
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalExTwentyOne.g:1220:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1224:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalExTwentyOne.g:1225:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

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
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalExTwentyOne.g:1232:1: rule__Input__Group__2__Impl : ( ( rule__Input__NameAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1236:1: ( ( ( rule__Input__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1237:1: ( ( rule__Input__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1237:1: ( ( rule__Input__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1238:2: ( rule__Input__NameAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1239:2: ( rule__Input__NameAssignment_2 )
            // InternalExTwentyOne.g:1239:3: rule__Input__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Input__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalExTwentyOne.g:1247:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1251:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalExTwentyOne.g:1252:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__4();

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
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalExTwentyOne.g:1259:1: rule__Input__Group__3__Impl : ( ':' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1263:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1264:1: ( ':' )
            {
            // InternalExTwentyOne.g:1264:1: ( ':' )
            // InternalExTwentyOne.g:1265:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // InternalExTwentyOne.g:1274:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1278:1: ( rule__Input__Group__4__Impl )
            // InternalExTwentyOne.g:1279:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__4__Impl();

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
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // InternalExTwentyOne.g:1285:1: rule__Input__Group__4__Impl : ( ruleType ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1289:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1290:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1290:1: ( ruleType )
            // InternalExTwentyOne.g:1291:2: ruleType
            {
             before(grammarAccess.getInputAccess().getTypeParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTypeParserRuleCall_4()); 

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
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalExTwentyOne.g:1301:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1305:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalExTwentyOne.g:1306:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

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
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalExTwentyOne.g:1313:1: rule__Node__Group__0__Impl : ( () ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1317:1: ( ( () ) )
            // InternalExTwentyOne.g:1318:1: ( () )
            {
            // InternalExTwentyOne.g:1318:1: ( () )
            // InternalExTwentyOne.g:1319:2: ()
            {
             before(grammarAccess.getNodeAccess().getNodeAction_0()); 
            // InternalExTwentyOne.g:1320:2: ()
            // InternalExTwentyOne.g:1320:3: 
            {
            }

             after(grammarAccess.getNodeAccess().getNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalExTwentyOne.g:1328:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1332:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalExTwentyOne.g:1333:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

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
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalExTwentyOne.g:1340:1: rule__Node__Group__1__Impl : ( 'node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1344:1: ( ( 'node' ) )
            // InternalExTwentyOne.g:1345:1: ( 'node' )
            {
            // InternalExTwentyOne.g:1345:1: ( 'node' )
            // InternalExTwentyOne.g:1346:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_1()); 

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
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalExTwentyOne.g:1355:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1359:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalExTwentyOne.g:1360:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

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
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalExTwentyOne.g:1367:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1371:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1372:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1372:1: ( ( rule__Node__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1373:2: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1374:2: ( rule__Node__NameAssignment_2 )
            // InternalExTwentyOne.g:1374:3: rule__Node__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // InternalExTwentyOne.g:1382:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1386:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalExTwentyOne.g:1387:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__4();

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
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalExTwentyOne.g:1394:1: rule__Node__Group__3__Impl : ( '[' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1398:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1399:1: ( '[' )
            {
            // InternalExTwentyOne.g:1399:1: ( '[' )
            // InternalExTwentyOne.g:1400:2: '['
            {
             before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // InternalExTwentyOne.g:1409:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1413:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // InternalExTwentyOne.g:1414:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__5();

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
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // InternalExTwentyOne.g:1421:1: rule__Node__Group__4__Impl : ( ( rule__Node__Alternatives_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1425:1: ( ( ( rule__Node__Alternatives_4 ) ) )
            // InternalExTwentyOne.g:1426:1: ( ( rule__Node__Alternatives_4 ) )
            {
            // InternalExTwentyOne.g:1426:1: ( ( rule__Node__Alternatives_4 ) )
            // InternalExTwentyOne.g:1427:2: ( rule__Node__Alternatives_4 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_4()); 
            // InternalExTwentyOne.g:1428:2: ( rule__Node__Alternatives_4 )
            // InternalExTwentyOne.g:1428:3: rule__Node__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__5"
    // InternalExTwentyOne.g:1436:1: rule__Node__Group__5 : rule__Node__Group__5__Impl ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1440:1: ( rule__Node__Group__5__Impl )
            // InternalExTwentyOne.g:1441:2: rule__Node__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__5__Impl();

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
    // $ANTLR end "rule__Node__Group__5"


    // $ANTLR start "rule__Node__Group__5__Impl"
    // InternalExTwentyOne.g:1447:1: rule__Node__Group__5__Impl : ( ']' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1451:1: ( ( ']' ) )
            // InternalExTwentyOne.g:1452:1: ( ']' )
            {
            // InternalExTwentyOne.g:1452:1: ( ']' )
            // InternalExTwentyOne.g:1453:2: ']'
            {
             before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Node__Group__5__Impl"


    // $ANTLR start "rule__Stream__Group__0"
    // InternalExTwentyOne.g:1463:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1467:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // InternalExTwentyOne.g:1468:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Stream__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group__1();

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
    // $ANTLR end "rule__Stream__Group__0"


    // $ANTLR start "rule__Stream__Group__0__Impl"
    // InternalExTwentyOne.g:1475:1: rule__Stream__Group__0__Impl : ( () ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1479:1: ( ( () ) )
            // InternalExTwentyOne.g:1480:1: ( () )
            {
            // InternalExTwentyOne.g:1480:1: ( () )
            // InternalExTwentyOne.g:1481:2: ()
            {
             before(grammarAccess.getStreamAccess().getStreamAction_0()); 
            // InternalExTwentyOne.g:1482:2: ()
            // InternalExTwentyOne.g:1482:3: 
            {
            }

             after(grammarAccess.getStreamAccess().getStreamAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__0__Impl"


    // $ANTLR start "rule__Stream__Group__1"
    // InternalExTwentyOne.g:1490:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1494:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // InternalExTwentyOne.g:1495:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Stream__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group__2();

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
    // $ANTLR end "rule__Stream__Group__1"


    // $ANTLR start "rule__Stream__Group__1__Impl"
    // InternalExTwentyOne.g:1502:1: rule__Stream__Group__1__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1506:1: ( ( 'stream' ) )
            // InternalExTwentyOne.g:1507:1: ( 'stream' )
            {
            // InternalExTwentyOne.g:1507:1: ( 'stream' )
            // InternalExTwentyOne.g:1508:2: 'stream'
            {
             before(grammarAccess.getStreamAccess().getStreamKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getStreamKeyword_1()); 

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
    // $ANTLR end "rule__Stream__Group__1__Impl"


    // $ANTLR start "rule__Stream__Group__2"
    // InternalExTwentyOne.g:1517:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1521:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // InternalExTwentyOne.g:1522:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Stream__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group__3();

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
    // $ANTLR end "rule__Stream__Group__2"


    // $ANTLR start "rule__Stream__Group__2__Impl"
    // InternalExTwentyOne.g:1529:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__InputsOrNodesAssignment_2 ) ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1533:1: ( ( ( rule__Stream__InputsOrNodesAssignment_2 ) ) )
            // InternalExTwentyOne.g:1534:1: ( ( rule__Stream__InputsOrNodesAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1534:1: ( ( rule__Stream__InputsOrNodesAssignment_2 ) )
            // InternalExTwentyOne.g:1535:2: ( rule__Stream__InputsOrNodesAssignment_2 )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_2()); 
            // InternalExTwentyOne.g:1536:2: ( rule__Stream__InputsOrNodesAssignment_2 )
            // InternalExTwentyOne.g:1536:3: rule__Stream__InputsOrNodesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Stream__InputsOrNodesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_2()); 

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
    // $ANTLR end "rule__Stream__Group__2__Impl"


    // $ANTLR start "rule__Stream__Group__3"
    // InternalExTwentyOne.g:1544:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl rule__Stream__Group__4 ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1548:1: ( rule__Stream__Group__3__Impl rule__Stream__Group__4 )
            // InternalExTwentyOne.g:1549:2: rule__Stream__Group__3__Impl rule__Stream__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Stream__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group__4();

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
    // $ANTLR end "rule__Stream__Group__3"


    // $ANTLR start "rule__Stream__Group__3__Impl"
    // InternalExTwentyOne.g:1556:1: rule__Stream__Group__3__Impl : ( ( rule__Stream__Group_3__0 )* ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1560:1: ( ( ( rule__Stream__Group_3__0 )* ) )
            // InternalExTwentyOne.g:1561:1: ( ( rule__Stream__Group_3__0 )* )
            {
            // InternalExTwentyOne.g:1561:1: ( ( rule__Stream__Group_3__0 )* )
            // InternalExTwentyOne.g:1562:2: ( rule__Stream__Group_3__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalExTwentyOne.g:1563:2: ( rule__Stream__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExTwentyOne.g:1563:3: rule__Stream__Group_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Stream__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Stream__Group__3__Impl"


    // $ANTLR start "rule__Stream__Group__4"
    // InternalExTwentyOne.g:1571:1: rule__Stream__Group__4 : rule__Stream__Group__4__Impl ;
    public final void rule__Stream__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1575:1: ( rule__Stream__Group__4__Impl )
            // InternalExTwentyOne.g:1576:2: rule__Stream__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group__4__Impl();

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
    // $ANTLR end "rule__Stream__Group__4"


    // $ANTLR start "rule__Stream__Group__4__Impl"
    // InternalExTwentyOne.g:1582:1: rule__Stream__Group__4__Impl : ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) ) ;
    public final void rule__Stream__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1586:1: ( ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) ) )
            // InternalExTwentyOne.g:1587:1: ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) )
            {
            // InternalExTwentyOne.g:1587:1: ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) )
            // InternalExTwentyOne.g:1588:2: ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* )
            {
            // InternalExTwentyOne.g:1588:2: ( ( rule__Stream__Group_4__0 ) )
            // InternalExTwentyOne.g:1589:3: ( rule__Stream__Group_4__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_4()); 
            // InternalExTwentyOne.g:1590:3: ( rule__Stream__Group_4__0 )
            // InternalExTwentyOne.g:1590:4: rule__Stream__Group_4__0
            {
            pushFollow(FOLLOW_21);
            rule__Stream__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_4()); 

            }

            // InternalExTwentyOne.g:1593:2: ( ( rule__Stream__Group_4__0 )* )
            // InternalExTwentyOne.g:1594:3: ( rule__Stream__Group_4__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_4()); 
            // InternalExTwentyOne.g:1595:3: ( rule__Stream__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExTwentyOne.g:1595:4: rule__Stream__Group_4__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Stream__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_4()); 

            }


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
    // $ANTLR end "rule__Stream__Group__4__Impl"


    // $ANTLR start "rule__Stream__Group_3__0"
    // InternalExTwentyOne.g:1605:1: rule__Stream__Group_3__0 : rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 ;
    public final void rule__Stream__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1609:1: ( rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 )
            // InternalExTwentyOne.g:1610:2: rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Stream__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_3__1();

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
    // $ANTLR end "rule__Stream__Group_3__0"


    // $ANTLR start "rule__Stream__Group_3__0__Impl"
    // InternalExTwentyOne.g:1617:1: rule__Stream__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1621:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1622:1: ( ',' )
            {
            // InternalExTwentyOne.g:1622:1: ( ',' )
            // InternalExTwentyOne.g:1623:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Stream__Group_3__0__Impl"


    // $ANTLR start "rule__Stream__Group_3__1"
    // InternalExTwentyOne.g:1632:1: rule__Stream__Group_3__1 : rule__Stream__Group_3__1__Impl ;
    public final void rule__Stream__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1636:1: ( rule__Stream__Group_3__1__Impl )
            // InternalExTwentyOne.g:1637:2: rule__Stream__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_3__1__Impl();

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
    // $ANTLR end "rule__Stream__Group_3__1"


    // $ANTLR start "rule__Stream__Group_3__1__Impl"
    // InternalExTwentyOne.g:1643:1: rule__Stream__Group_3__1__Impl : ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) ) ;
    public final void rule__Stream__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1647:1: ( ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) ) )
            // InternalExTwentyOne.g:1648:1: ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) )
            {
            // InternalExTwentyOne.g:1648:1: ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) )
            // InternalExTwentyOne.g:1649:2: ( rule__Stream__InputsOrNodesAssignment_3_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_3_1()); 
            // InternalExTwentyOne.g:1650:2: ( rule__Stream__InputsOrNodesAssignment_3_1 )
            // InternalExTwentyOne.g:1650:3: rule__Stream__InputsOrNodesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__InputsOrNodesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_3_1()); 

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
    // $ANTLR end "rule__Stream__Group_3__1__Impl"


    // $ANTLR start "rule__Stream__Group_4__0"
    // InternalExTwentyOne.g:1659:1: rule__Stream__Group_4__0 : rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1 ;
    public final void rule__Stream__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1663:1: ( rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1 )
            // InternalExTwentyOne.g:1664:2: rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__Stream__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_4__1();

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
    // $ANTLR end "rule__Stream__Group_4__0"


    // $ANTLR start "rule__Stream__Group_4__0__Impl"
    // InternalExTwentyOne.g:1671:1: rule__Stream__Group_4__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1675:1: ( ( 'to' ) )
            // InternalExTwentyOne.g:1676:1: ( 'to' )
            {
            // InternalExTwentyOne.g:1676:1: ( 'to' )
            // InternalExTwentyOne.g:1677:2: 'to'
            {
             before(grammarAccess.getStreamAccess().getToKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getToKeyword_4_0()); 

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
    // $ANTLR end "rule__Stream__Group_4__0__Impl"


    // $ANTLR start "rule__Stream__Group_4__1"
    // InternalExTwentyOne.g:1686:1: rule__Stream__Group_4__1 : rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2 ;
    public final void rule__Stream__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1690:1: ( rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2 )
            // InternalExTwentyOne.g:1691:2: rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__Stream__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_4__2();

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
    // $ANTLR end "rule__Stream__Group_4__1"


    // $ANTLR start "rule__Stream__Group_4__1__Impl"
    // InternalExTwentyOne.g:1698:1: rule__Stream__Group_4__1__Impl : ( ( rule__Stream__ElementsAssignment_4_1 ) ) ;
    public final void rule__Stream__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1702:1: ( ( ( rule__Stream__ElementsAssignment_4_1 ) ) )
            // InternalExTwentyOne.g:1703:1: ( ( rule__Stream__ElementsAssignment_4_1 ) )
            {
            // InternalExTwentyOne.g:1703:1: ( ( rule__Stream__ElementsAssignment_4_1 ) )
            // InternalExTwentyOne.g:1704:2: ( rule__Stream__ElementsAssignment_4_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_4_1()); 
            // InternalExTwentyOne.g:1705:2: ( rule__Stream__ElementsAssignment_4_1 )
            // InternalExTwentyOne.g:1705:3: rule__Stream__ElementsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__ElementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getElementsAssignment_4_1()); 

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
    // $ANTLR end "rule__Stream__Group_4__1__Impl"


    // $ANTLR start "rule__Stream__Group_4__2"
    // InternalExTwentyOne.g:1713:1: rule__Stream__Group_4__2 : rule__Stream__Group_4__2__Impl ;
    public final void rule__Stream__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1717:1: ( rule__Stream__Group_4__2__Impl )
            // InternalExTwentyOne.g:1718:2: rule__Stream__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_4__2__Impl();

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
    // $ANTLR end "rule__Stream__Group_4__2"


    // $ANTLR start "rule__Stream__Group_4__2__Impl"
    // InternalExTwentyOne.g:1724:1: rule__Stream__Group_4__2__Impl : ( ( rule__Stream__Group_4_2__0 )* ) ;
    public final void rule__Stream__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1728:1: ( ( ( rule__Stream__Group_4_2__0 )* ) )
            // InternalExTwentyOne.g:1729:1: ( ( rule__Stream__Group_4_2__0 )* )
            {
            // InternalExTwentyOne.g:1729:1: ( ( rule__Stream__Group_4_2__0 )* )
            // InternalExTwentyOne.g:1730:2: ( rule__Stream__Group_4_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_4_2()); 
            // InternalExTwentyOne.g:1731:2: ( rule__Stream__Group_4_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExTwentyOne.g:1731:3: rule__Stream__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Stream__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Stream__Group_4__2__Impl"


    // $ANTLR start "rule__Stream__Group_4_2__0"
    // InternalExTwentyOne.g:1740:1: rule__Stream__Group_4_2__0 : rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1 ;
    public final void rule__Stream__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1744:1: ( rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1 )
            // InternalExTwentyOne.g:1745:2: rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Stream__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_4_2__1();

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
    // $ANTLR end "rule__Stream__Group_4_2__0"


    // $ANTLR start "rule__Stream__Group_4_2__0__Impl"
    // InternalExTwentyOne.g:1752:1: rule__Stream__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1756:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1757:1: ( ',' )
            {
            // InternalExTwentyOne.g:1757:1: ( ',' )
            // InternalExTwentyOne.g:1758:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_4_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Stream__Group_4_2__0__Impl"


    // $ANTLR start "rule__Stream__Group_4_2__1"
    // InternalExTwentyOne.g:1767:1: rule__Stream__Group_4_2__1 : rule__Stream__Group_4_2__1__Impl ;
    public final void rule__Stream__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1771:1: ( rule__Stream__Group_4_2__1__Impl )
            // InternalExTwentyOne.g:1772:2: rule__Stream__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Stream__Group_4_2__1"


    // $ANTLR start "rule__Stream__Group_4_2__1__Impl"
    // InternalExTwentyOne.g:1778:1: rule__Stream__Group_4_2__1__Impl : ( ( rule__Stream__ElementsAssignment_4_2_1 ) ) ;
    public final void rule__Stream__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1782:1: ( ( ( rule__Stream__ElementsAssignment_4_2_1 ) ) )
            // InternalExTwentyOne.g:1783:1: ( ( rule__Stream__ElementsAssignment_4_2_1 ) )
            {
            // InternalExTwentyOne.g:1783:1: ( ( rule__Stream__ElementsAssignment_4_2_1 ) )
            // InternalExTwentyOne.g:1784:2: ( rule__Stream__ElementsAssignment_4_2_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_4_2_1()); 
            // InternalExTwentyOne.g:1785:2: ( rule__Stream__ElementsAssignment_4_2_1 )
            // InternalExTwentyOne.g:1785:3: rule__Stream__ElementsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__ElementsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getElementsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Stream__Group_4_2__1__Impl"


    // $ANTLR start "rule__Element__Group_0__0"
    // InternalExTwentyOne.g:1794:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1798:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalExTwentyOne.g:1799:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Element__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_0__1();

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
    // $ANTLR end "rule__Element__Group_0__0"


    // $ANTLR start "rule__Element__Group_0__0__Impl"
    // InternalExTwentyOne.g:1806:1: rule__Element__Group_0__0__Impl : ( () ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1810:1: ( ( () ) )
            // InternalExTwentyOne.g:1811:1: ( () )
            {
            // InternalExTwentyOne.g:1811:1: ( () )
            // InternalExTwentyOne.g:1812:2: ()
            {
             before(grammarAccess.getElementAccess().getElementAction_0_0()); 
            // InternalExTwentyOne.g:1813:2: ()
            // InternalExTwentyOne.g:1813:3: 
            {
            }

             after(grammarAccess.getElementAccess().getElementAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_0__0__Impl"


    // $ANTLR start "rule__Element__Group_0__1"
    // InternalExTwentyOne.g:1821:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1825:1: ( rule__Element__Group_0__1__Impl )
            // InternalExTwentyOne.g:1826:2: rule__Element__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_0__1__Impl();

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
    // $ANTLR end "rule__Element__Group_0__1"


    // $ANTLR start "rule__Element__Group_0__1__Impl"
    // InternalExTwentyOne.g:1832:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__ElementAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1836:1: ( ( ( rule__Element__ElementAssignment_0_1 ) ) )
            // InternalExTwentyOne.g:1837:1: ( ( rule__Element__ElementAssignment_0_1 ) )
            {
            // InternalExTwentyOne.g:1837:1: ( ( rule__Element__ElementAssignment_0_1 ) )
            // InternalExTwentyOne.g:1838:2: ( rule__Element__ElementAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getElementAssignment_0_1()); 
            // InternalExTwentyOne.g:1839:2: ( rule__Element__ElementAssignment_0_1 )
            // InternalExTwentyOne.g:1839:3: rule__Element__ElementAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__ElementAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getElementAssignment_0_1()); 

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
    // $ANTLR end "rule__Element__Group_0__1__Impl"


    // $ANTLR start "rule__Element__Group_1__0"
    // InternalExTwentyOne.g:1848:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1852:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalExTwentyOne.g:1853:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Element__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_1__1();

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
    // $ANTLR end "rule__Element__Group_1__0"


    // $ANTLR start "rule__Element__Group_1__0__Impl"
    // InternalExTwentyOne.g:1860:1: rule__Element__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1864:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1865:1: ( '[' )
            {
            // InternalExTwentyOne.g:1865:1: ( '[' )
            // InternalExTwentyOne.g:1866:2: '['
            {
             before(grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Element__Group_1__0__Impl"


    // $ANTLR start "rule__Element__Group_1__1"
    // InternalExTwentyOne.g:1875:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl rule__Element__Group_1__2 ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1879:1: ( rule__Element__Group_1__1__Impl rule__Element__Group_1__2 )
            // InternalExTwentyOne.g:1880:2: rule__Element__Group_1__1__Impl rule__Element__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Element__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_1__2();

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
    // $ANTLR end "rule__Element__Group_1__1"


    // $ANTLR start "rule__Element__Group_1__1__Impl"
    // InternalExTwentyOne.g:1887:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__Alternatives_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1891:1: ( ( ( rule__Element__Alternatives_1_1 ) ) )
            // InternalExTwentyOne.g:1892:1: ( ( rule__Element__Alternatives_1_1 ) )
            {
            // InternalExTwentyOne.g:1892:1: ( ( rule__Element__Alternatives_1_1 ) )
            // InternalExTwentyOne.g:1893:2: ( rule__Element__Alternatives_1_1 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_1_1()); 
            // InternalExTwentyOne.g:1894:2: ( rule__Element__Alternatives_1_1 )
            // InternalExTwentyOne.g:1894:3: rule__Element__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__Element__Group_1__1__Impl"


    // $ANTLR start "rule__Element__Group_1__2"
    // InternalExTwentyOne.g:1902:1: rule__Element__Group_1__2 : rule__Element__Group_1__2__Impl ;
    public final void rule__Element__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1906:1: ( rule__Element__Group_1__2__Impl )
            // InternalExTwentyOne.g:1907:2: rule__Element__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_1__2__Impl();

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
    // $ANTLR end "rule__Element__Group_1__2"


    // $ANTLR start "rule__Element__Group_1__2__Impl"
    // InternalExTwentyOne.g:1913:1: rule__Element__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Element__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1917:1: ( ( ']' ) )
            // InternalExTwentyOne.g:1918:1: ( ']' )
            {
            // InternalExTwentyOne.g:1918:1: ( ']' )
            // InternalExTwentyOne.g:1919:2: ']'
            {
             before(grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__Element__Group_1__2__Impl"


    // $ANTLR start "rule__Element__Group_2__0"
    // InternalExTwentyOne.g:1929:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1933:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalExTwentyOne.g:1934:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Element__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_2__1();

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
    // $ANTLR end "rule__Element__Group_2__0"


    // $ANTLR start "rule__Element__Group_2__0__Impl"
    // InternalExTwentyOne.g:1941:1: rule__Element__Group_2__0__Impl : ( 'output' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1945:1: ( ( 'output' ) )
            // InternalExTwentyOne.g:1946:1: ( 'output' )
            {
            // InternalExTwentyOne.g:1946:1: ( 'output' )
            // InternalExTwentyOne.g:1947:2: 'output'
            {
             before(grammarAccess.getElementAccess().getOutputKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getOutputKeyword_2_0()); 

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
    // $ANTLR end "rule__Element__Group_2__0__Impl"


    // $ANTLR start "rule__Element__Group_2__1"
    // InternalExTwentyOne.g:1956:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1960:1: ( rule__Element__Group_2__1__Impl )
            // InternalExTwentyOne.g:1961:2: rule__Element__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_2__1__Impl();

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
    // $ANTLR end "rule__Element__Group_2__1"


    // $ANTLR start "rule__Element__Group_2__1__Impl"
    // InternalExTwentyOne.g:1967:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__OutputAssignment_2_1 ) ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1971:1: ( ( ( rule__Element__OutputAssignment_2_1 ) ) )
            // InternalExTwentyOne.g:1972:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            {
            // InternalExTwentyOne.g:1972:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            // InternalExTwentyOne.g:1973:2: ( rule__Element__OutputAssignment_2_1 )
            {
             before(grammarAccess.getElementAccess().getOutputAssignment_2_1()); 
            // InternalExTwentyOne.g:1974:2: ( rule__Element__OutputAssignment_2_1 )
            // InternalExTwentyOne.g:1974:3: rule__Element__OutputAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__OutputAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getOutputAssignment_2_1()); 

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
    // $ANTLR end "rule__Element__Group_2__1__Impl"


    // $ANTLR start "rule__DataDecl__Group__0"
    // InternalExTwentyOne.g:1983:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1987:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalExTwentyOne.g:1988:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__DataDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__1();

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
    // $ANTLR end "rule__DataDecl__Group__0"


    // $ANTLR start "rule__DataDecl__Group__0__Impl"
    // InternalExTwentyOne.g:1995:1: rule__DataDecl__Group__0__Impl : ( () ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1999:1: ( ( () ) )
            // InternalExTwentyOne.g:2000:1: ( () )
            {
            // InternalExTwentyOne.g:2000:1: ( () )
            // InternalExTwentyOne.g:2001:2: ()
            {
             before(grammarAccess.getDataDeclAccess().getDataDeclAction_0()); 
            // InternalExTwentyOne.g:2002:2: ()
            // InternalExTwentyOne.g:2002:3: 
            {
            }

             after(grammarAccess.getDataDeclAccess().getDataDeclAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__0__Impl"


    // $ANTLR start "rule__DataDecl__Group__1"
    // InternalExTwentyOne.g:2010:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2014:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalExTwentyOne.g:2015:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DataDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__2();

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
    // $ANTLR end "rule__DataDecl__Group__1"


    // $ANTLR start "rule__DataDecl__Group__1__Impl"
    // InternalExTwentyOne.g:2022:1: rule__DataDecl__Group__1__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2026:1: ( ( 'data' ) )
            // InternalExTwentyOne.g:2027:1: ( 'data' )
            {
            // InternalExTwentyOne.g:2027:1: ( 'data' )
            // InternalExTwentyOne.g:2028:2: 'data'
            {
             before(grammarAccess.getDataDeclAccess().getDataKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getDataKeyword_1()); 

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
    // $ANTLR end "rule__DataDecl__Group__1__Impl"


    // $ANTLR start "rule__DataDecl__Group__2"
    // InternalExTwentyOne.g:2037:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2041:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalExTwentyOne.g:2042:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__DataDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__3();

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
    // $ANTLR end "rule__DataDecl__Group__2"


    // $ANTLR start "rule__DataDecl__Group__2__Impl"
    // InternalExTwentyOne.g:2049:1: rule__DataDecl__Group__2__Impl : ( ( rule__DataDecl__NameAssignment_2 ) ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2053:1: ( ( ( rule__DataDecl__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:2054:1: ( ( rule__DataDecl__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:2054:1: ( ( rule__DataDecl__NameAssignment_2 ) )
            // InternalExTwentyOne.g:2055:2: ( rule__DataDecl__NameAssignment_2 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:2056:2: ( rule__DataDecl__NameAssignment_2 )
            // InternalExTwentyOne.g:2056:3: rule__DataDecl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DataDecl__Group__2__Impl"


    // $ANTLR start "rule__DataDecl__Group__3"
    // InternalExTwentyOne.g:2064:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2068:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalExTwentyOne.g:2069:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__DataDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__4();

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
    // $ANTLR end "rule__DataDecl__Group__3"


    // $ANTLR start "rule__DataDecl__Group__3__Impl"
    // InternalExTwentyOne.g:2076:1: rule__DataDecl__Group__3__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2080:1: ( ( '{' ) )
            // InternalExTwentyOne.g:2081:1: ( '{' )
            {
            // InternalExTwentyOne.g:2081:1: ( '{' )
            // InternalExTwentyOne.g:2082:2: '{'
            {
             before(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DataDecl__Group__3__Impl"


    // $ANTLR start "rule__DataDecl__Group__4"
    // InternalExTwentyOne.g:2091:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2095:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalExTwentyOne.g:2096:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DataDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__5();

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
    // $ANTLR end "rule__DataDecl__Group__4"


    // $ANTLR start "rule__DataDecl__Group__4__Impl"
    // InternalExTwentyOne.g:2103:1: rule__DataDecl__Group__4__Impl : ( ( rule__DataDecl__DataAssignment_4 ) ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2107:1: ( ( ( rule__DataDecl__DataAssignment_4 ) ) )
            // InternalExTwentyOne.g:2108:1: ( ( rule__DataDecl__DataAssignment_4 ) )
            {
            // InternalExTwentyOne.g:2108:1: ( ( rule__DataDecl__DataAssignment_4 ) )
            // InternalExTwentyOne.g:2109:2: ( rule__DataDecl__DataAssignment_4 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_4()); 
            // InternalExTwentyOne.g:2110:2: ( rule__DataDecl__DataAssignment_4 )
            // InternalExTwentyOne.g:2110:3: rule__DataDecl__DataAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__DataAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getDataAssignment_4()); 

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
    // $ANTLR end "rule__DataDecl__Group__4__Impl"


    // $ANTLR start "rule__DataDecl__Group__5"
    // InternalExTwentyOne.g:2118:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2122:1: ( rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 )
            // InternalExTwentyOne.g:2123:2: rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__DataDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__6();

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
    // $ANTLR end "rule__DataDecl__Group__5"


    // $ANTLR start "rule__DataDecl__Group__5__Impl"
    // InternalExTwentyOne.g:2130:1: rule__DataDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2134:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2135:1: ( ':' )
            {
            // InternalExTwentyOne.g:2135:1: ( ':' )
            // InternalExTwentyOne.g:2136:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__DataDecl__Group__5__Impl"


    // $ANTLR start "rule__DataDecl__Group__6"
    // InternalExTwentyOne.g:2145:1: rule__DataDecl__Group__6 : rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 ;
    public final void rule__DataDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2149:1: ( rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 )
            // InternalExTwentyOne.g:2150:2: rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__DataDecl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__7();

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
    // $ANTLR end "rule__DataDecl__Group__6"


    // $ANTLR start "rule__DataDecl__Group__6__Impl"
    // InternalExTwentyOne.g:2157:1: rule__DataDecl__Group__6__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2161:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2162:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2162:1: ( ruleType )
            // InternalExTwentyOne.g:2163:2: ruleType
            {
             before(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_6()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_6()); 

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
    // $ANTLR end "rule__DataDecl__Group__6__Impl"


    // $ANTLR start "rule__DataDecl__Group__7"
    // InternalExTwentyOne.g:2172:1: rule__DataDecl__Group__7 : rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8 ;
    public final void rule__DataDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2176:1: ( rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8 )
            // InternalExTwentyOne.g:2177:2: rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__DataDecl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__8();

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
    // $ANTLR end "rule__DataDecl__Group__7"


    // $ANTLR start "rule__DataDecl__Group__7__Impl"
    // InternalExTwentyOne.g:2184:1: rule__DataDecl__Group__7__Impl : ( ( rule__DataDecl__Group_7__0 )* ) ;
    public final void rule__DataDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2188:1: ( ( ( rule__DataDecl__Group_7__0 )* ) )
            // InternalExTwentyOne.g:2189:1: ( ( rule__DataDecl__Group_7__0 )* )
            {
            // InternalExTwentyOne.g:2189:1: ( ( rule__DataDecl__Group_7__0 )* )
            // InternalExTwentyOne.g:2190:2: ( rule__DataDecl__Group_7__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_7()); 
            // InternalExTwentyOne.g:2191:2: ( rule__DataDecl__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExTwentyOne.g:2191:3: rule__DataDecl__Group_7__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DataDecl__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDataDeclAccess().getGroup_7()); 

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
    // $ANTLR end "rule__DataDecl__Group__7__Impl"


    // $ANTLR start "rule__DataDecl__Group__8"
    // InternalExTwentyOne.g:2199:1: rule__DataDecl__Group__8 : rule__DataDecl__Group__8__Impl ;
    public final void rule__DataDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2203:1: ( rule__DataDecl__Group__8__Impl )
            // InternalExTwentyOne.g:2204:2: rule__DataDecl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__8__Impl();

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
    // $ANTLR end "rule__DataDecl__Group__8"


    // $ANTLR start "rule__DataDecl__Group__8__Impl"
    // InternalExTwentyOne.g:2210:1: rule__DataDecl__Group__8__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2214:1: ( ( '}' ) )
            // InternalExTwentyOne.g:2215:1: ( '}' )
            {
            // InternalExTwentyOne.g:2215:1: ( '}' )
            // InternalExTwentyOne.g:2216:2: '}'
            {
             before(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__DataDecl__Group__8__Impl"


    // $ANTLR start "rule__DataDecl__Group_7__0"
    // InternalExTwentyOne.g:2226:1: rule__DataDecl__Group_7__0 : rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1 ;
    public final void rule__DataDecl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2230:1: ( rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1 )
            // InternalExTwentyOne.g:2231:2: rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__DataDecl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_7__1();

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
    // $ANTLR end "rule__DataDecl__Group_7__0"


    // $ANTLR start "rule__DataDecl__Group_7__0__Impl"
    // InternalExTwentyOne.g:2238:1: rule__DataDecl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2242:1: ( ( ',' ) )
            // InternalExTwentyOne.g:2243:1: ( ',' )
            {
            // InternalExTwentyOne.g:2243:1: ( ',' )
            // InternalExTwentyOne.g:2244:2: ','
            {
             before(grammarAccess.getDataDeclAccess().getCommaKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__DataDecl__Group_7__0__Impl"


    // $ANTLR start "rule__DataDecl__Group_7__1"
    // InternalExTwentyOne.g:2253:1: rule__DataDecl__Group_7__1 : rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2 ;
    public final void rule__DataDecl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2257:1: ( rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2 )
            // InternalExTwentyOne.g:2258:2: rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2
            {
            pushFollow(FOLLOW_6);
            rule__DataDecl__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_7__2();

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
    // $ANTLR end "rule__DataDecl__Group_7__1"


    // $ANTLR start "rule__DataDecl__Group_7__1__Impl"
    // InternalExTwentyOne.g:2265:1: rule__DataDecl__Group_7__1__Impl : ( ( rule__DataDecl__DataAssignment_7_1 ) ) ;
    public final void rule__DataDecl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2269:1: ( ( ( rule__DataDecl__DataAssignment_7_1 ) ) )
            // InternalExTwentyOne.g:2270:1: ( ( rule__DataDecl__DataAssignment_7_1 ) )
            {
            // InternalExTwentyOne.g:2270:1: ( ( rule__DataDecl__DataAssignment_7_1 ) )
            // InternalExTwentyOne.g:2271:2: ( rule__DataDecl__DataAssignment_7_1 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_7_1()); 
            // InternalExTwentyOne.g:2272:2: ( rule__DataDecl__DataAssignment_7_1 )
            // InternalExTwentyOne.g:2272:3: rule__DataDecl__DataAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__DataAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getDataAssignment_7_1()); 

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
    // $ANTLR end "rule__DataDecl__Group_7__1__Impl"


    // $ANTLR start "rule__DataDecl__Group_7__2"
    // InternalExTwentyOne.g:2280:1: rule__DataDecl__Group_7__2 : rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3 ;
    public final void rule__DataDecl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2284:1: ( rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3 )
            // InternalExTwentyOne.g:2285:2: rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__DataDecl__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_7__3();

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
    // $ANTLR end "rule__DataDecl__Group_7__2"


    // $ANTLR start "rule__DataDecl__Group_7__2__Impl"
    // InternalExTwentyOne.g:2292:1: rule__DataDecl__Group_7__2__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2296:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2297:1: ( ':' )
            {
            // InternalExTwentyOne.g:2297:1: ( ':' )
            // InternalExTwentyOne.g:2298:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_7_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getColonKeyword_7_2()); 

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
    // $ANTLR end "rule__DataDecl__Group_7__2__Impl"


    // $ANTLR start "rule__DataDecl__Group_7__3"
    // InternalExTwentyOne.g:2307:1: rule__DataDecl__Group_7__3 : rule__DataDecl__Group_7__3__Impl ;
    public final void rule__DataDecl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2311:1: ( rule__DataDecl__Group_7__3__Impl )
            // InternalExTwentyOne.g:2312:2: rule__DataDecl__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_7__3__Impl();

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
    // $ANTLR end "rule__DataDecl__Group_7__3"


    // $ANTLR start "rule__DataDecl__Group_7__3__Impl"
    // InternalExTwentyOne.g:2318:1: rule__DataDecl__Group_7__3__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2322:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2323:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2323:1: ( ruleType )
            // InternalExTwentyOne.g:2324:2: ruleType
            {
             before(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_7_3()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_7_3()); 

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
    // $ANTLR end "rule__DataDecl__Group_7__3__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalExTwentyOne.g:2334:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2338:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalExTwentyOne.g:2339:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

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
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalExTwentyOne.g:2346:1: rule__Exp__Group__0__Impl : ( () ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2350:1: ( ( () ) )
            // InternalExTwentyOne.g:2351:1: ( () )
            {
            // InternalExTwentyOne.g:2351:1: ( () )
            // InternalExTwentyOne.g:2352:2: ()
            {
             before(grammarAccess.getExpAccess().getExpAction_0()); 
            // InternalExTwentyOne.g:2353:2: ()
            // InternalExTwentyOne.g:2353:3: 
            {
            }

             after(grammarAccess.getExpAccess().getExpAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalExTwentyOne.g:2361:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl rule__Exp__Group__2 ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2365:1: ( rule__Exp__Group__1__Impl rule__Exp__Group__2 )
            // InternalExTwentyOne.g:2366:2: rule__Exp__Group__1__Impl rule__Exp__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__2();

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
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalExTwentyOne.g:2373:1: rule__Exp__Group__1__Impl : ( ruleType ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2377:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2378:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2378:1: ( ruleType )
            // InternalExTwentyOne.g:2379:2: ruleType
            {
             before(grammarAccess.getExpAccess().getTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getExpAccess().getTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group__2"
    // InternalExTwentyOne.g:2388:1: rule__Exp__Group__2 : rule__Exp__Group__2__Impl ;
    public final void rule__Exp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2392:1: ( rule__Exp__Group__2__Impl )
            // InternalExTwentyOne.g:2393:2: rule__Exp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__2__Impl();

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
    // $ANTLR end "rule__Exp__Group__2"


    // $ANTLR start "rule__Exp__Group__2__Impl"
    // InternalExTwentyOne.g:2399:1: rule__Exp__Group__2__Impl : ( ( rule__Exp__Group_2__0 ) ) ;
    public final void rule__Exp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2403:1: ( ( ( rule__Exp__Group_2__0 ) ) )
            // InternalExTwentyOne.g:2404:1: ( ( rule__Exp__Group_2__0 ) )
            {
            // InternalExTwentyOne.g:2404:1: ( ( rule__Exp__Group_2__0 ) )
            // InternalExTwentyOne.g:2405:2: ( rule__Exp__Group_2__0 )
            {
             before(grammarAccess.getExpAccess().getGroup_2()); 
            // InternalExTwentyOne.g:2406:2: ( rule__Exp__Group_2__0 )
            // InternalExTwentyOne.g:2406:3: rule__Exp__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Exp__Group__2__Impl"


    // $ANTLR start "rule__Exp__Group_2__0"
    // InternalExTwentyOne.g:2415:1: rule__Exp__Group_2__0 : rule__Exp__Group_2__0__Impl rule__Exp__Group_2__1 ;
    public final void rule__Exp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2419:1: ( rule__Exp__Group_2__0__Impl rule__Exp__Group_2__1 )
            // InternalExTwentyOne.g:2420:2: rule__Exp__Group_2__0__Impl rule__Exp__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__Exp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2__1();

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
    // $ANTLR end "rule__Exp__Group_2__0"


    // $ANTLR start "rule__Exp__Group_2__0__Impl"
    // InternalExTwentyOne.g:2427:1: rule__Exp__Group_2__0__Impl : ( ( rule__Exp__LeftAssignment_2_0 ) ) ;
    public final void rule__Exp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2431:1: ( ( ( rule__Exp__LeftAssignment_2_0 ) ) )
            // InternalExTwentyOne.g:2432:1: ( ( rule__Exp__LeftAssignment_2_0 ) )
            {
            // InternalExTwentyOne.g:2432:1: ( ( rule__Exp__LeftAssignment_2_0 ) )
            // InternalExTwentyOne.g:2433:2: ( rule__Exp__LeftAssignment_2_0 )
            {
             before(grammarAccess.getExpAccess().getLeftAssignment_2_0()); 
            // InternalExTwentyOne.g:2434:2: ( rule__Exp__LeftAssignment_2_0 )
            // InternalExTwentyOne.g:2434:3: rule__Exp__LeftAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__LeftAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getLeftAssignment_2_0()); 

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
    // $ANTLR end "rule__Exp__Group_2__0__Impl"


    // $ANTLR start "rule__Exp__Group_2__1"
    // InternalExTwentyOne.g:2442:1: rule__Exp__Group_2__1 : rule__Exp__Group_2__1__Impl ;
    public final void rule__Exp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2446:1: ( rule__Exp__Group_2__1__Impl )
            // InternalExTwentyOne.g:2447:2: rule__Exp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_2__1"


    // $ANTLR start "rule__Exp__Group_2__1__Impl"
    // InternalExTwentyOne.g:2453:1: rule__Exp__Group_2__1__Impl : ( ( rule__Exp__Alternatives_2_1 ) ) ;
    public final void rule__Exp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2457:1: ( ( ( rule__Exp__Alternatives_2_1 ) ) )
            // InternalExTwentyOne.g:2458:1: ( ( rule__Exp__Alternatives_2_1 ) )
            {
            // InternalExTwentyOne.g:2458:1: ( ( rule__Exp__Alternatives_2_1 ) )
            // InternalExTwentyOne.g:2459:2: ( rule__Exp__Alternatives_2_1 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_2_1()); 
            // InternalExTwentyOne.g:2460:2: ( rule__Exp__Alternatives_2_1 )
            // InternalExTwentyOne.g:2460:3: rule__Exp__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getAlternatives_2_1()); 

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
    // $ANTLR end "rule__Exp__Group_2__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_0__0"
    // InternalExTwentyOne.g:2469:1: rule__Exp__Group_2_1_0__0 : rule__Exp__Group_2_1_0__0__Impl rule__Exp__Group_2_1_0__1 ;
    public final void rule__Exp__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2473:1: ( rule__Exp__Group_2_1_0__0__Impl rule__Exp__Group_2_1_0__1 )
            // InternalExTwentyOne.g:2474:2: rule__Exp__Group_2_1_0__0__Impl rule__Exp__Group_2_1_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_0__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_0__0"


    // $ANTLR start "rule__Exp__Group_2_1_0__0__Impl"
    // InternalExTwentyOne.g:2481:1: rule__Exp__Group_2_1_0__0__Impl : ( '+' ) ;
    public final void rule__Exp__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2485:1: ( ( '+' ) )
            // InternalExTwentyOne.g:2486:1: ( '+' )
            {
            // InternalExTwentyOne.g:2486:1: ( '+' )
            // InternalExTwentyOne.g:2487:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_2_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getPlusSignKeyword_2_1_0_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_0__1"
    // InternalExTwentyOne.g:2496:1: rule__Exp__Group_2_1_0__1 : rule__Exp__Group_2_1_0__1__Impl ;
    public final void rule__Exp__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2500:1: ( rule__Exp__Group_2_1_0__1__Impl )
            // InternalExTwentyOne.g:2501:2: rule__Exp__Group_2_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_0__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_0__1"


    // $ANTLR start "rule__Exp__Group_2_1_0__1__Impl"
    // InternalExTwentyOne.g:2507:1: rule__Exp__Group_2_1_0__1__Impl : ( ( rule__Exp__RightPlusAssignment_2_1_0_1 ) ) ;
    public final void rule__Exp__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2511:1: ( ( ( rule__Exp__RightPlusAssignment_2_1_0_1 ) ) )
            // InternalExTwentyOne.g:2512:1: ( ( rule__Exp__RightPlusAssignment_2_1_0_1 ) )
            {
            // InternalExTwentyOne.g:2512:1: ( ( rule__Exp__RightPlusAssignment_2_1_0_1 ) )
            // InternalExTwentyOne.g:2513:2: ( rule__Exp__RightPlusAssignment_2_1_0_1 )
            {
             before(grammarAccess.getExpAccess().getRightPlusAssignment_2_1_0_1()); 
            // InternalExTwentyOne.g:2514:2: ( rule__Exp__RightPlusAssignment_2_1_0_1 )
            // InternalExTwentyOne.g:2514:3: rule__Exp__RightPlusAssignment_2_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightPlusAssignment_2_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightPlusAssignment_2_1_0_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_1__0"
    // InternalExTwentyOne.g:2523:1: rule__Exp__Group_2_1_1__0 : rule__Exp__Group_2_1_1__0__Impl rule__Exp__Group_2_1_1__1 ;
    public final void rule__Exp__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2527:1: ( rule__Exp__Group_2_1_1__0__Impl rule__Exp__Group_2_1_1__1 )
            // InternalExTwentyOne.g:2528:2: rule__Exp__Group_2_1_1__0__Impl rule__Exp__Group_2_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_1__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_1__0"


    // $ANTLR start "rule__Exp__Group_2_1_1__0__Impl"
    // InternalExTwentyOne.g:2535:1: rule__Exp__Group_2_1_1__0__Impl : ( '-' ) ;
    public final void rule__Exp__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2539:1: ( ( '-' ) )
            // InternalExTwentyOne.g:2540:1: ( '-' )
            {
            // InternalExTwentyOne.g:2540:1: ( '-' )
            // InternalExTwentyOne.g:2541:2: '-'
            {
             before(grammarAccess.getExpAccess().getHyphenMinusKeyword_2_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getHyphenMinusKeyword_2_1_1_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_1__1"
    // InternalExTwentyOne.g:2550:1: rule__Exp__Group_2_1_1__1 : rule__Exp__Group_2_1_1__1__Impl ;
    public final void rule__Exp__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2554:1: ( rule__Exp__Group_2_1_1__1__Impl )
            // InternalExTwentyOne.g:2555:2: rule__Exp__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_1__1"


    // $ANTLR start "rule__Exp__Group_2_1_1__1__Impl"
    // InternalExTwentyOne.g:2561:1: rule__Exp__Group_2_1_1__1__Impl : ( ( rule__Exp__RightMinusAssignment_2_1_1_1 ) ) ;
    public final void rule__Exp__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2565:1: ( ( ( rule__Exp__RightMinusAssignment_2_1_1_1 ) ) )
            // InternalExTwentyOne.g:2566:1: ( ( rule__Exp__RightMinusAssignment_2_1_1_1 ) )
            {
            // InternalExTwentyOne.g:2566:1: ( ( rule__Exp__RightMinusAssignment_2_1_1_1 ) )
            // InternalExTwentyOne.g:2567:2: ( rule__Exp__RightMinusAssignment_2_1_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightMinusAssignment_2_1_1_1()); 
            // InternalExTwentyOne.g:2568:2: ( rule__Exp__RightMinusAssignment_2_1_1_1 )
            // InternalExTwentyOne.g:2568:3: rule__Exp__RightMinusAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightMinusAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightMinusAssignment_2_1_1_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_2__0"
    // InternalExTwentyOne.g:2577:1: rule__Exp__Group_2_1_2__0 : rule__Exp__Group_2_1_2__0__Impl rule__Exp__Group_2_1_2__1 ;
    public final void rule__Exp__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2581:1: ( rule__Exp__Group_2_1_2__0__Impl rule__Exp__Group_2_1_2__1 )
            // InternalExTwentyOne.g:2582:2: rule__Exp__Group_2_1_2__0__Impl rule__Exp__Group_2_1_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_2__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_2__0"


    // $ANTLR start "rule__Exp__Group_2_1_2__0__Impl"
    // InternalExTwentyOne.g:2589:1: rule__Exp__Group_2_1_2__0__Impl : ( '*' ) ;
    public final void rule__Exp__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2593:1: ( ( '*' ) )
            // InternalExTwentyOne.g:2594:1: ( '*' )
            {
            // InternalExTwentyOne.g:2594:1: ( '*' )
            // InternalExTwentyOne.g:2595:2: '*'
            {
             before(grammarAccess.getExpAccess().getAsteriskKeyword_2_1_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getAsteriskKeyword_2_1_2_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_2__1"
    // InternalExTwentyOne.g:2604:1: rule__Exp__Group_2_1_2__1 : rule__Exp__Group_2_1_2__1__Impl ;
    public final void rule__Exp__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2608:1: ( rule__Exp__Group_2_1_2__1__Impl )
            // InternalExTwentyOne.g:2609:2: rule__Exp__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_2__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_2__1"


    // $ANTLR start "rule__Exp__Group_2_1_2__1__Impl"
    // InternalExTwentyOne.g:2615:1: rule__Exp__Group_2_1_2__1__Impl : ( ( rule__Exp__RightMultiplyAssignment_2_1_2_1 ) ) ;
    public final void rule__Exp__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2619:1: ( ( ( rule__Exp__RightMultiplyAssignment_2_1_2_1 ) ) )
            // InternalExTwentyOne.g:2620:1: ( ( rule__Exp__RightMultiplyAssignment_2_1_2_1 ) )
            {
            // InternalExTwentyOne.g:2620:1: ( ( rule__Exp__RightMultiplyAssignment_2_1_2_1 ) )
            // InternalExTwentyOne.g:2621:2: ( rule__Exp__RightMultiplyAssignment_2_1_2_1 )
            {
             before(grammarAccess.getExpAccess().getRightMultiplyAssignment_2_1_2_1()); 
            // InternalExTwentyOne.g:2622:2: ( rule__Exp__RightMultiplyAssignment_2_1_2_1 )
            // InternalExTwentyOne.g:2622:3: rule__Exp__RightMultiplyAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightMultiplyAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightMultiplyAssignment_2_1_2_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_3__0"
    // InternalExTwentyOne.g:2631:1: rule__Exp__Group_2_1_3__0 : rule__Exp__Group_2_1_3__0__Impl rule__Exp__Group_2_1_3__1 ;
    public final void rule__Exp__Group_2_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2635:1: ( rule__Exp__Group_2_1_3__0__Impl rule__Exp__Group_2_1_3__1 )
            // InternalExTwentyOne.g:2636:2: rule__Exp__Group_2_1_3__0__Impl rule__Exp__Group_2_1_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_3__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_3__0"


    // $ANTLR start "rule__Exp__Group_2_1_3__0__Impl"
    // InternalExTwentyOne.g:2643:1: rule__Exp__Group_2_1_3__0__Impl : ( '/' ) ;
    public final void rule__Exp__Group_2_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2647:1: ( ( '/' ) )
            // InternalExTwentyOne.g:2648:1: ( '/' )
            {
            // InternalExTwentyOne.g:2648:1: ( '/' )
            // InternalExTwentyOne.g:2649:2: '/'
            {
             before(grammarAccess.getExpAccess().getSolidusKeyword_2_1_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getSolidusKeyword_2_1_3_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_3__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_3__1"
    // InternalExTwentyOne.g:2658:1: rule__Exp__Group_2_1_3__1 : rule__Exp__Group_2_1_3__1__Impl ;
    public final void rule__Exp__Group_2_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2662:1: ( rule__Exp__Group_2_1_3__1__Impl )
            // InternalExTwentyOne.g:2663:2: rule__Exp__Group_2_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_3__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_3__1"


    // $ANTLR start "rule__Exp__Group_2_1_3__1__Impl"
    // InternalExTwentyOne.g:2669:1: rule__Exp__Group_2_1_3__1__Impl : ( ( rule__Exp__RightDivideAssignment_2_1_3_1 ) ) ;
    public final void rule__Exp__Group_2_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2673:1: ( ( ( rule__Exp__RightDivideAssignment_2_1_3_1 ) ) )
            // InternalExTwentyOne.g:2674:1: ( ( rule__Exp__RightDivideAssignment_2_1_3_1 ) )
            {
            // InternalExTwentyOne.g:2674:1: ( ( rule__Exp__RightDivideAssignment_2_1_3_1 ) )
            // InternalExTwentyOne.g:2675:2: ( rule__Exp__RightDivideAssignment_2_1_3_1 )
            {
             before(grammarAccess.getExpAccess().getRightDivideAssignment_2_1_3_1()); 
            // InternalExTwentyOne.g:2676:2: ( rule__Exp__RightDivideAssignment_2_1_3_1 )
            // InternalExTwentyOne.g:2676:3: rule__Exp__RightDivideAssignment_2_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightDivideAssignment_2_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightDivideAssignment_2_1_3_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_3__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_4__0"
    // InternalExTwentyOne.g:2685:1: rule__Exp__Group_2_1_4__0 : rule__Exp__Group_2_1_4__0__Impl rule__Exp__Group_2_1_4__1 ;
    public final void rule__Exp__Group_2_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2689:1: ( rule__Exp__Group_2_1_4__0__Impl rule__Exp__Group_2_1_4__1 )
            // InternalExTwentyOne.g:2690:2: rule__Exp__Group_2_1_4__0__Impl rule__Exp__Group_2_1_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_4__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_4__0"


    // $ANTLR start "rule__Exp__Group_2_1_4__0__Impl"
    // InternalExTwentyOne.g:2697:1: rule__Exp__Group_2_1_4__0__Impl : ( '(' ) ;
    public final void rule__Exp__Group_2_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2701:1: ( ( '(' ) )
            // InternalExTwentyOne.g:2702:1: ( '(' )
            {
            // InternalExTwentyOne.g:2702:1: ( '(' )
            // InternalExTwentyOne.g:2703:2: '('
            {
             before(grammarAccess.getExpAccess().getLeftParenthesisKeyword_2_1_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getLeftParenthesisKeyword_2_1_4_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_4__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_4__1"
    // InternalExTwentyOne.g:2712:1: rule__Exp__Group_2_1_4__1 : rule__Exp__Group_2_1_4__1__Impl rule__Exp__Group_2_1_4__2 ;
    public final void rule__Exp__Group_2_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2716:1: ( rule__Exp__Group_2_1_4__1__Impl rule__Exp__Group_2_1_4__2 )
            // InternalExTwentyOne.g:2717:2: rule__Exp__Group_2_1_4__1__Impl rule__Exp__Group_2_1_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Exp__Group_2_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_4__2();

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
    // $ANTLR end "rule__Exp__Group_2_1_4__1"


    // $ANTLR start "rule__Exp__Group_2_1_4__1__Impl"
    // InternalExTwentyOne.g:2724:1: rule__Exp__Group_2_1_4__1__Impl : ( ( rule__Exp__InParenthesisAssignment_2_1_4_1 ) ) ;
    public final void rule__Exp__Group_2_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2728:1: ( ( ( rule__Exp__InParenthesisAssignment_2_1_4_1 ) ) )
            // InternalExTwentyOne.g:2729:1: ( ( rule__Exp__InParenthesisAssignment_2_1_4_1 ) )
            {
            // InternalExTwentyOne.g:2729:1: ( ( rule__Exp__InParenthesisAssignment_2_1_4_1 ) )
            // InternalExTwentyOne.g:2730:2: ( rule__Exp__InParenthesisAssignment_2_1_4_1 )
            {
             before(grammarAccess.getExpAccess().getInParenthesisAssignment_2_1_4_1()); 
            // InternalExTwentyOne.g:2731:2: ( rule__Exp__InParenthesisAssignment_2_1_4_1 )
            // InternalExTwentyOne.g:2731:3: rule__Exp__InParenthesisAssignment_2_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__InParenthesisAssignment_2_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getInParenthesisAssignment_2_1_4_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_4__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_4__2"
    // InternalExTwentyOne.g:2739:1: rule__Exp__Group_2_1_4__2 : rule__Exp__Group_2_1_4__2__Impl ;
    public final void rule__Exp__Group_2_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2743:1: ( rule__Exp__Group_2_1_4__2__Impl )
            // InternalExTwentyOne.g:2744:2: rule__Exp__Group_2_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_4__2__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_4__2"


    // $ANTLR start "rule__Exp__Group_2_1_4__2__Impl"
    // InternalExTwentyOne.g:2750:1: rule__Exp__Group_2_1_4__2__Impl : ( ')' ) ;
    public final void rule__Exp__Group_2_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2754:1: ( ( ')' ) )
            // InternalExTwentyOne.g:2755:1: ( ')' )
            {
            // InternalExTwentyOne.g:2755:1: ( ')' )
            // InternalExTwentyOne.g:2756:2: ')'
            {
             before(grammarAccess.getExpAccess().getRightParenthesisKeyword_2_1_4_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getRightParenthesisKeyword_2_1_4_2()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_4__2__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_5__0"
    // InternalExTwentyOne.g:2766:1: rule__Exp__Group_2_1_5__0 : rule__Exp__Group_2_1_5__0__Impl rule__Exp__Group_2_1_5__1 ;
    public final void rule__Exp__Group_2_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2770:1: ( rule__Exp__Group_2_1_5__0__Impl rule__Exp__Group_2_1_5__1 )
            // InternalExTwentyOne.g:2771:2: rule__Exp__Group_2_1_5__0__Impl rule__Exp__Group_2_1_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Exp__Group_2_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_5__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_5__0"


    // $ANTLR start "rule__Exp__Group_2_1_5__0__Impl"
    // InternalExTwentyOne.g:2778:1: rule__Exp__Group_2_1_5__0__Impl : ( 'let' ) ;
    public final void rule__Exp__Group_2_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2782:1: ( ( 'let' ) )
            // InternalExTwentyOne.g:2783:1: ( 'let' )
            {
            // InternalExTwentyOne.g:2783:1: ( 'let' )
            // InternalExTwentyOne.g:2784:2: 'let'
            {
             before(grammarAccess.getExpAccess().getLetKeyword_2_1_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getLetKeyword_2_1_5_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_5__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_5__1"
    // InternalExTwentyOne.g:2793:1: rule__Exp__Group_2_1_5__1 : rule__Exp__Group_2_1_5__1__Impl rule__Exp__Group_2_1_5__2 ;
    public final void rule__Exp__Group_2_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2797:1: ( rule__Exp__Group_2_1_5__1__Impl rule__Exp__Group_2_1_5__2 )
            // InternalExTwentyOne.g:2798:2: rule__Exp__Group_2_1_5__1__Impl rule__Exp__Group_2_1_5__2
            {
            pushFollow(FOLLOW_27);
            rule__Exp__Group_2_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_5__2();

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
    // $ANTLR end "rule__Exp__Group_2_1_5__1"


    // $ANTLR start "rule__Exp__Group_2_1_5__1__Impl"
    // InternalExTwentyOne.g:2805:1: rule__Exp__Group_2_1_5__1__Impl : ( ( rule__Exp__LetIdAssignment_2_1_5_1 ) ) ;
    public final void rule__Exp__Group_2_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2809:1: ( ( ( rule__Exp__LetIdAssignment_2_1_5_1 ) ) )
            // InternalExTwentyOne.g:2810:1: ( ( rule__Exp__LetIdAssignment_2_1_5_1 ) )
            {
            // InternalExTwentyOne.g:2810:1: ( ( rule__Exp__LetIdAssignment_2_1_5_1 ) )
            // InternalExTwentyOne.g:2811:2: ( rule__Exp__LetIdAssignment_2_1_5_1 )
            {
             before(grammarAccess.getExpAccess().getLetIdAssignment_2_1_5_1()); 
            // InternalExTwentyOne.g:2812:2: ( rule__Exp__LetIdAssignment_2_1_5_1 )
            // InternalExTwentyOne.g:2812:3: rule__Exp__LetIdAssignment_2_1_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__LetIdAssignment_2_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getLetIdAssignment_2_1_5_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_5__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_5__2"
    // InternalExTwentyOne.g:2820:1: rule__Exp__Group_2_1_5__2 : rule__Exp__Group_2_1_5__2__Impl rule__Exp__Group_2_1_5__3 ;
    public final void rule__Exp__Group_2_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2824:1: ( rule__Exp__Group_2_1_5__2__Impl rule__Exp__Group_2_1_5__3 )
            // InternalExTwentyOne.g:2825:2: rule__Exp__Group_2_1_5__2__Impl rule__Exp__Group_2_1_5__3
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_5__3();

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
    // $ANTLR end "rule__Exp__Group_2_1_5__2"


    // $ANTLR start "rule__Exp__Group_2_1_5__2__Impl"
    // InternalExTwentyOne.g:2832:1: rule__Exp__Group_2_1_5__2__Impl : ( '=' ) ;
    public final void rule__Exp__Group_2_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2836:1: ( ( '=' ) )
            // InternalExTwentyOne.g:2837:1: ( '=' )
            {
            // InternalExTwentyOne.g:2837:1: ( '=' )
            // InternalExTwentyOne.g:2838:2: '='
            {
             before(grammarAccess.getExpAccess().getEqualsSignKeyword_2_1_5_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getEqualsSignKeyword_2_1_5_2()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_5__2__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_5__3"
    // InternalExTwentyOne.g:2847:1: rule__Exp__Group_2_1_5__3 : rule__Exp__Group_2_1_5__3__Impl rule__Exp__Group_2_1_5__4 ;
    public final void rule__Exp__Group_2_1_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2851:1: ( rule__Exp__Group_2_1_5__3__Impl rule__Exp__Group_2_1_5__4 )
            // InternalExTwentyOne.g:2852:2: rule__Exp__Group_2_1_5__3__Impl rule__Exp__Group_2_1_5__4
            {
            pushFollow(FOLLOW_28);
            rule__Exp__Group_2_1_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_5__4();

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
    // $ANTLR end "rule__Exp__Group_2_1_5__3"


    // $ANTLR start "rule__Exp__Group_2_1_5__3__Impl"
    // InternalExTwentyOne.g:2859:1: rule__Exp__Group_2_1_5__3__Impl : ( ( rule__Exp__LetDefExpAssignment_2_1_5_3 ) ) ;
    public final void rule__Exp__Group_2_1_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2863:1: ( ( ( rule__Exp__LetDefExpAssignment_2_1_5_3 ) ) )
            // InternalExTwentyOne.g:2864:1: ( ( rule__Exp__LetDefExpAssignment_2_1_5_3 ) )
            {
            // InternalExTwentyOne.g:2864:1: ( ( rule__Exp__LetDefExpAssignment_2_1_5_3 ) )
            // InternalExTwentyOne.g:2865:2: ( rule__Exp__LetDefExpAssignment_2_1_5_3 )
            {
             before(grammarAccess.getExpAccess().getLetDefExpAssignment_2_1_5_3()); 
            // InternalExTwentyOne.g:2866:2: ( rule__Exp__LetDefExpAssignment_2_1_5_3 )
            // InternalExTwentyOne.g:2866:3: rule__Exp__LetDefExpAssignment_2_1_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Exp__LetDefExpAssignment_2_1_5_3();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getLetDefExpAssignment_2_1_5_3()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_5__3__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_5__4"
    // InternalExTwentyOne.g:2874:1: rule__Exp__Group_2_1_5__4 : rule__Exp__Group_2_1_5__4__Impl rule__Exp__Group_2_1_5__5 ;
    public final void rule__Exp__Group_2_1_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2878:1: ( rule__Exp__Group_2_1_5__4__Impl rule__Exp__Group_2_1_5__5 )
            // InternalExTwentyOne.g:2879:2: rule__Exp__Group_2_1_5__4__Impl rule__Exp__Group_2_1_5__5
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_5__5();

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
    // $ANTLR end "rule__Exp__Group_2_1_5__4"


    // $ANTLR start "rule__Exp__Group_2_1_5__4__Impl"
    // InternalExTwentyOne.g:2886:1: rule__Exp__Group_2_1_5__4__Impl : ( 'in' ) ;
    public final void rule__Exp__Group_2_1_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2890:1: ( ( 'in' ) )
            // InternalExTwentyOne.g:2891:1: ( 'in' )
            {
            // InternalExTwentyOne.g:2891:1: ( 'in' )
            // InternalExTwentyOne.g:2892:2: 'in'
            {
             before(grammarAccess.getExpAccess().getInKeyword_2_1_5_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getInKeyword_2_1_5_4()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_5__4__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_5__5"
    // InternalExTwentyOne.g:2901:1: rule__Exp__Group_2_1_5__5 : rule__Exp__Group_2_1_5__5__Impl rule__Exp__Group_2_1_5__6 ;
    public final void rule__Exp__Group_2_1_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2905:1: ( rule__Exp__Group_2_1_5__5__Impl rule__Exp__Group_2_1_5__6 )
            // InternalExTwentyOne.g:2906:2: rule__Exp__Group_2_1_5__5__Impl rule__Exp__Group_2_1_5__6
            {
            pushFollow(FOLLOW_29);
            rule__Exp__Group_2_1_5__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_5__6();

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
    // $ANTLR end "rule__Exp__Group_2_1_5__5"


    // $ANTLR start "rule__Exp__Group_2_1_5__5__Impl"
    // InternalExTwentyOne.g:2913:1: rule__Exp__Group_2_1_5__5__Impl : ( ( rule__Exp__LetTargetExpAssignment_2_1_5_5 ) ) ;
    public final void rule__Exp__Group_2_1_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2917:1: ( ( ( rule__Exp__LetTargetExpAssignment_2_1_5_5 ) ) )
            // InternalExTwentyOne.g:2918:1: ( ( rule__Exp__LetTargetExpAssignment_2_1_5_5 ) )
            {
            // InternalExTwentyOne.g:2918:1: ( ( rule__Exp__LetTargetExpAssignment_2_1_5_5 ) )
            // InternalExTwentyOne.g:2919:2: ( rule__Exp__LetTargetExpAssignment_2_1_5_5 )
            {
             before(grammarAccess.getExpAccess().getLetTargetExpAssignment_2_1_5_5()); 
            // InternalExTwentyOne.g:2920:2: ( rule__Exp__LetTargetExpAssignment_2_1_5_5 )
            // InternalExTwentyOne.g:2920:3: rule__Exp__LetTargetExpAssignment_2_1_5_5
            {
            pushFollow(FOLLOW_2);
            rule__Exp__LetTargetExpAssignment_2_1_5_5();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getLetTargetExpAssignment_2_1_5_5()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_5__5__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_5__6"
    // InternalExTwentyOne.g:2928:1: rule__Exp__Group_2_1_5__6 : rule__Exp__Group_2_1_5__6__Impl ;
    public final void rule__Exp__Group_2_1_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2932:1: ( rule__Exp__Group_2_1_5__6__Impl )
            // InternalExTwentyOne.g:2933:2: rule__Exp__Group_2_1_5__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_5__6__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_5__6"


    // $ANTLR start "rule__Exp__Group_2_1_5__6__Impl"
    // InternalExTwentyOne.g:2939:1: rule__Exp__Group_2_1_5__6__Impl : ( 'end' ) ;
    public final void rule__Exp__Group_2_1_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2943:1: ( ( 'end' ) )
            // InternalExTwentyOne.g:2944:1: ( 'end' )
            {
            // InternalExTwentyOne.g:2944:1: ( 'end' )
            // InternalExTwentyOne.g:2945:2: 'end'
            {
             before(grammarAccess.getExpAccess().getEndKeyword_2_1_5_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getEndKeyword_2_1_5_6()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_5__6__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_6__0"
    // InternalExTwentyOne.g:2955:1: rule__Exp__Group_2_1_6__0 : rule__Exp__Group_2_1_6__0__Impl rule__Exp__Group_2_1_6__1 ;
    public final void rule__Exp__Group_2_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2959:1: ( rule__Exp__Group_2_1_6__0__Impl rule__Exp__Group_2_1_6__1 )
            // InternalExTwentyOne.g:2960:2: rule__Exp__Group_2_1_6__0__Impl rule__Exp__Group_2_1_6__1
            {
            pushFollow(FOLLOW_30);
            rule__Exp__Group_2_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_6__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_6__0"


    // $ANTLR start "rule__Exp__Group_2_1_6__0__Impl"
    // InternalExTwentyOne.g:2967:1: rule__Exp__Group_2_1_6__0__Impl : ( RULE_ID ) ;
    public final void rule__Exp__Group_2_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2971:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2972:1: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2972:1: ( RULE_ID )
            // InternalExTwentyOne.g:2973:2: RULE_ID
            {
             before(grammarAccess.getExpAccess().getIDTerminalRuleCall_2_1_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getIDTerminalRuleCall_2_1_6_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_6__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_6__1"
    // InternalExTwentyOne.g:2982:1: rule__Exp__Group_2_1_6__1 : rule__Exp__Group_2_1_6__1__Impl ;
    public final void rule__Exp__Group_2_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2986:1: ( rule__Exp__Group_2_1_6__1__Impl )
            // InternalExTwentyOne.g:2987:2: rule__Exp__Group_2_1_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_6__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_6__1"


    // $ANTLR start "rule__Exp__Group_2_1_6__1__Impl"
    // InternalExTwentyOne.g:2993:1: rule__Exp__Group_2_1_6__1__Impl : ( ( rule__Exp__Group_2_1_6_1__0 )* ) ;
    public final void rule__Exp__Group_2_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2997:1: ( ( ( rule__Exp__Group_2_1_6_1__0 )* ) )
            // InternalExTwentyOne.g:2998:1: ( ( rule__Exp__Group_2_1_6_1__0 )* )
            {
            // InternalExTwentyOne.g:2998:1: ( ( rule__Exp__Group_2_1_6_1__0 )* )
            // InternalExTwentyOne.g:2999:2: ( rule__Exp__Group_2_1_6_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_2_1_6_1()); 
            // InternalExTwentyOne.g:3000:2: ( rule__Exp__Group_2_1_6_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExTwentyOne.g:3000:3: rule__Exp__Group_2_1_6_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Exp__Group_2_1_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getGroup_2_1_6_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_6__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_6_1__0"
    // InternalExTwentyOne.g:3009:1: rule__Exp__Group_2_1_6_1__0 : rule__Exp__Group_2_1_6_1__0__Impl rule__Exp__Group_2_1_6_1__1 ;
    public final void rule__Exp__Group_2_1_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3013:1: ( rule__Exp__Group_2_1_6_1__0__Impl rule__Exp__Group_2_1_6_1__1 )
            // InternalExTwentyOne.g:3014:2: rule__Exp__Group_2_1_6_1__0__Impl rule__Exp__Group_2_1_6_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Exp__Group_2_1_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_6_1__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_6_1__0"


    // $ANTLR start "rule__Exp__Group_2_1_6_1__0__Impl"
    // InternalExTwentyOne.g:3021:1: rule__Exp__Group_2_1_6_1__0__Impl : ( '.' ) ;
    public final void rule__Exp__Group_2_1_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3025:1: ( ( '.' ) )
            // InternalExTwentyOne.g:3026:1: ( '.' )
            {
            // InternalExTwentyOne.g:3026:1: ( '.' )
            // InternalExTwentyOne.g:3027:2: '.'
            {
             before(grammarAccess.getExpAccess().getFullStopKeyword_2_1_6_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getFullStopKeyword_2_1_6_1_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_6_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_6_1__1"
    // InternalExTwentyOne.g:3036:1: rule__Exp__Group_2_1_6_1__1 : rule__Exp__Group_2_1_6_1__1__Impl ;
    public final void rule__Exp__Group_2_1_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3040:1: ( rule__Exp__Group_2_1_6_1__1__Impl )
            // InternalExTwentyOne.g:3041:2: rule__Exp__Group_2_1_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_6_1__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_6_1__1"


    // $ANTLR start "rule__Exp__Group_2_1_6_1__1__Impl"
    // InternalExTwentyOne.g:3047:1: rule__Exp__Group_2_1_6_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Exp__Group_2_1_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3051:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3052:1: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3052:1: ( RULE_ID )
            // InternalExTwentyOne.g:3053:2: RULE_ID
            {
             before(grammarAccess.getExpAccess().getIDTerminalRuleCall_2_1_6_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getIDTerminalRuleCall_2_1_6_1_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_6_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_8__0"
    // InternalExTwentyOne.g:3063:1: rule__Exp__Group_2_1_8__0 : rule__Exp__Group_2_1_8__0__Impl rule__Exp__Group_2_1_8__1 ;
    public final void rule__Exp__Group_2_1_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3067:1: ( rule__Exp__Group_2_1_8__0__Impl rule__Exp__Group_2_1_8__1 )
            // InternalExTwentyOne.g:3068:2: rule__Exp__Group_2_1_8__0__Impl rule__Exp__Group_2_1_8__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_8__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_8__0"


    // $ANTLR start "rule__Exp__Group_2_1_8__0__Impl"
    // InternalExTwentyOne.g:3075:1: rule__Exp__Group_2_1_8__0__Impl : ( 'if' ) ;
    public final void rule__Exp__Group_2_1_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3079:1: ( ( 'if' ) )
            // InternalExTwentyOne.g:3080:1: ( 'if' )
            {
            // InternalExTwentyOne.g:3080:1: ( 'if' )
            // InternalExTwentyOne.g:3081:2: 'if'
            {
             before(grammarAccess.getExpAccess().getIfKeyword_2_1_8_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getIfKeyword_2_1_8_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_8__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_8__1"
    // InternalExTwentyOne.g:3090:1: rule__Exp__Group_2_1_8__1 : rule__Exp__Group_2_1_8__1__Impl rule__Exp__Group_2_1_8__2 ;
    public final void rule__Exp__Group_2_1_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3094:1: ( rule__Exp__Group_2_1_8__1__Impl rule__Exp__Group_2_1_8__2 )
            // InternalExTwentyOne.g:3095:2: rule__Exp__Group_2_1_8__1__Impl rule__Exp__Group_2_1_8__2
            {
            pushFollow(FOLLOW_32);
            rule__Exp__Group_2_1_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_8__2();

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
    // $ANTLR end "rule__Exp__Group_2_1_8__1"


    // $ANTLR start "rule__Exp__Group_2_1_8__1__Impl"
    // InternalExTwentyOne.g:3102:1: rule__Exp__Group_2_1_8__1__Impl : ( ( rule__Exp__IfLogicExpAssignment_2_1_8_1 ) ) ;
    public final void rule__Exp__Group_2_1_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3106:1: ( ( ( rule__Exp__IfLogicExpAssignment_2_1_8_1 ) ) )
            // InternalExTwentyOne.g:3107:1: ( ( rule__Exp__IfLogicExpAssignment_2_1_8_1 ) )
            {
            // InternalExTwentyOne.g:3107:1: ( ( rule__Exp__IfLogicExpAssignment_2_1_8_1 ) )
            // InternalExTwentyOne.g:3108:2: ( rule__Exp__IfLogicExpAssignment_2_1_8_1 )
            {
             before(grammarAccess.getExpAccess().getIfLogicExpAssignment_2_1_8_1()); 
            // InternalExTwentyOne.g:3109:2: ( rule__Exp__IfLogicExpAssignment_2_1_8_1 )
            // InternalExTwentyOne.g:3109:3: rule__Exp__IfLogicExpAssignment_2_1_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__IfLogicExpAssignment_2_1_8_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getIfLogicExpAssignment_2_1_8_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_8__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_8__2"
    // InternalExTwentyOne.g:3117:1: rule__Exp__Group_2_1_8__2 : rule__Exp__Group_2_1_8__2__Impl rule__Exp__Group_2_1_8__3 ;
    public final void rule__Exp__Group_2_1_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3121:1: ( rule__Exp__Group_2_1_8__2__Impl rule__Exp__Group_2_1_8__3 )
            // InternalExTwentyOne.g:3122:2: rule__Exp__Group_2_1_8__2__Impl rule__Exp__Group_2_1_8__3
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_8__3();

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
    // $ANTLR end "rule__Exp__Group_2_1_8__2"


    // $ANTLR start "rule__Exp__Group_2_1_8__2__Impl"
    // InternalExTwentyOne.g:3129:1: rule__Exp__Group_2_1_8__2__Impl : ( 'then' ) ;
    public final void rule__Exp__Group_2_1_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3133:1: ( ( 'then' ) )
            // InternalExTwentyOne.g:3134:1: ( 'then' )
            {
            // InternalExTwentyOne.g:3134:1: ( 'then' )
            // InternalExTwentyOne.g:3135:2: 'then'
            {
             before(grammarAccess.getExpAccess().getThenKeyword_2_1_8_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getThenKeyword_2_1_8_2()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_8__2__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_8__3"
    // InternalExTwentyOne.g:3144:1: rule__Exp__Group_2_1_8__3 : rule__Exp__Group_2_1_8__3__Impl rule__Exp__Group_2_1_8__4 ;
    public final void rule__Exp__Group_2_1_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3148:1: ( rule__Exp__Group_2_1_8__3__Impl rule__Exp__Group_2_1_8__4 )
            // InternalExTwentyOne.g:3149:2: rule__Exp__Group_2_1_8__3__Impl rule__Exp__Group_2_1_8__4
            {
            pushFollow(FOLLOW_33);
            rule__Exp__Group_2_1_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_8__4();

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
    // $ANTLR end "rule__Exp__Group_2_1_8__3"


    // $ANTLR start "rule__Exp__Group_2_1_8__3__Impl"
    // InternalExTwentyOne.g:3156:1: rule__Exp__Group_2_1_8__3__Impl : ( ( rule__Exp__ThenExpAssignment_2_1_8_3 ) ) ;
    public final void rule__Exp__Group_2_1_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3160:1: ( ( ( rule__Exp__ThenExpAssignment_2_1_8_3 ) ) )
            // InternalExTwentyOne.g:3161:1: ( ( rule__Exp__ThenExpAssignment_2_1_8_3 ) )
            {
            // InternalExTwentyOne.g:3161:1: ( ( rule__Exp__ThenExpAssignment_2_1_8_3 ) )
            // InternalExTwentyOne.g:3162:2: ( rule__Exp__ThenExpAssignment_2_1_8_3 )
            {
             before(grammarAccess.getExpAccess().getThenExpAssignment_2_1_8_3()); 
            // InternalExTwentyOne.g:3163:2: ( rule__Exp__ThenExpAssignment_2_1_8_3 )
            // InternalExTwentyOne.g:3163:3: rule__Exp__ThenExpAssignment_2_1_8_3
            {
            pushFollow(FOLLOW_2);
            rule__Exp__ThenExpAssignment_2_1_8_3();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getThenExpAssignment_2_1_8_3()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_8__3__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_8__4"
    // InternalExTwentyOne.g:3171:1: rule__Exp__Group_2_1_8__4 : rule__Exp__Group_2_1_8__4__Impl rule__Exp__Group_2_1_8__5 ;
    public final void rule__Exp__Group_2_1_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3175:1: ( rule__Exp__Group_2_1_8__4__Impl rule__Exp__Group_2_1_8__5 )
            // InternalExTwentyOne.g:3176:2: rule__Exp__Group_2_1_8__4__Impl rule__Exp__Group_2_1_8__5
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_8__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_8__5();

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
    // $ANTLR end "rule__Exp__Group_2_1_8__4"


    // $ANTLR start "rule__Exp__Group_2_1_8__4__Impl"
    // InternalExTwentyOne.g:3183:1: rule__Exp__Group_2_1_8__4__Impl : ( 'else' ) ;
    public final void rule__Exp__Group_2_1_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3187:1: ( ( 'else' ) )
            // InternalExTwentyOne.g:3188:1: ( 'else' )
            {
            // InternalExTwentyOne.g:3188:1: ( 'else' )
            // InternalExTwentyOne.g:3189:2: 'else'
            {
             before(grammarAccess.getExpAccess().getElseKeyword_2_1_8_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getElseKeyword_2_1_8_4()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_8__4__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_8__5"
    // InternalExTwentyOne.g:3198:1: rule__Exp__Group_2_1_8__5 : rule__Exp__Group_2_1_8__5__Impl rule__Exp__Group_2_1_8__6 ;
    public final void rule__Exp__Group_2_1_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3202:1: ( rule__Exp__Group_2_1_8__5__Impl rule__Exp__Group_2_1_8__6 )
            // InternalExTwentyOne.g:3203:2: rule__Exp__Group_2_1_8__5__Impl rule__Exp__Group_2_1_8__6
            {
            pushFollow(FOLLOW_29);
            rule__Exp__Group_2_1_8__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_8__6();

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
    // $ANTLR end "rule__Exp__Group_2_1_8__5"


    // $ANTLR start "rule__Exp__Group_2_1_8__5__Impl"
    // InternalExTwentyOne.g:3210:1: rule__Exp__Group_2_1_8__5__Impl : ( ( rule__Exp__ElseExpAssignment_2_1_8_5 ) ) ;
    public final void rule__Exp__Group_2_1_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3214:1: ( ( ( rule__Exp__ElseExpAssignment_2_1_8_5 ) ) )
            // InternalExTwentyOne.g:3215:1: ( ( rule__Exp__ElseExpAssignment_2_1_8_5 ) )
            {
            // InternalExTwentyOne.g:3215:1: ( ( rule__Exp__ElseExpAssignment_2_1_8_5 ) )
            // InternalExTwentyOne.g:3216:2: ( rule__Exp__ElseExpAssignment_2_1_8_5 )
            {
             before(grammarAccess.getExpAccess().getElseExpAssignment_2_1_8_5()); 
            // InternalExTwentyOne.g:3217:2: ( rule__Exp__ElseExpAssignment_2_1_8_5 )
            // InternalExTwentyOne.g:3217:3: rule__Exp__ElseExpAssignment_2_1_8_5
            {
            pushFollow(FOLLOW_2);
            rule__Exp__ElseExpAssignment_2_1_8_5();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getElseExpAssignment_2_1_8_5()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_8__5__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_8__6"
    // InternalExTwentyOne.g:3225:1: rule__Exp__Group_2_1_8__6 : rule__Exp__Group_2_1_8__6__Impl ;
    public final void rule__Exp__Group_2_1_8__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3229:1: ( rule__Exp__Group_2_1_8__6__Impl )
            // InternalExTwentyOne.g:3230:2: rule__Exp__Group_2_1_8__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_8__6__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_8__6"


    // $ANTLR start "rule__Exp__Group_2_1_8__6__Impl"
    // InternalExTwentyOne.g:3236:1: rule__Exp__Group_2_1_8__6__Impl : ( 'end' ) ;
    public final void rule__Exp__Group_2_1_8__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3240:1: ( ( 'end' ) )
            // InternalExTwentyOne.g:3241:1: ( 'end' )
            {
            // InternalExTwentyOne.g:3241:1: ( 'end' )
            // InternalExTwentyOne.g:3242:2: 'end'
            {
             before(grammarAccess.getExpAccess().getEndKeyword_2_1_8_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getEndKeyword_2_1_8_6()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_8__6__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9__0"
    // InternalExTwentyOne.g:3252:1: rule__Exp__Group_2_1_9__0 : rule__Exp__Group_2_1_9__0__Impl rule__Exp__Group_2_1_9__1 ;
    public final void rule__Exp__Group_2_1_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3256:1: ( rule__Exp__Group_2_1_9__0__Impl rule__Exp__Group_2_1_9__1 )
            // InternalExTwentyOne.g:3257:2: rule__Exp__Group_2_1_9__0__Impl rule__Exp__Group_2_1_9__1
            {
            pushFollow(FOLLOW_3);
            rule__Exp__Group_2_1_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_9__0"


    // $ANTLR start "rule__Exp__Group_2_1_9__0__Impl"
    // InternalExTwentyOne.g:3264:1: rule__Exp__Group_2_1_9__0__Impl : ( 'new' ) ;
    public final void rule__Exp__Group_2_1_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3268:1: ( ( 'new' ) )
            // InternalExTwentyOne.g:3269:1: ( 'new' )
            {
            // InternalExTwentyOne.g:3269:1: ( 'new' )
            // InternalExTwentyOne.g:3270:2: 'new'
            {
             before(grammarAccess.getExpAccess().getNewKeyword_2_1_9_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getNewKeyword_2_1_9_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9__1"
    // InternalExTwentyOne.g:3279:1: rule__Exp__Group_2_1_9__1 : rule__Exp__Group_2_1_9__1__Impl rule__Exp__Group_2_1_9__2 ;
    public final void rule__Exp__Group_2_1_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3283:1: ( rule__Exp__Group_2_1_9__1__Impl rule__Exp__Group_2_1_9__2 )
            // InternalExTwentyOne.g:3284:2: rule__Exp__Group_2_1_9__1__Impl rule__Exp__Group_2_1_9__2
            {
            pushFollow(FOLLOW_15);
            rule__Exp__Group_2_1_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9__2();

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
    // $ANTLR end "rule__Exp__Group_2_1_9__1"


    // $ANTLR start "rule__Exp__Group_2_1_9__1__Impl"
    // InternalExTwentyOne.g:3291:1: rule__Exp__Group_2_1_9__1__Impl : ( ( rule__Exp__NewArrayIdAssignment_2_1_9_1 ) ) ;
    public final void rule__Exp__Group_2_1_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3295:1: ( ( ( rule__Exp__NewArrayIdAssignment_2_1_9_1 ) ) )
            // InternalExTwentyOne.g:3296:1: ( ( rule__Exp__NewArrayIdAssignment_2_1_9_1 ) )
            {
            // InternalExTwentyOne.g:3296:1: ( ( rule__Exp__NewArrayIdAssignment_2_1_9_1 ) )
            // InternalExTwentyOne.g:3297:2: ( rule__Exp__NewArrayIdAssignment_2_1_9_1 )
            {
             before(grammarAccess.getExpAccess().getNewArrayIdAssignment_2_1_9_1()); 
            // InternalExTwentyOne.g:3298:2: ( rule__Exp__NewArrayIdAssignment_2_1_9_1 )
            // InternalExTwentyOne.g:3298:3: rule__Exp__NewArrayIdAssignment_2_1_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__NewArrayIdAssignment_2_1_9_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getNewArrayIdAssignment_2_1_9_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9__2"
    // InternalExTwentyOne.g:3306:1: rule__Exp__Group_2_1_9__2 : rule__Exp__Group_2_1_9__2__Impl rule__Exp__Group_2_1_9__3 ;
    public final void rule__Exp__Group_2_1_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3310:1: ( rule__Exp__Group_2_1_9__2__Impl rule__Exp__Group_2_1_9__3 )
            // InternalExTwentyOne.g:3311:2: rule__Exp__Group_2_1_9__2__Impl rule__Exp__Group_2_1_9__3
            {
            pushFollow(FOLLOW_3);
            rule__Exp__Group_2_1_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9__3();

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
    // $ANTLR end "rule__Exp__Group_2_1_9__2"


    // $ANTLR start "rule__Exp__Group_2_1_9__2__Impl"
    // InternalExTwentyOne.g:3318:1: rule__Exp__Group_2_1_9__2__Impl : ( '[' ) ;
    public final void rule__Exp__Group_2_1_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3322:1: ( ( '[' ) )
            // InternalExTwentyOne.g:3323:1: ( '[' )
            {
            // InternalExTwentyOne.g:3323:1: ( '[' )
            // InternalExTwentyOne.g:3324:2: '['
            {
             before(grammarAccess.getExpAccess().getLeftSquareBracketKeyword_2_1_9_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getLeftSquareBracketKeyword_2_1_9_2()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9__2__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9__3"
    // InternalExTwentyOne.g:3333:1: rule__Exp__Group_2_1_9__3 : rule__Exp__Group_2_1_9__3__Impl rule__Exp__Group_2_1_9__4 ;
    public final void rule__Exp__Group_2_1_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3337:1: ( rule__Exp__Group_2_1_9__3__Impl rule__Exp__Group_2_1_9__4 )
            // InternalExTwentyOne.g:3338:2: rule__Exp__Group_2_1_9__3__Impl rule__Exp__Group_2_1_9__4
            {
            pushFollow(FOLLOW_27);
            rule__Exp__Group_2_1_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9__4();

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
    // $ANTLR end "rule__Exp__Group_2_1_9__3"


    // $ANTLR start "rule__Exp__Group_2_1_9__3__Impl"
    // InternalExTwentyOne.g:3345:1: rule__Exp__Group_2_1_9__3__Impl : ( ( rule__Exp__NewArrayIdsAssignment_2_1_9_3 ) ) ;
    public final void rule__Exp__Group_2_1_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3349:1: ( ( ( rule__Exp__NewArrayIdsAssignment_2_1_9_3 ) ) )
            // InternalExTwentyOne.g:3350:1: ( ( rule__Exp__NewArrayIdsAssignment_2_1_9_3 ) )
            {
            // InternalExTwentyOne.g:3350:1: ( ( rule__Exp__NewArrayIdsAssignment_2_1_9_3 ) )
            // InternalExTwentyOne.g:3351:2: ( rule__Exp__NewArrayIdsAssignment_2_1_9_3 )
            {
             before(grammarAccess.getExpAccess().getNewArrayIdsAssignment_2_1_9_3()); 
            // InternalExTwentyOne.g:3352:2: ( rule__Exp__NewArrayIdsAssignment_2_1_9_3 )
            // InternalExTwentyOne.g:3352:3: rule__Exp__NewArrayIdsAssignment_2_1_9_3
            {
            pushFollow(FOLLOW_2);
            rule__Exp__NewArrayIdsAssignment_2_1_9_3();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getNewArrayIdsAssignment_2_1_9_3()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9__3__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9__4"
    // InternalExTwentyOne.g:3360:1: rule__Exp__Group_2_1_9__4 : rule__Exp__Group_2_1_9__4__Impl rule__Exp__Group_2_1_9__5 ;
    public final void rule__Exp__Group_2_1_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3364:1: ( rule__Exp__Group_2_1_9__4__Impl rule__Exp__Group_2_1_9__5 )
            // InternalExTwentyOne.g:3365:2: rule__Exp__Group_2_1_9__4__Impl rule__Exp__Group_2_1_9__5
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_9__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9__5();

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
    // $ANTLR end "rule__Exp__Group_2_1_9__4"


    // $ANTLR start "rule__Exp__Group_2_1_9__4__Impl"
    // InternalExTwentyOne.g:3372:1: rule__Exp__Group_2_1_9__4__Impl : ( '=' ) ;
    public final void rule__Exp__Group_2_1_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3376:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3377:1: ( '=' )
            {
            // InternalExTwentyOne.g:3377:1: ( '=' )
            // InternalExTwentyOne.g:3378:2: '='
            {
             before(grammarAccess.getExpAccess().getEqualsSignKeyword_2_1_9_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getEqualsSignKeyword_2_1_9_4()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9__4__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9__5"
    // InternalExTwentyOne.g:3387:1: rule__Exp__Group_2_1_9__5 : rule__Exp__Group_2_1_9__5__Impl rule__Exp__Group_2_1_9__6 ;
    public final void rule__Exp__Group_2_1_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3391:1: ( rule__Exp__Group_2_1_9__5__Impl rule__Exp__Group_2_1_9__6 )
            // InternalExTwentyOne.g:3392:2: rule__Exp__Group_2_1_9__5__Impl rule__Exp__Group_2_1_9__6
            {
            pushFollow(FOLLOW_34);
            rule__Exp__Group_2_1_9__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9__6();

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
    // $ANTLR end "rule__Exp__Group_2_1_9__5"


    // $ANTLR start "rule__Exp__Group_2_1_9__5__Impl"
    // InternalExTwentyOne.g:3399:1: rule__Exp__Group_2_1_9__5__Impl : ( ( rule__Exp__NewArrayExpsAssignment_2_1_9_5 ) ) ;
    public final void rule__Exp__Group_2_1_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3403:1: ( ( ( rule__Exp__NewArrayExpsAssignment_2_1_9_5 ) ) )
            // InternalExTwentyOne.g:3404:1: ( ( rule__Exp__NewArrayExpsAssignment_2_1_9_5 ) )
            {
            // InternalExTwentyOne.g:3404:1: ( ( rule__Exp__NewArrayExpsAssignment_2_1_9_5 ) )
            // InternalExTwentyOne.g:3405:2: ( rule__Exp__NewArrayExpsAssignment_2_1_9_5 )
            {
             before(grammarAccess.getExpAccess().getNewArrayExpsAssignment_2_1_9_5()); 
            // InternalExTwentyOne.g:3406:2: ( rule__Exp__NewArrayExpsAssignment_2_1_9_5 )
            // InternalExTwentyOne.g:3406:3: rule__Exp__NewArrayExpsAssignment_2_1_9_5
            {
            pushFollow(FOLLOW_2);
            rule__Exp__NewArrayExpsAssignment_2_1_9_5();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getNewArrayExpsAssignment_2_1_9_5()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9__5__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9__6"
    // InternalExTwentyOne.g:3414:1: rule__Exp__Group_2_1_9__6 : rule__Exp__Group_2_1_9__6__Impl rule__Exp__Group_2_1_9__7 ;
    public final void rule__Exp__Group_2_1_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3418:1: ( rule__Exp__Group_2_1_9__6__Impl rule__Exp__Group_2_1_9__7 )
            // InternalExTwentyOne.g:3419:2: rule__Exp__Group_2_1_9__6__Impl rule__Exp__Group_2_1_9__7
            {
            pushFollow(FOLLOW_34);
            rule__Exp__Group_2_1_9__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9__7();

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
    // $ANTLR end "rule__Exp__Group_2_1_9__6"


    // $ANTLR start "rule__Exp__Group_2_1_9__6__Impl"
    // InternalExTwentyOne.g:3426:1: rule__Exp__Group_2_1_9__6__Impl : ( ( rule__Exp__Group_2_1_9_6__0 )* ) ;
    public final void rule__Exp__Group_2_1_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3430:1: ( ( ( rule__Exp__Group_2_1_9_6__0 )* ) )
            // InternalExTwentyOne.g:3431:1: ( ( rule__Exp__Group_2_1_9_6__0 )* )
            {
            // InternalExTwentyOne.g:3431:1: ( ( rule__Exp__Group_2_1_9_6__0 )* )
            // InternalExTwentyOne.g:3432:2: ( rule__Exp__Group_2_1_9_6__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_2_1_9_6()); 
            // InternalExTwentyOne.g:3433:2: ( rule__Exp__Group_2_1_9_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExTwentyOne.g:3433:3: rule__Exp__Group_2_1_9_6__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Exp__Group_2_1_9_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getGroup_2_1_9_6()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9__6__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9__7"
    // InternalExTwentyOne.g:3441:1: rule__Exp__Group_2_1_9__7 : rule__Exp__Group_2_1_9__7__Impl ;
    public final void rule__Exp__Group_2_1_9__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3445:1: ( rule__Exp__Group_2_1_9__7__Impl )
            // InternalExTwentyOne.g:3446:2: rule__Exp__Group_2_1_9__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9__7__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_9__7"


    // $ANTLR start "rule__Exp__Group_2_1_9__7__Impl"
    // InternalExTwentyOne.g:3452:1: rule__Exp__Group_2_1_9__7__Impl : ( ']' ) ;
    public final void rule__Exp__Group_2_1_9__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3456:1: ( ( ']' ) )
            // InternalExTwentyOne.g:3457:1: ( ']' )
            {
            // InternalExTwentyOne.g:3457:1: ( ']' )
            // InternalExTwentyOne.g:3458:2: ']'
            {
             before(grammarAccess.getExpAccess().getRightSquareBracketKeyword_2_1_9_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getRightSquareBracketKeyword_2_1_9_7()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9__7__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9_6__0"
    // InternalExTwentyOne.g:3468:1: rule__Exp__Group_2_1_9_6__0 : rule__Exp__Group_2_1_9_6__0__Impl rule__Exp__Group_2_1_9_6__1 ;
    public final void rule__Exp__Group_2_1_9_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3472:1: ( rule__Exp__Group_2_1_9_6__0__Impl rule__Exp__Group_2_1_9_6__1 )
            // InternalExTwentyOne.g:3473:2: rule__Exp__Group_2_1_9_6__0__Impl rule__Exp__Group_2_1_9_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Exp__Group_2_1_9_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9_6__1();

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
    // $ANTLR end "rule__Exp__Group_2_1_9_6__0"


    // $ANTLR start "rule__Exp__Group_2_1_9_6__0__Impl"
    // InternalExTwentyOne.g:3480:1: rule__Exp__Group_2_1_9_6__0__Impl : ( ',' ) ;
    public final void rule__Exp__Group_2_1_9_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3484:1: ( ( ',' ) )
            // InternalExTwentyOne.g:3485:1: ( ',' )
            {
            // InternalExTwentyOne.g:3485:1: ( ',' )
            // InternalExTwentyOne.g:3486:2: ','
            {
             before(grammarAccess.getExpAccess().getCommaKeyword_2_1_9_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getCommaKeyword_2_1_9_6_0()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9_6__0__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9_6__1"
    // InternalExTwentyOne.g:3495:1: rule__Exp__Group_2_1_9_6__1 : rule__Exp__Group_2_1_9_6__1__Impl rule__Exp__Group_2_1_9_6__2 ;
    public final void rule__Exp__Group_2_1_9_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3499:1: ( rule__Exp__Group_2_1_9_6__1__Impl rule__Exp__Group_2_1_9_6__2 )
            // InternalExTwentyOne.g:3500:2: rule__Exp__Group_2_1_9_6__1__Impl rule__Exp__Group_2_1_9_6__2
            {
            pushFollow(FOLLOW_27);
            rule__Exp__Group_2_1_9_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9_6__2();

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
    // $ANTLR end "rule__Exp__Group_2_1_9_6__1"


    // $ANTLR start "rule__Exp__Group_2_1_9_6__1__Impl"
    // InternalExTwentyOne.g:3507:1: rule__Exp__Group_2_1_9_6__1__Impl : ( ( rule__Exp__NewArrayIdsAssignment_2_1_9_6_1 ) ) ;
    public final void rule__Exp__Group_2_1_9_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3511:1: ( ( ( rule__Exp__NewArrayIdsAssignment_2_1_9_6_1 ) ) )
            // InternalExTwentyOne.g:3512:1: ( ( rule__Exp__NewArrayIdsAssignment_2_1_9_6_1 ) )
            {
            // InternalExTwentyOne.g:3512:1: ( ( rule__Exp__NewArrayIdsAssignment_2_1_9_6_1 ) )
            // InternalExTwentyOne.g:3513:2: ( rule__Exp__NewArrayIdsAssignment_2_1_9_6_1 )
            {
             before(grammarAccess.getExpAccess().getNewArrayIdsAssignment_2_1_9_6_1()); 
            // InternalExTwentyOne.g:3514:2: ( rule__Exp__NewArrayIdsAssignment_2_1_9_6_1 )
            // InternalExTwentyOne.g:3514:3: rule__Exp__NewArrayIdsAssignment_2_1_9_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__NewArrayIdsAssignment_2_1_9_6_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getNewArrayIdsAssignment_2_1_9_6_1()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9_6__1__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9_6__2"
    // InternalExTwentyOne.g:3522:1: rule__Exp__Group_2_1_9_6__2 : rule__Exp__Group_2_1_9_6__2__Impl rule__Exp__Group_2_1_9_6__3 ;
    public final void rule__Exp__Group_2_1_9_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3526:1: ( rule__Exp__Group_2_1_9_6__2__Impl rule__Exp__Group_2_1_9_6__3 )
            // InternalExTwentyOne.g:3527:2: rule__Exp__Group_2_1_9_6__2__Impl rule__Exp__Group_2_1_9_6__3
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_2_1_9_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9_6__3();

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
    // $ANTLR end "rule__Exp__Group_2_1_9_6__2"


    // $ANTLR start "rule__Exp__Group_2_1_9_6__2__Impl"
    // InternalExTwentyOne.g:3534:1: rule__Exp__Group_2_1_9_6__2__Impl : ( '=' ) ;
    public final void rule__Exp__Group_2_1_9_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3538:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3539:1: ( '=' )
            {
            // InternalExTwentyOne.g:3539:1: ( '=' )
            // InternalExTwentyOne.g:3540:2: '='
            {
             before(grammarAccess.getExpAccess().getEqualsSignKeyword_2_1_9_6_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getEqualsSignKeyword_2_1_9_6_2()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9_6__2__Impl"


    // $ANTLR start "rule__Exp__Group_2_1_9_6__3"
    // InternalExTwentyOne.g:3549:1: rule__Exp__Group_2_1_9_6__3 : rule__Exp__Group_2_1_9_6__3__Impl ;
    public final void rule__Exp__Group_2_1_9_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3553:1: ( rule__Exp__Group_2_1_9_6__3__Impl )
            // InternalExTwentyOne.g:3554:2: rule__Exp__Group_2_1_9_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_2_1_9_6__3__Impl();

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
    // $ANTLR end "rule__Exp__Group_2_1_9_6__3"


    // $ANTLR start "rule__Exp__Group_2_1_9_6__3__Impl"
    // InternalExTwentyOne.g:3560:1: rule__Exp__Group_2_1_9_6__3__Impl : ( ( rule__Exp__NewArrayExpsAssignment_2_1_9_6_3 ) ) ;
    public final void rule__Exp__Group_2_1_9_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3564:1: ( ( ( rule__Exp__NewArrayExpsAssignment_2_1_9_6_3 ) ) )
            // InternalExTwentyOne.g:3565:1: ( ( rule__Exp__NewArrayExpsAssignment_2_1_9_6_3 ) )
            {
            // InternalExTwentyOne.g:3565:1: ( ( rule__Exp__NewArrayExpsAssignment_2_1_9_6_3 ) )
            // InternalExTwentyOne.g:3566:2: ( rule__Exp__NewArrayExpsAssignment_2_1_9_6_3 )
            {
             before(grammarAccess.getExpAccess().getNewArrayExpsAssignment_2_1_9_6_3()); 
            // InternalExTwentyOne.g:3567:2: ( rule__Exp__NewArrayExpsAssignment_2_1_9_6_3 )
            // InternalExTwentyOne.g:3567:3: rule__Exp__NewArrayExpsAssignment_2_1_9_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Exp__NewArrayExpsAssignment_2_1_9_6_3();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getNewArrayExpsAssignment_2_1_9_6_3()); 

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
    // $ANTLR end "rule__Exp__Group_2_1_9_6__3__Impl"


    // $ANTLR start "rule__LogicExp__Group__0"
    // InternalExTwentyOne.g:3576:1: rule__LogicExp__Group__0 : rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 ;
    public final void rule__LogicExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3580:1: ( rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 )
            // InternalExTwentyOne.g:3581:2: rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__LogicExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__1();

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
    // $ANTLR end "rule__LogicExp__Group__0"


    // $ANTLR start "rule__LogicExp__Group__0__Impl"
    // InternalExTwentyOne.g:3588:1: rule__LogicExp__Group__0__Impl : ( ( rule__LogicExp__LeftLogicAssignment_0 ) ) ;
    public final void rule__LogicExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3592:1: ( ( ( rule__LogicExp__LeftLogicAssignment_0 ) ) )
            // InternalExTwentyOne.g:3593:1: ( ( rule__LogicExp__LeftLogicAssignment_0 ) )
            {
            // InternalExTwentyOne.g:3593:1: ( ( rule__LogicExp__LeftLogicAssignment_0 ) )
            // InternalExTwentyOne.g:3594:2: ( rule__LogicExp__LeftLogicAssignment_0 )
            {
             before(grammarAccess.getLogicExpAccess().getLeftLogicAssignment_0()); 
            // InternalExTwentyOne.g:3595:2: ( rule__LogicExp__LeftLogicAssignment_0 )
            // InternalExTwentyOne.g:3595:3: rule__LogicExp__LeftLogicAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__LeftLogicAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getLeftLogicAssignment_0()); 

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
    // $ANTLR end "rule__LogicExp__Group__0__Impl"


    // $ANTLR start "rule__LogicExp__Group__1"
    // InternalExTwentyOne.g:3603:1: rule__LogicExp__Group__1 : rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 ;
    public final void rule__LogicExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3607:1: ( rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 )
            // InternalExTwentyOne.g:3608:2: rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LogicExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__2();

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
    // $ANTLR end "rule__LogicExp__Group__1"


    // $ANTLR start "rule__LogicExp__Group__1__Impl"
    // InternalExTwentyOne.g:3615:1: rule__LogicExp__Group__1__Impl : ( ( rule__LogicExp__Alternatives_1 ) ) ;
    public final void rule__LogicExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3619:1: ( ( ( rule__LogicExp__Alternatives_1 ) ) )
            // InternalExTwentyOne.g:3620:1: ( ( rule__LogicExp__Alternatives_1 ) )
            {
            // InternalExTwentyOne.g:3620:1: ( ( rule__LogicExp__Alternatives_1 ) )
            // InternalExTwentyOne.g:3621:2: ( rule__LogicExp__Alternatives_1 )
            {
             before(grammarAccess.getLogicExpAccess().getAlternatives_1()); 
            // InternalExTwentyOne.g:3622:2: ( rule__LogicExp__Alternatives_1 )
            // InternalExTwentyOne.g:3622:3: rule__LogicExp__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__LogicExp__Group__1__Impl"


    // $ANTLR start "rule__LogicExp__Group__2"
    // InternalExTwentyOne.g:3630:1: rule__LogicExp__Group__2 : rule__LogicExp__Group__2__Impl ;
    public final void rule__LogicExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3634:1: ( rule__LogicExp__Group__2__Impl )
            // InternalExTwentyOne.g:3635:2: rule__LogicExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__2__Impl();

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
    // $ANTLR end "rule__LogicExp__Group__2"


    // $ANTLR start "rule__LogicExp__Group__2__Impl"
    // InternalExTwentyOne.g:3641:1: rule__LogicExp__Group__2__Impl : ( ( rule__LogicExp__RightLogicAssignment_2 ) ) ;
    public final void rule__LogicExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3645:1: ( ( ( rule__LogicExp__RightLogicAssignment_2 ) ) )
            // InternalExTwentyOne.g:3646:1: ( ( rule__LogicExp__RightLogicAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3646:1: ( ( rule__LogicExp__RightLogicAssignment_2 ) )
            // InternalExTwentyOne.g:3647:2: ( rule__LogicExp__RightLogicAssignment_2 )
            {
             before(grammarAccess.getLogicExpAccess().getRightLogicAssignment_2()); 
            // InternalExTwentyOne.g:3648:2: ( rule__LogicExp__RightLogicAssignment_2 )
            // InternalExTwentyOne.g:3648:3: rule__LogicExp__RightLogicAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__RightLogicAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getRightLogicAssignment_2()); 

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
    // $ANTLR end "rule__LogicExp__Group__2__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalExTwentyOne.g:3657:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3661:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3662:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3662:2: ( RULE_ID )
            // InternalExTwentyOne.g:3663:3: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Program__DeclarationsAssignment_2"
    // InternalExTwentyOne.g:3672:1: rule__Program__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Program__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3676:1: ( ( ruleDeclaration ) )
            // InternalExTwentyOne.g:3677:2: ( ruleDeclaration )
            {
            // InternalExTwentyOne.g:3677:2: ( ruleDeclaration )
            // InternalExTwentyOne.g:3678:3: ruleDeclaration
            {
             before(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Program__DeclarationsAssignment_2"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalExTwentyOne.g:3687:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3691:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3692:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3692:2: ( RULE_ID )
            // InternalExTwentyOne.g:3693:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Function__NameAssignment_2"
    // InternalExTwentyOne.g:3702:1: rule__Function__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3706:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3707:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3707:2: ( RULE_ID )
            // InternalExTwentyOne.g:3708:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_2"


    // $ANTLR start "rule__Function__LambdaAssignment_3"
    // InternalExTwentyOne.g:3717:1: rule__Function__LambdaAssignment_3 : ( ruleLambda ) ;
    public final void rule__Function__LambdaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3721:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:3722:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:3722:2: ( ruleLambda )
            // InternalExTwentyOne.g:3723:3: ruleLambda
            {
             before(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Function__LambdaAssignment_3"


    // $ANTLR start "rule__Lambda__NameAssignment_2"
    // InternalExTwentyOne.g:3732:1: rule__Lambda__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Lambda__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3736:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3737:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3737:2: ( RULE_ID )
            // InternalExTwentyOne.g:3738:3: RULE_ID
            {
             before(grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Lambda__NameAssignment_2"


    // $ANTLR start "rule__Lambda__LambdaExpAssignment_7"
    // InternalExTwentyOne.g:3747:1: rule__Lambda__LambdaExpAssignment_7 : ( ruleExp ) ;
    public final void rule__Lambda__LambdaExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3751:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:3752:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:3752:2: ( ruleExp )
            // InternalExTwentyOne.g:3753:3: ruleExp
            {
             before(grammarAccess.getLambdaAccess().getLambdaExpExpParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getLambdaExpExpParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Lambda__LambdaExpAssignment_7"


    // $ANTLR start "rule__Input__NameAssignment_2"
    // InternalExTwentyOne.g:3762:1: rule__Input__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3766:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3767:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3767:2: ( RULE_ID )
            // InternalExTwentyOne.g:3768:3: RULE_ID
            {
             before(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Input__NameAssignment_2"


    // $ANTLR start "rule__Node__NameAssignment_2"
    // InternalExTwentyOne.g:3777:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3781:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3782:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3782:2: ( RULE_ID )
            // InternalExTwentyOne.g:3783:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Node__NameAssignment_2"


    // $ANTLR start "rule__Node__FunctionAssignment_4_0"
    // InternalExTwentyOne.g:3792:1: rule__Node__FunctionAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__FunctionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3796:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3797:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3797:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3798:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_4_0_0()); 
            // InternalExTwentyOne.g:3799:3: ( RULE_ID )
            // InternalExTwentyOne.g:3800:4: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getFunctionFunctionIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getFunctionFunctionIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_4_0_0()); 

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
    // $ANTLR end "rule__Node__FunctionAssignment_4_0"


    // $ANTLR start "rule__Node__LambdaAssignment_4_1"
    // InternalExTwentyOne.g:3811:1: rule__Node__LambdaAssignment_4_1 : ( ruleLambda ) ;
    public final void rule__Node__LambdaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3815:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:3816:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:3816:2: ( ruleLambda )
            // InternalExTwentyOne.g:3817:3: ruleLambda
            {
             before(grammarAccess.getNodeAccess().getLambdaLambdaParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getLambdaLambdaParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Node__LambdaAssignment_4_1"


    // $ANTLR start "rule__Stream__InputsOrNodesAssignment_2"
    // InternalExTwentyOne.g:3826:1: rule__Stream__InputsOrNodesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsOrNodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3830:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3831:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3831:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3832:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_2_0()); 
            // InternalExTwentyOne.g:3833:3: ( RULE_ID )
            // InternalExTwentyOne.g:3834:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_2_0()); 

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
    // $ANTLR end "rule__Stream__InputsOrNodesAssignment_2"


    // $ANTLR start "rule__Stream__InputsOrNodesAssignment_3_1"
    // InternalExTwentyOne.g:3845:1: rule__Stream__InputsOrNodesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsOrNodesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3849:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3850:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3850:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3851:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_3_1_0()); 
            // InternalExTwentyOne.g:3852:3: ( RULE_ID )
            // InternalExTwentyOne.g:3853:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Stream__InputsOrNodesAssignment_3_1"


    // $ANTLR start "rule__Stream__ElementsAssignment_4_1"
    // InternalExTwentyOne.g:3864:1: rule__Stream__ElementsAssignment_4_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3868:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:3869:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:3869:2: ( ruleElement )
            // InternalExTwentyOne.g:3870:3: ruleElement
            {
             before(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Stream__ElementsAssignment_4_1"


    // $ANTLR start "rule__Stream__ElementsAssignment_4_2_1"
    // InternalExTwentyOne.g:3879:1: rule__Stream__ElementsAssignment_4_2_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3883:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:3884:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:3884:2: ( ruleElement )
            // InternalExTwentyOne.g:3885:3: ruleElement
            {
             before(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__Stream__ElementsAssignment_4_2_1"


    // $ANTLR start "rule__Element__ElementAssignment_0_1"
    // InternalExTwentyOne.g:3894:1: rule__Element__ElementAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Element__ElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3898:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3899:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3899:2: ( RULE_ID )
            // InternalExTwentyOne.g:3900:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getElementIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getElementIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Element__ElementAssignment_0_1"


    // $ANTLR start "rule__Element__NodeAssignment_1_1_0"
    // InternalExTwentyOne.g:3909:1: rule__Element__NodeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Element__NodeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3913:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3914:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3914:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3915:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getNodeNodeCrossReference_1_1_0_0()); 
            // InternalExTwentyOne.g:3916:3: ( RULE_ID )
            // InternalExTwentyOne.g:3917:4: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNodeNodeIDTerminalRuleCall_1_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNodeNodeIDTerminalRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getElementAccess().getNodeNodeCrossReference_1_1_0_0()); 

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
    // $ANTLR end "rule__Element__NodeAssignment_1_1_0"


    // $ANTLR start "rule__Element__OutputAssignment_2_1"
    // InternalExTwentyOne.g:3928:1: rule__Element__OutputAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Element__OutputAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3932:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3933:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3933:2: ( RULE_ID )
            // InternalExTwentyOne.g:3934:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getOutputIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getOutputIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Element__OutputAssignment_2_1"


    // $ANTLR start "rule__DataDecl__NameAssignment_2"
    // InternalExTwentyOne.g:3943:1: rule__DataDecl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3947:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3948:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3948:2: ( RULE_ID )
            // InternalExTwentyOne.g:3949:3: RULE_ID
            {
             before(grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataDecl__NameAssignment_2"


    // $ANTLR start "rule__DataDecl__DataAssignment_4"
    // InternalExTwentyOne.g:3958:1: rule__DataDecl__DataAssignment_4 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3962:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3963:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3963:2: ( RULE_ID )
            // InternalExTwentyOne.g:3964:3: RULE_ID
            {
             before(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__DataDecl__DataAssignment_4"


    // $ANTLR start "rule__DataDecl__DataAssignment_7_1"
    // InternalExTwentyOne.g:3973:1: rule__DataDecl__DataAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3977:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3978:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3978:2: ( RULE_ID )
            // InternalExTwentyOne.g:3979:3: RULE_ID
            {
             before(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__DataDecl__DataAssignment_7_1"


    // $ANTLR start "rule__Exp__LeftAssignment_2_0"
    // InternalExTwentyOne.g:3988:1: rule__Exp__LeftAssignment_2_0 : ( ruleType ) ;
    public final void rule__Exp__LeftAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3992:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:3993:2: ( ruleType )
            {
            // InternalExTwentyOne.g:3993:2: ( ruleType )
            // InternalExTwentyOne.g:3994:3: ruleType
            {
             before(grammarAccess.getExpAccess().getLeftTypeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getExpAccess().getLeftTypeParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Exp__LeftAssignment_2_0"


    // $ANTLR start "rule__Exp__RightPlusAssignment_2_1_0_1"
    // InternalExTwentyOne.g:4003:1: rule__Exp__RightPlusAssignment_2_1_0_1 : ( ruleExp ) ;
    public final void rule__Exp__RightPlusAssignment_2_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4007:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4008:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4008:2: ( ruleExp )
            // InternalExTwentyOne.g:4009:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getRightPlusExpParserRuleCall_2_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightPlusExpParserRuleCall_2_1_0_1_0()); 

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
    // $ANTLR end "rule__Exp__RightPlusAssignment_2_1_0_1"


    // $ANTLR start "rule__Exp__RightMinusAssignment_2_1_1_1"
    // InternalExTwentyOne.g:4018:1: rule__Exp__RightMinusAssignment_2_1_1_1 : ( ruleExp ) ;
    public final void rule__Exp__RightMinusAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4022:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4023:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4023:2: ( ruleExp )
            // InternalExTwentyOne.g:4024:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getRightMinusExpParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightMinusExpParserRuleCall_2_1_1_1_0()); 

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
    // $ANTLR end "rule__Exp__RightMinusAssignment_2_1_1_1"


    // $ANTLR start "rule__Exp__RightMultiplyAssignment_2_1_2_1"
    // InternalExTwentyOne.g:4033:1: rule__Exp__RightMultiplyAssignment_2_1_2_1 : ( ruleExp ) ;
    public final void rule__Exp__RightMultiplyAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4037:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4038:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4038:2: ( ruleExp )
            // InternalExTwentyOne.g:4039:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getRightMultiplyExpParserRuleCall_2_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightMultiplyExpParserRuleCall_2_1_2_1_0()); 

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
    // $ANTLR end "rule__Exp__RightMultiplyAssignment_2_1_2_1"


    // $ANTLR start "rule__Exp__RightDivideAssignment_2_1_3_1"
    // InternalExTwentyOne.g:4048:1: rule__Exp__RightDivideAssignment_2_1_3_1 : ( ruleExp ) ;
    public final void rule__Exp__RightDivideAssignment_2_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4052:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4053:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4053:2: ( ruleExp )
            // InternalExTwentyOne.g:4054:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getRightDivideExpParserRuleCall_2_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightDivideExpParserRuleCall_2_1_3_1_0()); 

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
    // $ANTLR end "rule__Exp__RightDivideAssignment_2_1_3_1"


    // $ANTLR start "rule__Exp__InParenthesisAssignment_2_1_4_1"
    // InternalExTwentyOne.g:4063:1: rule__Exp__InParenthesisAssignment_2_1_4_1 : ( ruleExp ) ;
    public final void rule__Exp__InParenthesisAssignment_2_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4067:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4068:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4068:2: ( ruleExp )
            // InternalExTwentyOne.g:4069:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getInParenthesisExpParserRuleCall_2_1_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getInParenthesisExpParserRuleCall_2_1_4_1_0()); 

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
    // $ANTLR end "rule__Exp__InParenthesisAssignment_2_1_4_1"


    // $ANTLR start "rule__Exp__LetIdAssignment_2_1_5_1"
    // InternalExTwentyOne.g:4078:1: rule__Exp__LetIdAssignment_2_1_5_1 : ( RULE_ID ) ;
    public final void rule__Exp__LetIdAssignment_2_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4082:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4083:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4083:2: ( RULE_ID )
            // InternalExTwentyOne.g:4084:3: RULE_ID
            {
             before(grammarAccess.getExpAccess().getLetIdIDTerminalRuleCall_2_1_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getLetIdIDTerminalRuleCall_2_1_5_1_0()); 

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
    // $ANTLR end "rule__Exp__LetIdAssignment_2_1_5_1"


    // $ANTLR start "rule__Exp__LetDefExpAssignment_2_1_5_3"
    // InternalExTwentyOne.g:4093:1: rule__Exp__LetDefExpAssignment_2_1_5_3 : ( ruleExp ) ;
    public final void rule__Exp__LetDefExpAssignment_2_1_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4097:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4098:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4098:2: ( ruleExp )
            // InternalExTwentyOne.g:4099:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getLetDefExpExpParserRuleCall_2_1_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getLetDefExpExpParserRuleCall_2_1_5_3_0()); 

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
    // $ANTLR end "rule__Exp__LetDefExpAssignment_2_1_5_3"


    // $ANTLR start "rule__Exp__LetTargetExpAssignment_2_1_5_5"
    // InternalExTwentyOne.g:4108:1: rule__Exp__LetTargetExpAssignment_2_1_5_5 : ( ruleExp ) ;
    public final void rule__Exp__LetTargetExpAssignment_2_1_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4112:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4113:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4113:2: ( ruleExp )
            // InternalExTwentyOne.g:4114:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getLetTargetExpExpParserRuleCall_2_1_5_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getLetTargetExpExpParserRuleCall_2_1_5_5_0()); 

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
    // $ANTLR end "rule__Exp__LetTargetExpAssignment_2_1_5_5"


    // $ANTLR start "rule__Exp__IfLogicExpAssignment_2_1_8_1"
    // InternalExTwentyOne.g:4123:1: rule__Exp__IfLogicExpAssignment_2_1_8_1 : ( ruleLogicExp ) ;
    public final void rule__Exp__IfLogicExpAssignment_2_1_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4127:1: ( ( ruleLogicExp ) )
            // InternalExTwentyOne.g:4128:2: ( ruleLogicExp )
            {
            // InternalExTwentyOne.g:4128:2: ( ruleLogicExp )
            // InternalExTwentyOne.g:4129:3: ruleLogicExp
            {
             before(grammarAccess.getExpAccess().getIfLogicExpLogicExpParserRuleCall_2_1_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getIfLogicExpLogicExpParserRuleCall_2_1_8_1_0()); 

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
    // $ANTLR end "rule__Exp__IfLogicExpAssignment_2_1_8_1"


    // $ANTLR start "rule__Exp__ThenExpAssignment_2_1_8_3"
    // InternalExTwentyOne.g:4138:1: rule__Exp__ThenExpAssignment_2_1_8_3 : ( ruleExp ) ;
    public final void rule__Exp__ThenExpAssignment_2_1_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4142:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4143:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4143:2: ( ruleExp )
            // InternalExTwentyOne.g:4144:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getThenExpExpParserRuleCall_2_1_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getThenExpExpParserRuleCall_2_1_8_3_0()); 

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
    // $ANTLR end "rule__Exp__ThenExpAssignment_2_1_8_3"


    // $ANTLR start "rule__Exp__ElseExpAssignment_2_1_8_5"
    // InternalExTwentyOne.g:4153:1: rule__Exp__ElseExpAssignment_2_1_8_5 : ( ruleExp ) ;
    public final void rule__Exp__ElseExpAssignment_2_1_8_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4157:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4158:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4158:2: ( ruleExp )
            // InternalExTwentyOne.g:4159:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getElseExpExpParserRuleCall_2_1_8_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getElseExpExpParserRuleCall_2_1_8_5_0()); 

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
    // $ANTLR end "rule__Exp__ElseExpAssignment_2_1_8_5"


    // $ANTLR start "rule__Exp__NewArrayIdAssignment_2_1_9_1"
    // InternalExTwentyOne.g:4168:1: rule__Exp__NewArrayIdAssignment_2_1_9_1 : ( RULE_ID ) ;
    public final void rule__Exp__NewArrayIdAssignment_2_1_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4172:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4173:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4173:2: ( RULE_ID )
            // InternalExTwentyOne.g:4174:3: RULE_ID
            {
             before(grammarAccess.getExpAccess().getNewArrayIdIDTerminalRuleCall_2_1_9_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getNewArrayIdIDTerminalRuleCall_2_1_9_1_0()); 

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
    // $ANTLR end "rule__Exp__NewArrayIdAssignment_2_1_9_1"


    // $ANTLR start "rule__Exp__NewArrayIdsAssignment_2_1_9_3"
    // InternalExTwentyOne.g:4183:1: rule__Exp__NewArrayIdsAssignment_2_1_9_3 : ( RULE_ID ) ;
    public final void rule__Exp__NewArrayIdsAssignment_2_1_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4187:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4188:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4188:2: ( RULE_ID )
            // InternalExTwentyOne.g:4189:3: RULE_ID
            {
             before(grammarAccess.getExpAccess().getNewArrayIdsIDTerminalRuleCall_2_1_9_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getNewArrayIdsIDTerminalRuleCall_2_1_9_3_0()); 

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
    // $ANTLR end "rule__Exp__NewArrayIdsAssignment_2_1_9_3"


    // $ANTLR start "rule__Exp__NewArrayExpsAssignment_2_1_9_5"
    // InternalExTwentyOne.g:4198:1: rule__Exp__NewArrayExpsAssignment_2_1_9_5 : ( ruleExp ) ;
    public final void rule__Exp__NewArrayExpsAssignment_2_1_9_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4202:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4203:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4203:2: ( ruleExp )
            // InternalExTwentyOne.g:4204:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getNewArrayExpsExpParserRuleCall_2_1_9_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getNewArrayExpsExpParserRuleCall_2_1_9_5_0()); 

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
    // $ANTLR end "rule__Exp__NewArrayExpsAssignment_2_1_9_5"


    // $ANTLR start "rule__Exp__NewArrayIdsAssignment_2_1_9_6_1"
    // InternalExTwentyOne.g:4213:1: rule__Exp__NewArrayIdsAssignment_2_1_9_6_1 : ( RULE_ID ) ;
    public final void rule__Exp__NewArrayIdsAssignment_2_1_9_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4217:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4218:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4218:2: ( RULE_ID )
            // InternalExTwentyOne.g:4219:3: RULE_ID
            {
             before(grammarAccess.getExpAccess().getNewArrayIdsIDTerminalRuleCall_2_1_9_6_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getNewArrayIdsIDTerminalRuleCall_2_1_9_6_1_0()); 

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
    // $ANTLR end "rule__Exp__NewArrayIdsAssignment_2_1_9_6_1"


    // $ANTLR start "rule__Exp__NewArrayExpsAssignment_2_1_9_6_3"
    // InternalExTwentyOne.g:4228:1: rule__Exp__NewArrayExpsAssignment_2_1_9_6_3 : ( ruleExp ) ;
    public final void rule__Exp__NewArrayExpsAssignment_2_1_9_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4232:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4233:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4233:2: ( ruleExp )
            // InternalExTwentyOne.g:4234:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getNewArrayExpsExpParserRuleCall_2_1_9_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getNewArrayExpsExpParserRuleCall_2_1_9_6_3_0()); 

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
    // $ANTLR end "rule__Exp__NewArrayExpsAssignment_2_1_9_6_3"


    // $ANTLR start "rule__LogicExp__LeftLogicAssignment_0"
    // InternalExTwentyOne.g:4243:1: rule__LogicExp__LeftLogicAssignment_0 : ( ruleExp ) ;
    public final void rule__LogicExp__LeftLogicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4247:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4248:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4248:2: ( ruleExp )
            // InternalExTwentyOne.g:4249:3: ruleExp
            {
             before(grammarAccess.getLogicExpAccess().getLeftLogicExpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLogicExpAccess().getLeftLogicExpParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LogicExp__LeftLogicAssignment_0"


    // $ANTLR start "rule__LogicExp__RightLogicAssignment_2"
    // InternalExTwentyOne.g:4258:1: rule__LogicExp__RightLogicAssignment_2 : ( ruleExp ) ;
    public final void rule__LogicExp__RightLogicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4262:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4263:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4263:2: ( ruleExp )
            // InternalExTwentyOne.g:4264:3: ruleExp
            {
             before(grammarAccess.getLogicExpAccess().getRightLogicExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLogicExpAccess().getRightLogicExpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LogicExp__RightLogicAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000898500000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000898500002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000420000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000091F000802010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000007C000L});

}