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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<'", "'>'", "'<='", "'>='", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'+'", "'-'", "'*'", "'/'", "'.'", "'if'", "'then'", "'else'", "'end'", "'new'", "'let'", "'in'", "'int'", "'string'", "'none'"
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


    // $ANTLR start "entryRulePrimary"
    // InternalExTwentyOne.g:353:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:354:1: ( rulePrimary EOF )
            // InternalExTwentyOne.g:355:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalExTwentyOne.g:362:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:366:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalExTwentyOne.g:367:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalExTwentyOne.g:367:2: ( ( rule__Primary__Alternatives ) )
            // InternalExTwentyOne.g:368:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalExTwentyOne.g:369:3: ( rule__Primary__Alternatives )
            // InternalExTwentyOne.g:369:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalExTwentyOne.g:378:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:379:1: ( ruleParenthesis EOF )
            // InternalExTwentyOne.g:380:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalExTwentyOne.g:387:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:391:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalExTwentyOne.g:392:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalExTwentyOne.g:392:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalExTwentyOne.g:393:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalExTwentyOne.g:394:3: ( rule__Parenthesis__Group__0 )
            // InternalExTwentyOne.g:394:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleDataAccess"
    // InternalExTwentyOne.g:403:1: entryRuleDataAccess : ruleDataAccess EOF ;
    public final void entryRuleDataAccess() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:404:1: ( ruleDataAccess EOF )
            // InternalExTwentyOne.g:405:1: ruleDataAccess EOF
            {
             before(grammarAccess.getDataAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleDataAccess();

            state._fsp--;

             after(grammarAccess.getDataAccessRule()); 
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
    // $ANTLR end "entryRuleDataAccess"


    // $ANTLR start "ruleDataAccess"
    // InternalExTwentyOne.g:412:1: ruleDataAccess : ( ( rule__DataAccess__Group__0 ) ) ;
    public final void ruleDataAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:416:2: ( ( ( rule__DataAccess__Group__0 ) ) )
            // InternalExTwentyOne.g:417:2: ( ( rule__DataAccess__Group__0 ) )
            {
            // InternalExTwentyOne.g:417:2: ( ( rule__DataAccess__Group__0 ) )
            // InternalExTwentyOne.g:418:3: ( rule__DataAccess__Group__0 )
            {
             before(grammarAccess.getDataAccessAccess().getGroup()); 
            // InternalExTwentyOne.g:419:3: ( rule__DataAccess__Group__0 )
            // InternalExTwentyOne.g:419:4: rule__DataAccess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataAccess"


    // $ANTLR start "entryRuleIfThenElse"
    // InternalExTwentyOne.g:428:1: entryRuleIfThenElse : ruleIfThenElse EOF ;
    public final void entryRuleIfThenElse() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:429:1: ( ruleIfThenElse EOF )
            // InternalExTwentyOne.g:430:1: ruleIfThenElse EOF
            {
             before(grammarAccess.getIfThenElseRule()); 
            pushFollow(FOLLOW_1);
            ruleIfThenElse();

            state._fsp--;

             after(grammarAccess.getIfThenElseRule()); 
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
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // InternalExTwentyOne.g:437:1: ruleIfThenElse : ( ( rule__IfThenElse__Group__0 ) ) ;
    public final void ruleIfThenElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:441:2: ( ( ( rule__IfThenElse__Group__0 ) ) )
            // InternalExTwentyOne.g:442:2: ( ( rule__IfThenElse__Group__0 ) )
            {
            // InternalExTwentyOne.g:442:2: ( ( rule__IfThenElse__Group__0 ) )
            // InternalExTwentyOne.g:443:3: ( rule__IfThenElse__Group__0 )
            {
             before(grammarAccess.getIfThenElseAccess().getGroup()); 
            // InternalExTwentyOne.g:444:3: ( rule__IfThenElse__Group__0 )
            // InternalExTwentyOne.g:444:4: rule__IfThenElse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfThenElseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleNewInput"
    // InternalExTwentyOne.g:453:1: entryRuleNewInput : ruleNewInput EOF ;
    public final void entryRuleNewInput() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:454:1: ( ruleNewInput EOF )
            // InternalExTwentyOne.g:455:1: ruleNewInput EOF
            {
             before(grammarAccess.getNewInputRule()); 
            pushFollow(FOLLOW_1);
            ruleNewInput();

            state._fsp--;

             after(grammarAccess.getNewInputRule()); 
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
    // $ANTLR end "entryRuleNewInput"


    // $ANTLR start "ruleNewInput"
    // InternalExTwentyOne.g:462:1: ruleNewInput : ( ( rule__NewInput__Group__0 ) ) ;
    public final void ruleNewInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:466:2: ( ( ( rule__NewInput__Group__0 ) ) )
            // InternalExTwentyOne.g:467:2: ( ( rule__NewInput__Group__0 ) )
            {
            // InternalExTwentyOne.g:467:2: ( ( rule__NewInput__Group__0 ) )
            // InternalExTwentyOne.g:468:3: ( rule__NewInput__Group__0 )
            {
             before(grammarAccess.getNewInputAccess().getGroup()); 
            // InternalExTwentyOne.g:469:3: ( rule__NewInput__Group__0 )
            // InternalExTwentyOne.g:469:4: rule__NewInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNewInput"


    // $ANTLR start "entryRuleLetBinding"
    // InternalExTwentyOne.g:478:1: entryRuleLetBinding : ruleLetBinding EOF ;
    public final void entryRuleLetBinding() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:479:1: ( ruleLetBinding EOF )
            // InternalExTwentyOne.g:480:1: ruleLetBinding EOF
            {
             before(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleLetBinding();

            state._fsp--;

             after(grammarAccess.getLetBindingRule()); 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalExTwentyOne.g:487:1: ruleLetBinding : ( ( rule__LetBinding__Group__0 ) ) ;
    public final void ruleLetBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:491:2: ( ( ( rule__LetBinding__Group__0 ) ) )
            // InternalExTwentyOne.g:492:2: ( ( rule__LetBinding__Group__0 ) )
            {
            // InternalExTwentyOne.g:492:2: ( ( rule__LetBinding__Group__0 ) )
            // InternalExTwentyOne.g:493:3: ( rule__LetBinding__Group__0 )
            {
             before(grammarAccess.getLetBindingAccess().getGroup()); 
            // InternalExTwentyOne.g:494:3: ( rule__LetBinding__Group__0 )
            // InternalExTwentyOne.g:494:4: rule__LetBinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleLogicExp"
    // InternalExTwentyOne.g:503:1: entryRuleLogicExp : ruleLogicExp EOF ;
    public final void entryRuleLogicExp() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:504:1: ( ruleLogicExp EOF )
            // InternalExTwentyOne.g:505:1: ruleLogicExp EOF
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
    // InternalExTwentyOne.g:512:1: ruleLogicExp : ( ( rule__LogicExp__Group__0 ) ) ;
    public final void ruleLogicExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:516:2: ( ( ( rule__LogicExp__Group__0 ) ) )
            // InternalExTwentyOne.g:517:2: ( ( rule__LogicExp__Group__0 ) )
            {
            // InternalExTwentyOne.g:517:2: ( ( rule__LogicExp__Group__0 ) )
            // InternalExTwentyOne.g:518:3: ( rule__LogicExp__Group__0 )
            {
             before(grammarAccess.getLogicExpAccess().getGroup()); 
            // InternalExTwentyOne.g:519:3: ( rule__LogicExp__Group__0 )
            // InternalExTwentyOne.g:519:4: rule__LogicExp__Group__0
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
    // InternalExTwentyOne.g:527:1: rule__Declaration__Alternatives : ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:531:1: ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            case 32:
                {
                alt1=5;
                }
                break;
            case 17:
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
                    // InternalExTwentyOne.g:532:2: ( ruleFunction )
                    {
                    // InternalExTwentyOne.g:532:2: ( ruleFunction )
                    // InternalExTwentyOne.g:533:3: ruleFunction
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
                    // InternalExTwentyOne.g:538:2: ( ruleInput )
                    {
                    // InternalExTwentyOne.g:538:2: ( ruleInput )
                    // InternalExTwentyOne.g:539:3: ruleInput
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
                    // InternalExTwentyOne.g:544:2: ( ruleNode )
                    {
                    // InternalExTwentyOne.g:544:2: ( ruleNode )
                    // InternalExTwentyOne.g:545:3: ruleNode
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
                    // InternalExTwentyOne.g:550:2: ( ruleStream )
                    {
                    // InternalExTwentyOne.g:550:2: ( ruleStream )
                    // InternalExTwentyOne.g:551:3: ruleStream
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
                    // InternalExTwentyOne.g:556:2: ( ruleDataDecl )
                    {
                    // InternalExTwentyOne.g:556:2: ( ruleDataDecl )
                    // InternalExTwentyOne.g:557:3: ruleDataDecl
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
                    // InternalExTwentyOne.g:562:2: ( ruleParameter )
                    {
                    // InternalExTwentyOne.g:562:2: ( ruleParameter )
                    // InternalExTwentyOne.g:563:3: ruleParameter
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
    // InternalExTwentyOne.g:572:1: rule__Node__Alternatives_4 : ( ( ( rule__Node__FunctionAssignment_4_0 ) ) | ( ( rule__Node__LambdaAssignment_4_1 ) ) );
    public final void rule__Node__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:576:1: ( ( ( rule__Node__FunctionAssignment_4_0 ) ) | ( ( rule__Node__LambdaAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExTwentyOne.g:577:2: ( ( rule__Node__FunctionAssignment_4_0 ) )
                    {
                    // InternalExTwentyOne.g:577:2: ( ( rule__Node__FunctionAssignment_4_0 ) )
                    // InternalExTwentyOne.g:578:3: ( rule__Node__FunctionAssignment_4_0 )
                    {
                     before(grammarAccess.getNodeAccess().getFunctionAssignment_4_0()); 
                    // InternalExTwentyOne.g:579:3: ( rule__Node__FunctionAssignment_4_0 )
                    // InternalExTwentyOne.g:579:4: rule__Node__FunctionAssignment_4_0
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
                    // InternalExTwentyOne.g:583:2: ( ( rule__Node__LambdaAssignment_4_1 ) )
                    {
                    // InternalExTwentyOne.g:583:2: ( ( rule__Node__LambdaAssignment_4_1 ) )
                    // InternalExTwentyOne.g:584:3: ( rule__Node__LambdaAssignment_4_1 )
                    {
                     before(grammarAccess.getNodeAccess().getLambdaAssignment_4_1()); 
                    // InternalExTwentyOne.g:585:3: ( rule__Node__LambdaAssignment_4_1 )
                    // InternalExTwentyOne.g:585:4: rule__Node__LambdaAssignment_4_1
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
    // InternalExTwentyOne.g:593:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:597:1: ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 31:
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
                    // InternalExTwentyOne.g:598:2: ( ( rule__Element__Group_0__0 ) )
                    {
                    // InternalExTwentyOne.g:598:2: ( ( rule__Element__Group_0__0 ) )
                    // InternalExTwentyOne.g:599:3: ( rule__Element__Group_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_0()); 
                    // InternalExTwentyOne.g:600:3: ( rule__Element__Group_0__0 )
                    // InternalExTwentyOne.g:600:4: rule__Element__Group_0__0
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
                    // InternalExTwentyOne.g:604:2: ( ( rule__Element__Group_1__0 ) )
                    {
                    // InternalExTwentyOne.g:604:2: ( ( rule__Element__Group_1__0 ) )
                    // InternalExTwentyOne.g:605:3: ( rule__Element__Group_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1()); 
                    // InternalExTwentyOne.g:606:3: ( rule__Element__Group_1__0 )
                    // InternalExTwentyOne.g:606:4: rule__Element__Group_1__0
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
                    // InternalExTwentyOne.g:610:2: ( ( rule__Element__Group_2__0 ) )
                    {
                    // InternalExTwentyOne.g:610:2: ( ( rule__Element__Group_2__0 ) )
                    // InternalExTwentyOne.g:611:3: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // InternalExTwentyOne.g:612:3: ( rule__Element__Group_2__0 )
                    // InternalExTwentyOne.g:612:4: rule__Element__Group_2__0
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
    // InternalExTwentyOne.g:620:1: rule__Element__Alternatives_1_1 : ( ( ( rule__Element__NodeAssignment_1_1_0 ) ) | ( ruleLambda ) );
    public final void rule__Element__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:624:1: ( ( ( rule__Element__NodeAssignment_1_1_0 ) ) | ( ruleLambda ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExTwentyOne.g:625:2: ( ( rule__Element__NodeAssignment_1_1_0 ) )
                    {
                    // InternalExTwentyOne.g:625:2: ( ( rule__Element__NodeAssignment_1_1_0 ) )
                    // InternalExTwentyOne.g:626:3: ( rule__Element__NodeAssignment_1_1_0 )
                    {
                     before(grammarAccess.getElementAccess().getNodeAssignment_1_1_0()); 
                    // InternalExTwentyOne.g:627:3: ( rule__Element__NodeAssignment_1_1_0 )
                    // InternalExTwentyOne.g:627:4: rule__Element__NodeAssignment_1_1_0
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
                    // InternalExTwentyOne.g:631:2: ( ruleLambda )
                    {
                    // InternalExTwentyOne.g:631:2: ( ruleLambda )
                    // InternalExTwentyOne.g:632:3: ruleLambda
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
    // InternalExTwentyOne.g:641:1: rule__Type__Alternatives : ( ( ( rule__Type__IntIdentifierAssignment_0 ) ) | ( ( rule__Type__StringValueAssignment_1 ) ) | ( ( rule__Type__IdAssignment_2 ) ) | ( ( rule__Type__IntValueAssignment_3 ) ) | ( ( rule__Type__NoneValueAssignment_4 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:645:1: ( ( ( rule__Type__IntIdentifierAssignment_0 ) ) | ( ( rule__Type__StringValueAssignment_1 ) ) | ( ( rule__Type__IdAssignment_2 ) ) | ( ( rule__Type__IntValueAssignment_3 ) ) | ( ( rule__Type__NoneValueAssignment_4 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt5=1;
                }
                break;
            case 46:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            case RULE_INT:
                {
                alt5=4;
                }
                break;
            case 47:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalExTwentyOne.g:646:2: ( ( rule__Type__IntIdentifierAssignment_0 ) )
                    {
                    // InternalExTwentyOne.g:646:2: ( ( rule__Type__IntIdentifierAssignment_0 ) )
                    // InternalExTwentyOne.g:647:3: ( rule__Type__IntIdentifierAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getIntIdentifierAssignment_0()); 
                    // InternalExTwentyOne.g:648:3: ( rule__Type__IntIdentifierAssignment_0 )
                    // InternalExTwentyOne.g:648:4: rule__Type__IntIdentifierAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__IntIdentifierAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getIntIdentifierAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:652:2: ( ( rule__Type__StringValueAssignment_1 ) )
                    {
                    // InternalExTwentyOne.g:652:2: ( ( rule__Type__StringValueAssignment_1 ) )
                    // InternalExTwentyOne.g:653:3: ( rule__Type__StringValueAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getStringValueAssignment_1()); 
                    // InternalExTwentyOne.g:654:3: ( rule__Type__StringValueAssignment_1 )
                    // InternalExTwentyOne.g:654:4: rule__Type__StringValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__StringValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getStringValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:658:2: ( ( rule__Type__IdAssignment_2 ) )
                    {
                    // InternalExTwentyOne.g:658:2: ( ( rule__Type__IdAssignment_2 ) )
                    // InternalExTwentyOne.g:659:3: ( rule__Type__IdAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getIdAssignment_2()); 
                    // InternalExTwentyOne.g:660:3: ( rule__Type__IdAssignment_2 )
                    // InternalExTwentyOne.g:660:4: rule__Type__IdAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__IdAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getIdAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:664:2: ( ( rule__Type__IntValueAssignment_3 ) )
                    {
                    // InternalExTwentyOne.g:664:2: ( ( rule__Type__IntValueAssignment_3 ) )
                    // InternalExTwentyOne.g:665:3: ( rule__Type__IntValueAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getIntValueAssignment_3()); 
                    // InternalExTwentyOne.g:666:3: ( rule__Type__IntValueAssignment_3 )
                    // InternalExTwentyOne.g:666:4: rule__Type__IntValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__IntValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getIntValueAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:670:2: ( ( rule__Type__NoneValueAssignment_4 ) )
                    {
                    // InternalExTwentyOne.g:670:2: ( ( rule__Type__NoneValueAssignment_4 ) )
                    // InternalExTwentyOne.g:671:3: ( rule__Type__NoneValueAssignment_4 )
                    {
                     before(grammarAccess.getTypeAccess().getNoneValueAssignment_4()); 
                    // InternalExTwentyOne.g:672:3: ( rule__Type__NoneValueAssignment_4 )
                    // InternalExTwentyOne.g:672:4: rule__Type__NoneValueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__NoneValueAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getNoneValueAssignment_4()); 

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


    // $ANTLR start "rule__Exp__Alternatives_1_0"
    // InternalExTwentyOne.g:680:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) | ( ( rule__Exp__Group_1_0_2__0 ) ) | ( ( rule__Exp__Group_1_0_3__0 ) ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:684:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) | ( ( rule__Exp__Group_1_0_2__0 ) ) | ( ( rule__Exp__Group_1_0_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case 35:
                {
                alt6=3;
                }
                break;
            case 36:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalExTwentyOne.g:685:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalExTwentyOne.g:685:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalExTwentyOne.g:686:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalExTwentyOne.g:687:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalExTwentyOne.g:687:4: rule__Exp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:691:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    {
                    // InternalExTwentyOne.g:691:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    // InternalExTwentyOne.g:692:3: ( rule__Exp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_1()); 
                    // InternalExTwentyOne.g:693:3: ( rule__Exp__Group_1_0_1__0 )
                    // InternalExTwentyOne.g:693:4: rule__Exp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:697:2: ( ( rule__Exp__Group_1_0_2__0 ) )
                    {
                    // InternalExTwentyOne.g:697:2: ( ( rule__Exp__Group_1_0_2__0 ) )
                    // InternalExTwentyOne.g:698:3: ( rule__Exp__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_2()); 
                    // InternalExTwentyOne.g:699:3: ( rule__Exp__Group_1_0_2__0 )
                    // InternalExTwentyOne.g:699:4: rule__Exp__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:703:2: ( ( rule__Exp__Group_1_0_3__0 ) )
                    {
                    // InternalExTwentyOne.g:703:2: ( ( rule__Exp__Group_1_0_3__0 ) )
                    // InternalExTwentyOne.g:704:3: ( rule__Exp__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_3()); 
                    // InternalExTwentyOne.g:705:3: ( rule__Exp__Group_1_0_3__0 )
                    // InternalExTwentyOne.g:705:4: rule__Exp__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_3()); 

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
    // $ANTLR end "rule__Exp__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalExTwentyOne.g:713:1: rule__Primary__Alternatives : ( ( ruleLetBinding ) | ( ruleIfThenElse ) | ( ruleParenthesis ) | ( ruleNewInput ) | ( ruleDataAccess ) | ( ruleType ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:717:1: ( ( ruleLetBinding ) | ( ruleIfThenElse ) | ( ruleParenthesis ) | ( ruleNewInput ) | ( ruleDataAccess ) | ( ruleType ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt7=1;
                }
                break;
            case 38:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 42:
                {
                alt7=4;
                }
                break;
            case RULE_ID:
                {
                int LA7_5 = input.LA(2);

                if ( (LA7_5==37) ) {
                    alt7=5;
                }
                else if ( (LA7_5==EOF||(LA7_5>=11 && LA7_5<=15)||LA7_5==21||LA7_5==23||LA7_5==27||LA7_5==29||(LA7_5>=33 && LA7_5<=36)||(LA7_5>=39 && LA7_5<=41)||LA7_5==44) ) {
                    alt7=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 45:
            case 46:
            case 47:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalExTwentyOne.g:718:2: ( ruleLetBinding )
                    {
                    // InternalExTwentyOne.g:718:2: ( ruleLetBinding )
                    // InternalExTwentyOne.g:719:3: ruleLetBinding
                    {
                     before(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLetBinding();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:724:2: ( ruleIfThenElse )
                    {
                    // InternalExTwentyOne.g:724:2: ( ruleIfThenElse )
                    // InternalExTwentyOne.g:725:3: ruleIfThenElse
                    {
                     before(grammarAccess.getPrimaryAccess().getIfThenElseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIfThenElse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIfThenElseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:730:2: ( ruleParenthesis )
                    {
                    // InternalExTwentyOne.g:730:2: ( ruleParenthesis )
                    // InternalExTwentyOne.g:731:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:736:2: ( ruleNewInput )
                    {
                    // InternalExTwentyOne.g:736:2: ( ruleNewInput )
                    // InternalExTwentyOne.g:737:3: ruleNewInput
                    {
                     before(grammarAccess.getPrimaryAccess().getNewInputParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNewInput();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNewInputParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:742:2: ( ruleDataAccess )
                    {
                    // InternalExTwentyOne.g:742:2: ( ruleDataAccess )
                    // InternalExTwentyOne.g:743:3: ruleDataAccess
                    {
                     before(grammarAccess.getPrimaryAccess().getDataAccessParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDataAccess();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getDataAccessParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExTwentyOne.g:748:2: ( ruleType )
                    {
                    // InternalExTwentyOne.g:748:2: ( ruleType )
                    // InternalExTwentyOne.g:749:3: ruleType
                    {
                     before(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_5()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__LogicExp__Alternatives_1"
    // InternalExTwentyOne.g:758:1: rule__LogicExp__Alternatives_1 : ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__LogicExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:762:1: ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalExTwentyOne.g:763:2: ( '=' )
                    {
                    // InternalExTwentyOne.g:763:2: ( '=' )
                    // InternalExTwentyOne.g:764:3: '='
                    {
                     before(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:769:2: ( '<' )
                    {
                    // InternalExTwentyOne.g:769:2: ( '<' )
                    // InternalExTwentyOne.g:770:3: '<'
                    {
                     before(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:775:2: ( '>' )
                    {
                    // InternalExTwentyOne.g:775:2: ( '>' )
                    // InternalExTwentyOne.g:776:3: '>'
                    {
                     before(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:781:2: ( '<=' )
                    {
                    // InternalExTwentyOne.g:781:2: ( '<=' )
                    // InternalExTwentyOne.g:782:3: '<='
                    {
                     before(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:787:2: ( '>=' )
                    {
                    // InternalExTwentyOne.g:787:2: ( '>=' )
                    // InternalExTwentyOne.g:788:3: '>='
                    {
                     before(grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalExTwentyOne.g:797:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:801:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalExTwentyOne.g:802:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalExTwentyOne.g:809:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:813:1: ( ( 'program' ) )
            // InternalExTwentyOne.g:814:1: ( 'program' )
            {
            // InternalExTwentyOne.g:814:1: ( 'program' )
            // InternalExTwentyOne.g:815:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalExTwentyOne.g:824:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:828:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalExTwentyOne.g:829:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalExTwentyOne.g:836:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:840:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:841:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:841:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalExTwentyOne.g:842:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:843:2: ( rule__Program__NameAssignment_1 )
            // InternalExTwentyOne.g:843:3: rule__Program__NameAssignment_1
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
    // InternalExTwentyOne.g:851:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:855:1: ( rule__Program__Group__2__Impl )
            // InternalExTwentyOne.g:856:2: rule__Program__Group__2__Impl
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
    // InternalExTwentyOne.g:862:1: rule__Program__Group__2__Impl : ( ( rule__Program__DeclarationsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:866:1: ( ( ( rule__Program__DeclarationsAssignment_2 )* ) )
            // InternalExTwentyOne.g:867:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            {
            // InternalExTwentyOne.g:867:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            // InternalExTwentyOne.g:868:2: ( rule__Program__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getDeclarationsAssignment_2()); 
            // InternalExTwentyOne.g:869:2: ( rule__Program__DeclarationsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17||LA9_0==19||(LA9_0>=24 && LA9_0<=25)||LA9_0==28||LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExTwentyOne.g:869:3: rule__Program__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalExTwentyOne.g:878:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:882:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalExTwentyOne.g:883:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalExTwentyOne.g:890:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:894:1: ( ( 'parameter' ) )
            // InternalExTwentyOne.g:895:1: ( 'parameter' )
            {
            // InternalExTwentyOne.g:895:1: ( 'parameter' )
            // InternalExTwentyOne.g:896:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalExTwentyOne.g:905:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:909:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalExTwentyOne.g:910:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalExTwentyOne.g:917:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:921:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:922:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:922:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalExTwentyOne.g:923:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:924:2: ( rule__Parameter__NameAssignment_1 )
            // InternalExTwentyOne.g:924:3: rule__Parameter__NameAssignment_1
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
    // InternalExTwentyOne.g:932:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:936:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalExTwentyOne.g:937:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalExTwentyOne.g:944:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:948:1: ( ( ':' ) )
            // InternalExTwentyOne.g:949:1: ( ':' )
            {
            // InternalExTwentyOne.g:949:1: ( ':' )
            // InternalExTwentyOne.g:950:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExTwentyOne.g:959:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:963:1: ( rule__Parameter__Group__3__Impl )
            // InternalExTwentyOne.g:964:2: rule__Parameter__Group__3__Impl
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
    // InternalExTwentyOne.g:970:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ValueAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:974:1: ( ( ( rule__Parameter__ValueAssignment_3 ) ) )
            // InternalExTwentyOne.g:975:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            {
            // InternalExTwentyOne.g:975:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            // InternalExTwentyOne.g:976:2: ( rule__Parameter__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_3()); 
            // InternalExTwentyOne.g:977:2: ( rule__Parameter__ValueAssignment_3 )
            // InternalExTwentyOne.g:977:3: rule__Parameter__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_3()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:986:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:990:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalExTwentyOne.g:991:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalExTwentyOne.g:998:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1002:1: ( ( () ) )
            // InternalExTwentyOne.g:1003:1: ( () )
            {
            // InternalExTwentyOne.g:1003:1: ( () )
            // InternalExTwentyOne.g:1004:2: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // InternalExTwentyOne.g:1005:2: ()
            // InternalExTwentyOne.g:1005:3: 
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
    // InternalExTwentyOne.g:1013:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1017:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalExTwentyOne.g:1018:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalExTwentyOne.g:1025:1: rule__Function__Group__1__Impl : ( 'function' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1029:1: ( ( 'function' ) )
            // InternalExTwentyOne.g:1030:1: ( 'function' )
            {
            // InternalExTwentyOne.g:1030:1: ( 'function' )
            // InternalExTwentyOne.g:1031:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1040:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1044:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalExTwentyOne.g:1045:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalExTwentyOne.g:1052:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1056:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1057:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1057:1: ( ( rule__Function__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1058:2: ( rule__Function__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1059:2: ( rule__Function__NameAssignment_2 )
            // InternalExTwentyOne.g:1059:3: rule__Function__NameAssignment_2
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
    // InternalExTwentyOne.g:1067:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1071:1: ( rule__Function__Group__3__Impl )
            // InternalExTwentyOne.g:1072:2: rule__Function__Group__3__Impl
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
    // InternalExTwentyOne.g:1078:1: rule__Function__Group__3__Impl : ( ( rule__Function__LambdaAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1082:1: ( ( ( rule__Function__LambdaAssignment_3 ) ) )
            // InternalExTwentyOne.g:1083:1: ( ( rule__Function__LambdaAssignment_3 ) )
            {
            // InternalExTwentyOne.g:1083:1: ( ( rule__Function__LambdaAssignment_3 ) )
            // InternalExTwentyOne.g:1084:2: ( rule__Function__LambdaAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getLambdaAssignment_3()); 
            // InternalExTwentyOne.g:1085:2: ( rule__Function__LambdaAssignment_3 )
            // InternalExTwentyOne.g:1085:3: rule__Function__LambdaAssignment_3
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
    // InternalExTwentyOne.g:1094:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1098:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalExTwentyOne.g:1099:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
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
    // InternalExTwentyOne.g:1106:1: rule__Lambda__Group__0__Impl : ( () ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1110:1: ( ( () ) )
            // InternalExTwentyOne.g:1111:1: ( () )
            {
            // InternalExTwentyOne.g:1111:1: ( () )
            // InternalExTwentyOne.g:1112:2: ()
            {
             before(grammarAccess.getLambdaAccess().getLambdaAction_0()); 
            // InternalExTwentyOne.g:1113:2: ()
            // InternalExTwentyOne.g:1113:3: 
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
    // InternalExTwentyOne.g:1121:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1125:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalExTwentyOne.g:1126:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
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
    // InternalExTwentyOne.g:1133:1: rule__Lambda__Group__1__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1137:1: ( ( '(' ) )
            // InternalExTwentyOne.g:1138:1: ( '(' )
            {
            // InternalExTwentyOne.g:1138:1: ( '(' )
            // InternalExTwentyOne.g:1139:2: '('
            {
             before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1148:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1152:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalExTwentyOne.g:1153:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
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
    // InternalExTwentyOne.g:1160:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__NameAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1164:1: ( ( ( rule__Lambda__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1165:1: ( ( rule__Lambda__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1165:1: ( ( rule__Lambda__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1166:2: ( rule__Lambda__NameAssignment_2 )
            {
             before(grammarAccess.getLambdaAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1167:2: ( rule__Lambda__NameAssignment_2 )
            // InternalExTwentyOne.g:1167:3: rule__Lambda__NameAssignment_2
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
    // InternalExTwentyOne.g:1175:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1179:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalExTwentyOne.g:1180:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
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
    // InternalExTwentyOne.g:1187:1: rule__Lambda__Group__3__Impl : ( ':' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1191:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1192:1: ( ':' )
            {
            // InternalExTwentyOne.g:1192:1: ( ':' )
            // InternalExTwentyOne.g:1193:2: ':'
            {
             before(grammarAccess.getLambdaAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1202:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1206:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalExTwentyOne.g:1207:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
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
    // InternalExTwentyOne.g:1214:1: rule__Lambda__Group__4__Impl : ( ( rule__Lambda__ValueAssignment_4 ) ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1218:1: ( ( ( rule__Lambda__ValueAssignment_4 ) ) )
            // InternalExTwentyOne.g:1219:1: ( ( rule__Lambda__ValueAssignment_4 ) )
            {
            // InternalExTwentyOne.g:1219:1: ( ( rule__Lambda__ValueAssignment_4 ) )
            // InternalExTwentyOne.g:1220:2: ( rule__Lambda__ValueAssignment_4 )
            {
             before(grammarAccess.getLambdaAccess().getValueAssignment_4()); 
            // InternalExTwentyOne.g:1221:2: ( rule__Lambda__ValueAssignment_4 )
            // InternalExTwentyOne.g:1221:3: rule__Lambda__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getValueAssignment_4()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1229:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl rule__Lambda__Group__6 ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1233:1: ( rule__Lambda__Group__5__Impl rule__Lambda__Group__6 )
            // InternalExTwentyOne.g:1234:2: rule__Lambda__Group__5__Impl rule__Lambda__Group__6
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
    // InternalExTwentyOne.g:1241:1: rule__Lambda__Group__5__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1245:1: ( ( ')' ) )
            // InternalExTwentyOne.g:1246:1: ( ')' )
            {
            // InternalExTwentyOne.g:1246:1: ( ')' )
            // InternalExTwentyOne.g:1247:2: ')'
            {
             before(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1256:1: rule__Lambda__Group__6 : rule__Lambda__Group__6__Impl rule__Lambda__Group__7 ;
    public final void rule__Lambda__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1260:1: ( rule__Lambda__Group__6__Impl rule__Lambda__Group__7 )
            // InternalExTwentyOne.g:1261:2: rule__Lambda__Group__6__Impl rule__Lambda__Group__7
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
    // InternalExTwentyOne.g:1268:1: rule__Lambda__Group__6__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1272:1: ( ( '{' ) )
            // InternalExTwentyOne.g:1273:1: ( '{' )
            {
            // InternalExTwentyOne.g:1273:1: ( '{' )
            // InternalExTwentyOne.g:1274:2: '{'
            {
             before(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1283:1: rule__Lambda__Group__7 : rule__Lambda__Group__7__Impl rule__Lambda__Group__8 ;
    public final void rule__Lambda__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1287:1: ( rule__Lambda__Group__7__Impl rule__Lambda__Group__8 )
            // InternalExTwentyOne.g:1288:2: rule__Lambda__Group__7__Impl rule__Lambda__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalExTwentyOne.g:1295:1: rule__Lambda__Group__7__Impl : ( ( rule__Lambda__LambdaExpAssignment_7 ) ) ;
    public final void rule__Lambda__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1299:1: ( ( ( rule__Lambda__LambdaExpAssignment_7 ) ) )
            // InternalExTwentyOne.g:1300:1: ( ( rule__Lambda__LambdaExpAssignment_7 ) )
            {
            // InternalExTwentyOne.g:1300:1: ( ( rule__Lambda__LambdaExpAssignment_7 ) )
            // InternalExTwentyOne.g:1301:2: ( rule__Lambda__LambdaExpAssignment_7 )
            {
             before(grammarAccess.getLambdaAccess().getLambdaExpAssignment_7()); 
            // InternalExTwentyOne.g:1302:2: ( rule__Lambda__LambdaExpAssignment_7 )
            // InternalExTwentyOne.g:1302:3: rule__Lambda__LambdaExpAssignment_7
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
    // InternalExTwentyOne.g:1310:1: rule__Lambda__Group__8 : rule__Lambda__Group__8__Impl ;
    public final void rule__Lambda__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1314:1: ( rule__Lambda__Group__8__Impl )
            // InternalExTwentyOne.g:1315:2: rule__Lambda__Group__8__Impl
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
    // InternalExTwentyOne.g:1321:1: rule__Lambda__Group__8__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1325:1: ( ( '}' ) )
            // InternalExTwentyOne.g:1326:1: ( '}' )
            {
            // InternalExTwentyOne.g:1326:1: ( '}' )
            // InternalExTwentyOne.g:1327:2: '}'
            {
             before(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1337:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1341:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalExTwentyOne.g:1342:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalExTwentyOne.g:1349:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1353:1: ( ( () ) )
            // InternalExTwentyOne.g:1354:1: ( () )
            {
            // InternalExTwentyOne.g:1354:1: ( () )
            // InternalExTwentyOne.g:1355:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalExTwentyOne.g:1356:2: ()
            // InternalExTwentyOne.g:1356:3: 
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
    // InternalExTwentyOne.g:1364:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1368:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalExTwentyOne.g:1369:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalExTwentyOne.g:1376:1: rule__Input__Group__1__Impl : ( 'input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1380:1: ( ( 'input' ) )
            // InternalExTwentyOne.g:1381:1: ( 'input' )
            {
            // InternalExTwentyOne.g:1381:1: ( 'input' )
            // InternalExTwentyOne.g:1382:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1391:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1395:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalExTwentyOne.g:1396:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalExTwentyOne.g:1403:1: rule__Input__Group__2__Impl : ( ( rule__Input__NameAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1407:1: ( ( ( rule__Input__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1408:1: ( ( rule__Input__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1408:1: ( ( rule__Input__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1409:2: ( rule__Input__NameAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1410:2: ( rule__Input__NameAssignment_2 )
            // InternalExTwentyOne.g:1410:3: rule__Input__NameAssignment_2
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
    // InternalExTwentyOne.g:1418:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1422:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalExTwentyOne.g:1423:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalExTwentyOne.g:1430:1: rule__Input__Group__3__Impl : ( ':' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1434:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1435:1: ( ':' )
            {
            // InternalExTwentyOne.g:1435:1: ( ':' )
            // InternalExTwentyOne.g:1436:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1445:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1449:1: ( rule__Input__Group__4__Impl )
            // InternalExTwentyOne.g:1450:2: rule__Input__Group__4__Impl
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
    // InternalExTwentyOne.g:1456:1: rule__Input__Group__4__Impl : ( ( rule__Input__ValueAssignment_4 ) ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1460:1: ( ( ( rule__Input__ValueAssignment_4 ) ) )
            // InternalExTwentyOne.g:1461:1: ( ( rule__Input__ValueAssignment_4 ) )
            {
            // InternalExTwentyOne.g:1461:1: ( ( rule__Input__ValueAssignment_4 ) )
            // InternalExTwentyOne.g:1462:2: ( rule__Input__ValueAssignment_4 )
            {
             before(grammarAccess.getInputAccess().getValueAssignment_4()); 
            // InternalExTwentyOne.g:1463:2: ( rule__Input__ValueAssignment_4 )
            // InternalExTwentyOne.g:1463:3: rule__Input__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Input__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getValueAssignment_4()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:1472:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1476:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalExTwentyOne.g:1477:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalExTwentyOne.g:1484:1: rule__Node__Group__0__Impl : ( () ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1488:1: ( ( () ) )
            // InternalExTwentyOne.g:1489:1: ( () )
            {
            // InternalExTwentyOne.g:1489:1: ( () )
            // InternalExTwentyOne.g:1490:2: ()
            {
             before(grammarAccess.getNodeAccess().getNodeAction_0()); 
            // InternalExTwentyOne.g:1491:2: ()
            // InternalExTwentyOne.g:1491:3: 
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
    // InternalExTwentyOne.g:1499:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1503:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalExTwentyOne.g:1504:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalExTwentyOne.g:1511:1: rule__Node__Group__1__Impl : ( 'node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1515:1: ( ( 'node' ) )
            // InternalExTwentyOne.g:1516:1: ( 'node' )
            {
            // InternalExTwentyOne.g:1516:1: ( 'node' )
            // InternalExTwentyOne.g:1517:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1526:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1530:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalExTwentyOne.g:1531:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalExTwentyOne.g:1538:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1542:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1543:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1543:1: ( ( rule__Node__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1544:2: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1545:2: ( rule__Node__NameAssignment_2 )
            // InternalExTwentyOne.g:1545:3: rule__Node__NameAssignment_2
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
    // InternalExTwentyOne.g:1553:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1557:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalExTwentyOne.g:1558:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalExTwentyOne.g:1565:1: rule__Node__Group__3__Impl : ( '[' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1569:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1570:1: ( '[' )
            {
            // InternalExTwentyOne.g:1570:1: ( '[' )
            // InternalExTwentyOne.g:1571:2: '['
            {
             before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1580:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1584:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // InternalExTwentyOne.g:1585:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalExTwentyOne.g:1592:1: rule__Node__Group__4__Impl : ( ( rule__Node__Alternatives_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1596:1: ( ( ( rule__Node__Alternatives_4 ) ) )
            // InternalExTwentyOne.g:1597:1: ( ( rule__Node__Alternatives_4 ) )
            {
            // InternalExTwentyOne.g:1597:1: ( ( rule__Node__Alternatives_4 ) )
            // InternalExTwentyOne.g:1598:2: ( rule__Node__Alternatives_4 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_4()); 
            // InternalExTwentyOne.g:1599:2: ( rule__Node__Alternatives_4 )
            // InternalExTwentyOne.g:1599:3: rule__Node__Alternatives_4
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
    // InternalExTwentyOne.g:1607:1: rule__Node__Group__5 : rule__Node__Group__5__Impl ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1611:1: ( rule__Node__Group__5__Impl )
            // InternalExTwentyOne.g:1612:2: rule__Node__Group__5__Impl
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
    // InternalExTwentyOne.g:1618:1: rule__Node__Group__5__Impl : ( ']' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1622:1: ( ( ']' ) )
            // InternalExTwentyOne.g:1623:1: ( ']' )
            {
            // InternalExTwentyOne.g:1623:1: ( ']' )
            // InternalExTwentyOne.g:1624:2: ']'
            {
             before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1634:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1638:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // InternalExTwentyOne.g:1639:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalExTwentyOne.g:1646:1: rule__Stream__Group__0__Impl : ( () ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1650:1: ( ( () ) )
            // InternalExTwentyOne.g:1651:1: ( () )
            {
            // InternalExTwentyOne.g:1651:1: ( () )
            // InternalExTwentyOne.g:1652:2: ()
            {
             before(grammarAccess.getStreamAccess().getStreamAction_0()); 
            // InternalExTwentyOne.g:1653:2: ()
            // InternalExTwentyOne.g:1653:3: 
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
    // InternalExTwentyOne.g:1661:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1665:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // InternalExTwentyOne.g:1666:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
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
    // InternalExTwentyOne.g:1673:1: rule__Stream__Group__1__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1677:1: ( ( 'stream' ) )
            // InternalExTwentyOne.g:1678:1: ( 'stream' )
            {
            // InternalExTwentyOne.g:1678:1: ( 'stream' )
            // InternalExTwentyOne.g:1679:2: 'stream'
            {
             before(grammarAccess.getStreamAccess().getStreamKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1688:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1692:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // InternalExTwentyOne.g:1693:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalExTwentyOne.g:1700:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__InputsOrNodesAssignment_2 ) ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1704:1: ( ( ( rule__Stream__InputsOrNodesAssignment_2 ) ) )
            // InternalExTwentyOne.g:1705:1: ( ( rule__Stream__InputsOrNodesAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1705:1: ( ( rule__Stream__InputsOrNodesAssignment_2 ) )
            // InternalExTwentyOne.g:1706:2: ( rule__Stream__InputsOrNodesAssignment_2 )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_2()); 
            // InternalExTwentyOne.g:1707:2: ( rule__Stream__InputsOrNodesAssignment_2 )
            // InternalExTwentyOne.g:1707:3: rule__Stream__InputsOrNodesAssignment_2
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
    // InternalExTwentyOne.g:1715:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl rule__Stream__Group__4 ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1719:1: ( rule__Stream__Group__3__Impl rule__Stream__Group__4 )
            // InternalExTwentyOne.g:1720:2: rule__Stream__Group__3__Impl rule__Stream__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalExTwentyOne.g:1727:1: rule__Stream__Group__3__Impl : ( ( rule__Stream__Group_3__0 )* ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1731:1: ( ( ( rule__Stream__Group_3__0 )* ) )
            // InternalExTwentyOne.g:1732:1: ( ( rule__Stream__Group_3__0 )* )
            {
            // InternalExTwentyOne.g:1732:1: ( ( rule__Stream__Group_3__0 )* )
            // InternalExTwentyOne.g:1733:2: ( rule__Stream__Group_3__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalExTwentyOne.g:1734:2: ( rule__Stream__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExTwentyOne.g:1734:3: rule__Stream__Group_3__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Stream__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalExTwentyOne.g:1742:1: rule__Stream__Group__4 : rule__Stream__Group__4__Impl ;
    public final void rule__Stream__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1746:1: ( rule__Stream__Group__4__Impl )
            // InternalExTwentyOne.g:1747:2: rule__Stream__Group__4__Impl
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
    // InternalExTwentyOne.g:1753:1: rule__Stream__Group__4__Impl : ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) ) ;
    public final void rule__Stream__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1757:1: ( ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) ) )
            // InternalExTwentyOne.g:1758:1: ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) )
            {
            // InternalExTwentyOne.g:1758:1: ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) )
            // InternalExTwentyOne.g:1759:2: ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* )
            {
            // InternalExTwentyOne.g:1759:2: ( ( rule__Stream__Group_4__0 ) )
            // InternalExTwentyOne.g:1760:3: ( rule__Stream__Group_4__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_4()); 
            // InternalExTwentyOne.g:1761:3: ( rule__Stream__Group_4__0 )
            // InternalExTwentyOne.g:1761:4: rule__Stream__Group_4__0
            {
            pushFollow(FOLLOW_22);
            rule__Stream__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_4()); 

            }

            // InternalExTwentyOne.g:1764:2: ( ( rule__Stream__Group_4__0 )* )
            // InternalExTwentyOne.g:1765:3: ( rule__Stream__Group_4__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_4()); 
            // InternalExTwentyOne.g:1766:3: ( rule__Stream__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExTwentyOne.g:1766:4: rule__Stream__Group_4__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Stream__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalExTwentyOne.g:1776:1: rule__Stream__Group_3__0 : rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 ;
    public final void rule__Stream__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1780:1: ( rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 )
            // InternalExTwentyOne.g:1781:2: rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1
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
    // InternalExTwentyOne.g:1788:1: rule__Stream__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1792:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1793:1: ( ',' )
            {
            // InternalExTwentyOne.g:1793:1: ( ',' )
            // InternalExTwentyOne.g:1794:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1803:1: rule__Stream__Group_3__1 : rule__Stream__Group_3__1__Impl ;
    public final void rule__Stream__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1807:1: ( rule__Stream__Group_3__1__Impl )
            // InternalExTwentyOne.g:1808:2: rule__Stream__Group_3__1__Impl
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
    // InternalExTwentyOne.g:1814:1: rule__Stream__Group_3__1__Impl : ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) ) ;
    public final void rule__Stream__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1818:1: ( ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) ) )
            // InternalExTwentyOne.g:1819:1: ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) )
            {
            // InternalExTwentyOne.g:1819:1: ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) )
            // InternalExTwentyOne.g:1820:2: ( rule__Stream__InputsOrNodesAssignment_3_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_3_1()); 
            // InternalExTwentyOne.g:1821:2: ( rule__Stream__InputsOrNodesAssignment_3_1 )
            // InternalExTwentyOne.g:1821:3: rule__Stream__InputsOrNodesAssignment_3_1
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
    // InternalExTwentyOne.g:1830:1: rule__Stream__Group_4__0 : rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1 ;
    public final void rule__Stream__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1834:1: ( rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1 )
            // InternalExTwentyOne.g:1835:2: rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalExTwentyOne.g:1842:1: rule__Stream__Group_4__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1846:1: ( ( 'to' ) )
            // InternalExTwentyOne.g:1847:1: ( 'to' )
            {
            // InternalExTwentyOne.g:1847:1: ( 'to' )
            // InternalExTwentyOne.g:1848:2: 'to'
            {
             before(grammarAccess.getStreamAccess().getToKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1857:1: rule__Stream__Group_4__1 : rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2 ;
    public final void rule__Stream__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1861:1: ( rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2 )
            // InternalExTwentyOne.g:1862:2: rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalExTwentyOne.g:1869:1: rule__Stream__Group_4__1__Impl : ( ( rule__Stream__ElementsAssignment_4_1 ) ) ;
    public final void rule__Stream__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1873:1: ( ( ( rule__Stream__ElementsAssignment_4_1 ) ) )
            // InternalExTwentyOne.g:1874:1: ( ( rule__Stream__ElementsAssignment_4_1 ) )
            {
            // InternalExTwentyOne.g:1874:1: ( ( rule__Stream__ElementsAssignment_4_1 ) )
            // InternalExTwentyOne.g:1875:2: ( rule__Stream__ElementsAssignment_4_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_4_1()); 
            // InternalExTwentyOne.g:1876:2: ( rule__Stream__ElementsAssignment_4_1 )
            // InternalExTwentyOne.g:1876:3: rule__Stream__ElementsAssignment_4_1
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
    // InternalExTwentyOne.g:1884:1: rule__Stream__Group_4__2 : rule__Stream__Group_4__2__Impl ;
    public final void rule__Stream__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1888:1: ( rule__Stream__Group_4__2__Impl )
            // InternalExTwentyOne.g:1889:2: rule__Stream__Group_4__2__Impl
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
    // InternalExTwentyOne.g:1895:1: rule__Stream__Group_4__2__Impl : ( ( rule__Stream__Group_4_2__0 )* ) ;
    public final void rule__Stream__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1899:1: ( ( ( rule__Stream__Group_4_2__0 )* ) )
            // InternalExTwentyOne.g:1900:1: ( ( rule__Stream__Group_4_2__0 )* )
            {
            // InternalExTwentyOne.g:1900:1: ( ( rule__Stream__Group_4_2__0 )* )
            // InternalExTwentyOne.g:1901:2: ( rule__Stream__Group_4_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_4_2()); 
            // InternalExTwentyOne.g:1902:2: ( rule__Stream__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExTwentyOne.g:1902:3: rule__Stream__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Stream__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalExTwentyOne.g:1911:1: rule__Stream__Group_4_2__0 : rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1 ;
    public final void rule__Stream__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1915:1: ( rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1 )
            // InternalExTwentyOne.g:1916:2: rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalExTwentyOne.g:1923:1: rule__Stream__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1927:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1928:1: ( ',' )
            {
            // InternalExTwentyOne.g:1928:1: ( ',' )
            // InternalExTwentyOne.g:1929:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_4_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1938:1: rule__Stream__Group_4_2__1 : rule__Stream__Group_4_2__1__Impl ;
    public final void rule__Stream__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1942:1: ( rule__Stream__Group_4_2__1__Impl )
            // InternalExTwentyOne.g:1943:2: rule__Stream__Group_4_2__1__Impl
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
    // InternalExTwentyOne.g:1949:1: rule__Stream__Group_4_2__1__Impl : ( ( rule__Stream__ElementsAssignment_4_2_1 ) ) ;
    public final void rule__Stream__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1953:1: ( ( ( rule__Stream__ElementsAssignment_4_2_1 ) ) )
            // InternalExTwentyOne.g:1954:1: ( ( rule__Stream__ElementsAssignment_4_2_1 ) )
            {
            // InternalExTwentyOne.g:1954:1: ( ( rule__Stream__ElementsAssignment_4_2_1 ) )
            // InternalExTwentyOne.g:1955:2: ( rule__Stream__ElementsAssignment_4_2_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_4_2_1()); 
            // InternalExTwentyOne.g:1956:2: ( rule__Stream__ElementsAssignment_4_2_1 )
            // InternalExTwentyOne.g:1956:3: rule__Stream__ElementsAssignment_4_2_1
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
    // InternalExTwentyOne.g:1965:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1969:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalExTwentyOne.g:1970:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
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
    // InternalExTwentyOne.g:1977:1: rule__Element__Group_0__0__Impl : ( () ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1981:1: ( ( () ) )
            // InternalExTwentyOne.g:1982:1: ( () )
            {
            // InternalExTwentyOne.g:1982:1: ( () )
            // InternalExTwentyOne.g:1983:2: ()
            {
             before(grammarAccess.getElementAccess().getElementAction_0_0()); 
            // InternalExTwentyOne.g:1984:2: ()
            // InternalExTwentyOne.g:1984:3: 
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
    // InternalExTwentyOne.g:1992:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1996:1: ( rule__Element__Group_0__1__Impl )
            // InternalExTwentyOne.g:1997:2: rule__Element__Group_0__1__Impl
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
    // InternalExTwentyOne.g:2003:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__ElementAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2007:1: ( ( ( rule__Element__ElementAssignment_0_1 ) ) )
            // InternalExTwentyOne.g:2008:1: ( ( rule__Element__ElementAssignment_0_1 ) )
            {
            // InternalExTwentyOne.g:2008:1: ( ( rule__Element__ElementAssignment_0_1 ) )
            // InternalExTwentyOne.g:2009:2: ( rule__Element__ElementAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getElementAssignment_0_1()); 
            // InternalExTwentyOne.g:2010:2: ( rule__Element__ElementAssignment_0_1 )
            // InternalExTwentyOne.g:2010:3: rule__Element__ElementAssignment_0_1
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
    // InternalExTwentyOne.g:2019:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2023:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalExTwentyOne.g:2024:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalExTwentyOne.g:2031:1: rule__Element__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2035:1: ( ( '[' ) )
            // InternalExTwentyOne.g:2036:1: ( '[' )
            {
            // InternalExTwentyOne.g:2036:1: ( '[' )
            // InternalExTwentyOne.g:2037:2: '['
            {
             before(grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2046:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl rule__Element__Group_1__2 ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2050:1: ( rule__Element__Group_1__1__Impl rule__Element__Group_1__2 )
            // InternalExTwentyOne.g:2051:2: rule__Element__Group_1__1__Impl rule__Element__Group_1__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalExTwentyOne.g:2058:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__Alternatives_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2062:1: ( ( ( rule__Element__Alternatives_1_1 ) ) )
            // InternalExTwentyOne.g:2063:1: ( ( rule__Element__Alternatives_1_1 ) )
            {
            // InternalExTwentyOne.g:2063:1: ( ( rule__Element__Alternatives_1_1 ) )
            // InternalExTwentyOne.g:2064:2: ( rule__Element__Alternatives_1_1 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_1_1()); 
            // InternalExTwentyOne.g:2065:2: ( rule__Element__Alternatives_1_1 )
            // InternalExTwentyOne.g:2065:3: rule__Element__Alternatives_1_1
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
    // InternalExTwentyOne.g:2073:1: rule__Element__Group_1__2 : rule__Element__Group_1__2__Impl ;
    public final void rule__Element__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2077:1: ( rule__Element__Group_1__2__Impl )
            // InternalExTwentyOne.g:2078:2: rule__Element__Group_1__2__Impl
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
    // InternalExTwentyOne.g:2084:1: rule__Element__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Element__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2088:1: ( ( ']' ) )
            // InternalExTwentyOne.g:2089:1: ( ']' )
            {
            // InternalExTwentyOne.g:2089:1: ( ']' )
            // InternalExTwentyOne.g:2090:2: ']'
            {
             before(grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2100:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2104:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalExTwentyOne.g:2105:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
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
    // InternalExTwentyOne.g:2112:1: rule__Element__Group_2__0__Impl : ( 'output' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2116:1: ( ( 'output' ) )
            // InternalExTwentyOne.g:2117:1: ( 'output' )
            {
            // InternalExTwentyOne.g:2117:1: ( 'output' )
            // InternalExTwentyOne.g:2118:2: 'output'
            {
             before(grammarAccess.getElementAccess().getOutputKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2127:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2131:1: ( rule__Element__Group_2__1__Impl )
            // InternalExTwentyOne.g:2132:2: rule__Element__Group_2__1__Impl
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
    // InternalExTwentyOne.g:2138:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__OutputAssignment_2_1 ) ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2142:1: ( ( ( rule__Element__OutputAssignment_2_1 ) ) )
            // InternalExTwentyOne.g:2143:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            {
            // InternalExTwentyOne.g:2143:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            // InternalExTwentyOne.g:2144:2: ( rule__Element__OutputAssignment_2_1 )
            {
             before(grammarAccess.getElementAccess().getOutputAssignment_2_1()); 
            // InternalExTwentyOne.g:2145:2: ( rule__Element__OutputAssignment_2_1 )
            // InternalExTwentyOne.g:2145:3: rule__Element__OutputAssignment_2_1
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
    // InternalExTwentyOne.g:2154:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2158:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalExTwentyOne.g:2159:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalExTwentyOne.g:2166:1: rule__DataDecl__Group__0__Impl : ( () ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2170:1: ( ( () ) )
            // InternalExTwentyOne.g:2171:1: ( () )
            {
            // InternalExTwentyOne.g:2171:1: ( () )
            // InternalExTwentyOne.g:2172:2: ()
            {
             before(grammarAccess.getDataDeclAccess().getDataDeclAction_0()); 
            // InternalExTwentyOne.g:2173:2: ()
            // InternalExTwentyOne.g:2173:3: 
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
    // InternalExTwentyOne.g:2181:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2185:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalExTwentyOne.g:2186:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
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
    // InternalExTwentyOne.g:2193:1: rule__DataDecl__Group__1__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2197:1: ( ( 'data' ) )
            // InternalExTwentyOne.g:2198:1: ( 'data' )
            {
            // InternalExTwentyOne.g:2198:1: ( 'data' )
            // InternalExTwentyOne.g:2199:2: 'data'
            {
             before(grammarAccess.getDataDeclAccess().getDataKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2208:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2212:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalExTwentyOne.g:2213:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
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
    // InternalExTwentyOne.g:2220:1: rule__DataDecl__Group__2__Impl : ( ( rule__DataDecl__NameAssignment_2 ) ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2224:1: ( ( ( rule__DataDecl__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:2225:1: ( ( rule__DataDecl__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:2225:1: ( ( rule__DataDecl__NameAssignment_2 ) )
            // InternalExTwentyOne.g:2226:2: ( rule__DataDecl__NameAssignment_2 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:2227:2: ( rule__DataDecl__NameAssignment_2 )
            // InternalExTwentyOne.g:2227:3: rule__DataDecl__NameAssignment_2
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
    // InternalExTwentyOne.g:2235:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2239:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalExTwentyOne.g:2240:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
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
    // InternalExTwentyOne.g:2247:1: rule__DataDecl__Group__3__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2251:1: ( ( '{' ) )
            // InternalExTwentyOne.g:2252:1: ( '{' )
            {
            // InternalExTwentyOne.g:2252:1: ( '{' )
            // InternalExTwentyOne.g:2253:2: '{'
            {
             before(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2262:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2266:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalExTwentyOne.g:2267:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
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
    // InternalExTwentyOne.g:2274:1: rule__DataDecl__Group__4__Impl : ( ( rule__DataDecl__DataAssignment_4 ) ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2278:1: ( ( ( rule__DataDecl__DataAssignment_4 ) ) )
            // InternalExTwentyOne.g:2279:1: ( ( rule__DataDecl__DataAssignment_4 ) )
            {
            // InternalExTwentyOne.g:2279:1: ( ( rule__DataDecl__DataAssignment_4 ) )
            // InternalExTwentyOne.g:2280:2: ( rule__DataDecl__DataAssignment_4 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_4()); 
            // InternalExTwentyOne.g:2281:2: ( rule__DataDecl__DataAssignment_4 )
            // InternalExTwentyOne.g:2281:3: rule__DataDecl__DataAssignment_4
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
    // InternalExTwentyOne.g:2289:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2293:1: ( rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 )
            // InternalExTwentyOne.g:2294:2: rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6
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
    // InternalExTwentyOne.g:2301:1: rule__DataDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2305:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2306:1: ( ':' )
            {
            // InternalExTwentyOne.g:2306:1: ( ':' )
            // InternalExTwentyOne.g:2307:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2316:1: rule__DataDecl__Group__6 : rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 ;
    public final void rule__DataDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2320:1: ( rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 )
            // InternalExTwentyOne.g:2321:2: rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalExTwentyOne.g:2328:1: rule__DataDecl__Group__6__Impl : ( ( rule__DataDecl__ValuesAssignment_6 ) ) ;
    public final void rule__DataDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2332:1: ( ( ( rule__DataDecl__ValuesAssignment_6 ) ) )
            // InternalExTwentyOne.g:2333:1: ( ( rule__DataDecl__ValuesAssignment_6 ) )
            {
            // InternalExTwentyOne.g:2333:1: ( ( rule__DataDecl__ValuesAssignment_6 ) )
            // InternalExTwentyOne.g:2334:2: ( rule__DataDecl__ValuesAssignment_6 )
            {
             before(grammarAccess.getDataDeclAccess().getValuesAssignment_6()); 
            // InternalExTwentyOne.g:2335:2: ( rule__DataDecl__ValuesAssignment_6 )
            // InternalExTwentyOne.g:2335:3: rule__DataDecl__ValuesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__ValuesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getValuesAssignment_6()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:2343:1: rule__DataDecl__Group__7 : rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8 ;
    public final void rule__DataDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2347:1: ( rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8 )
            // InternalExTwentyOne.g:2348:2: rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8
            {
            pushFollow(FOLLOW_26);
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
    // InternalExTwentyOne.g:2355:1: rule__DataDecl__Group__7__Impl : ( ( rule__DataDecl__Group_7__0 )* ) ;
    public final void rule__DataDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2359:1: ( ( ( rule__DataDecl__Group_7__0 )* ) )
            // InternalExTwentyOne.g:2360:1: ( ( rule__DataDecl__Group_7__0 )* )
            {
            // InternalExTwentyOne.g:2360:1: ( ( rule__DataDecl__Group_7__0 )* )
            // InternalExTwentyOne.g:2361:2: ( rule__DataDecl__Group_7__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_7()); 
            // InternalExTwentyOne.g:2362:2: ( rule__DataDecl__Group_7__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExTwentyOne.g:2362:3: rule__DataDecl__Group_7__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DataDecl__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalExTwentyOne.g:2370:1: rule__DataDecl__Group__8 : rule__DataDecl__Group__8__Impl ;
    public final void rule__DataDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2374:1: ( rule__DataDecl__Group__8__Impl )
            // InternalExTwentyOne.g:2375:2: rule__DataDecl__Group__8__Impl
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
    // InternalExTwentyOne.g:2381:1: rule__DataDecl__Group__8__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2385:1: ( ( '}' ) )
            // InternalExTwentyOne.g:2386:1: ( '}' )
            {
            // InternalExTwentyOne.g:2386:1: ( '}' )
            // InternalExTwentyOne.g:2387:2: '}'
            {
             before(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2397:1: rule__DataDecl__Group_7__0 : rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1 ;
    public final void rule__DataDecl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2401:1: ( rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1 )
            // InternalExTwentyOne.g:2402:2: rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1
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
    // InternalExTwentyOne.g:2409:1: rule__DataDecl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2413:1: ( ( ',' ) )
            // InternalExTwentyOne.g:2414:1: ( ',' )
            {
            // InternalExTwentyOne.g:2414:1: ( ',' )
            // InternalExTwentyOne.g:2415:2: ','
            {
             before(grammarAccess.getDataDeclAccess().getCommaKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2424:1: rule__DataDecl__Group_7__1 : rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2 ;
    public final void rule__DataDecl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2428:1: ( rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2 )
            // InternalExTwentyOne.g:2429:2: rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2
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
    // InternalExTwentyOne.g:2436:1: rule__DataDecl__Group_7__1__Impl : ( ( rule__DataDecl__DataAssignment_7_1 ) ) ;
    public final void rule__DataDecl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2440:1: ( ( ( rule__DataDecl__DataAssignment_7_1 ) ) )
            // InternalExTwentyOne.g:2441:1: ( ( rule__DataDecl__DataAssignment_7_1 ) )
            {
            // InternalExTwentyOne.g:2441:1: ( ( rule__DataDecl__DataAssignment_7_1 ) )
            // InternalExTwentyOne.g:2442:2: ( rule__DataDecl__DataAssignment_7_1 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_7_1()); 
            // InternalExTwentyOne.g:2443:2: ( rule__DataDecl__DataAssignment_7_1 )
            // InternalExTwentyOne.g:2443:3: rule__DataDecl__DataAssignment_7_1
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
    // InternalExTwentyOne.g:2451:1: rule__DataDecl__Group_7__2 : rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3 ;
    public final void rule__DataDecl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2455:1: ( rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3 )
            // InternalExTwentyOne.g:2456:2: rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3
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
    // InternalExTwentyOne.g:2463:1: rule__DataDecl__Group_7__2__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2467:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2468:1: ( ':' )
            {
            // InternalExTwentyOne.g:2468:1: ( ':' )
            // InternalExTwentyOne.g:2469:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_7_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2478:1: rule__DataDecl__Group_7__3 : rule__DataDecl__Group_7__3__Impl ;
    public final void rule__DataDecl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2482:1: ( rule__DataDecl__Group_7__3__Impl )
            // InternalExTwentyOne.g:2483:2: rule__DataDecl__Group_7__3__Impl
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
    // InternalExTwentyOne.g:2489:1: rule__DataDecl__Group_7__3__Impl : ( ( rule__DataDecl__ValuesAssignment_7_3 ) ) ;
    public final void rule__DataDecl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2493:1: ( ( ( rule__DataDecl__ValuesAssignment_7_3 ) ) )
            // InternalExTwentyOne.g:2494:1: ( ( rule__DataDecl__ValuesAssignment_7_3 ) )
            {
            // InternalExTwentyOne.g:2494:1: ( ( rule__DataDecl__ValuesAssignment_7_3 ) )
            // InternalExTwentyOne.g:2495:2: ( rule__DataDecl__ValuesAssignment_7_3 )
            {
             before(grammarAccess.getDataDeclAccess().getValuesAssignment_7_3()); 
            // InternalExTwentyOne.g:2496:2: ( rule__DataDecl__ValuesAssignment_7_3 )
            // InternalExTwentyOne.g:2496:3: rule__DataDecl__ValuesAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__ValuesAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getValuesAssignment_7_3()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:2505:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2509:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalExTwentyOne.g:2510:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalExTwentyOne.g:2517:1: rule__Exp__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2521:1: ( ( rulePrimary ) )
            // InternalExTwentyOne.g:2522:1: ( rulePrimary )
            {
            // InternalExTwentyOne.g:2522:1: ( rulePrimary )
            // InternalExTwentyOne.g:2523:2: rulePrimary
            {
             before(grammarAccess.getExpAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getExpAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:2532:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2536:1: ( rule__Exp__Group__1__Impl )
            // InternalExTwentyOne.g:2537:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalExTwentyOne.g:2543:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2547:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalExTwentyOne.g:2548:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalExTwentyOne.g:2548:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalExTwentyOne.g:2549:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalExTwentyOne.g:2550:2: ( rule__Exp__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=33 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExTwentyOne.g:2550:3: rule__Exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalExTwentyOne.g:2559:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2563:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalExTwentyOne.g:2564:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalExTwentyOne.g:2571:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2575:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalExTwentyOne.g:2576:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalExTwentyOne.g:2576:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalExTwentyOne.g:2577:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalExTwentyOne.g:2578:2: ( rule__Exp__Alternatives_1_0 )
            // InternalExTwentyOne.g:2578:3: rule__Exp__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalExTwentyOne.g:2586:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2590:1: ( rule__Exp__Group_1__1__Impl )
            // InternalExTwentyOne.g:2591:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalExTwentyOne.g:2597:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2601:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalExTwentyOne.g:2602:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalExTwentyOne.g:2602:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalExTwentyOne.g:2603:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalExTwentyOne.g:2604:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalExTwentyOne.g:2604:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__0"
    // InternalExTwentyOne.g:2613:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2617:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalExTwentyOne.g:2618:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_29);
            rule__Exp__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__0"


    // $ANTLR start "rule__Exp__Group_1_0_0__0__Impl"
    // InternalExTwentyOne.g:2625:1: rule__Exp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2629:1: ( ( () ) )
            // InternalExTwentyOne.g:2630:1: ( () )
            {
            // InternalExTwentyOne.g:2630:1: ( () )
            // InternalExTwentyOne.g:2631:2: ()
            {
             before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalExTwentyOne.g:2632:2: ()
            // InternalExTwentyOne.g:2632:3: 
            {
            }

             after(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__1"
    // InternalExTwentyOne.g:2640:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2644:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalExTwentyOne.g:2645:2: rule__Exp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__1"


    // $ANTLR start "rule__Exp__Group_1_0_0__1__Impl"
    // InternalExTwentyOne.g:2651:1: rule__Exp__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2655:1: ( ( '+' ) )
            // InternalExTwentyOne.g:2656:1: ( '+' )
            {
            // InternalExTwentyOne.g:2656:1: ( '+' )
            // InternalExTwentyOne.g:2657:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_1__0"
    // InternalExTwentyOne.g:2667:1: rule__Exp__Group_1_0_1__0 : rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 ;
    public final void rule__Exp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2671:1: ( rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 )
            // InternalExTwentyOne.g:2672:2: rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Exp__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__0"


    // $ANTLR start "rule__Exp__Group_1_0_1__0__Impl"
    // InternalExTwentyOne.g:2679:1: rule__Exp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2683:1: ( ( () ) )
            // InternalExTwentyOne.g:2684:1: ( () )
            {
            // InternalExTwentyOne.g:2684:1: ( () )
            // InternalExTwentyOne.g:2685:2: ()
            {
             before(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalExTwentyOne.g:2686:2: ()
            // InternalExTwentyOne.g:2686:3: 
            {
            }

             after(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_1__1"
    // InternalExTwentyOne.g:2694:1: rule__Exp__Group_1_0_1__1 : rule__Exp__Group_1_0_1__1__Impl ;
    public final void rule__Exp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2698:1: ( rule__Exp__Group_1_0_1__1__Impl )
            // InternalExTwentyOne.g:2699:2: rule__Exp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__1"


    // $ANTLR start "rule__Exp__Group_1_0_1__1__Impl"
    // InternalExTwentyOne.g:2705:1: rule__Exp__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Exp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2709:1: ( ( '-' ) )
            // InternalExTwentyOne.g:2710:1: ( '-' )
            {
            // InternalExTwentyOne.g:2710:1: ( '-' )
            // InternalExTwentyOne.g:2711:2: '-'
            {
             before(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_2__0"
    // InternalExTwentyOne.g:2721:1: rule__Exp__Group_1_0_2__0 : rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1 ;
    public final void rule__Exp__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2725:1: ( rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1 )
            // InternalExTwentyOne.g:2726:2: rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Exp__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_2__0"


    // $ANTLR start "rule__Exp__Group_1_0_2__0__Impl"
    // InternalExTwentyOne.g:2733:1: rule__Exp__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2737:1: ( ( () ) )
            // InternalExTwentyOne.g:2738:1: ( () )
            {
            // InternalExTwentyOne.g:2738:1: ( () )
            // InternalExTwentyOne.g:2739:2: ()
            {
             before(grammarAccess.getExpAccess().getMultLeftAction_1_0_2_0()); 
            // InternalExTwentyOne.g:2740:2: ()
            // InternalExTwentyOne.g:2740:3: 
            {
            }

             after(grammarAccess.getExpAccess().getMultLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_2__1"
    // InternalExTwentyOne.g:2748:1: rule__Exp__Group_1_0_2__1 : rule__Exp__Group_1_0_2__1__Impl ;
    public final void rule__Exp__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2752:1: ( rule__Exp__Group_1_0_2__1__Impl )
            // InternalExTwentyOne.g:2753:2: rule__Exp__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_2__1"


    // $ANTLR start "rule__Exp__Group_1_0_2__1__Impl"
    // InternalExTwentyOne.g:2759:1: rule__Exp__Group_1_0_2__1__Impl : ( '*' ) ;
    public final void rule__Exp__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2763:1: ( ( '*' ) )
            // InternalExTwentyOne.g:2764:1: ( '*' )
            {
            // InternalExTwentyOne.g:2764:1: ( '*' )
            // InternalExTwentyOne.g:2765:2: '*'
            {
             before(grammarAccess.getExpAccess().getAsteriskKeyword_1_0_2_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getAsteriskKeyword_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_3__0"
    // InternalExTwentyOne.g:2775:1: rule__Exp__Group_1_0_3__0 : rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1 ;
    public final void rule__Exp__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2779:1: ( rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1 )
            // InternalExTwentyOne.g:2780:2: rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1
            {
            pushFollow(FOLLOW_27);
            rule__Exp__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_3__0"


    // $ANTLR start "rule__Exp__Group_1_0_3__0__Impl"
    // InternalExTwentyOne.g:2787:1: rule__Exp__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2791:1: ( ( () ) )
            // InternalExTwentyOne.g:2792:1: ( () )
            {
            // InternalExTwentyOne.g:2792:1: ( () )
            // InternalExTwentyOne.g:2793:2: ()
            {
             before(grammarAccess.getExpAccess().getDivideLeftAction_1_0_3_0()); 
            // InternalExTwentyOne.g:2794:2: ()
            // InternalExTwentyOne.g:2794:3: 
            {
            }

             after(grammarAccess.getExpAccess().getDivideLeftAction_1_0_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_3__1"
    // InternalExTwentyOne.g:2802:1: rule__Exp__Group_1_0_3__1 : rule__Exp__Group_1_0_3__1__Impl ;
    public final void rule__Exp__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2806:1: ( rule__Exp__Group_1_0_3__1__Impl )
            // InternalExTwentyOne.g:2807:2: rule__Exp__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_3__1"


    // $ANTLR start "rule__Exp__Group_1_0_3__1__Impl"
    // InternalExTwentyOne.g:2813:1: rule__Exp__Group_1_0_3__1__Impl : ( '/' ) ;
    public final void rule__Exp__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2817:1: ( ( '/' ) )
            // InternalExTwentyOne.g:2818:1: ( '/' )
            {
            // InternalExTwentyOne.g:2818:1: ( '/' )
            // InternalExTwentyOne.g:2819:2: '/'
            {
             before(grammarAccess.getExpAccess().getSolidusKeyword_1_0_3_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getSolidusKeyword_1_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalExTwentyOne.g:2829:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2833:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalExTwentyOne.g:2834:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalExTwentyOne.g:2841:1: rule__Parenthesis__Group__0__Impl : ( () ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2845:1: ( ( () ) )
            // InternalExTwentyOne.g:2846:1: ( () )
            {
            // InternalExTwentyOne.g:2846:1: ( () )
            // InternalExTwentyOne.g:2847:2: ()
            {
             before(grammarAccess.getParenthesisAccess().getParenthesisAction_0()); 
            // InternalExTwentyOne.g:2848:2: ()
            // InternalExTwentyOne.g:2848:3: 
            {
            }

             after(grammarAccess.getParenthesisAccess().getParenthesisAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalExTwentyOne.g:2856:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2860:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalExTwentyOne.g:2861:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalExTwentyOne.g:2868:1: rule__Parenthesis__Group__1__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2872:1: ( ( '(' ) )
            // InternalExTwentyOne.g:2873:1: ( '(' )
            {
            // InternalExTwentyOne.g:2873:1: ( '(' )
            // InternalExTwentyOne.g:2874:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalExTwentyOne.g:2883:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3 ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2887:1: ( rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3 )
            // InternalExTwentyOne.g:2888:2: rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Parenthesis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalExTwentyOne.g:2895:1: rule__Parenthesis__Group__2__Impl : ( ( rule__Parenthesis__ExpAssignment_2 ) ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2899:1: ( ( ( rule__Parenthesis__ExpAssignment_2 ) ) )
            // InternalExTwentyOne.g:2900:1: ( ( rule__Parenthesis__ExpAssignment_2 ) )
            {
            // InternalExTwentyOne.g:2900:1: ( ( rule__Parenthesis__ExpAssignment_2 ) )
            // InternalExTwentyOne.g:2901:2: ( rule__Parenthesis__ExpAssignment_2 )
            {
             before(grammarAccess.getParenthesisAccess().getExpAssignment_2()); 
            // InternalExTwentyOne.g:2902:2: ( rule__Parenthesis__ExpAssignment_2 )
            // InternalExTwentyOne.g:2902:3: rule__Parenthesis__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__Parenthesis__Group__3"
    // InternalExTwentyOne.g:2910:1: rule__Parenthesis__Group__3 : rule__Parenthesis__Group__3__Impl ;
    public final void rule__Parenthesis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2914:1: ( rule__Parenthesis__Group__3__Impl )
            // InternalExTwentyOne.g:2915:2: rule__Parenthesis__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__3"


    // $ANTLR start "rule__Parenthesis__Group__3__Impl"
    // InternalExTwentyOne.g:2921:1: rule__Parenthesis__Group__3__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2925:1: ( ( ')' ) )
            // InternalExTwentyOne.g:2926:1: ( ')' )
            {
            // InternalExTwentyOne.g:2926:1: ( ')' )
            // InternalExTwentyOne.g:2927:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__3__Impl"


    // $ANTLR start "rule__DataAccess__Group__0"
    // InternalExTwentyOne.g:2937:1: rule__DataAccess__Group__0 : rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 ;
    public final void rule__DataAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2941:1: ( rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 )
            // InternalExTwentyOne.g:2942:2: rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataAccess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__0"


    // $ANTLR start "rule__DataAccess__Group__0__Impl"
    // InternalExTwentyOne.g:2949:1: rule__DataAccess__Group__0__Impl : ( () ) ;
    public final void rule__DataAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2953:1: ( ( () ) )
            // InternalExTwentyOne.g:2954:1: ( () )
            {
            // InternalExTwentyOne.g:2954:1: ( () )
            // InternalExTwentyOne.g:2955:2: ()
            {
             before(grammarAccess.getDataAccessAccess().getDataAccessAction_0()); 
            // InternalExTwentyOne.g:2956:2: ()
            // InternalExTwentyOne.g:2956:3: 
            {
            }

             after(grammarAccess.getDataAccessAccess().getDataAccessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__0__Impl"


    // $ANTLR start "rule__DataAccess__Group__1"
    // InternalExTwentyOne.g:2964:1: rule__DataAccess__Group__1 : rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2 ;
    public final void rule__DataAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2968:1: ( rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2 )
            // InternalExTwentyOne.g:2969:2: rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__DataAccess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__1"


    // $ANTLR start "rule__DataAccess__Group__1__Impl"
    // InternalExTwentyOne.g:2976:1: rule__DataAccess__Group__1__Impl : ( ( rule__DataAccess__AccessedDataAssignment_1 ) ) ;
    public final void rule__DataAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2980:1: ( ( ( rule__DataAccess__AccessedDataAssignment_1 ) ) )
            // InternalExTwentyOne.g:2981:1: ( ( rule__DataAccess__AccessedDataAssignment_1 ) )
            {
            // InternalExTwentyOne.g:2981:1: ( ( rule__DataAccess__AccessedDataAssignment_1 ) )
            // InternalExTwentyOne.g:2982:2: ( rule__DataAccess__AccessedDataAssignment_1 )
            {
             before(grammarAccess.getDataAccessAccess().getAccessedDataAssignment_1()); 
            // InternalExTwentyOne.g:2983:2: ( rule__DataAccess__AccessedDataAssignment_1 )
            // InternalExTwentyOne.g:2983:3: rule__DataAccess__AccessedDataAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__AccessedDataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getAccessedDataAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__1__Impl"


    // $ANTLR start "rule__DataAccess__Group__2"
    // InternalExTwentyOne.g:2991:1: rule__DataAccess__Group__2 : rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3 ;
    public final void rule__DataAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2995:1: ( rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3 )
            // InternalExTwentyOne.g:2996:2: rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__DataAccess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__2"


    // $ANTLR start "rule__DataAccess__Group__2__Impl"
    // InternalExTwentyOne.g:3003:1: rule__DataAccess__Group__2__Impl : ( '.' ) ;
    public final void rule__DataAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3007:1: ( ( '.' ) )
            // InternalExTwentyOne.g:3008:1: ( '.' )
            {
            // InternalExTwentyOne.g:3008:1: ( '.' )
            // InternalExTwentyOne.g:3009:2: '.'
            {
             before(grammarAccess.getDataAccessAccess().getFullStopKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__2__Impl"


    // $ANTLR start "rule__DataAccess__Group__3"
    // InternalExTwentyOne.g:3018:1: rule__DataAccess__Group__3 : rule__DataAccess__Group__3__Impl ;
    public final void rule__DataAccess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3022:1: ( rule__DataAccess__Group__3__Impl )
            // InternalExTwentyOne.g:3023:2: rule__DataAccess__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__3"


    // $ANTLR start "rule__DataAccess__Group__3__Impl"
    // InternalExTwentyOne.g:3029:1: rule__DataAccess__Group__3__Impl : ( ( rule__DataAccess__AccessedFieldAssignment_3 ) ) ;
    public final void rule__DataAccess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3033:1: ( ( ( rule__DataAccess__AccessedFieldAssignment_3 ) ) )
            // InternalExTwentyOne.g:3034:1: ( ( rule__DataAccess__AccessedFieldAssignment_3 ) )
            {
            // InternalExTwentyOne.g:3034:1: ( ( rule__DataAccess__AccessedFieldAssignment_3 ) )
            // InternalExTwentyOne.g:3035:2: ( rule__DataAccess__AccessedFieldAssignment_3 )
            {
             before(grammarAccess.getDataAccessAccess().getAccessedFieldAssignment_3()); 
            // InternalExTwentyOne.g:3036:2: ( rule__DataAccess__AccessedFieldAssignment_3 )
            // InternalExTwentyOne.g:3036:3: rule__DataAccess__AccessedFieldAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataAccess__AccessedFieldAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessAccess().getAccessedFieldAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__Group__3__Impl"


    // $ANTLR start "rule__IfThenElse__Group__0"
    // InternalExTwentyOne.g:3045:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3049:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // InternalExTwentyOne.g:3050:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__IfThenElse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0"


    // $ANTLR start "rule__IfThenElse__Group__0__Impl"
    // InternalExTwentyOne.g:3057:1: rule__IfThenElse__Group__0__Impl : ( () ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3061:1: ( ( () ) )
            // InternalExTwentyOne.g:3062:1: ( () )
            {
            // InternalExTwentyOne.g:3062:1: ( () )
            // InternalExTwentyOne.g:3063:2: ()
            {
             before(grammarAccess.getIfThenElseAccess().getIfThenElseAction_0()); 
            // InternalExTwentyOne.g:3064:2: ()
            // InternalExTwentyOne.g:3064:3: 
            {
            }

             after(grammarAccess.getIfThenElseAccess().getIfThenElseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0__Impl"


    // $ANTLR start "rule__IfThenElse__Group__1"
    // InternalExTwentyOne.g:3072:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3076:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // InternalExTwentyOne.g:3077:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__IfThenElse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__1"


    // $ANTLR start "rule__IfThenElse__Group__1__Impl"
    // InternalExTwentyOne.g:3084:1: rule__IfThenElse__Group__1__Impl : ( 'if' ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3088:1: ( ( 'if' ) )
            // InternalExTwentyOne.g:3089:1: ( 'if' )
            {
            // InternalExTwentyOne.g:3089:1: ( 'if' )
            // InternalExTwentyOne.g:3090:2: 'if'
            {
             before(grammarAccess.getIfThenElseAccess().getIfKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIfThenElseAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__1__Impl"


    // $ANTLR start "rule__IfThenElse__Group__2"
    // InternalExTwentyOne.g:3099:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3103:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // InternalExTwentyOne.g:3104:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__IfThenElse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__2"


    // $ANTLR start "rule__IfThenElse__Group__2__Impl"
    // InternalExTwentyOne.g:3111:1: rule__IfThenElse__Group__2__Impl : ( ( rule__IfThenElse__IfLogicExpAssignment_2 ) ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3115:1: ( ( ( rule__IfThenElse__IfLogicExpAssignment_2 ) ) )
            // InternalExTwentyOne.g:3116:1: ( ( rule__IfThenElse__IfLogicExpAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3116:1: ( ( rule__IfThenElse__IfLogicExpAssignment_2 ) )
            // InternalExTwentyOne.g:3117:2: ( rule__IfThenElse__IfLogicExpAssignment_2 )
            {
             before(grammarAccess.getIfThenElseAccess().getIfLogicExpAssignment_2()); 
            // InternalExTwentyOne.g:3118:2: ( rule__IfThenElse__IfLogicExpAssignment_2 )
            // InternalExTwentyOne.g:3118:3: rule__IfThenElse__IfLogicExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__IfLogicExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfThenElseAccess().getIfLogicExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__2__Impl"


    // $ANTLR start "rule__IfThenElse__Group__3"
    // InternalExTwentyOne.g:3126:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3130:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // InternalExTwentyOne.g:3131:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__IfThenElse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__3"


    // $ANTLR start "rule__IfThenElse__Group__3__Impl"
    // InternalExTwentyOne.g:3138:1: rule__IfThenElse__Group__3__Impl : ( 'then' ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3142:1: ( ( 'then' ) )
            // InternalExTwentyOne.g:3143:1: ( 'then' )
            {
            // InternalExTwentyOne.g:3143:1: ( 'then' )
            // InternalExTwentyOne.g:3144:2: 'then'
            {
             before(grammarAccess.getIfThenElseAccess().getThenKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIfThenElseAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__3__Impl"


    // $ANTLR start "rule__IfThenElse__Group__4"
    // InternalExTwentyOne.g:3153:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3157:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // InternalExTwentyOne.g:3158:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__IfThenElse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__4"


    // $ANTLR start "rule__IfThenElse__Group__4__Impl"
    // InternalExTwentyOne.g:3165:1: rule__IfThenElse__Group__4__Impl : ( ( rule__IfThenElse__ThenExpAssignment_4 ) ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3169:1: ( ( ( rule__IfThenElse__ThenExpAssignment_4 ) ) )
            // InternalExTwentyOne.g:3170:1: ( ( rule__IfThenElse__ThenExpAssignment_4 ) )
            {
            // InternalExTwentyOne.g:3170:1: ( ( rule__IfThenElse__ThenExpAssignment_4 ) )
            // InternalExTwentyOne.g:3171:2: ( rule__IfThenElse__ThenExpAssignment_4 )
            {
             before(grammarAccess.getIfThenElseAccess().getThenExpAssignment_4()); 
            // InternalExTwentyOne.g:3172:2: ( rule__IfThenElse__ThenExpAssignment_4 )
            // InternalExTwentyOne.g:3172:3: rule__IfThenElse__ThenExpAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__ThenExpAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfThenElseAccess().getThenExpAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__4__Impl"


    // $ANTLR start "rule__IfThenElse__Group__5"
    // InternalExTwentyOne.g:3180:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3184:1: ( rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 )
            // InternalExTwentyOne.g:3185:2: rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__IfThenElse__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__5"


    // $ANTLR start "rule__IfThenElse__Group__5__Impl"
    // InternalExTwentyOne.g:3192:1: rule__IfThenElse__Group__5__Impl : ( 'else' ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3196:1: ( ( 'else' ) )
            // InternalExTwentyOne.g:3197:1: ( 'else' )
            {
            // InternalExTwentyOne.g:3197:1: ( 'else' )
            // InternalExTwentyOne.g:3198:2: 'else'
            {
             before(grammarAccess.getIfThenElseAccess().getElseKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIfThenElseAccess().getElseKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__5__Impl"


    // $ANTLR start "rule__IfThenElse__Group__6"
    // InternalExTwentyOne.g:3207:1: rule__IfThenElse__Group__6 : rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7 ;
    public final void rule__IfThenElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3211:1: ( rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7 )
            // InternalExTwentyOne.g:3212:2: rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__IfThenElse__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__6"


    // $ANTLR start "rule__IfThenElse__Group__6__Impl"
    // InternalExTwentyOne.g:3219:1: rule__IfThenElse__Group__6__Impl : ( ( rule__IfThenElse__ElseExpAssignment_6 ) ) ;
    public final void rule__IfThenElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3223:1: ( ( ( rule__IfThenElse__ElseExpAssignment_6 ) ) )
            // InternalExTwentyOne.g:3224:1: ( ( rule__IfThenElse__ElseExpAssignment_6 ) )
            {
            // InternalExTwentyOne.g:3224:1: ( ( rule__IfThenElse__ElseExpAssignment_6 ) )
            // InternalExTwentyOne.g:3225:2: ( rule__IfThenElse__ElseExpAssignment_6 )
            {
             before(grammarAccess.getIfThenElseAccess().getElseExpAssignment_6()); 
            // InternalExTwentyOne.g:3226:2: ( rule__IfThenElse__ElseExpAssignment_6 )
            // InternalExTwentyOne.g:3226:3: rule__IfThenElse__ElseExpAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__ElseExpAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIfThenElseAccess().getElseExpAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__6__Impl"


    // $ANTLR start "rule__IfThenElse__Group__7"
    // InternalExTwentyOne.g:3234:1: rule__IfThenElse__Group__7 : rule__IfThenElse__Group__7__Impl ;
    public final void rule__IfThenElse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3238:1: ( rule__IfThenElse__Group__7__Impl )
            // InternalExTwentyOne.g:3239:2: rule__IfThenElse__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__7"


    // $ANTLR start "rule__IfThenElse__Group__7__Impl"
    // InternalExTwentyOne.g:3245:1: rule__IfThenElse__Group__7__Impl : ( 'end' ) ;
    public final void rule__IfThenElse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3249:1: ( ( 'end' ) )
            // InternalExTwentyOne.g:3250:1: ( 'end' )
            {
            // InternalExTwentyOne.g:3250:1: ( 'end' )
            // InternalExTwentyOne.g:3251:2: 'end'
            {
             before(grammarAccess.getIfThenElseAccess().getEndKeyword_7()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getIfThenElseAccess().getEndKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__7__Impl"


    // $ANTLR start "rule__NewInput__Group__0"
    // InternalExTwentyOne.g:3261:1: rule__NewInput__Group__0 : rule__NewInput__Group__0__Impl rule__NewInput__Group__1 ;
    public final void rule__NewInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3265:1: ( rule__NewInput__Group__0__Impl rule__NewInput__Group__1 )
            // InternalExTwentyOne.g:3266:2: rule__NewInput__Group__0__Impl rule__NewInput__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__NewInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__0"


    // $ANTLR start "rule__NewInput__Group__0__Impl"
    // InternalExTwentyOne.g:3273:1: rule__NewInput__Group__0__Impl : ( () ) ;
    public final void rule__NewInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3277:1: ( ( () ) )
            // InternalExTwentyOne.g:3278:1: ( () )
            {
            // InternalExTwentyOne.g:3278:1: ( () )
            // InternalExTwentyOne.g:3279:2: ()
            {
             before(grammarAccess.getNewInputAccess().getNewInputAction_0()); 
            // InternalExTwentyOne.g:3280:2: ()
            // InternalExTwentyOne.g:3280:3: 
            {
            }

             after(grammarAccess.getNewInputAccess().getNewInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__0__Impl"


    // $ANTLR start "rule__NewInput__Group__1"
    // InternalExTwentyOne.g:3288:1: rule__NewInput__Group__1 : rule__NewInput__Group__1__Impl rule__NewInput__Group__2 ;
    public final void rule__NewInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3292:1: ( rule__NewInput__Group__1__Impl rule__NewInput__Group__2 )
            // InternalExTwentyOne.g:3293:2: rule__NewInput__Group__1__Impl rule__NewInput__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__NewInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__1"


    // $ANTLR start "rule__NewInput__Group__1__Impl"
    // InternalExTwentyOne.g:3300:1: rule__NewInput__Group__1__Impl : ( 'new' ) ;
    public final void rule__NewInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3304:1: ( ( 'new' ) )
            // InternalExTwentyOne.g:3305:1: ( 'new' )
            {
            // InternalExTwentyOne.g:3305:1: ( 'new' )
            // InternalExTwentyOne.g:3306:2: 'new'
            {
             before(grammarAccess.getNewInputAccess().getNewKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getNewKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__1__Impl"


    // $ANTLR start "rule__NewInput__Group__2"
    // InternalExTwentyOne.g:3315:1: rule__NewInput__Group__2 : rule__NewInput__Group__2__Impl rule__NewInput__Group__3 ;
    public final void rule__NewInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3319:1: ( rule__NewInput__Group__2__Impl rule__NewInput__Group__3 )
            // InternalExTwentyOne.g:3320:2: rule__NewInput__Group__2__Impl rule__NewInput__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__NewInput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__2"


    // $ANTLR start "rule__NewInput__Group__2__Impl"
    // InternalExTwentyOne.g:3327:1: rule__NewInput__Group__2__Impl : ( ( rule__NewInput__NewArrayIdAssignment_2 ) ) ;
    public final void rule__NewInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3331:1: ( ( ( rule__NewInput__NewArrayIdAssignment_2 ) ) )
            // InternalExTwentyOne.g:3332:1: ( ( rule__NewInput__NewArrayIdAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3332:1: ( ( rule__NewInput__NewArrayIdAssignment_2 ) )
            // InternalExTwentyOne.g:3333:2: ( rule__NewInput__NewArrayIdAssignment_2 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdAssignment_2()); 
            // InternalExTwentyOne.g:3334:2: ( rule__NewInput__NewArrayIdAssignment_2 )
            // InternalExTwentyOne.g:3334:3: rule__NewInput__NewArrayIdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__NewArrayIdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getNewArrayIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__2__Impl"


    // $ANTLR start "rule__NewInput__Group__3"
    // InternalExTwentyOne.g:3342:1: rule__NewInput__Group__3 : rule__NewInput__Group__3__Impl rule__NewInput__Group__4 ;
    public final void rule__NewInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3346:1: ( rule__NewInput__Group__3__Impl rule__NewInput__Group__4 )
            // InternalExTwentyOne.g:3347:2: rule__NewInput__Group__3__Impl rule__NewInput__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__NewInput__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__3"


    // $ANTLR start "rule__NewInput__Group__3__Impl"
    // InternalExTwentyOne.g:3354:1: rule__NewInput__Group__3__Impl : ( '[' ) ;
    public final void rule__NewInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3358:1: ( ( '[' ) )
            // InternalExTwentyOne.g:3359:1: ( '[' )
            {
            // InternalExTwentyOne.g:3359:1: ( '[' )
            // InternalExTwentyOne.g:3360:2: '['
            {
             before(grammarAccess.getNewInputAccess().getLeftSquareBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__3__Impl"


    // $ANTLR start "rule__NewInput__Group__4"
    // InternalExTwentyOne.g:3369:1: rule__NewInput__Group__4 : rule__NewInput__Group__4__Impl rule__NewInput__Group__5 ;
    public final void rule__NewInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3373:1: ( rule__NewInput__Group__4__Impl rule__NewInput__Group__5 )
            // InternalExTwentyOne.g:3374:2: rule__NewInput__Group__4__Impl rule__NewInput__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__NewInput__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__4"


    // $ANTLR start "rule__NewInput__Group__4__Impl"
    // InternalExTwentyOne.g:3381:1: rule__NewInput__Group__4__Impl : ( ( rule__NewInput__NewArrayIdsAssignment_4 ) ) ;
    public final void rule__NewInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3385:1: ( ( ( rule__NewInput__NewArrayIdsAssignment_4 ) ) )
            // InternalExTwentyOne.g:3386:1: ( ( rule__NewInput__NewArrayIdsAssignment_4 ) )
            {
            // InternalExTwentyOne.g:3386:1: ( ( rule__NewInput__NewArrayIdsAssignment_4 ) )
            // InternalExTwentyOne.g:3387:2: ( rule__NewInput__NewArrayIdsAssignment_4 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_4()); 
            // InternalExTwentyOne.g:3388:2: ( rule__NewInput__NewArrayIdsAssignment_4 )
            // InternalExTwentyOne.g:3388:3: rule__NewInput__NewArrayIdsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__NewArrayIdsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__4__Impl"


    // $ANTLR start "rule__NewInput__Group__5"
    // InternalExTwentyOne.g:3396:1: rule__NewInput__Group__5 : rule__NewInput__Group__5__Impl rule__NewInput__Group__6 ;
    public final void rule__NewInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3400:1: ( rule__NewInput__Group__5__Impl rule__NewInput__Group__6 )
            // InternalExTwentyOne.g:3401:2: rule__NewInput__Group__5__Impl rule__NewInput__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__NewInput__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__5"


    // $ANTLR start "rule__NewInput__Group__5__Impl"
    // InternalExTwentyOne.g:3408:1: rule__NewInput__Group__5__Impl : ( '=' ) ;
    public final void rule__NewInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3412:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3413:1: ( '=' )
            {
            // InternalExTwentyOne.g:3413:1: ( '=' )
            // InternalExTwentyOne.g:3414:2: '='
            {
             before(grammarAccess.getNewInputAccess().getEqualsSignKeyword_5()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__5__Impl"


    // $ANTLR start "rule__NewInput__Group__6"
    // InternalExTwentyOne.g:3423:1: rule__NewInput__Group__6 : rule__NewInput__Group__6__Impl rule__NewInput__Group__7 ;
    public final void rule__NewInput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3427:1: ( rule__NewInput__Group__6__Impl rule__NewInput__Group__7 )
            // InternalExTwentyOne.g:3428:2: rule__NewInput__Group__6__Impl rule__NewInput__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__NewInput__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__6"


    // $ANTLR start "rule__NewInput__Group__6__Impl"
    // InternalExTwentyOne.g:3435:1: rule__NewInput__Group__6__Impl : ( ( rule__NewInput__NewArrayExpsAssignment_6 ) ) ;
    public final void rule__NewInput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3439:1: ( ( ( rule__NewInput__NewArrayExpsAssignment_6 ) ) )
            // InternalExTwentyOne.g:3440:1: ( ( rule__NewInput__NewArrayExpsAssignment_6 ) )
            {
            // InternalExTwentyOne.g:3440:1: ( ( rule__NewInput__NewArrayExpsAssignment_6 ) )
            // InternalExTwentyOne.g:3441:2: ( rule__NewInput__NewArrayExpsAssignment_6 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_6()); 
            // InternalExTwentyOne.g:3442:2: ( rule__NewInput__NewArrayExpsAssignment_6 )
            // InternalExTwentyOne.g:3442:3: rule__NewInput__NewArrayExpsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__NewArrayExpsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__6__Impl"


    // $ANTLR start "rule__NewInput__Group__7"
    // InternalExTwentyOne.g:3450:1: rule__NewInput__Group__7 : rule__NewInput__Group__7__Impl rule__NewInput__Group__8 ;
    public final void rule__NewInput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3454:1: ( rule__NewInput__Group__7__Impl rule__NewInput__Group__8 )
            // InternalExTwentyOne.g:3455:2: rule__NewInput__Group__7__Impl rule__NewInput__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__NewInput__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__7"


    // $ANTLR start "rule__NewInput__Group__7__Impl"
    // InternalExTwentyOne.g:3462:1: rule__NewInput__Group__7__Impl : ( ( rule__NewInput__Group_7__0 )* ) ;
    public final void rule__NewInput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3466:1: ( ( ( rule__NewInput__Group_7__0 )* ) )
            // InternalExTwentyOne.g:3467:1: ( ( rule__NewInput__Group_7__0 )* )
            {
            // InternalExTwentyOne.g:3467:1: ( ( rule__NewInput__Group_7__0 )* )
            // InternalExTwentyOne.g:3468:2: ( rule__NewInput__Group_7__0 )*
            {
             before(grammarAccess.getNewInputAccess().getGroup_7()); 
            // InternalExTwentyOne.g:3469:2: ( rule__NewInput__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExTwentyOne.g:3469:3: rule__NewInput__Group_7__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__NewInput__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNewInputAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__7__Impl"


    // $ANTLR start "rule__NewInput__Group__8"
    // InternalExTwentyOne.g:3477:1: rule__NewInput__Group__8 : rule__NewInput__Group__8__Impl ;
    public final void rule__NewInput__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3481:1: ( rule__NewInput__Group__8__Impl )
            // InternalExTwentyOne.g:3482:2: rule__NewInput__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__8"


    // $ANTLR start "rule__NewInput__Group__8__Impl"
    // InternalExTwentyOne.g:3488:1: rule__NewInput__Group__8__Impl : ( ']' ) ;
    public final void rule__NewInput__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3492:1: ( ( ']' ) )
            // InternalExTwentyOne.g:3493:1: ( ']' )
            {
            // InternalExTwentyOne.g:3493:1: ( ']' )
            // InternalExTwentyOne.g:3494:2: ']'
            {
             before(grammarAccess.getNewInputAccess().getRightSquareBracketKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__8__Impl"


    // $ANTLR start "rule__NewInput__Group_7__0"
    // InternalExTwentyOne.g:3504:1: rule__NewInput__Group_7__0 : rule__NewInput__Group_7__0__Impl rule__NewInput__Group_7__1 ;
    public final void rule__NewInput__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3508:1: ( rule__NewInput__Group_7__0__Impl rule__NewInput__Group_7__1 )
            // InternalExTwentyOne.g:3509:2: rule__NewInput__Group_7__0__Impl rule__NewInput__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__NewInput__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_7__0"


    // $ANTLR start "rule__NewInput__Group_7__0__Impl"
    // InternalExTwentyOne.g:3516:1: rule__NewInput__Group_7__0__Impl : ( ',' ) ;
    public final void rule__NewInput__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3520:1: ( ( ',' ) )
            // InternalExTwentyOne.g:3521:1: ( ',' )
            {
            // InternalExTwentyOne.g:3521:1: ( ',' )
            // InternalExTwentyOne.g:3522:2: ','
            {
             before(grammarAccess.getNewInputAccess().getCommaKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_7__0__Impl"


    // $ANTLR start "rule__NewInput__Group_7__1"
    // InternalExTwentyOne.g:3531:1: rule__NewInput__Group_7__1 : rule__NewInput__Group_7__1__Impl rule__NewInput__Group_7__2 ;
    public final void rule__NewInput__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3535:1: ( rule__NewInput__Group_7__1__Impl rule__NewInput__Group_7__2 )
            // InternalExTwentyOne.g:3536:2: rule__NewInput__Group_7__1__Impl rule__NewInput__Group_7__2
            {
            pushFollow(FOLLOW_38);
            rule__NewInput__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_7__1"


    // $ANTLR start "rule__NewInput__Group_7__1__Impl"
    // InternalExTwentyOne.g:3543:1: rule__NewInput__Group_7__1__Impl : ( ( rule__NewInput__NewArrayIdsAssignment_7_1 ) ) ;
    public final void rule__NewInput__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3547:1: ( ( ( rule__NewInput__NewArrayIdsAssignment_7_1 ) ) )
            // InternalExTwentyOne.g:3548:1: ( ( rule__NewInput__NewArrayIdsAssignment_7_1 ) )
            {
            // InternalExTwentyOne.g:3548:1: ( ( rule__NewInput__NewArrayIdsAssignment_7_1 ) )
            // InternalExTwentyOne.g:3549:2: ( rule__NewInput__NewArrayIdsAssignment_7_1 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_7_1()); 
            // InternalExTwentyOne.g:3550:2: ( rule__NewInput__NewArrayIdsAssignment_7_1 )
            // InternalExTwentyOne.g:3550:3: rule__NewInput__NewArrayIdsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__NewArrayIdsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_7__1__Impl"


    // $ANTLR start "rule__NewInput__Group_7__2"
    // InternalExTwentyOne.g:3558:1: rule__NewInput__Group_7__2 : rule__NewInput__Group_7__2__Impl rule__NewInput__Group_7__3 ;
    public final void rule__NewInput__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3562:1: ( rule__NewInput__Group_7__2__Impl rule__NewInput__Group_7__3 )
            // InternalExTwentyOne.g:3563:2: rule__NewInput__Group_7__2__Impl rule__NewInput__Group_7__3
            {
            pushFollow(FOLLOW_12);
            rule__NewInput__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_7__2"


    // $ANTLR start "rule__NewInput__Group_7__2__Impl"
    // InternalExTwentyOne.g:3570:1: rule__NewInput__Group_7__2__Impl : ( '=' ) ;
    public final void rule__NewInput__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3574:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3575:1: ( '=' )
            {
            // InternalExTwentyOne.g:3575:1: ( '=' )
            // InternalExTwentyOne.g:3576:2: '='
            {
             before(grammarAccess.getNewInputAccess().getEqualsSignKeyword_7_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getEqualsSignKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_7__2__Impl"


    // $ANTLR start "rule__NewInput__Group_7__3"
    // InternalExTwentyOne.g:3585:1: rule__NewInput__Group_7__3 : rule__NewInput__Group_7__3__Impl ;
    public final void rule__NewInput__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3589:1: ( rule__NewInput__Group_7__3__Impl )
            // InternalExTwentyOne.g:3590:2: rule__NewInput__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_7__3"


    // $ANTLR start "rule__NewInput__Group_7__3__Impl"
    // InternalExTwentyOne.g:3596:1: rule__NewInput__Group_7__3__Impl : ( ( rule__NewInput__NewArrayExpsAssignment_7_3 ) ) ;
    public final void rule__NewInput__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3600:1: ( ( ( rule__NewInput__NewArrayExpsAssignment_7_3 ) ) )
            // InternalExTwentyOne.g:3601:1: ( ( rule__NewInput__NewArrayExpsAssignment_7_3 ) )
            {
            // InternalExTwentyOne.g:3601:1: ( ( rule__NewInput__NewArrayExpsAssignment_7_3 ) )
            // InternalExTwentyOne.g:3602:2: ( rule__NewInput__NewArrayExpsAssignment_7_3 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_7_3()); 
            // InternalExTwentyOne.g:3603:2: ( rule__NewInput__NewArrayExpsAssignment_7_3 )
            // InternalExTwentyOne.g:3603:3: rule__NewInput__NewArrayExpsAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__NewArrayExpsAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_7__3__Impl"


    // $ANTLR start "rule__LetBinding__Group__0"
    // InternalExTwentyOne.g:3612:1: rule__LetBinding__Group__0 : rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 ;
    public final void rule__LetBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3616:1: ( rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 )
            // InternalExTwentyOne.g:3617:2: rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__LetBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__0"


    // $ANTLR start "rule__LetBinding__Group__0__Impl"
    // InternalExTwentyOne.g:3624:1: rule__LetBinding__Group__0__Impl : ( () ) ;
    public final void rule__LetBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3628:1: ( ( () ) )
            // InternalExTwentyOne.g:3629:1: ( () )
            {
            // InternalExTwentyOne.g:3629:1: ( () )
            // InternalExTwentyOne.g:3630:2: ()
            {
             before(grammarAccess.getLetBindingAccess().getLetBindingAction_0()); 
            // InternalExTwentyOne.g:3631:2: ()
            // InternalExTwentyOne.g:3631:3: 
            {
            }

             after(grammarAccess.getLetBindingAccess().getLetBindingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__0__Impl"


    // $ANTLR start "rule__LetBinding__Group__1"
    // InternalExTwentyOne.g:3639:1: rule__LetBinding__Group__1 : rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 ;
    public final void rule__LetBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3643:1: ( rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 )
            // InternalExTwentyOne.g:3644:2: rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LetBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__1"


    // $ANTLR start "rule__LetBinding__Group__1__Impl"
    // InternalExTwentyOne.g:3651:1: rule__LetBinding__Group__1__Impl : ( 'let' ) ;
    public final void rule__LetBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3655:1: ( ( 'let' ) )
            // InternalExTwentyOne.g:3656:1: ( 'let' )
            {
            // InternalExTwentyOne.g:3656:1: ( 'let' )
            // InternalExTwentyOne.g:3657:2: 'let'
            {
             before(grammarAccess.getLetBindingAccess().getLetKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getLetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__1__Impl"


    // $ANTLR start "rule__LetBinding__Group__2"
    // InternalExTwentyOne.g:3666:1: rule__LetBinding__Group__2 : rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 ;
    public final void rule__LetBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3670:1: ( rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 )
            // InternalExTwentyOne.g:3671:2: rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__LetBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__2"


    // $ANTLR start "rule__LetBinding__Group__2__Impl"
    // InternalExTwentyOne.g:3678:1: rule__LetBinding__Group__2__Impl : ( ( rule__LetBinding__NameAssignment_2 ) ) ;
    public final void rule__LetBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3682:1: ( ( ( rule__LetBinding__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:3683:1: ( ( rule__LetBinding__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3683:1: ( ( rule__LetBinding__NameAssignment_2 ) )
            // InternalExTwentyOne.g:3684:2: ( rule__LetBinding__NameAssignment_2 )
            {
             before(grammarAccess.getLetBindingAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:3685:2: ( rule__LetBinding__NameAssignment_2 )
            // InternalExTwentyOne.g:3685:3: rule__LetBinding__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__2__Impl"


    // $ANTLR start "rule__LetBinding__Group__3"
    // InternalExTwentyOne.g:3693:1: rule__LetBinding__Group__3 : rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 ;
    public final void rule__LetBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3697:1: ( rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 )
            // InternalExTwentyOne.g:3698:2: rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__LetBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__3"


    // $ANTLR start "rule__LetBinding__Group__3__Impl"
    // InternalExTwentyOne.g:3705:1: rule__LetBinding__Group__3__Impl : ( '=' ) ;
    public final void rule__LetBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3709:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3710:1: ( '=' )
            {
            // InternalExTwentyOne.g:3710:1: ( '=' )
            // InternalExTwentyOne.g:3711:2: '='
            {
             before(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__3__Impl"


    // $ANTLR start "rule__LetBinding__Group__4"
    // InternalExTwentyOne.g:3720:1: rule__LetBinding__Group__4 : rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 ;
    public final void rule__LetBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3724:1: ( rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 )
            // InternalExTwentyOne.g:3725:2: rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__LetBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__4"


    // $ANTLR start "rule__LetBinding__Group__4__Impl"
    // InternalExTwentyOne.g:3732:1: rule__LetBinding__Group__4__Impl : ( ( rule__LetBinding__BindingAssignment_4 ) ) ;
    public final void rule__LetBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3736:1: ( ( ( rule__LetBinding__BindingAssignment_4 ) ) )
            // InternalExTwentyOne.g:3737:1: ( ( rule__LetBinding__BindingAssignment_4 ) )
            {
            // InternalExTwentyOne.g:3737:1: ( ( rule__LetBinding__BindingAssignment_4 ) )
            // InternalExTwentyOne.g:3738:2: ( rule__LetBinding__BindingAssignment_4 )
            {
             before(grammarAccess.getLetBindingAccess().getBindingAssignment_4()); 
            // InternalExTwentyOne.g:3739:2: ( rule__LetBinding__BindingAssignment_4 )
            // InternalExTwentyOne.g:3739:3: rule__LetBinding__BindingAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__BindingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getBindingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__4__Impl"


    // $ANTLR start "rule__LetBinding__Group__5"
    // InternalExTwentyOne.g:3747:1: rule__LetBinding__Group__5 : rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 ;
    public final void rule__LetBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3751:1: ( rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 )
            // InternalExTwentyOne.g:3752:2: rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__LetBinding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__5"


    // $ANTLR start "rule__LetBinding__Group__5__Impl"
    // InternalExTwentyOne.g:3759:1: rule__LetBinding__Group__5__Impl : ( 'in' ) ;
    public final void rule__LetBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3763:1: ( ( 'in' ) )
            // InternalExTwentyOne.g:3764:1: ( 'in' )
            {
            // InternalExTwentyOne.g:3764:1: ( 'in' )
            // InternalExTwentyOne.g:3765:2: 'in'
            {
             before(grammarAccess.getLetBindingAccess().getInKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__5__Impl"


    // $ANTLR start "rule__LetBinding__Group__6"
    // InternalExTwentyOne.g:3774:1: rule__LetBinding__Group__6 : rule__LetBinding__Group__6__Impl rule__LetBinding__Group__7 ;
    public final void rule__LetBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3778:1: ( rule__LetBinding__Group__6__Impl rule__LetBinding__Group__7 )
            // InternalExTwentyOne.g:3779:2: rule__LetBinding__Group__6__Impl rule__LetBinding__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__LetBinding__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__6"


    // $ANTLR start "rule__LetBinding__Group__6__Impl"
    // InternalExTwentyOne.g:3786:1: rule__LetBinding__Group__6__Impl : ( ( rule__LetBinding__BodyAssignment_6 ) ) ;
    public final void rule__LetBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3790:1: ( ( ( rule__LetBinding__BodyAssignment_6 ) ) )
            // InternalExTwentyOne.g:3791:1: ( ( rule__LetBinding__BodyAssignment_6 ) )
            {
            // InternalExTwentyOne.g:3791:1: ( ( rule__LetBinding__BodyAssignment_6 ) )
            // InternalExTwentyOne.g:3792:2: ( rule__LetBinding__BodyAssignment_6 )
            {
             before(grammarAccess.getLetBindingAccess().getBodyAssignment_6()); 
            // InternalExTwentyOne.g:3793:2: ( rule__LetBinding__BodyAssignment_6 )
            // InternalExTwentyOne.g:3793:3: rule__LetBinding__BodyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__BodyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getBodyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__6__Impl"


    // $ANTLR start "rule__LetBinding__Group__7"
    // InternalExTwentyOne.g:3801:1: rule__LetBinding__Group__7 : rule__LetBinding__Group__7__Impl ;
    public final void rule__LetBinding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3805:1: ( rule__LetBinding__Group__7__Impl )
            // InternalExTwentyOne.g:3806:2: rule__LetBinding__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__7"


    // $ANTLR start "rule__LetBinding__Group__7__Impl"
    // InternalExTwentyOne.g:3812:1: rule__LetBinding__Group__7__Impl : ( 'end' ) ;
    public final void rule__LetBinding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3816:1: ( ( 'end' ) )
            // InternalExTwentyOne.g:3817:1: ( 'end' )
            {
            // InternalExTwentyOne.g:3817:1: ( 'end' )
            // InternalExTwentyOne.g:3818:2: 'end'
            {
             before(grammarAccess.getLetBindingAccess().getEndKeyword_7()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getEndKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__7__Impl"


    // $ANTLR start "rule__LogicExp__Group__0"
    // InternalExTwentyOne.g:3828:1: rule__LogicExp__Group__0 : rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 ;
    public final void rule__LogicExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3832:1: ( rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 )
            // InternalExTwentyOne.g:3833:2: rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalExTwentyOne.g:3840:1: rule__LogicExp__Group__0__Impl : ( ( rule__LogicExp__LeftLogicAssignment_0 ) ) ;
    public final void rule__LogicExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3844:1: ( ( ( rule__LogicExp__LeftLogicAssignment_0 ) ) )
            // InternalExTwentyOne.g:3845:1: ( ( rule__LogicExp__LeftLogicAssignment_0 ) )
            {
            // InternalExTwentyOne.g:3845:1: ( ( rule__LogicExp__LeftLogicAssignment_0 ) )
            // InternalExTwentyOne.g:3846:2: ( rule__LogicExp__LeftLogicAssignment_0 )
            {
             before(grammarAccess.getLogicExpAccess().getLeftLogicAssignment_0()); 
            // InternalExTwentyOne.g:3847:2: ( rule__LogicExp__LeftLogicAssignment_0 )
            // InternalExTwentyOne.g:3847:3: rule__LogicExp__LeftLogicAssignment_0
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
    // InternalExTwentyOne.g:3855:1: rule__LogicExp__Group__1 : rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 ;
    public final void rule__LogicExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3859:1: ( rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 )
            // InternalExTwentyOne.g:3860:2: rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalExTwentyOne.g:3867:1: rule__LogicExp__Group__1__Impl : ( ( rule__LogicExp__Alternatives_1 ) ) ;
    public final void rule__LogicExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3871:1: ( ( ( rule__LogicExp__Alternatives_1 ) ) )
            // InternalExTwentyOne.g:3872:1: ( ( rule__LogicExp__Alternatives_1 ) )
            {
            // InternalExTwentyOne.g:3872:1: ( ( rule__LogicExp__Alternatives_1 ) )
            // InternalExTwentyOne.g:3873:2: ( rule__LogicExp__Alternatives_1 )
            {
             before(grammarAccess.getLogicExpAccess().getAlternatives_1()); 
            // InternalExTwentyOne.g:3874:2: ( rule__LogicExp__Alternatives_1 )
            // InternalExTwentyOne.g:3874:3: rule__LogicExp__Alternatives_1
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
    // InternalExTwentyOne.g:3882:1: rule__LogicExp__Group__2 : rule__LogicExp__Group__2__Impl ;
    public final void rule__LogicExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3886:1: ( rule__LogicExp__Group__2__Impl )
            // InternalExTwentyOne.g:3887:2: rule__LogicExp__Group__2__Impl
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
    // InternalExTwentyOne.g:3893:1: rule__LogicExp__Group__2__Impl : ( ( rule__LogicExp__RightLogicAssignment_2 ) ) ;
    public final void rule__LogicExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3897:1: ( ( ( rule__LogicExp__RightLogicAssignment_2 ) ) )
            // InternalExTwentyOne.g:3898:1: ( ( rule__LogicExp__RightLogicAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3898:1: ( ( rule__LogicExp__RightLogicAssignment_2 ) )
            // InternalExTwentyOne.g:3899:2: ( rule__LogicExp__RightLogicAssignment_2 )
            {
             before(grammarAccess.getLogicExpAccess().getRightLogicAssignment_2()); 
            // InternalExTwentyOne.g:3900:2: ( rule__LogicExp__RightLogicAssignment_2 )
            // InternalExTwentyOne.g:3900:3: rule__LogicExp__RightLogicAssignment_2
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
    // InternalExTwentyOne.g:3909:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3913:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3914:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3914:2: ( RULE_ID )
            // InternalExTwentyOne.g:3915:3: RULE_ID
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
    // InternalExTwentyOne.g:3924:1: rule__Program__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Program__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3928:1: ( ( ruleDeclaration ) )
            // InternalExTwentyOne.g:3929:2: ( ruleDeclaration )
            {
            // InternalExTwentyOne.g:3929:2: ( ruleDeclaration )
            // InternalExTwentyOne.g:3930:3: ruleDeclaration
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
    // InternalExTwentyOne.g:3939:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3943:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3944:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3944:2: ( RULE_ID )
            // InternalExTwentyOne.g:3945:3: RULE_ID
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


    // $ANTLR start "rule__Parameter__ValueAssignment_3"
    // InternalExTwentyOne.g:3954:1: rule__Parameter__ValueAssignment_3 : ( ruleType ) ;
    public final void rule__Parameter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3958:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:3959:2: ( ruleType )
            {
            // InternalExTwentyOne.g:3959:2: ( ruleType )
            // InternalExTwentyOne.g:3960:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getValueTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_3"


    // $ANTLR start "rule__Function__NameAssignment_2"
    // InternalExTwentyOne.g:3969:1: rule__Function__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3973:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3974:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3974:2: ( RULE_ID )
            // InternalExTwentyOne.g:3975:3: RULE_ID
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
    // InternalExTwentyOne.g:3984:1: rule__Function__LambdaAssignment_3 : ( ruleLambda ) ;
    public final void rule__Function__LambdaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3988:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:3989:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:3989:2: ( ruleLambda )
            // InternalExTwentyOne.g:3990:3: ruleLambda
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
    // InternalExTwentyOne.g:3999:1: rule__Lambda__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Lambda__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4003:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4004:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4004:2: ( RULE_ID )
            // InternalExTwentyOne.g:4005:3: RULE_ID
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


    // $ANTLR start "rule__Lambda__ValueAssignment_4"
    // InternalExTwentyOne.g:4014:1: rule__Lambda__ValueAssignment_4 : ( ruleType ) ;
    public final void rule__Lambda__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4018:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:4019:2: ( ruleType )
            {
            // InternalExTwentyOne.g:4019:2: ( ruleType )
            // InternalExTwentyOne.g:4020:3: ruleType
            {
             before(grammarAccess.getLambdaAccess().getValueTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getValueTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lambda__ValueAssignment_4"


    // $ANTLR start "rule__Lambda__LambdaExpAssignment_7"
    // InternalExTwentyOne.g:4029:1: rule__Lambda__LambdaExpAssignment_7 : ( ruleExp ) ;
    public final void rule__Lambda__LambdaExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4033:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4034:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4034:2: ( ruleExp )
            // InternalExTwentyOne.g:4035:3: ruleExp
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
    // InternalExTwentyOne.g:4044:1: rule__Input__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4048:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4049:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4049:2: ( RULE_ID )
            // InternalExTwentyOne.g:4050:3: RULE_ID
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


    // $ANTLR start "rule__Input__ValueAssignment_4"
    // InternalExTwentyOne.g:4059:1: rule__Input__ValueAssignment_4 : ( ruleType ) ;
    public final void rule__Input__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4063:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:4064:2: ( ruleType )
            {
            // InternalExTwentyOne.g:4064:2: ( ruleType )
            // InternalExTwentyOne.g:4065:3: ruleType
            {
             before(grammarAccess.getInputAccess().getValueTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getInputAccess().getValueTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ValueAssignment_4"


    // $ANTLR start "rule__Node__NameAssignment_2"
    // InternalExTwentyOne.g:4074:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4078:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4079:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4079:2: ( RULE_ID )
            // InternalExTwentyOne.g:4080:3: RULE_ID
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
    // InternalExTwentyOne.g:4089:1: rule__Node__FunctionAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__FunctionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4093:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:4094:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:4094:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4095:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_4_0_0()); 
            // InternalExTwentyOne.g:4096:3: ( RULE_ID )
            // InternalExTwentyOne.g:4097:4: RULE_ID
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
    // InternalExTwentyOne.g:4108:1: rule__Node__LambdaAssignment_4_1 : ( ruleLambda ) ;
    public final void rule__Node__LambdaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4112:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:4113:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:4113:2: ( ruleLambda )
            // InternalExTwentyOne.g:4114:3: ruleLambda
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
    // InternalExTwentyOne.g:4123:1: rule__Stream__InputsOrNodesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsOrNodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4127:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:4128:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:4128:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4129:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_2_0()); 
            // InternalExTwentyOne.g:4130:3: ( RULE_ID )
            // InternalExTwentyOne.g:4131:4: RULE_ID
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
    // InternalExTwentyOne.g:4142:1: rule__Stream__InputsOrNodesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsOrNodesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4146:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:4147:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:4147:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4148:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_3_1_0()); 
            // InternalExTwentyOne.g:4149:3: ( RULE_ID )
            // InternalExTwentyOne.g:4150:4: RULE_ID
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
    // InternalExTwentyOne.g:4161:1: rule__Stream__ElementsAssignment_4_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4165:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:4166:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:4166:2: ( ruleElement )
            // InternalExTwentyOne.g:4167:3: ruleElement
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
    // InternalExTwentyOne.g:4176:1: rule__Stream__ElementsAssignment_4_2_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4180:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:4181:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:4181:2: ( ruleElement )
            // InternalExTwentyOne.g:4182:3: ruleElement
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
    // InternalExTwentyOne.g:4191:1: rule__Element__ElementAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Element__ElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4195:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4196:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4196:2: ( RULE_ID )
            // InternalExTwentyOne.g:4197:3: RULE_ID
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
    // InternalExTwentyOne.g:4206:1: rule__Element__NodeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Element__NodeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4210:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:4211:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:4211:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4212:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getNodeNodeOrFunctionCrossReference_1_1_0_0()); 
            // InternalExTwentyOne.g:4213:3: ( RULE_ID )
            // InternalExTwentyOne.g:4214:4: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNodeNodeOrFunctionIDTerminalRuleCall_1_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNodeNodeOrFunctionIDTerminalRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getElementAccess().getNodeNodeOrFunctionCrossReference_1_1_0_0()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:4225:1: rule__Element__OutputAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Element__OutputAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4229:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4230:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4230:2: ( RULE_ID )
            // InternalExTwentyOne.g:4231:3: RULE_ID
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
    // InternalExTwentyOne.g:4240:1: rule__DataDecl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4244:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4245:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4245:2: ( RULE_ID )
            // InternalExTwentyOne.g:4246:3: RULE_ID
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
    // InternalExTwentyOne.g:4255:1: rule__DataDecl__DataAssignment_4 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4259:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4260:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4260:2: ( RULE_ID )
            // InternalExTwentyOne.g:4261:3: RULE_ID
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


    // $ANTLR start "rule__DataDecl__ValuesAssignment_6"
    // InternalExTwentyOne.g:4270:1: rule__DataDecl__ValuesAssignment_6 : ( ruleType ) ;
    public final void rule__DataDecl__ValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4274:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:4275:2: ( ruleType )
            {
            // InternalExTwentyOne.g:4275:2: ( ruleType )
            // InternalExTwentyOne.g:4276:3: ruleType
            {
             before(grammarAccess.getDataDeclAccess().getValuesTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataDeclAccess().getValuesTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__ValuesAssignment_6"


    // $ANTLR start "rule__DataDecl__DataAssignment_7_1"
    // InternalExTwentyOne.g:4285:1: rule__DataDecl__DataAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4289:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4290:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4290:2: ( RULE_ID )
            // InternalExTwentyOne.g:4291:3: RULE_ID
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


    // $ANTLR start "rule__DataDecl__ValuesAssignment_7_3"
    // InternalExTwentyOne.g:4300:1: rule__DataDecl__ValuesAssignment_7_3 : ( ruleType ) ;
    public final void rule__DataDecl__ValuesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4304:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:4305:2: ( ruleType )
            {
            // InternalExTwentyOne.g:4305:2: ( ruleType )
            // InternalExTwentyOne.g:4306:3: ruleType
            {
             before(grammarAccess.getDataDeclAccess().getValuesTypeParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataDeclAccess().getValuesTypeParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDecl__ValuesAssignment_7_3"


    // $ANTLR start "rule__Type__IntIdentifierAssignment_0"
    // InternalExTwentyOne.g:4315:1: rule__Type__IntIdentifierAssignment_0 : ( ( 'int' ) ) ;
    public final void rule__Type__IntIdentifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4319:1: ( ( ( 'int' ) ) )
            // InternalExTwentyOne.g:4320:2: ( ( 'int' ) )
            {
            // InternalExTwentyOne.g:4320:2: ( ( 'int' ) )
            // InternalExTwentyOne.g:4321:3: ( 'int' )
            {
             before(grammarAccess.getTypeAccess().getIntIdentifierIntKeyword_0_0()); 
            // InternalExTwentyOne.g:4322:3: ( 'int' )
            // InternalExTwentyOne.g:4323:4: 'int'
            {
             before(grammarAccess.getTypeAccess().getIntIdentifierIntKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getIntIdentifierIntKeyword_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getIntIdentifierIntKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__IntIdentifierAssignment_0"


    // $ANTLR start "rule__Type__StringValueAssignment_1"
    // InternalExTwentyOne.g:4334:1: rule__Type__StringValueAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__Type__StringValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4338:1: ( ( ( 'string' ) ) )
            // InternalExTwentyOne.g:4339:2: ( ( 'string' ) )
            {
            // InternalExTwentyOne.g:4339:2: ( ( 'string' ) )
            // InternalExTwentyOne.g:4340:3: ( 'string' )
            {
             before(grammarAccess.getTypeAccess().getStringValueStringKeyword_1_0()); 
            // InternalExTwentyOne.g:4341:3: ( 'string' )
            // InternalExTwentyOne.g:4342:4: 'string'
            {
             before(grammarAccess.getTypeAccess().getStringValueStringKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getStringValueStringKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getStringValueStringKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__StringValueAssignment_1"


    // $ANTLR start "rule__Type__IdAssignment_2"
    // InternalExTwentyOne.g:4353:1: rule__Type__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__Type__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4357:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4358:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4358:2: ( RULE_ID )
            // InternalExTwentyOne.g:4359:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getIdIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__IdAssignment_2"


    // $ANTLR start "rule__Type__IntValueAssignment_3"
    // InternalExTwentyOne.g:4368:1: rule__Type__IntValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__Type__IntValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4372:1: ( ( RULE_INT ) )
            // InternalExTwentyOne.g:4373:2: ( RULE_INT )
            {
            // InternalExTwentyOne.g:4373:2: ( RULE_INT )
            // InternalExTwentyOne.g:4374:3: RULE_INT
            {
             before(grammarAccess.getTypeAccess().getIntValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getIntValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__IntValueAssignment_3"


    // $ANTLR start "rule__Type__NoneValueAssignment_4"
    // InternalExTwentyOne.g:4383:1: rule__Type__NoneValueAssignment_4 : ( ( 'none' ) ) ;
    public final void rule__Type__NoneValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4387:1: ( ( ( 'none' ) ) )
            // InternalExTwentyOne.g:4388:2: ( ( 'none' ) )
            {
            // InternalExTwentyOne.g:4388:2: ( ( 'none' ) )
            // InternalExTwentyOne.g:4389:3: ( 'none' )
            {
             before(grammarAccess.getTypeAccess().getNoneValueNoneKeyword_4_0()); 
            // InternalExTwentyOne.g:4390:3: ( 'none' )
            // InternalExTwentyOne.g:4391:4: 'none'
            {
             before(grammarAccess.getTypeAccess().getNoneValueNoneKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNoneValueNoneKeyword_4_0()); 

            }

             after(grammarAccess.getTypeAccess().getNoneValueNoneKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NoneValueAssignment_4"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalExTwentyOne.g:4402:1: rule__Exp__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4406:1: ( ( rulePrimary ) )
            // InternalExTwentyOne.g:4407:2: ( rulePrimary )
            {
            // InternalExTwentyOne.g:4407:2: ( rulePrimary )
            // InternalExTwentyOne.g:4408:3: rulePrimary
            {
             before(grammarAccess.getExpAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightPrimaryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__Parenthesis__ExpAssignment_2"
    // InternalExTwentyOne.g:4417:1: rule__Parenthesis__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__Parenthesis__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4421:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4422:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4422:2: ( ruleExp )
            // InternalExTwentyOne.g:4423:3: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__ExpAssignment_2"


    // $ANTLR start "rule__DataAccess__AccessedDataAssignment_1"
    // InternalExTwentyOne.g:4432:1: rule__DataAccess__AccessedDataAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataAccess__AccessedDataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4436:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4437:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4437:2: ( RULE_ID )
            // InternalExTwentyOne.g:4438:3: RULE_ID
            {
             before(grammarAccess.getDataAccessAccess().getAccessedDataIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getAccessedDataIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__AccessedDataAssignment_1"


    // $ANTLR start "rule__DataAccess__AccessedFieldAssignment_3"
    // InternalExTwentyOne.g:4447:1: rule__DataAccess__AccessedFieldAssignment_3 : ( RULE_ID ) ;
    public final void rule__DataAccess__AccessedFieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4451:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4452:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4452:2: ( RULE_ID )
            // InternalExTwentyOne.g:4453:3: RULE_ID
            {
             before(grammarAccess.getDataAccessAccess().getAccessedFieldIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataAccessAccess().getAccessedFieldIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataAccess__AccessedFieldAssignment_3"


    // $ANTLR start "rule__IfThenElse__IfLogicExpAssignment_2"
    // InternalExTwentyOne.g:4462:1: rule__IfThenElse__IfLogicExpAssignment_2 : ( ruleLogicExp ) ;
    public final void rule__IfThenElse__IfLogicExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4466:1: ( ( ruleLogicExp ) )
            // InternalExTwentyOne.g:4467:2: ( ruleLogicExp )
            {
            // InternalExTwentyOne.g:4467:2: ( ruleLogicExp )
            // InternalExTwentyOne.g:4468:3: ruleLogicExp
            {
             before(grammarAccess.getIfThenElseAccess().getIfLogicExpLogicExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicExp();

            state._fsp--;

             after(grammarAccess.getIfThenElseAccess().getIfLogicExpLogicExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__IfLogicExpAssignment_2"


    // $ANTLR start "rule__IfThenElse__ThenExpAssignment_4"
    // InternalExTwentyOne.g:4477:1: rule__IfThenElse__ThenExpAssignment_4 : ( ruleExp ) ;
    public final void rule__IfThenElse__ThenExpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4481:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4482:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4482:2: ( ruleExp )
            // InternalExTwentyOne.g:4483:3: ruleExp
            {
             before(grammarAccess.getIfThenElseAccess().getThenExpExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getIfThenElseAccess().getThenExpExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ThenExpAssignment_4"


    // $ANTLR start "rule__IfThenElse__ElseExpAssignment_6"
    // InternalExTwentyOne.g:4492:1: rule__IfThenElse__ElseExpAssignment_6 : ( ruleExp ) ;
    public final void rule__IfThenElse__ElseExpAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4496:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4497:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4497:2: ( ruleExp )
            // InternalExTwentyOne.g:4498:3: ruleExp
            {
             before(grammarAccess.getIfThenElseAccess().getElseExpExpParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getIfThenElseAccess().getElseExpExpParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ElseExpAssignment_6"


    // $ANTLR start "rule__NewInput__NewArrayIdAssignment_2"
    // InternalExTwentyOne.g:4507:1: rule__NewInput__NewArrayIdAssignment_2 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4511:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4512:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4512:2: ( RULE_ID )
            // InternalExTwentyOne.g:4513:3: RULE_ID
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getNewArrayIdIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__NewArrayIdAssignment_2"


    // $ANTLR start "rule__NewInput__NewArrayIdsAssignment_4"
    // InternalExTwentyOne.g:4522:1: rule__NewInput__NewArrayIdsAssignment_4 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4526:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4527:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4527:2: ( RULE_ID )
            // InternalExTwentyOne.g:4528:3: RULE_ID
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__NewArrayIdsAssignment_4"


    // $ANTLR start "rule__NewInput__NewArrayExpsAssignment_6"
    // InternalExTwentyOne.g:4537:1: rule__NewInput__NewArrayExpsAssignment_6 : ( ruleExp ) ;
    public final void rule__NewInput__NewArrayExpsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4541:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4542:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4542:2: ( ruleExp )
            // InternalExTwentyOne.g:4543:3: ruleExp
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__NewArrayExpsAssignment_6"


    // $ANTLR start "rule__NewInput__NewArrayIdsAssignment_7_1"
    // InternalExTwentyOne.g:4552:1: rule__NewInput__NewArrayIdsAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4556:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4557:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4557:2: ( RULE_ID )
            // InternalExTwentyOne.g:4558:3: RULE_ID
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__NewArrayIdsAssignment_7_1"


    // $ANTLR start "rule__NewInput__NewArrayExpsAssignment_7_3"
    // InternalExTwentyOne.g:4567:1: rule__NewInput__NewArrayExpsAssignment_7_3 : ( ruleExp ) ;
    public final void rule__NewInput__NewArrayExpsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4571:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4572:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4572:2: ( ruleExp )
            // InternalExTwentyOne.g:4573:3: ruleExp
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__NewArrayExpsAssignment_7_3"


    // $ANTLR start "rule__LetBinding__NameAssignment_2"
    // InternalExTwentyOne.g:4582:1: rule__LetBinding__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LetBinding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4586:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4587:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4587:2: ( RULE_ID )
            // InternalExTwentyOne.g:4588:3: RULE_ID
            {
             before(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__NameAssignment_2"


    // $ANTLR start "rule__LetBinding__BindingAssignment_4"
    // InternalExTwentyOne.g:4597:1: rule__LetBinding__BindingAssignment_4 : ( ruleExp ) ;
    public final void rule__LetBinding__BindingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4601:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4602:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4602:2: ( ruleExp )
            // InternalExTwentyOne.g:4603:3: ruleExp
            {
             before(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__BindingAssignment_4"


    // $ANTLR start "rule__LetBinding__BodyAssignment_6"
    // InternalExTwentyOne.g:4612:1: rule__LetBinding__BodyAssignment_6 : ( ruleExp ) ;
    public final void rule__LetBinding__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4616:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4617:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4617:2: ( ruleExp )
            // InternalExTwentyOne.g:4618:3: ruleExp
            {
             before(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__BodyAssignment_6"


    // $ANTLR start "rule__LogicExp__LeftLogicAssignment_0"
    // InternalExTwentyOne.g:4627:1: rule__LogicExp__LeftLogicAssignment_0 : ( ruleExp ) ;
    public final void rule__LogicExp__LeftLogicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4631:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4632:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4632:2: ( ruleExp )
            // InternalExTwentyOne.g:4633:3: ruleExp
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
    // InternalExTwentyOne.g:4642:1: rule__LogicExp__RightLogicAssignment_2 : ( ruleExp ) ;
    public final void rule__LogicExp__RightLogicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4646:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4647:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4647:2: ( ruleExp )
            // InternalExTwentyOne.g:4648:3: ruleExp
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000001130A0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000001130A0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000E00000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000EC4000100030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000084000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000000000F800L});

}