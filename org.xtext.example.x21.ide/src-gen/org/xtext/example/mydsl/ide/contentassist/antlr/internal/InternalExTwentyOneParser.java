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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'+'"
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
    // InternalExTwentyOne.g:237:1: ruleStream : ( ( rule__Stream__Alternatives ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:241:2: ( ( ( rule__Stream__Alternatives ) ) )
            // InternalExTwentyOne.g:242:2: ( ( rule__Stream__Alternatives ) )
            {
            // InternalExTwentyOne.g:242:2: ( ( rule__Stream__Alternatives ) )
            // InternalExTwentyOne.g:243:3: ( rule__Stream__Alternatives )
            {
             before(grammarAccess.getStreamAccess().getAlternatives()); 
            // InternalExTwentyOne.g:244:3: ( rule__Stream__Alternatives )
            // InternalExTwentyOne.g:244:4: rule__Stream__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalExTwentyOne.g:352:1: rule__Declaration__Alternatives : ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:356:1: ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
            case 25:
                {
                alt1=4;
                }
                break;
            case 29:
                {
                alt1=5;
                }
                break;
            case 14:
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
                    // InternalExTwentyOne.g:357:2: ( ruleFunction )
                    {
                    // InternalExTwentyOne.g:357:2: ( ruleFunction )
                    // InternalExTwentyOne.g:358:3: ruleFunction
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
                    // InternalExTwentyOne.g:363:2: ( ruleInput )
                    {
                    // InternalExTwentyOne.g:363:2: ( ruleInput )
                    // InternalExTwentyOne.g:364:3: ruleInput
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
                    // InternalExTwentyOne.g:369:2: ( ruleNode )
                    {
                    // InternalExTwentyOne.g:369:2: ( ruleNode )
                    // InternalExTwentyOne.g:370:3: ruleNode
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
                    // InternalExTwentyOne.g:375:2: ( ruleStream )
                    {
                    // InternalExTwentyOne.g:375:2: ( ruleStream )
                    // InternalExTwentyOne.g:376:3: ruleStream
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
                    // InternalExTwentyOne.g:381:2: ( ruleDataDecl )
                    {
                    // InternalExTwentyOne.g:381:2: ( ruleDataDecl )
                    // InternalExTwentyOne.g:382:3: ruleDataDecl
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
                    // InternalExTwentyOne.g:387:2: ( ruleParameter )
                    {
                    // InternalExTwentyOne.g:387:2: ( ruleParameter )
                    // InternalExTwentyOne.g:388:3: ruleParameter
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


    // $ANTLR start "rule__Node__Alternatives_3"
    // InternalExTwentyOne.g:397:1: rule__Node__Alternatives_3 : ( ( ( rule__Node__FunctionAssignment_3_0 ) ) | ( ( rule__Node__LambdaAssignment_3_1 ) ) );
    public final void rule__Node__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:401:1: ( ( ( rule__Node__FunctionAssignment_3_0 ) ) | ( ( rule__Node__LambdaAssignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExTwentyOne.g:402:2: ( ( rule__Node__FunctionAssignment_3_0 ) )
                    {
                    // InternalExTwentyOne.g:402:2: ( ( rule__Node__FunctionAssignment_3_0 ) )
                    // InternalExTwentyOne.g:403:3: ( rule__Node__FunctionAssignment_3_0 )
                    {
                     before(grammarAccess.getNodeAccess().getFunctionAssignment_3_0()); 
                    // InternalExTwentyOne.g:404:3: ( rule__Node__FunctionAssignment_3_0 )
                    // InternalExTwentyOne.g:404:4: rule__Node__FunctionAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__FunctionAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getFunctionAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:408:2: ( ( rule__Node__LambdaAssignment_3_1 ) )
                    {
                    // InternalExTwentyOne.g:408:2: ( ( rule__Node__LambdaAssignment_3_1 ) )
                    // InternalExTwentyOne.g:409:3: ( rule__Node__LambdaAssignment_3_1 )
                    {
                     before(grammarAccess.getNodeAccess().getLambdaAssignment_3_1()); 
                    // InternalExTwentyOne.g:410:3: ( rule__Node__LambdaAssignment_3_1 )
                    // InternalExTwentyOne.g:410:4: rule__Node__LambdaAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__LambdaAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getLambdaAssignment_3_1()); 

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
    // $ANTLR end "rule__Node__Alternatives_3"


    // $ANTLR start "rule__Stream__Alternatives"
    // InternalExTwentyOne.g:418:1: rule__Stream__Alternatives : ( ( ( rule__Stream__Group_0__0 ) ) | ( ( rule__Stream__Group_1__0 ) ) );
    public final void rule__Stream__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:422:1: ( ( ( rule__Stream__Group_0__0 ) ) | ( ( rule__Stream__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExTwentyOne.g:423:2: ( ( rule__Stream__Group_0__0 ) )
                    {
                    // InternalExTwentyOne.g:423:2: ( ( rule__Stream__Group_0__0 ) )
                    // InternalExTwentyOne.g:424:3: ( rule__Stream__Group_0__0 )
                    {
                     before(grammarAccess.getStreamAccess().getGroup_0()); 
                    // InternalExTwentyOne.g:425:3: ( rule__Stream__Group_0__0 )
                    // InternalExTwentyOne.g:425:4: rule__Stream__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stream__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStreamAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:429:2: ( ( rule__Stream__Group_1__0 ) )
                    {
                    // InternalExTwentyOne.g:429:2: ( ( rule__Stream__Group_1__0 ) )
                    // InternalExTwentyOne.g:430:3: ( rule__Stream__Group_1__0 )
                    {
                     before(grammarAccess.getStreamAccess().getGroup_1()); 
                    // InternalExTwentyOne.g:431:3: ( rule__Stream__Group_1__0 )
                    // InternalExTwentyOne.g:431:4: rule__Stream__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stream__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStreamAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Stream__Alternatives"


    // $ANTLR start "rule__Stream__Alternatives_1_1"
    // InternalExTwentyOne.g:439:1: rule__Stream__Alternatives_1_1 : ( ( ( rule__Stream__Group_1_1_0__0 ) ) | ( ( rule__Stream__InputsAssignment_1_1_1 ) ) );
    public final void rule__Stream__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:443:1: ( ( ( rule__Stream__Group_1_1_0__0 ) ) | ( ( rule__Stream__InputsAssignment_1_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExTwentyOne.g:444:2: ( ( rule__Stream__Group_1_1_0__0 ) )
                    {
                    // InternalExTwentyOne.g:444:2: ( ( rule__Stream__Group_1_1_0__0 ) )
                    // InternalExTwentyOne.g:445:3: ( rule__Stream__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getStreamAccess().getGroup_1_1_0()); 
                    // InternalExTwentyOne.g:446:3: ( rule__Stream__Group_1_1_0__0 )
                    // InternalExTwentyOne.g:446:4: rule__Stream__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stream__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStreamAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:450:2: ( ( rule__Stream__InputsAssignment_1_1_1 ) )
                    {
                    // InternalExTwentyOne.g:450:2: ( ( rule__Stream__InputsAssignment_1_1_1 ) )
                    // InternalExTwentyOne.g:451:3: ( rule__Stream__InputsAssignment_1_1_1 )
                    {
                     before(grammarAccess.getStreamAccess().getInputsAssignment_1_1_1()); 
                    // InternalExTwentyOne.g:452:3: ( rule__Stream__InputsAssignment_1_1_1 )
                    // InternalExTwentyOne.g:452:4: rule__Stream__InputsAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stream__InputsAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStreamAccess().getInputsAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Stream__Alternatives_1_1"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalExTwentyOne.g:460:1: rule__Element__Alternatives : ( ( ( rule__Element__ElementAssignment_0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:464:1: ( ( ( rule__Element__ElementAssignment_0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 28:
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
                    // InternalExTwentyOne.g:465:2: ( ( rule__Element__ElementAssignment_0 ) )
                    {
                    // InternalExTwentyOne.g:465:2: ( ( rule__Element__ElementAssignment_0 ) )
                    // InternalExTwentyOne.g:466:3: ( rule__Element__ElementAssignment_0 )
                    {
                     before(grammarAccess.getElementAccess().getElementAssignment_0()); 
                    // InternalExTwentyOne.g:467:3: ( rule__Element__ElementAssignment_0 )
                    // InternalExTwentyOne.g:467:4: rule__Element__ElementAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__ElementAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getElementAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:471:2: ( ( rule__Element__Group_1__0 ) )
                    {
                    // InternalExTwentyOne.g:471:2: ( ( rule__Element__Group_1__0 ) )
                    // InternalExTwentyOne.g:472:3: ( rule__Element__Group_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1()); 
                    // InternalExTwentyOne.g:473:3: ( rule__Element__Group_1__0 )
                    // InternalExTwentyOne.g:473:4: rule__Element__Group_1__0
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
                    // InternalExTwentyOne.g:477:2: ( ( rule__Element__Group_2__0 ) )
                    {
                    // InternalExTwentyOne.g:477:2: ( ( rule__Element__Group_2__0 ) )
                    // InternalExTwentyOne.g:478:3: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // InternalExTwentyOne.g:479:3: ( rule__Element__Group_2__0 )
                    // InternalExTwentyOne.g:479:4: rule__Element__Group_2__0
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
    // InternalExTwentyOne.g:487:1: rule__Element__Alternatives_1_1 : ( ( ( rule__Element__NodeAssignment_1_1_0 ) ) | ( ruleLambda ) );
    public final void rule__Element__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:491:1: ( ( ( rule__Element__NodeAssignment_1_1_0 ) ) | ( ruleLambda ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalExTwentyOne.g:492:2: ( ( rule__Element__NodeAssignment_1_1_0 ) )
                    {
                    // InternalExTwentyOne.g:492:2: ( ( rule__Element__NodeAssignment_1_1_0 ) )
                    // InternalExTwentyOne.g:493:3: ( rule__Element__NodeAssignment_1_1_0 )
                    {
                     before(grammarAccess.getElementAccess().getNodeAssignment_1_1_0()); 
                    // InternalExTwentyOne.g:494:3: ( rule__Element__NodeAssignment_1_1_0 )
                    // InternalExTwentyOne.g:494:4: rule__Element__NodeAssignment_1_1_0
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
                    // InternalExTwentyOne.g:498:2: ( ruleLambda )
                    {
                    // InternalExTwentyOne.g:498:2: ( ruleLambda )
                    // InternalExTwentyOne.g:499:3: ruleLambda
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
    // InternalExTwentyOne.g:508:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:512:1: ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalExTwentyOne.g:513:2: ( 'int' )
                    {
                    // InternalExTwentyOne.g:513:2: ( 'int' )
                    // InternalExTwentyOne.g:514:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:519:2: ( 'string' )
                    {
                    // InternalExTwentyOne.g:519:2: ( 'string' )
                    // InternalExTwentyOne.g:520:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:525:2: ( RULE_ID )
                    {
                    // InternalExTwentyOne.g:525:2: ( RULE_ID )
                    // InternalExTwentyOne.g:526:3: RULE_ID
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


    // $ANTLR start "rule__Program__Group__0"
    // InternalExTwentyOne.g:535:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:539:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalExTwentyOne.g:540:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalExTwentyOne.g:547:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:551:1: ( ( 'program' ) )
            // InternalExTwentyOne.g:552:1: ( 'program' )
            {
            // InternalExTwentyOne.g:552:1: ( 'program' )
            // InternalExTwentyOne.g:553:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalExTwentyOne.g:562:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:566:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalExTwentyOne.g:567:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalExTwentyOne.g:574:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:578:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:579:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:579:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalExTwentyOne.g:580:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:581:2: ( rule__Program__NameAssignment_1 )
            // InternalExTwentyOne.g:581:3: rule__Program__NameAssignment_1
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
    // InternalExTwentyOne.g:589:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:593:1: ( rule__Program__Group__2__Impl )
            // InternalExTwentyOne.g:594:2: rule__Program__Group__2__Impl
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
    // InternalExTwentyOne.g:600:1: rule__Program__Group__2__Impl : ( ( rule__Program__DeclarationsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:604:1: ( ( ( rule__Program__DeclarationsAssignment_2 )* ) )
            // InternalExTwentyOne.g:605:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            {
            // InternalExTwentyOne.g:605:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            // InternalExTwentyOne.g:606:2: ( rule__Program__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getDeclarationsAssignment_2()); 
            // InternalExTwentyOne.g:607:2: ( rule__Program__DeclarationsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==14||LA8_0==16||(LA8_0>=21 && LA8_0<=22)||LA8_0==25||LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExTwentyOne.g:607:3: rule__Program__DeclarationsAssignment_2
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
    // InternalExTwentyOne.g:616:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:620:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalExTwentyOne.g:621:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalExTwentyOne.g:628:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:632:1: ( ( 'parameter' ) )
            // InternalExTwentyOne.g:633:1: ( 'parameter' )
            {
            // InternalExTwentyOne.g:633:1: ( 'parameter' )
            // InternalExTwentyOne.g:634:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalExTwentyOne.g:643:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:647:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalExTwentyOne.g:648:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalExTwentyOne.g:655:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:659:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:660:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:660:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalExTwentyOne.g:661:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:662:2: ( rule__Parameter__NameAssignment_1 )
            // InternalExTwentyOne.g:662:3: rule__Parameter__NameAssignment_1
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
    // InternalExTwentyOne.g:670:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:674:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalExTwentyOne.g:675:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalExTwentyOne.g:682:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:686:1: ( ( ':' ) )
            // InternalExTwentyOne.g:687:1: ( ':' )
            {
            // InternalExTwentyOne.g:687:1: ( ':' )
            // InternalExTwentyOne.g:688:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalExTwentyOne.g:697:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:701:1: ( rule__Parameter__Group__3__Impl )
            // InternalExTwentyOne.g:702:2: rule__Parameter__Group__3__Impl
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
    // InternalExTwentyOne.g:708:1: rule__Parameter__Group__3__Impl : ( ruleType ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:712:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:713:1: ( ruleType )
            {
            // InternalExTwentyOne.g:713:1: ( ruleType )
            // InternalExTwentyOne.g:714:2: ruleType
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
    // InternalExTwentyOne.g:724:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:728:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalExTwentyOne.g:729:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalExTwentyOne.g:736:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:740:1: ( ( 'function' ) )
            // InternalExTwentyOne.g:741:1: ( 'function' )
            {
            // InternalExTwentyOne.g:741:1: ( 'function' )
            // InternalExTwentyOne.g:742:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalExTwentyOne.g:751:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:755:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalExTwentyOne.g:756:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalExTwentyOne.g:763:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:767:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:768:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:768:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalExTwentyOne.g:769:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:770:2: ( rule__Function__NameAssignment_1 )
            // InternalExTwentyOne.g:770:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:778:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:782:1: ( rule__Function__Group__2__Impl )
            // InternalExTwentyOne.g:783:2: rule__Function__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__2__Impl();

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
    // InternalExTwentyOne.g:789:1: rule__Function__Group__2__Impl : ( ( rule__Function__LambdaAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:793:1: ( ( ( rule__Function__LambdaAssignment_2 ) ) )
            // InternalExTwentyOne.g:794:1: ( ( rule__Function__LambdaAssignment_2 ) )
            {
            // InternalExTwentyOne.g:794:1: ( ( rule__Function__LambdaAssignment_2 ) )
            // InternalExTwentyOne.g:795:2: ( rule__Function__LambdaAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getLambdaAssignment_2()); 
            // InternalExTwentyOne.g:796:2: ( rule__Function__LambdaAssignment_2 )
            // InternalExTwentyOne.g:796:3: rule__Function__LambdaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__LambdaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getLambdaAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Lambda__Group__0"
    // InternalExTwentyOne.g:805:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:809:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalExTwentyOne.g:810:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalExTwentyOne.g:817:1: rule__Lambda__Group__0__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:821:1: ( ( '(' ) )
            // InternalExTwentyOne.g:822:1: ( '(' )
            {
            // InternalExTwentyOne.g:822:1: ( '(' )
            // InternalExTwentyOne.g:823:2: '('
            {
             before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__Group__0__Impl"


    // $ANTLR start "rule__Lambda__Group__1"
    // InternalExTwentyOne.g:832:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:836:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalExTwentyOne.g:837:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalExTwentyOne.g:844:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__NameAssignment_1 ) ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:848:1: ( ( ( rule__Lambda__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:849:1: ( ( rule__Lambda__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:849:1: ( ( rule__Lambda__NameAssignment_1 ) )
            // InternalExTwentyOne.g:850:2: ( rule__Lambda__NameAssignment_1 )
            {
             before(grammarAccess.getLambdaAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:851:2: ( rule__Lambda__NameAssignment_1 )
            // InternalExTwentyOne.g:851:3: rule__Lambda__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:859:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:863:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalExTwentyOne.g:864:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalExTwentyOne.g:871:1: rule__Lambda__Group__2__Impl : ( ':' ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:875:1: ( ( ':' ) )
            // InternalExTwentyOne.g:876:1: ( ':' )
            {
            // InternalExTwentyOne.g:876:1: ( ':' )
            // InternalExTwentyOne.g:877:2: ':'
            {
             before(grammarAccess.getLambdaAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:886:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:890:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalExTwentyOne.g:891:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalExTwentyOne.g:898:1: rule__Lambda__Group__3__Impl : ( ruleType ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:902:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:903:1: ( ruleType )
            {
            // InternalExTwentyOne.g:903:1: ( ruleType )
            // InternalExTwentyOne.g:904:2: ruleType
            {
             before(grammarAccess.getLambdaAccess().getTypeParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getTypeParserRuleCall_3()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:913:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:917:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalExTwentyOne.g:918:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
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
    // InternalExTwentyOne.g:925:1: rule__Lambda__Group__4__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:929:1: ( ( ')' ) )
            // InternalExTwentyOne.g:930:1: ( ')' )
            {
            // InternalExTwentyOne.g:930:1: ( ')' )
            // InternalExTwentyOne.g:931:2: ')'
            {
             before(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:940:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl rule__Lambda__Group__6 ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:944:1: ( rule__Lambda__Group__5__Impl rule__Lambda__Group__6 )
            // InternalExTwentyOne.g:945:2: rule__Lambda__Group__5__Impl rule__Lambda__Group__6
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
    // InternalExTwentyOne.g:952:1: rule__Lambda__Group__5__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:956:1: ( ( '{' ) )
            // InternalExTwentyOne.g:957:1: ( '{' )
            {
            // InternalExTwentyOne.g:957:1: ( '{' )
            // InternalExTwentyOne.g:958:2: '{'
            {
             before(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:967:1: rule__Lambda__Group__6 : rule__Lambda__Group__6__Impl rule__Lambda__Group__7 ;
    public final void rule__Lambda__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:971:1: ( rule__Lambda__Group__6__Impl rule__Lambda__Group__7 )
            // InternalExTwentyOne.g:972:2: rule__Lambda__Group__6__Impl rule__Lambda__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalExTwentyOne.g:979:1: rule__Lambda__Group__6__Impl : ( ruleExp ) ;
    public final void rule__Lambda__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:983:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:984:1: ( ruleExp )
            {
            // InternalExTwentyOne.g:984:1: ( ruleExp )
            // InternalExTwentyOne.g:985:2: ruleExp
            {
             before(grammarAccess.getLambdaAccess().getExpParserRuleCall_6()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getExpParserRuleCall_6()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:994:1: rule__Lambda__Group__7 : rule__Lambda__Group__7__Impl ;
    public final void rule__Lambda__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:998:1: ( rule__Lambda__Group__7__Impl )
            // InternalExTwentyOne.g:999:2: rule__Lambda__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__7__Impl();

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
    // InternalExTwentyOne.g:1005:1: rule__Lambda__Group__7__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1009:1: ( ( '}' ) )
            // InternalExTwentyOne.g:1010:1: ( '}' )
            {
            // InternalExTwentyOne.g:1010:1: ( '}' )
            // InternalExTwentyOne.g:1011:2: '}'
            {
             before(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Input__Group__0"
    // InternalExTwentyOne.g:1021:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1025:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalExTwentyOne.g:1026:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalExTwentyOne.g:1033:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1037:1: ( ( 'input' ) )
            // InternalExTwentyOne.g:1038:1: ( 'input' )
            {
            // InternalExTwentyOne.g:1038:1: ( 'input' )
            // InternalExTwentyOne.g:1039:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalExTwentyOne.g:1048:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1052:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalExTwentyOne.g:1053:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalExTwentyOne.g:1060:1: rule__Input__Group__1__Impl : ( ( rule__Input__NameAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1064:1: ( ( ( rule__Input__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:1065:1: ( ( rule__Input__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:1065:1: ( ( rule__Input__NameAssignment_1 ) )
            // InternalExTwentyOne.g:1066:2: ( rule__Input__NameAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:1067:2: ( rule__Input__NameAssignment_1 )
            // InternalExTwentyOne.g:1067:3: rule__Input__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1075:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1079:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalExTwentyOne.g:1080:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalExTwentyOne.g:1087:1: rule__Input__Group__2__Impl : ( ':' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1091:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1092:1: ( ':' )
            {
            // InternalExTwentyOne.g:1092:1: ( ':' )
            // InternalExTwentyOne.g:1093:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1102:1: rule__Input__Group__3 : rule__Input__Group__3__Impl ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1106:1: ( rule__Input__Group__3__Impl )
            // InternalExTwentyOne.g:1107:2: rule__Input__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__3__Impl();

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
    // InternalExTwentyOne.g:1113:1: rule__Input__Group__3__Impl : ( ruleType ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1117:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1118:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1118:1: ( ruleType )
            // InternalExTwentyOne.g:1119:2: ruleType
            {
             before(grammarAccess.getInputAccess().getTypeParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTypeParserRuleCall_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Node__Group__0"
    // InternalExTwentyOne.g:1129:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1133:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalExTwentyOne.g:1134:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalExTwentyOne.g:1141:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1145:1: ( ( 'node' ) )
            // InternalExTwentyOne.g:1146:1: ( 'node' )
            {
            // InternalExTwentyOne.g:1146:1: ( 'node' )
            // InternalExTwentyOne.g:1147:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalExTwentyOne.g:1156:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1160:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalExTwentyOne.g:1161:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalExTwentyOne.g:1168:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1172:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:1173:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:1173:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalExTwentyOne.g:1174:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:1175:2: ( rule__Node__NameAssignment_1 )
            // InternalExTwentyOne.g:1175:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1183:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1187:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalExTwentyOne.g:1188:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalExTwentyOne.g:1195:1: rule__Node__Group__2__Impl : ( '[' ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1199:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1200:1: ( '[' )
            {
            // InternalExTwentyOne.g:1200:1: ( '[' )
            // InternalExTwentyOne.g:1201:2: '['
            {
             before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1210:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1214:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalExTwentyOne.g:1215:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalExTwentyOne.g:1222:1: rule__Node__Group__3__Impl : ( ( rule__Node__Alternatives_3 ) ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1226:1: ( ( ( rule__Node__Alternatives_3 ) ) )
            // InternalExTwentyOne.g:1227:1: ( ( rule__Node__Alternatives_3 ) )
            {
            // InternalExTwentyOne.g:1227:1: ( ( rule__Node__Alternatives_3 ) )
            // InternalExTwentyOne.g:1228:2: ( rule__Node__Alternatives_3 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3()); 
            // InternalExTwentyOne.g:1229:2: ( rule__Node__Alternatives_3 )
            // InternalExTwentyOne.g:1229:3: rule__Node__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1237:1: rule__Node__Group__4 : rule__Node__Group__4__Impl ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1241:1: ( rule__Node__Group__4__Impl )
            // InternalExTwentyOne.g:1242:2: rule__Node__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__4__Impl();

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
    // InternalExTwentyOne.g:1248:1: rule__Node__Group__4__Impl : ( ']' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1252:1: ( ( ']' ) )
            // InternalExTwentyOne.g:1253:1: ( ']' )
            {
            // InternalExTwentyOne.g:1253:1: ( ']' )
            // InternalExTwentyOne.g:1254:2: ']'
            {
             before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Stream__Group_0__0"
    // InternalExTwentyOne.g:1264:1: rule__Stream__Group_0__0 : rule__Stream__Group_0__0__Impl rule__Stream__Group_0__1 ;
    public final void rule__Stream__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1268:1: ( rule__Stream__Group_0__0__Impl rule__Stream__Group_0__1 )
            // InternalExTwentyOne.g:1269:2: rule__Stream__Group_0__0__Impl rule__Stream__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Stream__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_0__1();

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
    // $ANTLR end "rule__Stream__Group_0__0"


    // $ANTLR start "rule__Stream__Group_0__0__Impl"
    // InternalExTwentyOne.g:1276:1: rule__Stream__Group_0__0__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1280:1: ( ( 'stream' ) )
            // InternalExTwentyOne.g:1281:1: ( 'stream' )
            {
            // InternalExTwentyOne.g:1281:1: ( 'stream' )
            // InternalExTwentyOne.g:1282:2: 'stream'
            {
             before(grammarAccess.getStreamAccess().getStreamKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getStreamKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_0__0__Impl"


    // $ANTLR start "rule__Stream__Group_0__1"
    // InternalExTwentyOne.g:1291:1: rule__Stream__Group_0__1 : rule__Stream__Group_0__1__Impl ;
    public final void rule__Stream__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1295:1: ( rule__Stream__Group_0__1__Impl )
            // InternalExTwentyOne.g:1296:2: rule__Stream__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_0__1__Impl();

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
    // $ANTLR end "rule__Stream__Group_0__1"


    // $ANTLR start "rule__Stream__Group_0__1__Impl"
    // InternalExTwentyOne.g:1302:1: rule__Stream__Group_0__1__Impl : ( ( rule__Stream__InputsAssignment_0_1 ) ) ;
    public final void rule__Stream__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1306:1: ( ( ( rule__Stream__InputsAssignment_0_1 ) ) )
            // InternalExTwentyOne.g:1307:1: ( ( rule__Stream__InputsAssignment_0_1 ) )
            {
            // InternalExTwentyOne.g:1307:1: ( ( rule__Stream__InputsAssignment_0_1 ) )
            // InternalExTwentyOne.g:1308:2: ( rule__Stream__InputsAssignment_0_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsAssignment_0_1()); 
            // InternalExTwentyOne.g:1309:2: ( rule__Stream__InputsAssignment_0_1 )
            // InternalExTwentyOne.g:1309:3: rule__Stream__InputsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__InputsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getInputsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_0__1__Impl"


    // $ANTLR start "rule__Stream__Group_1__0"
    // InternalExTwentyOne.g:1318:1: rule__Stream__Group_1__0 : rule__Stream__Group_1__0__Impl rule__Stream__Group_1__1 ;
    public final void rule__Stream__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1322:1: ( rule__Stream__Group_1__0__Impl rule__Stream__Group_1__1 )
            // InternalExTwentyOne.g:1323:2: rule__Stream__Group_1__0__Impl rule__Stream__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Stream__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_1__1();

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
    // $ANTLR end "rule__Stream__Group_1__0"


    // $ANTLR start "rule__Stream__Group_1__0__Impl"
    // InternalExTwentyOne.g:1330:1: rule__Stream__Group_1__0__Impl : ( ( rule__Stream__InputsAssignment_1_0 ) ) ;
    public final void rule__Stream__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1334:1: ( ( ( rule__Stream__InputsAssignment_1_0 ) ) )
            // InternalExTwentyOne.g:1335:1: ( ( rule__Stream__InputsAssignment_1_0 ) )
            {
            // InternalExTwentyOne.g:1335:1: ( ( rule__Stream__InputsAssignment_1_0 ) )
            // InternalExTwentyOne.g:1336:2: ( rule__Stream__InputsAssignment_1_0 )
            {
             before(grammarAccess.getStreamAccess().getInputsAssignment_1_0()); 
            // InternalExTwentyOne.g:1337:2: ( rule__Stream__InputsAssignment_1_0 )
            // InternalExTwentyOne.g:1337:3: rule__Stream__InputsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Stream__InputsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getInputsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_1__0__Impl"


    // $ANTLR start "rule__Stream__Group_1__1"
    // InternalExTwentyOne.g:1345:1: rule__Stream__Group_1__1 : rule__Stream__Group_1__1__Impl rule__Stream__Group_1__2 ;
    public final void rule__Stream__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1349:1: ( rule__Stream__Group_1__1__Impl rule__Stream__Group_1__2 )
            // InternalExTwentyOne.g:1350:2: rule__Stream__Group_1__1__Impl rule__Stream__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Stream__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_1__2();

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
    // $ANTLR end "rule__Stream__Group_1__1"


    // $ANTLR start "rule__Stream__Group_1__1__Impl"
    // InternalExTwentyOne.g:1357:1: rule__Stream__Group_1__1__Impl : ( ( rule__Stream__Alternatives_1_1 )* ) ;
    public final void rule__Stream__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1361:1: ( ( ( rule__Stream__Alternatives_1_1 )* ) )
            // InternalExTwentyOne.g:1362:1: ( ( rule__Stream__Alternatives_1_1 )* )
            {
            // InternalExTwentyOne.g:1362:1: ( ( rule__Stream__Alternatives_1_1 )* )
            // InternalExTwentyOne.g:1363:2: ( rule__Stream__Alternatives_1_1 )*
            {
             before(grammarAccess.getStreamAccess().getAlternatives_1_1()); 
            // InternalExTwentyOne.g:1364:2: ( rule__Stream__Alternatives_1_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExTwentyOne.g:1364:3: rule__Stream__Alternatives_1_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Stream__Alternatives_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_1__1__Impl"


    // $ANTLR start "rule__Stream__Group_1__2"
    // InternalExTwentyOne.g:1372:1: rule__Stream__Group_1__2 : rule__Stream__Group_1__2__Impl ;
    public final void rule__Stream__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1376:1: ( rule__Stream__Group_1__2__Impl )
            // InternalExTwentyOne.g:1377:2: rule__Stream__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_1__2__Impl();

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
    // $ANTLR end "rule__Stream__Group_1__2"


    // $ANTLR start "rule__Stream__Group_1__2__Impl"
    // InternalExTwentyOne.g:1383:1: rule__Stream__Group_1__2__Impl : ( ( ( rule__Stream__Group_1_2__0 ) ) ( ( rule__Stream__Group_1_2__0 )* ) ) ;
    public final void rule__Stream__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1387:1: ( ( ( ( rule__Stream__Group_1_2__0 ) ) ( ( rule__Stream__Group_1_2__0 )* ) ) )
            // InternalExTwentyOne.g:1388:1: ( ( ( rule__Stream__Group_1_2__0 ) ) ( ( rule__Stream__Group_1_2__0 )* ) )
            {
            // InternalExTwentyOne.g:1388:1: ( ( ( rule__Stream__Group_1_2__0 ) ) ( ( rule__Stream__Group_1_2__0 )* ) )
            // InternalExTwentyOne.g:1389:2: ( ( rule__Stream__Group_1_2__0 ) ) ( ( rule__Stream__Group_1_2__0 )* )
            {
            // InternalExTwentyOne.g:1389:2: ( ( rule__Stream__Group_1_2__0 ) )
            // InternalExTwentyOne.g:1390:3: ( rule__Stream__Group_1_2__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_1_2()); 
            // InternalExTwentyOne.g:1391:3: ( rule__Stream__Group_1_2__0 )
            // InternalExTwentyOne.g:1391:4: rule__Stream__Group_1_2__0
            {
            pushFollow(FOLLOW_18);
            rule__Stream__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_1_2()); 

            }

            // InternalExTwentyOne.g:1394:2: ( ( rule__Stream__Group_1_2__0 )* )
            // InternalExTwentyOne.g:1395:3: ( rule__Stream__Group_1_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_1_2()); 
            // InternalExTwentyOne.g:1396:3: ( rule__Stream__Group_1_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExTwentyOne.g:1396:4: rule__Stream__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Stream__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Stream__Group_1__2__Impl"


    // $ANTLR start "rule__Stream__Group_1_1_0__0"
    // InternalExTwentyOne.g:1406:1: rule__Stream__Group_1_1_0__0 : rule__Stream__Group_1_1_0__0__Impl rule__Stream__Group_1_1_0__1 ;
    public final void rule__Stream__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1410:1: ( rule__Stream__Group_1_1_0__0__Impl rule__Stream__Group_1_1_0__1 )
            // InternalExTwentyOne.g:1411:2: rule__Stream__Group_1_1_0__0__Impl rule__Stream__Group_1_1_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Stream__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_1_1_0__1();

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
    // $ANTLR end "rule__Stream__Group_1_1_0__0"


    // $ANTLR start "rule__Stream__Group_1_1_0__0__Impl"
    // InternalExTwentyOne.g:1418:1: rule__Stream__Group_1_1_0__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1422:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1423:1: ( ',' )
            {
            // InternalExTwentyOne.g:1423:1: ( ',' )
            // InternalExTwentyOne.g:1424:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_1_1_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getCommaKeyword_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__Stream__Group_1_1_0__1"
    // InternalExTwentyOne.g:1433:1: rule__Stream__Group_1_1_0__1 : rule__Stream__Group_1_1_0__1__Impl ;
    public final void rule__Stream__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1437:1: ( rule__Stream__Group_1_1_0__1__Impl )
            // InternalExTwentyOne.g:1438:2: rule__Stream__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_1_1_0__1__Impl();

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
    // $ANTLR end "rule__Stream__Group_1_1_0__1"


    // $ANTLR start "rule__Stream__Group_1_1_0__1__Impl"
    // InternalExTwentyOne.g:1444:1: rule__Stream__Group_1_1_0__1__Impl : ( ( rule__Stream__InputsAssignment_1_1_0_1 ) ) ;
    public final void rule__Stream__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1448:1: ( ( ( rule__Stream__InputsAssignment_1_1_0_1 ) ) )
            // InternalExTwentyOne.g:1449:1: ( ( rule__Stream__InputsAssignment_1_1_0_1 ) )
            {
            // InternalExTwentyOne.g:1449:1: ( ( rule__Stream__InputsAssignment_1_1_0_1 ) )
            // InternalExTwentyOne.g:1450:2: ( rule__Stream__InputsAssignment_1_1_0_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsAssignment_1_1_0_1()); 
            // InternalExTwentyOne.g:1451:2: ( rule__Stream__InputsAssignment_1_1_0_1 )
            // InternalExTwentyOne.g:1451:3: rule__Stream__InputsAssignment_1_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__InputsAssignment_1_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getInputsAssignment_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__Stream__Group_1_2__0"
    // InternalExTwentyOne.g:1460:1: rule__Stream__Group_1_2__0 : rule__Stream__Group_1_2__0__Impl rule__Stream__Group_1_2__1 ;
    public final void rule__Stream__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1464:1: ( rule__Stream__Group_1_2__0__Impl rule__Stream__Group_1_2__1 )
            // InternalExTwentyOne.g:1465:2: rule__Stream__Group_1_2__0__Impl rule__Stream__Group_1_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Stream__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_1_2__1();

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
    // $ANTLR end "rule__Stream__Group_1_2__0"


    // $ANTLR start "rule__Stream__Group_1_2__0__Impl"
    // InternalExTwentyOne.g:1472:1: rule__Stream__Group_1_2__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1476:1: ( ( 'to' ) )
            // InternalExTwentyOne.g:1477:1: ( 'to' )
            {
            // InternalExTwentyOne.g:1477:1: ( 'to' )
            // InternalExTwentyOne.g:1478:2: 'to'
            {
             before(grammarAccess.getStreamAccess().getToKeyword_1_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getToKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_1_2__0__Impl"


    // $ANTLR start "rule__Stream__Group_1_2__1"
    // InternalExTwentyOne.g:1487:1: rule__Stream__Group_1_2__1 : rule__Stream__Group_1_2__1__Impl rule__Stream__Group_1_2__2 ;
    public final void rule__Stream__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1491:1: ( rule__Stream__Group_1_2__1__Impl rule__Stream__Group_1_2__2 )
            // InternalExTwentyOne.g:1492:2: rule__Stream__Group_1_2__1__Impl rule__Stream__Group_1_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Stream__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_1_2__2();

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
    // $ANTLR end "rule__Stream__Group_1_2__1"


    // $ANTLR start "rule__Stream__Group_1_2__1__Impl"
    // InternalExTwentyOne.g:1499:1: rule__Stream__Group_1_2__1__Impl : ( ( rule__Stream__ElementsAssignment_1_2_1 ) ) ;
    public final void rule__Stream__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1503:1: ( ( ( rule__Stream__ElementsAssignment_1_2_1 ) ) )
            // InternalExTwentyOne.g:1504:1: ( ( rule__Stream__ElementsAssignment_1_2_1 ) )
            {
            // InternalExTwentyOne.g:1504:1: ( ( rule__Stream__ElementsAssignment_1_2_1 ) )
            // InternalExTwentyOne.g:1505:2: ( rule__Stream__ElementsAssignment_1_2_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_1_2_1()); 
            // InternalExTwentyOne.g:1506:2: ( rule__Stream__ElementsAssignment_1_2_1 )
            // InternalExTwentyOne.g:1506:3: rule__Stream__ElementsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__ElementsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getElementsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_1_2__1__Impl"


    // $ANTLR start "rule__Stream__Group_1_2__2"
    // InternalExTwentyOne.g:1514:1: rule__Stream__Group_1_2__2 : rule__Stream__Group_1_2__2__Impl ;
    public final void rule__Stream__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1518:1: ( rule__Stream__Group_1_2__2__Impl )
            // InternalExTwentyOne.g:1519:2: rule__Stream__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__Stream__Group_1_2__2"


    // $ANTLR start "rule__Stream__Group_1_2__2__Impl"
    // InternalExTwentyOne.g:1525:1: rule__Stream__Group_1_2__2__Impl : ( ( rule__Stream__Group_1_2_2__0 )* ) ;
    public final void rule__Stream__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1529:1: ( ( ( rule__Stream__Group_1_2_2__0 )* ) )
            // InternalExTwentyOne.g:1530:1: ( ( rule__Stream__Group_1_2_2__0 )* )
            {
            // InternalExTwentyOne.g:1530:1: ( ( rule__Stream__Group_1_2_2__0 )* )
            // InternalExTwentyOne.g:1531:2: ( rule__Stream__Group_1_2_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_1_2_2()); 
            // InternalExTwentyOne.g:1532:2: ( rule__Stream__Group_1_2_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExTwentyOne.g:1532:3: rule__Stream__Group_1_2_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Stream__Group_1_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_1_2__2__Impl"


    // $ANTLR start "rule__Stream__Group_1_2_2__0"
    // InternalExTwentyOne.g:1541:1: rule__Stream__Group_1_2_2__0 : rule__Stream__Group_1_2_2__0__Impl rule__Stream__Group_1_2_2__1 ;
    public final void rule__Stream__Group_1_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1545:1: ( rule__Stream__Group_1_2_2__0__Impl rule__Stream__Group_1_2_2__1 )
            // InternalExTwentyOne.g:1546:2: rule__Stream__Group_1_2_2__0__Impl rule__Stream__Group_1_2_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Stream__Group_1_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_1_2_2__1();

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
    // $ANTLR end "rule__Stream__Group_1_2_2__0"


    // $ANTLR start "rule__Stream__Group_1_2_2__0__Impl"
    // InternalExTwentyOne.g:1553:1: rule__Stream__Group_1_2_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_1_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1557:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1558:1: ( ',' )
            {
            // InternalExTwentyOne.g:1558:1: ( ',' )
            // InternalExTwentyOne.g:1559:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_1_2_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getCommaKeyword_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_1_2_2__0__Impl"


    // $ANTLR start "rule__Stream__Group_1_2_2__1"
    // InternalExTwentyOne.g:1568:1: rule__Stream__Group_1_2_2__1 : rule__Stream__Group_1_2_2__1__Impl ;
    public final void rule__Stream__Group_1_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1572:1: ( rule__Stream__Group_1_2_2__1__Impl )
            // InternalExTwentyOne.g:1573:2: rule__Stream__Group_1_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_1_2_2__1__Impl();

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
    // $ANTLR end "rule__Stream__Group_1_2_2__1"


    // $ANTLR start "rule__Stream__Group_1_2_2__1__Impl"
    // InternalExTwentyOne.g:1579:1: rule__Stream__Group_1_2_2__1__Impl : ( ( rule__Stream__ElementsAssignment_1_2_2_1 ) ) ;
    public final void rule__Stream__Group_1_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1583:1: ( ( ( rule__Stream__ElementsAssignment_1_2_2_1 ) ) )
            // InternalExTwentyOne.g:1584:1: ( ( rule__Stream__ElementsAssignment_1_2_2_1 ) )
            {
            // InternalExTwentyOne.g:1584:1: ( ( rule__Stream__ElementsAssignment_1_2_2_1 ) )
            // InternalExTwentyOne.g:1585:2: ( rule__Stream__ElementsAssignment_1_2_2_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_1_2_2_1()); 
            // InternalExTwentyOne.g:1586:2: ( rule__Stream__ElementsAssignment_1_2_2_1 )
            // InternalExTwentyOne.g:1586:3: rule__Stream__ElementsAssignment_1_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__ElementsAssignment_1_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getElementsAssignment_1_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_1_2_2__1__Impl"


    // $ANTLR start "rule__Element__Group_1__0"
    // InternalExTwentyOne.g:1595:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1599:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalExTwentyOne.g:1600:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalExTwentyOne.g:1607:1: rule__Element__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1611:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1612:1: ( '[' )
            {
            // InternalExTwentyOne.g:1612:1: ( '[' )
            // InternalExTwentyOne.g:1613:2: '['
            {
             before(grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1622:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl rule__Element__Group_1__2 ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1626:1: ( rule__Element__Group_1__1__Impl rule__Element__Group_1__2 )
            // InternalExTwentyOne.g:1627:2: rule__Element__Group_1__1__Impl rule__Element__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalExTwentyOne.g:1634:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__Alternatives_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1638:1: ( ( ( rule__Element__Alternatives_1_1 ) ) )
            // InternalExTwentyOne.g:1639:1: ( ( rule__Element__Alternatives_1_1 ) )
            {
            // InternalExTwentyOne.g:1639:1: ( ( rule__Element__Alternatives_1_1 ) )
            // InternalExTwentyOne.g:1640:2: ( rule__Element__Alternatives_1_1 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_1_1()); 
            // InternalExTwentyOne.g:1641:2: ( rule__Element__Alternatives_1_1 )
            // InternalExTwentyOne.g:1641:3: rule__Element__Alternatives_1_1
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
    // InternalExTwentyOne.g:1649:1: rule__Element__Group_1__2 : rule__Element__Group_1__2__Impl ;
    public final void rule__Element__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1653:1: ( rule__Element__Group_1__2__Impl )
            // InternalExTwentyOne.g:1654:2: rule__Element__Group_1__2__Impl
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
    // InternalExTwentyOne.g:1660:1: rule__Element__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Element__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1664:1: ( ( ']' ) )
            // InternalExTwentyOne.g:1665:1: ( ']' )
            {
            // InternalExTwentyOne.g:1665:1: ( ']' )
            // InternalExTwentyOne.g:1666:2: ']'
            {
             before(grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1676:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1680:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalExTwentyOne.g:1681:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
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
    // InternalExTwentyOne.g:1688:1: rule__Element__Group_2__0__Impl : ( 'output' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1692:1: ( ( 'output' ) )
            // InternalExTwentyOne.g:1693:1: ( 'output' )
            {
            // InternalExTwentyOne.g:1693:1: ( 'output' )
            // InternalExTwentyOne.g:1694:2: 'output'
            {
             before(grammarAccess.getElementAccess().getOutputKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1703:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1707:1: ( rule__Element__Group_2__1__Impl )
            // InternalExTwentyOne.g:1708:2: rule__Element__Group_2__1__Impl
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
    // InternalExTwentyOne.g:1714:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__OutputAssignment_2_1 ) ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1718:1: ( ( ( rule__Element__OutputAssignment_2_1 ) ) )
            // InternalExTwentyOne.g:1719:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            {
            // InternalExTwentyOne.g:1719:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            // InternalExTwentyOne.g:1720:2: ( rule__Element__OutputAssignment_2_1 )
            {
             before(grammarAccess.getElementAccess().getOutputAssignment_2_1()); 
            // InternalExTwentyOne.g:1721:2: ( rule__Element__OutputAssignment_2_1 )
            // InternalExTwentyOne.g:1721:3: rule__Element__OutputAssignment_2_1
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
    // InternalExTwentyOne.g:1730:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1734:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalExTwentyOne.g:1735:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalExTwentyOne.g:1742:1: rule__DataDecl__Group__0__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1746:1: ( ( 'data' ) )
            // InternalExTwentyOne.g:1747:1: ( 'data' )
            {
            // InternalExTwentyOne.g:1747:1: ( 'data' )
            // InternalExTwentyOne.g:1748:2: 'data'
            {
             before(grammarAccess.getDataDeclAccess().getDataKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group__0__Impl"


    // $ANTLR start "rule__DataDecl__Group__1"
    // InternalExTwentyOne.g:1757:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1761:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalExTwentyOne.g:1762:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalExTwentyOne.g:1769:1: rule__DataDecl__Group__1__Impl : ( ( rule__DataDecl__NameAssignment_1 ) ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1773:1: ( ( ( rule__DataDecl__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:1774:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:1774:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            // InternalExTwentyOne.g:1775:2: ( rule__DataDecl__NameAssignment_1 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:1776:2: ( rule__DataDecl__NameAssignment_1 )
            // InternalExTwentyOne.g:1776:3: rule__DataDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1784:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1788:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalExTwentyOne.g:1789:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalExTwentyOne.g:1796:1: rule__DataDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1800:1: ( ( '{' ) )
            // InternalExTwentyOne.g:1801:1: ( '{' )
            {
            // InternalExTwentyOne.g:1801:1: ( '{' )
            // InternalExTwentyOne.g:1802:2: '{'
            {
             before(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1811:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1815:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalExTwentyOne.g:1816:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalExTwentyOne.g:1823:1: rule__DataDecl__Group__3__Impl : ( ( rule__DataDecl__DataAssignment_3 ) ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1827:1: ( ( ( rule__DataDecl__DataAssignment_3 ) ) )
            // InternalExTwentyOne.g:1828:1: ( ( rule__DataDecl__DataAssignment_3 ) )
            {
            // InternalExTwentyOne.g:1828:1: ( ( rule__DataDecl__DataAssignment_3 ) )
            // InternalExTwentyOne.g:1829:2: ( rule__DataDecl__DataAssignment_3 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_3()); 
            // InternalExTwentyOne.g:1830:2: ( rule__DataDecl__DataAssignment_3 )
            // InternalExTwentyOne.g:1830:3: rule__DataDecl__DataAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__DataAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getDataAssignment_3()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1838:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1842:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalExTwentyOne.g:1843:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalExTwentyOne.g:1850:1: rule__DataDecl__Group__4__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1854:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1855:1: ( ':' )
            {
            // InternalExTwentyOne.g:1855:1: ( ':' )
            // InternalExTwentyOne.g:1856:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getColonKeyword_4()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1865:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1869:1: ( rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 )
            // InternalExTwentyOne.g:1870:2: rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalExTwentyOne.g:1877:1: rule__DataDecl__Group__5__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1881:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1882:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1882:1: ( ruleType )
            // InternalExTwentyOne.g:1883:2: ruleType
            {
             before(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_5()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1892:1: rule__DataDecl__Group__6 : rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 ;
    public final void rule__DataDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1896:1: ( rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 )
            // InternalExTwentyOne.g:1897:2: rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalExTwentyOne.g:1904:1: rule__DataDecl__Group__6__Impl : ( ( rule__DataDecl__Group_6__0 )* ) ;
    public final void rule__DataDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1908:1: ( ( ( rule__DataDecl__Group_6__0 )* ) )
            // InternalExTwentyOne.g:1909:1: ( ( rule__DataDecl__Group_6__0 )* )
            {
            // InternalExTwentyOne.g:1909:1: ( ( rule__DataDecl__Group_6__0 )* )
            // InternalExTwentyOne.g:1910:2: ( rule__DataDecl__Group_6__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_6()); 
            // InternalExTwentyOne.g:1911:2: ( rule__DataDecl__Group_6__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExTwentyOne.g:1911:3: rule__DataDecl__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DataDecl__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDataDeclAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1919:1: rule__DataDecl__Group__7 : rule__DataDecl__Group__7__Impl ;
    public final void rule__DataDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1923:1: ( rule__DataDecl__Group__7__Impl )
            // InternalExTwentyOne.g:1924:2: rule__DataDecl__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__7__Impl();

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
    // InternalExTwentyOne.g:1930:1: rule__DataDecl__Group__7__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1934:1: ( ( '}' ) )
            // InternalExTwentyOne.g:1935:1: ( '}' )
            {
            // InternalExTwentyOne.g:1935:1: ( '}' )
            // InternalExTwentyOne.g:1936:2: '}'
            {
             before(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataDecl__Group_6__0"
    // InternalExTwentyOne.g:1946:1: rule__DataDecl__Group_6__0 : rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1 ;
    public final void rule__DataDecl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1950:1: ( rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1 )
            // InternalExTwentyOne.g:1951:2: rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__DataDecl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_6__1();

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
    // $ANTLR end "rule__DataDecl__Group_6__0"


    // $ANTLR start "rule__DataDecl__Group_6__0__Impl"
    // InternalExTwentyOne.g:1958:1: rule__DataDecl__Group_6__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1962:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1963:1: ( ',' )
            {
            // InternalExTwentyOne.g:1963:1: ( ',' )
            // InternalExTwentyOne.g:1964:2: ','
            {
             before(grammarAccess.getDataDeclAccess().getCommaKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group_6__0__Impl"


    // $ANTLR start "rule__DataDecl__Group_6__1"
    // InternalExTwentyOne.g:1973:1: rule__DataDecl__Group_6__1 : rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2 ;
    public final void rule__DataDecl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1977:1: ( rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2 )
            // InternalExTwentyOne.g:1978:2: rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2
            {
            pushFollow(FOLLOW_6);
            rule__DataDecl__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_6__2();

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
    // $ANTLR end "rule__DataDecl__Group_6__1"


    // $ANTLR start "rule__DataDecl__Group_6__1__Impl"
    // InternalExTwentyOne.g:1985:1: rule__DataDecl__Group_6__1__Impl : ( ( rule__DataDecl__DataAssignment_6_1 ) ) ;
    public final void rule__DataDecl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1989:1: ( ( ( rule__DataDecl__DataAssignment_6_1 ) ) )
            // InternalExTwentyOne.g:1990:1: ( ( rule__DataDecl__DataAssignment_6_1 ) )
            {
            // InternalExTwentyOne.g:1990:1: ( ( rule__DataDecl__DataAssignment_6_1 ) )
            // InternalExTwentyOne.g:1991:2: ( rule__DataDecl__DataAssignment_6_1 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_6_1()); 
            // InternalExTwentyOne.g:1992:2: ( rule__DataDecl__DataAssignment_6_1 )
            // InternalExTwentyOne.g:1992:3: rule__DataDecl__DataAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__DataAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getDataAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group_6__1__Impl"


    // $ANTLR start "rule__DataDecl__Group_6__2"
    // InternalExTwentyOne.g:2000:1: rule__DataDecl__Group_6__2 : rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3 ;
    public final void rule__DataDecl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2004:1: ( rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3 )
            // InternalExTwentyOne.g:2005:2: rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__DataDecl__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_6__3();

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
    // $ANTLR end "rule__DataDecl__Group_6__2"


    // $ANTLR start "rule__DataDecl__Group_6__2__Impl"
    // InternalExTwentyOne.g:2012:1: rule__DataDecl__Group_6__2__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2016:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2017:1: ( ':' )
            {
            // InternalExTwentyOne.g:2017:1: ( ':' )
            // InternalExTwentyOne.g:2018:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_6_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getColonKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group_6__2__Impl"


    // $ANTLR start "rule__DataDecl__Group_6__3"
    // InternalExTwentyOne.g:2027:1: rule__DataDecl__Group_6__3 : rule__DataDecl__Group_6__3__Impl ;
    public final void rule__DataDecl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2031:1: ( rule__DataDecl__Group_6__3__Impl )
            // InternalExTwentyOne.g:2032:2: rule__DataDecl__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_6__3__Impl();

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
    // $ANTLR end "rule__DataDecl__Group_6__3"


    // $ANTLR start "rule__DataDecl__Group_6__3__Impl"
    // InternalExTwentyOne.g:2038:1: rule__DataDecl__Group_6__3__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2042:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2043:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2043:1: ( ruleType )
            // InternalExTwentyOne.g:2044:2: ruleType
            {
             before(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_6_3()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__Group_6__3__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalExTwentyOne.g:2054:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2058:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalExTwentyOne.g:2059:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalExTwentyOne.g:2066:1: rule__Exp__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2070:1: ( ( RULE_INT ) )
            // InternalExTwentyOne.g:2071:1: ( RULE_INT )
            {
            // InternalExTwentyOne.g:2071:1: ( RULE_INT )
            // InternalExTwentyOne.g:2072:2: RULE_INT
            {
             before(grammarAccess.getExpAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalExTwentyOne.g:2081:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl rule__Exp__Group__2 ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2085:1: ( rule__Exp__Group__1__Impl rule__Exp__Group__2 )
            // InternalExTwentyOne.g:2086:2: rule__Exp__Group__1__Impl rule__Exp__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalExTwentyOne.g:2093:1: rule__Exp__Group__1__Impl : ( '+' ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2097:1: ( ( '+' ) )
            // InternalExTwentyOne.g:2098:1: ( '+' )
            {
            // InternalExTwentyOne.g:2098:1: ( '+' )
            // InternalExTwentyOne.g:2099:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getPlusSignKeyword_1()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:2108:1: rule__Exp__Group__2 : rule__Exp__Group__2__Impl ;
    public final void rule__Exp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2112:1: ( rule__Exp__Group__2__Impl )
            // InternalExTwentyOne.g:2113:2: rule__Exp__Group__2__Impl
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
    // InternalExTwentyOne.g:2119:1: rule__Exp__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Exp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2123:1: ( ( RULE_INT ) )
            // InternalExTwentyOne.g:2124:1: ( RULE_INT )
            {
            // InternalExTwentyOne.g:2124:1: ( RULE_INT )
            // InternalExTwentyOne.g:2125:2: RULE_INT
            {
             before(grammarAccess.getExpAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalExTwentyOne.g:2135:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2139:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2140:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2140:2: ( RULE_ID )
            // InternalExTwentyOne.g:2141:3: RULE_ID
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
    // InternalExTwentyOne.g:2150:1: rule__Program__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Program__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2154:1: ( ( ruleDeclaration ) )
            // InternalExTwentyOne.g:2155:2: ( ruleDeclaration )
            {
            // InternalExTwentyOne.g:2155:2: ( ruleDeclaration )
            // InternalExTwentyOne.g:2156:3: ruleDeclaration
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
    // InternalExTwentyOne.g:2165:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2169:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2170:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2170:2: ( RULE_ID )
            // InternalExTwentyOne.g:2171:3: RULE_ID
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


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalExTwentyOne.g:2180:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2184:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2185:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2185:2: ( RULE_ID )
            // InternalExTwentyOne.g:2186:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__LambdaAssignment_2"
    // InternalExTwentyOne.g:2195:1: rule__Function__LambdaAssignment_2 : ( ruleLambda ) ;
    public final void rule__Function__LambdaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2199:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:2200:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:2200:2: ( ruleLambda )
            // InternalExTwentyOne.g:2201:3: ruleLambda
            {
             before(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__LambdaAssignment_2"


    // $ANTLR start "rule__Lambda__NameAssignment_1"
    // InternalExTwentyOne.g:2210:1: rule__Lambda__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lambda__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2214:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2215:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2215:2: ( RULE_ID )
            // InternalExTwentyOne.g:2216:3: RULE_ID
            {
             before(grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__NameAssignment_1"


    // $ANTLR start "rule__Input__NameAssignment_1"
    // InternalExTwentyOne.g:2225:1: rule__Input__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2229:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2230:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2230:2: ( RULE_ID )
            // InternalExTwentyOne.g:2231:3: RULE_ID
            {
             before(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__NameAssignment_1"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalExTwentyOne.g:2240:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2244:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2245:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2245:2: ( RULE_ID )
            // InternalExTwentyOne.g:2246:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__FunctionAssignment_3_0"
    // InternalExTwentyOne.g:2255:1: rule__Node__FunctionAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__FunctionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2259:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2260:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2260:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2261:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_3_0_0()); 
            // InternalExTwentyOne.g:2262:3: ( RULE_ID )
            // InternalExTwentyOne.g:2263:4: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getFunctionFunctionIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getFunctionFunctionIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__FunctionAssignment_3_0"


    // $ANTLR start "rule__Node__LambdaAssignment_3_1"
    // InternalExTwentyOne.g:2274:1: rule__Node__LambdaAssignment_3_1 : ( ruleLambda ) ;
    public final void rule__Node__LambdaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2278:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:2279:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:2279:2: ( ruleLambda )
            // InternalExTwentyOne.g:2280:3: ruleLambda
            {
             before(grammarAccess.getNodeAccess().getLambdaLambdaParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getLambdaLambdaParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__LambdaAssignment_3_1"


    // $ANTLR start "rule__Stream__InputsAssignment_0_1"
    // InternalExTwentyOne.g:2289:1: rule__Stream__InputsAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2293:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2294:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2294:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2295:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsInputCrossReference_0_1_0()); 
            // InternalExTwentyOne.g:2296:3: ( RULE_ID )
            // InternalExTwentyOne.g:2297:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getInputsInputCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__InputsAssignment_0_1"


    // $ANTLR start "rule__Stream__InputsAssignment_1_0"
    // InternalExTwentyOne.g:2308:1: rule__Stream__InputsAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2312:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2313:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2313:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2314:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsNodeCrossReference_1_0_0()); 
            // InternalExTwentyOne.g:2315:3: ( RULE_ID )
            // InternalExTwentyOne.g:2316:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getInputsNodeIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getInputsNodeIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getInputsNodeCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__InputsAssignment_1_0"


    // $ANTLR start "rule__Stream__InputsAssignment_1_1_0_1"
    // InternalExTwentyOne.g:2327:1: rule__Stream__InputsAssignment_1_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2331:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2332:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2332:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2333:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsInputCrossReference_1_1_0_1_0()); 
            // InternalExTwentyOne.g:2334:3: ( RULE_ID )
            // InternalExTwentyOne.g:2335:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_1_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_1_1_0_1_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getInputsInputCrossReference_1_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__InputsAssignment_1_1_0_1"


    // $ANTLR start "rule__Stream__InputsAssignment_1_1_1"
    // InternalExTwentyOne.g:2346:1: rule__Stream__InputsAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2350:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2351:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2351:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2352:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsNodeCrossReference_1_1_1_0()); 
            // InternalExTwentyOne.g:2353:3: ( RULE_ID )
            // InternalExTwentyOne.g:2354:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getInputsNodeIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getInputsNodeIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getInputsNodeCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__InputsAssignment_1_1_1"


    // $ANTLR start "rule__Stream__ElementsAssignment_1_2_1"
    // InternalExTwentyOne.g:2365:1: rule__Stream__ElementsAssignment_1_2_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2369:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:2370:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:2370:2: ( ruleElement )
            // InternalExTwentyOne.g:2371:3: ruleElement
            {
             before(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__ElementsAssignment_1_2_1"


    // $ANTLR start "rule__Stream__ElementsAssignment_1_2_2_1"
    // InternalExTwentyOne.g:2380:1: rule__Stream__ElementsAssignment_1_2_2_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_1_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2384:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:2385:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:2385:2: ( ruleElement )
            // InternalExTwentyOne.g:2386:3: ruleElement
            {
             before(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_1_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_1_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__ElementsAssignment_1_2_2_1"


    // $ANTLR start "rule__Element__ElementAssignment_0"
    // InternalExTwentyOne.g:2395:1: rule__Element__ElementAssignment_0 : ( RULE_ID ) ;
    public final void rule__Element__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2399:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2400:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2400:2: ( RULE_ID )
            // InternalExTwentyOne.g:2401:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getElementIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getElementIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ElementAssignment_0"


    // $ANTLR start "rule__Element__NodeAssignment_1_1_0"
    // InternalExTwentyOne.g:2410:1: rule__Element__NodeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Element__NodeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2414:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2415:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2415:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2416:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getNodeNodeCrossReference_1_1_0_0()); 
            // InternalExTwentyOne.g:2417:3: ( RULE_ID )
            // InternalExTwentyOne.g:2418:4: RULE_ID
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
    // InternalExTwentyOne.g:2429:1: rule__Element__OutputAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Element__OutputAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2433:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2434:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2434:2: ( RULE_ID )
            // InternalExTwentyOne.g:2435:3: RULE_ID
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


    // $ANTLR start "rule__DataDecl__NameAssignment_1"
    // InternalExTwentyOne.g:2444:1: rule__DataDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2448:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2449:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2449:2: ( RULE_ID )
            // InternalExTwentyOne.g:2450:3: RULE_ID
            {
             before(grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__NameAssignment_1"


    // $ANTLR start "rule__DataDecl__DataAssignment_3"
    // InternalExTwentyOne.g:2459:1: rule__DataDecl__DataAssignment_3 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2463:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2464:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2464:2: ( RULE_ID )
            // InternalExTwentyOne.g:2465:3: RULE_ID
            {
             before(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__DataAssignment_3"


    // $ANTLR start "rule__DataDecl__DataAssignment_6_1"
    // InternalExTwentyOne.g:2474:1: rule__DataDecl__DataAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2478:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2479:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2479:2: ( RULE_ID )
            // InternalExTwentyOne.g:2480:3: RULE_ID
            {
             before(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__DataAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000022614010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000022614012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010800010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}