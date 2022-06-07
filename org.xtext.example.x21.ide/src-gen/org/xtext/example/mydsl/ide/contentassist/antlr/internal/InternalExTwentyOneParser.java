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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'data'", "'+'"
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
    // InternalExTwentyOne.g:212:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:216:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalExTwentyOne.g:217:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalExTwentyOne.g:217:2: ( ( rule__Node__Alternatives ) )
            // InternalExTwentyOne.g:218:3: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // InternalExTwentyOne.g:219:3: ( rule__Node__Alternatives )
            // InternalExTwentyOne.g:219:4: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDataDecl"
    // InternalExTwentyOne.g:253:1: entryRuleDataDecl : ruleDataDecl EOF ;
    public final void entryRuleDataDecl() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:254:1: ( ruleDataDecl EOF )
            // InternalExTwentyOne.g:255:1: ruleDataDecl EOF
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
    // InternalExTwentyOne.g:262:1: ruleDataDecl : ( ( rule__DataDecl__Group__0 ) ) ;
    public final void ruleDataDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:266:2: ( ( ( rule__DataDecl__Group__0 ) ) )
            // InternalExTwentyOne.g:267:2: ( ( rule__DataDecl__Group__0 ) )
            {
            // InternalExTwentyOne.g:267:2: ( ( rule__DataDecl__Group__0 ) )
            // InternalExTwentyOne.g:268:3: ( rule__DataDecl__Group__0 )
            {
             before(grammarAccess.getDataDeclAccess().getGroup()); 
            // InternalExTwentyOne.g:269:3: ( rule__DataDecl__Group__0 )
            // InternalExTwentyOne.g:269:4: rule__DataDecl__Group__0
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
    // InternalExTwentyOne.g:278:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:279:1: ( ruleType EOF )
            // InternalExTwentyOne.g:280:1: ruleType EOF
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
    // InternalExTwentyOne.g:287:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:291:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalExTwentyOne.g:292:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalExTwentyOne.g:292:2: ( ( rule__Type__Alternatives ) )
            // InternalExTwentyOne.g:293:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalExTwentyOne.g:294:3: ( rule__Type__Alternatives )
            // InternalExTwentyOne.g:294:4: rule__Type__Alternatives
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
    // InternalExTwentyOne.g:303:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:304:1: ( ruleExp EOF )
            // InternalExTwentyOne.g:305:1: ruleExp EOF
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
    // InternalExTwentyOne.g:312:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:316:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalExTwentyOne.g:317:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalExTwentyOne.g:317:2: ( ( rule__Exp__Group__0 ) )
            // InternalExTwentyOne.g:318:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalExTwentyOne.g:319:3: ( rule__Exp__Group__0 )
            // InternalExTwentyOne.g:319:4: rule__Exp__Group__0
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
    // InternalExTwentyOne.g:327:1: rule__Declaration__Alternatives : ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:331:1: ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) )
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
            case 17:
            case 22:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case 28:
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
                    // InternalExTwentyOne.g:332:2: ( ruleFunction )
                    {
                    // InternalExTwentyOne.g:332:2: ( ruleFunction )
                    // InternalExTwentyOne.g:333:3: ruleFunction
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
                    // InternalExTwentyOne.g:338:2: ( ruleInput )
                    {
                    // InternalExTwentyOne.g:338:2: ( ruleInput )
                    // InternalExTwentyOne.g:339:3: ruleInput
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
                    // InternalExTwentyOne.g:344:2: ( ruleNode )
                    {
                    // InternalExTwentyOne.g:344:2: ( ruleNode )
                    // InternalExTwentyOne.g:345:3: ruleNode
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
                    // InternalExTwentyOne.g:350:2: ( ruleStream )
                    {
                    // InternalExTwentyOne.g:350:2: ( ruleStream )
                    // InternalExTwentyOne.g:351:3: ruleStream
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
                    // InternalExTwentyOne.g:356:2: ( ruleDataDecl )
                    {
                    // InternalExTwentyOne.g:356:2: ( ruleDataDecl )
                    // InternalExTwentyOne.g:357:3: ruleDataDecl
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
                    // InternalExTwentyOne.g:362:2: ( ruleParameter )
                    {
                    // InternalExTwentyOne.g:362:2: ( ruleParameter )
                    // InternalExTwentyOne.g:363:3: ruleParameter
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


    // $ANTLR start "rule__Node__Alternatives"
    // InternalExTwentyOne.g:372:1: rule__Node__Alternatives : ( ( ( rule__Node__Group_0__0 ) ) | ( ( rule__Node__Group_1__0 ) ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:376:1: ( ( ( rule__Node__Group_0__0 ) ) | ( ( rule__Node__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
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
                    // InternalExTwentyOne.g:377:2: ( ( rule__Node__Group_0__0 ) )
                    {
                    // InternalExTwentyOne.g:377:2: ( ( rule__Node__Group_0__0 ) )
                    // InternalExTwentyOne.g:378:3: ( rule__Node__Group_0__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_0()); 
                    // InternalExTwentyOne.g:379:3: ( rule__Node__Group_0__0 )
                    // InternalExTwentyOne.g:379:4: rule__Node__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:383:2: ( ( rule__Node__Group_1__0 ) )
                    {
                    // InternalExTwentyOne.g:383:2: ( ( rule__Node__Group_1__0 ) )
                    // InternalExTwentyOne.g:384:3: ( rule__Node__Group_1__0 )
                    {
                     before(grammarAccess.getNodeAccess().getGroup_1()); 
                    // InternalExTwentyOne.g:385:3: ( rule__Node__Group_1__0 )
                    // InternalExTwentyOne.g:385:4: rule__Node__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalExTwentyOne.g:393:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:397:1: ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
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
                    // InternalExTwentyOne.g:398:2: ( 'int' )
                    {
                    // InternalExTwentyOne.g:398:2: ( 'int' )
                    // InternalExTwentyOne.g:399:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:404:2: ( 'string' )
                    {
                    // InternalExTwentyOne.g:404:2: ( 'string' )
                    // InternalExTwentyOne.g:405:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:410:2: ( RULE_ID )
                    {
                    // InternalExTwentyOne.g:410:2: ( RULE_ID )
                    // InternalExTwentyOne.g:411:3: RULE_ID
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
    // InternalExTwentyOne.g:420:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:424:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalExTwentyOne.g:425:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalExTwentyOne.g:432:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:436:1: ( ( 'program' ) )
            // InternalExTwentyOne.g:437:1: ( 'program' )
            {
            // InternalExTwentyOne.g:437:1: ( 'program' )
            // InternalExTwentyOne.g:438:2: 'program'
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
    // InternalExTwentyOne.g:447:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:451:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalExTwentyOne.g:452:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalExTwentyOne.g:459:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:463:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:464:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:464:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalExTwentyOne.g:465:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:466:2: ( rule__Program__NameAssignment_1 )
            // InternalExTwentyOne.g:466:3: rule__Program__NameAssignment_1
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
    // InternalExTwentyOne.g:474:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:478:1: ( rule__Program__Group__2__Impl )
            // InternalExTwentyOne.g:479:2: rule__Program__Group__2__Impl
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
    // InternalExTwentyOne.g:485:1: rule__Program__Group__2__Impl : ( ( rule__Program__DeclarationsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:489:1: ( ( ( rule__Program__DeclarationsAssignment_2 )* ) )
            // InternalExTwentyOne.g:490:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            {
            // InternalExTwentyOne.g:490:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            // InternalExTwentyOne.g:491:2: ( rule__Program__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getDeclarationsAssignment_2()); 
            // InternalExTwentyOne.g:492:2: ( rule__Program__DeclarationsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||(LA4_0>=16 && LA4_0<=17)||(LA4_0>=21 && LA4_0<=22)||LA4_0==25||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExTwentyOne.g:492:3: rule__Program__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalExTwentyOne.g:501:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:505:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalExTwentyOne.g:506:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalExTwentyOne.g:513:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:517:1: ( ( 'parameter' ) )
            // InternalExTwentyOne.g:518:1: ( 'parameter' )
            {
            // InternalExTwentyOne.g:518:1: ( 'parameter' )
            // InternalExTwentyOne.g:519:2: 'parameter'
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
    // InternalExTwentyOne.g:528:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:532:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalExTwentyOne.g:533:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalExTwentyOne.g:540:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:544:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:545:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:545:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalExTwentyOne.g:546:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:547:2: ( rule__Parameter__NameAssignment_1 )
            // InternalExTwentyOne.g:547:3: rule__Parameter__NameAssignment_1
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
    // InternalExTwentyOne.g:555:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:559:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalExTwentyOne.g:560:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalExTwentyOne.g:567:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:571:1: ( ( ':' ) )
            // InternalExTwentyOne.g:572:1: ( ':' )
            {
            // InternalExTwentyOne.g:572:1: ( ':' )
            // InternalExTwentyOne.g:573:2: ':'
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
    // InternalExTwentyOne.g:582:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:586:1: ( rule__Parameter__Group__3__Impl )
            // InternalExTwentyOne.g:587:2: rule__Parameter__Group__3__Impl
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
    // InternalExTwentyOne.g:593:1: rule__Parameter__Group__3__Impl : ( ruleType ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:597:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:598:1: ( ruleType )
            {
            // InternalExTwentyOne.g:598:1: ( ruleType )
            // InternalExTwentyOne.g:599:2: ruleType
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
    // InternalExTwentyOne.g:609:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:613:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalExTwentyOne.g:614:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalExTwentyOne.g:621:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:625:1: ( ( 'function' ) )
            // InternalExTwentyOne.g:626:1: ( 'function' )
            {
            // InternalExTwentyOne.g:626:1: ( 'function' )
            // InternalExTwentyOne.g:627:2: 'function'
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
    // InternalExTwentyOne.g:636:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:640:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalExTwentyOne.g:641:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalExTwentyOne.g:648:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:652:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:653:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:653:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalExTwentyOne.g:654:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:655:2: ( rule__Function__NameAssignment_1 )
            // InternalExTwentyOne.g:655:3: rule__Function__NameAssignment_1
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
    // InternalExTwentyOne.g:663:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:667:1: ( rule__Function__Group__2__Impl )
            // InternalExTwentyOne.g:668:2: rule__Function__Group__2__Impl
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
    // InternalExTwentyOne.g:674:1: rule__Function__Group__2__Impl : ( ( rule__Function__LambdaAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:678:1: ( ( ( rule__Function__LambdaAssignment_2 ) ) )
            // InternalExTwentyOne.g:679:1: ( ( rule__Function__LambdaAssignment_2 ) )
            {
            // InternalExTwentyOne.g:679:1: ( ( rule__Function__LambdaAssignment_2 ) )
            // InternalExTwentyOne.g:680:2: ( rule__Function__LambdaAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getLambdaAssignment_2()); 
            // InternalExTwentyOne.g:681:2: ( rule__Function__LambdaAssignment_2 )
            // InternalExTwentyOne.g:681:3: rule__Function__LambdaAssignment_2
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
    // InternalExTwentyOne.g:690:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:694:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalExTwentyOne.g:695:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
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
    // InternalExTwentyOne.g:702:1: rule__Lambda__Group__0__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:706:1: ( ( '(' ) )
            // InternalExTwentyOne.g:707:1: ( '(' )
            {
            // InternalExTwentyOne.g:707:1: ( '(' )
            // InternalExTwentyOne.g:708:2: '('
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
    // InternalExTwentyOne.g:717:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:721:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalExTwentyOne.g:722:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
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
    // InternalExTwentyOne.g:729:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__NameAssignment_1 ) ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:733:1: ( ( ( rule__Lambda__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:734:1: ( ( rule__Lambda__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:734:1: ( ( rule__Lambda__NameAssignment_1 ) )
            // InternalExTwentyOne.g:735:2: ( rule__Lambda__NameAssignment_1 )
            {
             before(grammarAccess.getLambdaAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:736:2: ( rule__Lambda__NameAssignment_1 )
            // InternalExTwentyOne.g:736:3: rule__Lambda__NameAssignment_1
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
    // InternalExTwentyOne.g:744:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:748:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalExTwentyOne.g:749:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
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
    // InternalExTwentyOne.g:756:1: rule__Lambda__Group__2__Impl : ( ':' ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:760:1: ( ( ':' ) )
            // InternalExTwentyOne.g:761:1: ( ':' )
            {
            // InternalExTwentyOne.g:761:1: ( ':' )
            // InternalExTwentyOne.g:762:2: ':'
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
    // InternalExTwentyOne.g:771:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:775:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalExTwentyOne.g:776:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
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
    // InternalExTwentyOne.g:783:1: rule__Lambda__Group__3__Impl : ( ruleType ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:787:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:788:1: ( ruleType )
            {
            // InternalExTwentyOne.g:788:1: ( ruleType )
            // InternalExTwentyOne.g:789:2: ruleType
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
    // InternalExTwentyOne.g:798:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:802:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalExTwentyOne.g:803:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
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
    // InternalExTwentyOne.g:810:1: rule__Lambda__Group__4__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:814:1: ( ( ')' ) )
            // InternalExTwentyOne.g:815:1: ( ')' )
            {
            // InternalExTwentyOne.g:815:1: ( ')' )
            // InternalExTwentyOne.g:816:2: ')'
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
    // InternalExTwentyOne.g:825:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl rule__Lambda__Group__6 ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:829:1: ( rule__Lambda__Group__5__Impl rule__Lambda__Group__6 )
            // InternalExTwentyOne.g:830:2: rule__Lambda__Group__5__Impl rule__Lambda__Group__6
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
    // InternalExTwentyOne.g:837:1: rule__Lambda__Group__5__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:841:1: ( ( '{' ) )
            // InternalExTwentyOne.g:842:1: ( '{' )
            {
            // InternalExTwentyOne.g:842:1: ( '{' )
            // InternalExTwentyOne.g:843:2: '{'
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
    // InternalExTwentyOne.g:852:1: rule__Lambda__Group__6 : rule__Lambda__Group__6__Impl rule__Lambda__Group__7 ;
    public final void rule__Lambda__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:856:1: ( rule__Lambda__Group__6__Impl rule__Lambda__Group__7 )
            // InternalExTwentyOne.g:857:2: rule__Lambda__Group__6__Impl rule__Lambda__Group__7
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
    // InternalExTwentyOne.g:864:1: rule__Lambda__Group__6__Impl : ( ruleExp ) ;
    public final void rule__Lambda__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:868:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:869:1: ( ruleExp )
            {
            // InternalExTwentyOne.g:869:1: ( ruleExp )
            // InternalExTwentyOne.g:870:2: ruleExp
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
    // InternalExTwentyOne.g:879:1: rule__Lambda__Group__7 : rule__Lambda__Group__7__Impl ;
    public final void rule__Lambda__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:883:1: ( rule__Lambda__Group__7__Impl )
            // InternalExTwentyOne.g:884:2: rule__Lambda__Group__7__Impl
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
    // InternalExTwentyOne.g:890:1: rule__Lambda__Group__7__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:894:1: ( ( '}' ) )
            // InternalExTwentyOne.g:895:1: ( '}' )
            {
            // InternalExTwentyOne.g:895:1: ( '}' )
            // InternalExTwentyOne.g:896:2: '}'
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
    // InternalExTwentyOne.g:906:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:910:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalExTwentyOne.g:911:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalExTwentyOne.g:918:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:922:1: ( ( 'input' ) )
            // InternalExTwentyOne.g:923:1: ( 'input' )
            {
            // InternalExTwentyOne.g:923:1: ( 'input' )
            // InternalExTwentyOne.g:924:2: 'input'
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
    // InternalExTwentyOne.g:933:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:937:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalExTwentyOne.g:938:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalExTwentyOne.g:945:1: rule__Input__Group__1__Impl : ( ( rule__Input__NameAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:949:1: ( ( ( rule__Input__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:950:1: ( ( rule__Input__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:950:1: ( ( rule__Input__NameAssignment_1 ) )
            // InternalExTwentyOne.g:951:2: ( rule__Input__NameAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:952:2: ( rule__Input__NameAssignment_1 )
            // InternalExTwentyOne.g:952:3: rule__Input__NameAssignment_1
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
    // InternalExTwentyOne.g:960:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:964:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalExTwentyOne.g:965:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalExTwentyOne.g:972:1: rule__Input__Group__2__Impl : ( ':' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:976:1: ( ( ':' ) )
            // InternalExTwentyOne.g:977:1: ( ':' )
            {
            // InternalExTwentyOne.g:977:1: ( ':' )
            // InternalExTwentyOne.g:978:2: ':'
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
    // InternalExTwentyOne.g:987:1: rule__Input__Group__3 : rule__Input__Group__3__Impl ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:991:1: ( rule__Input__Group__3__Impl )
            // InternalExTwentyOne.g:992:2: rule__Input__Group__3__Impl
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
    // InternalExTwentyOne.g:998:1: rule__Input__Group__3__Impl : ( ruleType ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1002:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1003:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1003:1: ( ruleType )
            // InternalExTwentyOne.g:1004:2: ruleType
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


    // $ANTLR start "rule__Node__Group_0__0"
    // InternalExTwentyOne.g:1014:1: rule__Node__Group_0__0 : rule__Node__Group_0__0__Impl rule__Node__Group_0__1 ;
    public final void rule__Node__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1018:1: ( rule__Node__Group_0__0__Impl rule__Node__Group_0__1 )
            // InternalExTwentyOne.g:1019:2: rule__Node__Group_0__0__Impl rule__Node__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Node__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_0__1();

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
    // $ANTLR end "rule__Node__Group_0__0"


    // $ANTLR start "rule__Node__Group_0__0__Impl"
    // InternalExTwentyOne.g:1026:1: rule__Node__Group_0__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1030:1: ( ( 'node' ) )
            // InternalExTwentyOne.g:1031:1: ( 'node' )
            {
            // InternalExTwentyOne.g:1031:1: ( 'node' )
            // InternalExTwentyOne.g:1032:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_0__0__Impl"


    // $ANTLR start "rule__Node__Group_0__1"
    // InternalExTwentyOne.g:1041:1: rule__Node__Group_0__1 : rule__Node__Group_0__1__Impl rule__Node__Group_0__2 ;
    public final void rule__Node__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1045:1: ( rule__Node__Group_0__1__Impl rule__Node__Group_0__2 )
            // InternalExTwentyOne.g:1046:2: rule__Node__Group_0__1__Impl rule__Node__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__Node__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_0__2();

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
    // $ANTLR end "rule__Node__Group_0__1"


    // $ANTLR start "rule__Node__Group_0__1__Impl"
    // InternalExTwentyOne.g:1053:1: rule__Node__Group_0__1__Impl : ( ( rule__Node__NameAssignment_0_1 ) ) ;
    public final void rule__Node__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1057:1: ( ( ( rule__Node__NameAssignment_0_1 ) ) )
            // InternalExTwentyOne.g:1058:1: ( ( rule__Node__NameAssignment_0_1 ) )
            {
            // InternalExTwentyOne.g:1058:1: ( ( rule__Node__NameAssignment_0_1 ) )
            // InternalExTwentyOne.g:1059:2: ( rule__Node__NameAssignment_0_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0_1()); 
            // InternalExTwentyOne.g:1060:2: ( rule__Node__NameAssignment_0_1 )
            // InternalExTwentyOne.g:1060:3: rule__Node__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_0__1__Impl"


    // $ANTLR start "rule__Node__Group_0__2"
    // InternalExTwentyOne.g:1068:1: rule__Node__Group_0__2 : rule__Node__Group_0__2__Impl rule__Node__Group_0__3 ;
    public final void rule__Node__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1072:1: ( rule__Node__Group_0__2__Impl rule__Node__Group_0__3 )
            // InternalExTwentyOne.g:1073:2: rule__Node__Group_0__2__Impl rule__Node__Group_0__3
            {
            pushFollow(FOLLOW_3);
            rule__Node__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_0__3();

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
    // $ANTLR end "rule__Node__Group_0__2"


    // $ANTLR start "rule__Node__Group_0__2__Impl"
    // InternalExTwentyOne.g:1080:1: rule__Node__Group_0__2__Impl : ( '[' ) ;
    public final void rule__Node__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1084:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1085:1: ( '[' )
            {
            // InternalExTwentyOne.g:1085:1: ( '[' )
            // InternalExTwentyOne.g:1086:2: '['
            {
             before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_0_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_0__2__Impl"


    // $ANTLR start "rule__Node__Group_0__3"
    // InternalExTwentyOne.g:1095:1: rule__Node__Group_0__3 : rule__Node__Group_0__3__Impl ;
    public final void rule__Node__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1099:1: ( rule__Node__Group_0__3__Impl )
            // InternalExTwentyOne.g:1100:2: rule__Node__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_0__3__Impl();

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
    // $ANTLR end "rule__Node__Group_0__3"


    // $ANTLR start "rule__Node__Group_0__3__Impl"
    // InternalExTwentyOne.g:1106:1: rule__Node__Group_0__3__Impl : ( ( rule__Node__LambdaAssignment_0_3 ) ) ;
    public final void rule__Node__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1110:1: ( ( ( rule__Node__LambdaAssignment_0_3 ) ) )
            // InternalExTwentyOne.g:1111:1: ( ( rule__Node__LambdaAssignment_0_3 ) )
            {
            // InternalExTwentyOne.g:1111:1: ( ( rule__Node__LambdaAssignment_0_3 ) )
            // InternalExTwentyOne.g:1112:2: ( rule__Node__LambdaAssignment_0_3 )
            {
             before(grammarAccess.getNodeAccess().getLambdaAssignment_0_3()); 
            // InternalExTwentyOne.g:1113:2: ( rule__Node__LambdaAssignment_0_3 )
            // InternalExTwentyOne.g:1113:3: rule__Node__LambdaAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Node__LambdaAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getLambdaAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_0__3__Impl"


    // $ANTLR start "rule__Node__Group_1__0"
    // InternalExTwentyOne.g:1122:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1126:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // InternalExTwentyOne.g:1127:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Node__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_1__1();

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
    // $ANTLR end "rule__Node__Group_1__0"


    // $ANTLR start "rule__Node__Group_1__0__Impl"
    // InternalExTwentyOne.g:1134:1: rule__Node__Group_1__0__Impl : ( ruleLambda ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1138:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:1139:1: ( ruleLambda )
            {
            // InternalExTwentyOne.g:1139:1: ( ruleLambda )
            // InternalExTwentyOne.g:1140:2: ruleLambda
            {
             before(grammarAccess.getNodeAccess().getLambdaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getLambdaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_1__0__Impl"


    // $ANTLR start "rule__Node__Group_1__1"
    // InternalExTwentyOne.g:1149:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1153:1: ( rule__Node__Group_1__1__Impl )
            // InternalExTwentyOne.g:1154:2: rule__Node__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_1__1__Impl();

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
    // $ANTLR end "rule__Node__Group_1__1"


    // $ANTLR start "rule__Node__Group_1__1__Impl"
    // InternalExTwentyOne.g:1160:1: rule__Node__Group_1__1__Impl : ( ']' ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1164:1: ( ( ']' ) )
            // InternalExTwentyOne.g:1165:1: ( ']' )
            {
            // InternalExTwentyOne.g:1165:1: ( ']' )
            // InternalExTwentyOne.g:1166:2: ']'
            {
             before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_1__1__Impl"


    // $ANTLR start "rule__Stream__Group__0"
    // InternalExTwentyOne.g:1176:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1180:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // InternalExTwentyOne.g:1181:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalExTwentyOne.g:1188:1: rule__Stream__Group__0__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1192:1: ( ( 'stream' ) )
            // InternalExTwentyOne.g:1193:1: ( 'stream' )
            {
            // InternalExTwentyOne.g:1193:1: ( 'stream' )
            // InternalExTwentyOne.g:1194:2: 'stream'
            {
             before(grammarAccess.getStreamAccess().getStreamKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getStreamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group__0__Impl"


    // $ANTLR start "rule__Stream__Group__1"
    // InternalExTwentyOne.g:1203:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1207:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // InternalExTwentyOne.g:1208:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalExTwentyOne.g:1215:1: rule__Stream__Group__1__Impl : ( ( rule__Stream__InputsAssignment_1 ) ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1219:1: ( ( ( rule__Stream__InputsAssignment_1 ) ) )
            // InternalExTwentyOne.g:1220:1: ( ( rule__Stream__InputsAssignment_1 ) )
            {
            // InternalExTwentyOne.g:1220:1: ( ( rule__Stream__InputsAssignment_1 ) )
            // InternalExTwentyOne.g:1221:2: ( rule__Stream__InputsAssignment_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsAssignment_1()); 
            // InternalExTwentyOne.g:1222:2: ( rule__Stream__InputsAssignment_1 )
            // InternalExTwentyOne.g:1222:3: rule__Stream__InputsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__InputsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getInputsAssignment_1()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1230:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1234:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // InternalExTwentyOne.g:1235:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalExTwentyOne.g:1242:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__Group_2__0 )* ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1246:1: ( ( ( rule__Stream__Group_2__0 )* ) )
            // InternalExTwentyOne.g:1247:1: ( ( rule__Stream__Group_2__0 )* )
            {
            // InternalExTwentyOne.g:1247:1: ( ( rule__Stream__Group_2__0 )* )
            // InternalExTwentyOne.g:1248:2: ( rule__Stream__Group_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_2()); 
            // InternalExTwentyOne.g:1249:2: ( rule__Stream__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalExTwentyOne.g:1249:3: rule__Stream__Group_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Stream__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1257:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1261:1: ( rule__Stream__Group__3__Impl )
            // InternalExTwentyOne.g:1262:2: rule__Stream__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group__3__Impl();

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
    // InternalExTwentyOne.g:1268:1: rule__Stream__Group__3__Impl : ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1272:1: ( ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) ) )
            // InternalExTwentyOne.g:1273:1: ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) )
            {
            // InternalExTwentyOne.g:1273:1: ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) )
            // InternalExTwentyOne.g:1274:2: ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* )
            {
            // InternalExTwentyOne.g:1274:2: ( ( rule__Stream__Group_3__0 ) )
            // InternalExTwentyOne.g:1275:3: ( rule__Stream__Group_3__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalExTwentyOne.g:1276:3: ( rule__Stream__Group_3__0 )
            // InternalExTwentyOne.g:1276:4: rule__Stream__Group_3__0
            {
            pushFollow(FOLLOW_17);
            rule__Stream__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_3()); 

            }

            // InternalExTwentyOne.g:1279:2: ( ( rule__Stream__Group_3__0 )* )
            // InternalExTwentyOne.g:1280:3: ( rule__Stream__Group_3__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalExTwentyOne.g:1281:3: ( rule__Stream__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExTwentyOne.g:1281:4: rule__Stream__Group_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Stream__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Stream__Group__3__Impl"


    // $ANTLR start "rule__Stream__Group_2__0"
    // InternalExTwentyOne.g:1291:1: rule__Stream__Group_2__0 : rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1 ;
    public final void rule__Stream__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1295:1: ( rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1 )
            // InternalExTwentyOne.g:1296:2: rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Stream__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_2__1();

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
    // $ANTLR end "rule__Stream__Group_2__0"


    // $ANTLR start "rule__Stream__Group_2__0__Impl"
    // InternalExTwentyOne.g:1303:1: rule__Stream__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1307:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1308:1: ( ',' )
            {
            // InternalExTwentyOne.g:1308:1: ( ',' )
            // InternalExTwentyOne.g:1309:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_2__0__Impl"


    // $ANTLR start "rule__Stream__Group_2__1"
    // InternalExTwentyOne.g:1318:1: rule__Stream__Group_2__1 : rule__Stream__Group_2__1__Impl ;
    public final void rule__Stream__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1322:1: ( rule__Stream__Group_2__1__Impl )
            // InternalExTwentyOne.g:1323:2: rule__Stream__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_2__1__Impl();

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
    // $ANTLR end "rule__Stream__Group_2__1"


    // $ANTLR start "rule__Stream__Group_2__1__Impl"
    // InternalExTwentyOne.g:1329:1: rule__Stream__Group_2__1__Impl : ( ( rule__Stream__InputsAssignment_2_1 ) ) ;
    public final void rule__Stream__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1333:1: ( ( ( rule__Stream__InputsAssignment_2_1 ) ) )
            // InternalExTwentyOne.g:1334:1: ( ( rule__Stream__InputsAssignment_2_1 ) )
            {
            // InternalExTwentyOne.g:1334:1: ( ( rule__Stream__InputsAssignment_2_1 ) )
            // InternalExTwentyOne.g:1335:2: ( rule__Stream__InputsAssignment_2_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsAssignment_2_1()); 
            // InternalExTwentyOne.g:1336:2: ( rule__Stream__InputsAssignment_2_1 )
            // InternalExTwentyOne.g:1336:3: rule__Stream__InputsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__InputsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getInputsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_2__1__Impl"


    // $ANTLR start "rule__Stream__Group_3__0"
    // InternalExTwentyOne.g:1345:1: rule__Stream__Group_3__0 : rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 ;
    public final void rule__Stream__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1349:1: ( rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 )
            // InternalExTwentyOne.g:1350:2: rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1
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
    // InternalExTwentyOne.g:1357:1: rule__Stream__Group_3__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1361:1: ( ( 'to' ) )
            // InternalExTwentyOne.g:1362:1: ( 'to' )
            {
            // InternalExTwentyOne.g:1362:1: ( 'to' )
            // InternalExTwentyOne.g:1363:2: 'to'
            {
             before(grammarAccess.getStreamAccess().getToKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getToKeyword_3_0()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1372:1: rule__Stream__Group_3__1 : rule__Stream__Group_3__1__Impl rule__Stream__Group_3__2 ;
    public final void rule__Stream__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1376:1: ( rule__Stream__Group_3__1__Impl rule__Stream__Group_3__2 )
            // InternalExTwentyOne.g:1377:2: rule__Stream__Group_3__1__Impl rule__Stream__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__Stream__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_3__2();

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
    // InternalExTwentyOne.g:1384:1: rule__Stream__Group_3__1__Impl : ( ( rule__Stream__ElementsAssignment_3_1 ) ) ;
    public final void rule__Stream__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1388:1: ( ( ( rule__Stream__ElementsAssignment_3_1 ) ) )
            // InternalExTwentyOne.g:1389:1: ( ( rule__Stream__ElementsAssignment_3_1 ) )
            {
            // InternalExTwentyOne.g:1389:1: ( ( rule__Stream__ElementsAssignment_3_1 ) )
            // InternalExTwentyOne.g:1390:2: ( rule__Stream__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_3_1()); 
            // InternalExTwentyOne.g:1391:2: ( rule__Stream__ElementsAssignment_3_1 )
            // InternalExTwentyOne.g:1391:3: rule__Stream__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getElementsAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Stream__Group_3__2"
    // InternalExTwentyOne.g:1399:1: rule__Stream__Group_3__2 : rule__Stream__Group_3__2__Impl ;
    public final void rule__Stream__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1403:1: ( rule__Stream__Group_3__2__Impl )
            // InternalExTwentyOne.g:1404:2: rule__Stream__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_3__2__Impl();

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
    // $ANTLR end "rule__Stream__Group_3__2"


    // $ANTLR start "rule__Stream__Group_3__2__Impl"
    // InternalExTwentyOne.g:1410:1: rule__Stream__Group_3__2__Impl : ( ( rule__Stream__Group_3_2__0 )* ) ;
    public final void rule__Stream__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1414:1: ( ( ( rule__Stream__Group_3_2__0 )* ) )
            // InternalExTwentyOne.g:1415:1: ( ( rule__Stream__Group_3_2__0 )* )
            {
            // InternalExTwentyOne.g:1415:1: ( ( rule__Stream__Group_3_2__0 )* )
            // InternalExTwentyOne.g:1416:2: ( rule__Stream__Group_3_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3_2()); 
            // InternalExTwentyOne.g:1417:2: ( rule__Stream__Group_3_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalExTwentyOne.g:1417:3: rule__Stream__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Stream__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_3__2__Impl"


    // $ANTLR start "rule__Stream__Group_3_2__0"
    // InternalExTwentyOne.g:1426:1: rule__Stream__Group_3_2__0 : rule__Stream__Group_3_2__0__Impl rule__Stream__Group_3_2__1 ;
    public final void rule__Stream__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1430:1: ( rule__Stream__Group_3_2__0__Impl rule__Stream__Group_3_2__1 )
            // InternalExTwentyOne.g:1431:2: rule__Stream__Group_3_2__0__Impl rule__Stream__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Stream__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_3_2__1();

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
    // $ANTLR end "rule__Stream__Group_3_2__0"


    // $ANTLR start "rule__Stream__Group_3_2__0__Impl"
    // InternalExTwentyOne.g:1438:1: rule__Stream__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1442:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1443:1: ( ',' )
            {
            // InternalExTwentyOne.g:1443:1: ( ',' )
            // InternalExTwentyOne.g:1444:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_3_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_3_2__0__Impl"


    // $ANTLR start "rule__Stream__Group_3_2__1"
    // InternalExTwentyOne.g:1453:1: rule__Stream__Group_3_2__1 : rule__Stream__Group_3_2__1__Impl ;
    public final void rule__Stream__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1457:1: ( rule__Stream__Group_3_2__1__Impl )
            // InternalExTwentyOne.g:1458:2: rule__Stream__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Stream__Group_3_2__1"


    // $ANTLR start "rule__Stream__Group_3_2__1__Impl"
    // InternalExTwentyOne.g:1464:1: rule__Stream__Group_3_2__1__Impl : ( ( rule__Stream__ElementsAssignment_3_2_1 ) ) ;
    public final void rule__Stream__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1468:1: ( ( ( rule__Stream__ElementsAssignment_3_2_1 ) ) )
            // InternalExTwentyOne.g:1469:1: ( ( rule__Stream__ElementsAssignment_3_2_1 ) )
            {
            // InternalExTwentyOne.g:1469:1: ( ( rule__Stream__ElementsAssignment_3_2_1 ) )
            // InternalExTwentyOne.g:1470:2: ( rule__Stream__ElementsAssignment_3_2_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_3_2_1()); 
            // InternalExTwentyOne.g:1471:2: ( rule__Stream__ElementsAssignment_3_2_1 )
            // InternalExTwentyOne.g:1471:3: rule__Stream__ElementsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__ElementsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getElementsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__Group_3_2__1__Impl"


    // $ANTLR start "rule__DataDecl__Group__0"
    // InternalExTwentyOne.g:1480:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1484:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalExTwentyOne.g:1485:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
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
    // InternalExTwentyOne.g:1492:1: rule__DataDecl__Group__0__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1496:1: ( ( 'data' ) )
            // InternalExTwentyOne.g:1497:1: ( 'data' )
            {
            // InternalExTwentyOne.g:1497:1: ( 'data' )
            // InternalExTwentyOne.g:1498:2: 'data'
            {
             before(grammarAccess.getDataDeclAccess().getDataKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1507:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1511:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalExTwentyOne.g:1512:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
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
    // InternalExTwentyOne.g:1519:1: rule__DataDecl__Group__1__Impl : ( ( rule__DataDecl__NameAssignment_1 ) ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1523:1: ( ( ( rule__DataDecl__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:1524:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:1524:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            // InternalExTwentyOne.g:1525:2: ( rule__DataDecl__NameAssignment_1 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:1526:2: ( rule__DataDecl__NameAssignment_1 )
            // InternalExTwentyOne.g:1526:3: rule__DataDecl__NameAssignment_1
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
    // InternalExTwentyOne.g:1534:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1538:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalExTwentyOne.g:1539:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
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
    // InternalExTwentyOne.g:1546:1: rule__DataDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1550:1: ( ( '{' ) )
            // InternalExTwentyOne.g:1551:1: ( '{' )
            {
            // InternalExTwentyOne.g:1551:1: ( '{' )
            // InternalExTwentyOne.g:1552:2: '{'
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
    // InternalExTwentyOne.g:1561:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1565:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalExTwentyOne.g:1566:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
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
    // InternalExTwentyOne.g:1573:1: rule__DataDecl__Group__3__Impl : ( ( rule__DataDecl__DataAssignment_3 ) ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1577:1: ( ( ( rule__DataDecl__DataAssignment_3 ) ) )
            // InternalExTwentyOne.g:1578:1: ( ( rule__DataDecl__DataAssignment_3 ) )
            {
            // InternalExTwentyOne.g:1578:1: ( ( rule__DataDecl__DataAssignment_3 ) )
            // InternalExTwentyOne.g:1579:2: ( rule__DataDecl__DataAssignment_3 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_3()); 
            // InternalExTwentyOne.g:1580:2: ( rule__DataDecl__DataAssignment_3 )
            // InternalExTwentyOne.g:1580:3: rule__DataDecl__DataAssignment_3
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
    // InternalExTwentyOne.g:1588:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1592:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalExTwentyOne.g:1593:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
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
    // InternalExTwentyOne.g:1600:1: rule__DataDecl__Group__4__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1604:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1605:1: ( ':' )
            {
            // InternalExTwentyOne.g:1605:1: ( ':' )
            // InternalExTwentyOne.g:1606:2: ':'
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
    // InternalExTwentyOne.g:1615:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1619:1: ( rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 )
            // InternalExTwentyOne.g:1620:2: rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalExTwentyOne.g:1627:1: rule__DataDecl__Group__5__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1631:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1632:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1632:1: ( ruleType )
            // InternalExTwentyOne.g:1633:2: ruleType
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
    // InternalExTwentyOne.g:1642:1: rule__DataDecl__Group__6 : rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 ;
    public final void rule__DataDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1646:1: ( rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 )
            // InternalExTwentyOne.g:1647:2: rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalExTwentyOne.g:1654:1: rule__DataDecl__Group__6__Impl : ( ( rule__DataDecl__Group_6__0 )* ) ;
    public final void rule__DataDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1658:1: ( ( ( rule__DataDecl__Group_6__0 )* ) )
            // InternalExTwentyOne.g:1659:1: ( ( rule__DataDecl__Group_6__0 )* )
            {
            // InternalExTwentyOne.g:1659:1: ( ( rule__DataDecl__Group_6__0 )* )
            // InternalExTwentyOne.g:1660:2: ( rule__DataDecl__Group_6__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_6()); 
            // InternalExTwentyOne.g:1661:2: ( rule__DataDecl__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExTwentyOne.g:1661:3: rule__DataDecl__Group_6__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DataDecl__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalExTwentyOne.g:1669:1: rule__DataDecl__Group__7 : rule__DataDecl__Group__7__Impl ;
    public final void rule__DataDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1673:1: ( rule__DataDecl__Group__7__Impl )
            // InternalExTwentyOne.g:1674:2: rule__DataDecl__Group__7__Impl
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
    // InternalExTwentyOne.g:1680:1: rule__DataDecl__Group__7__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1684:1: ( ( '}' ) )
            // InternalExTwentyOne.g:1685:1: ( '}' )
            {
            // InternalExTwentyOne.g:1685:1: ( '}' )
            // InternalExTwentyOne.g:1686:2: '}'
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
    // InternalExTwentyOne.g:1696:1: rule__DataDecl__Group_6__0 : rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1 ;
    public final void rule__DataDecl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1700:1: ( rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1 )
            // InternalExTwentyOne.g:1701:2: rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1
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
    // InternalExTwentyOne.g:1708:1: rule__DataDecl__Group_6__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1712:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1713:1: ( ',' )
            {
            // InternalExTwentyOne.g:1713:1: ( ',' )
            // InternalExTwentyOne.g:1714:2: ','
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
    // InternalExTwentyOne.g:1723:1: rule__DataDecl__Group_6__1 : rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2 ;
    public final void rule__DataDecl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1727:1: ( rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2 )
            // InternalExTwentyOne.g:1728:2: rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2
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
    // InternalExTwentyOne.g:1735:1: rule__DataDecl__Group_6__1__Impl : ( ( rule__DataDecl__DataAssignment_6_1 ) ) ;
    public final void rule__DataDecl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1739:1: ( ( ( rule__DataDecl__DataAssignment_6_1 ) ) )
            // InternalExTwentyOne.g:1740:1: ( ( rule__DataDecl__DataAssignment_6_1 ) )
            {
            // InternalExTwentyOne.g:1740:1: ( ( rule__DataDecl__DataAssignment_6_1 ) )
            // InternalExTwentyOne.g:1741:2: ( rule__DataDecl__DataAssignment_6_1 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_6_1()); 
            // InternalExTwentyOne.g:1742:2: ( rule__DataDecl__DataAssignment_6_1 )
            // InternalExTwentyOne.g:1742:3: rule__DataDecl__DataAssignment_6_1
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
    // InternalExTwentyOne.g:1750:1: rule__DataDecl__Group_6__2 : rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3 ;
    public final void rule__DataDecl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1754:1: ( rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3 )
            // InternalExTwentyOne.g:1755:2: rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3
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
    // InternalExTwentyOne.g:1762:1: rule__DataDecl__Group_6__2__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1766:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1767:1: ( ':' )
            {
            // InternalExTwentyOne.g:1767:1: ( ':' )
            // InternalExTwentyOne.g:1768:2: ':'
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
    // InternalExTwentyOne.g:1777:1: rule__DataDecl__Group_6__3 : rule__DataDecl__Group_6__3__Impl ;
    public final void rule__DataDecl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1781:1: ( rule__DataDecl__Group_6__3__Impl )
            // InternalExTwentyOne.g:1782:2: rule__DataDecl__Group_6__3__Impl
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
    // InternalExTwentyOne.g:1788:1: rule__DataDecl__Group_6__3__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1792:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1793:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1793:1: ( ruleType )
            // InternalExTwentyOne.g:1794:2: ruleType
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
    // InternalExTwentyOne.g:1804:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1808:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalExTwentyOne.g:1809:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalExTwentyOne.g:1816:1: rule__Exp__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1820:1: ( ( RULE_INT ) )
            // InternalExTwentyOne.g:1821:1: ( RULE_INT )
            {
            // InternalExTwentyOne.g:1821:1: ( RULE_INT )
            // InternalExTwentyOne.g:1822:2: RULE_INT
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
    // InternalExTwentyOne.g:1831:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl rule__Exp__Group__2 ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1835:1: ( rule__Exp__Group__1__Impl rule__Exp__Group__2 )
            // InternalExTwentyOne.g:1836:2: rule__Exp__Group__1__Impl rule__Exp__Group__2
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
    // InternalExTwentyOne.g:1843:1: rule__Exp__Group__1__Impl : ( '+' ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1847:1: ( ( '+' ) )
            // InternalExTwentyOne.g:1848:1: ( '+' )
            {
            // InternalExTwentyOne.g:1848:1: ( '+' )
            // InternalExTwentyOne.g:1849:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1858:1: rule__Exp__Group__2 : rule__Exp__Group__2__Impl ;
    public final void rule__Exp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1862:1: ( rule__Exp__Group__2__Impl )
            // InternalExTwentyOne.g:1863:2: rule__Exp__Group__2__Impl
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
    // InternalExTwentyOne.g:1869:1: rule__Exp__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Exp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1873:1: ( ( RULE_INT ) )
            // InternalExTwentyOne.g:1874:1: ( RULE_INT )
            {
            // InternalExTwentyOne.g:1874:1: ( RULE_INT )
            // InternalExTwentyOne.g:1875:2: RULE_INT
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
    // InternalExTwentyOne.g:1885:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1889:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:1890:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:1890:2: ( RULE_ID )
            // InternalExTwentyOne.g:1891:3: RULE_ID
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
    // InternalExTwentyOne.g:1900:1: rule__Program__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Program__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1904:1: ( ( ruleDeclaration ) )
            // InternalExTwentyOne.g:1905:2: ( ruleDeclaration )
            {
            // InternalExTwentyOne.g:1905:2: ( ruleDeclaration )
            // InternalExTwentyOne.g:1906:3: ruleDeclaration
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
    // InternalExTwentyOne.g:1915:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1919:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:1920:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:1920:2: ( RULE_ID )
            // InternalExTwentyOne.g:1921:3: RULE_ID
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
    // InternalExTwentyOne.g:1930:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1934:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:1935:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:1935:2: ( RULE_ID )
            // InternalExTwentyOne.g:1936:3: RULE_ID
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
    // InternalExTwentyOne.g:1945:1: rule__Function__LambdaAssignment_2 : ( ruleLambda ) ;
    public final void rule__Function__LambdaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1949:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:1950:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:1950:2: ( ruleLambda )
            // InternalExTwentyOne.g:1951:3: ruleLambda
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
    // InternalExTwentyOne.g:1960:1: rule__Lambda__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lambda__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1964:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:1965:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:1965:2: ( RULE_ID )
            // InternalExTwentyOne.g:1966:3: RULE_ID
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
    // InternalExTwentyOne.g:1975:1: rule__Input__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1979:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:1980:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:1980:2: ( RULE_ID )
            // InternalExTwentyOne.g:1981:3: RULE_ID
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


    // $ANTLR start "rule__Node__NameAssignment_0_1"
    // InternalExTwentyOne.g:1990:1: rule__Node__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1994:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:1995:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:1995:2: ( RULE_ID )
            // InternalExTwentyOne.g:1996:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_0_1"


    // $ANTLR start "rule__Node__LambdaAssignment_0_3"
    // InternalExTwentyOne.g:2005:1: rule__Node__LambdaAssignment_0_3 : ( ( RULE_ID ) ) ;
    public final void rule__Node__LambdaAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2009:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2010:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2010:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2011:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getLambdaLambdaCrossReference_0_3_0()); 
            // InternalExTwentyOne.g:2012:3: ( RULE_ID )
            // InternalExTwentyOne.g:2013:4: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getLambdaLambdaIDTerminalRuleCall_0_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLambdaLambdaIDTerminalRuleCall_0_3_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getLambdaLambdaCrossReference_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__LambdaAssignment_0_3"


    // $ANTLR start "rule__Stream__InputsAssignment_1"
    // InternalExTwentyOne.g:2024:1: rule__Stream__InputsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2028:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2029:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2029:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2030:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsInputCrossReference_1_0()); 
            // InternalExTwentyOne.g:2031:3: ( RULE_ID )
            // InternalExTwentyOne.g:2032:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getInputsInputCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__InputsAssignment_1"


    // $ANTLR start "rule__Stream__InputsAssignment_2_1"
    // InternalExTwentyOne.g:2043:1: rule__Stream__InputsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2047:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2048:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2048:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2049:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsInputCrossReference_2_1_0()); 
            // InternalExTwentyOne.g:2050:3: ( RULE_ID )
            // InternalExTwentyOne.g:2051:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getInputsInputCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__InputsAssignment_2_1"


    // $ANTLR start "rule__Stream__ElementsAssignment_3_1"
    // InternalExTwentyOne.g:2062:1: rule__Stream__ElementsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2066:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2067:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2067:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2068:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getElementsElementCrossReference_3_1_0()); 
            // InternalExTwentyOne.g:2069:3: ( RULE_ID )
            // InternalExTwentyOne.g:2070:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getElementsElementIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getElementsElementIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getElementsElementCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__ElementsAssignment_3_1"


    // $ANTLR start "rule__Stream__ElementsAssignment_3_2_1"
    // InternalExTwentyOne.g:2081:1: rule__Stream__ElementsAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__ElementsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2085:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:2086:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:2086:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2087:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getElementsElementCrossReference_3_2_1_0()); 
            // InternalExTwentyOne.g:2088:3: ( RULE_ID )
            // InternalExTwentyOne.g:2089:4: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getElementsElementIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getElementsElementIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getStreamAccess().getElementsElementCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stream__ElementsAssignment_3_2_1"


    // $ANTLR start "rule__DataDecl__NameAssignment_1"
    // InternalExTwentyOne.g:2100:1: rule__DataDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2104:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2105:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2105:2: ( RULE_ID )
            // InternalExTwentyOne.g:2106:3: RULE_ID
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
    // InternalExTwentyOne.g:2115:1: rule__DataDecl__DataAssignment_3 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2119:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2120:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2120:2: ( RULE_ID )
            // InternalExTwentyOne.g:2121:3: RULE_ID
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
    // InternalExTwentyOne.g:2130:1: rule__DataDecl__DataAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2134:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:2135:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:2135:2: ( RULE_ID )
            // InternalExTwentyOne.g:2136:3: RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000012634000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000012634002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});

}