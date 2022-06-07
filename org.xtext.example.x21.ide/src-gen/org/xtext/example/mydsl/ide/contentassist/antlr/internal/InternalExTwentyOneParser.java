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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'='", "'<'", "'>'", "'<='", "'>='", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'+'", "'-'", "'*'", "'/'", "'none'", "'.'", "'if'", "'then'", "'else'", "'end'", "'new'", "'let'", "'in'"
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


    // $ANTLR start "entryRuleDataAccess"
    // InternalExTwentyOne.g:378:1: entryRuleDataAccess : ruleDataAccess EOF ;
    public final void entryRuleDataAccess() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:379:1: ( ruleDataAccess EOF )
            // InternalExTwentyOne.g:380:1: ruleDataAccess EOF
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
    // InternalExTwentyOne.g:387:1: ruleDataAccess : ( ( rule__DataAccess__Group__0 ) ) ;
    public final void ruleDataAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:391:2: ( ( ( rule__DataAccess__Group__0 ) ) )
            // InternalExTwentyOne.g:392:2: ( ( rule__DataAccess__Group__0 ) )
            {
            // InternalExTwentyOne.g:392:2: ( ( rule__DataAccess__Group__0 ) )
            // InternalExTwentyOne.g:393:3: ( rule__DataAccess__Group__0 )
            {
             before(grammarAccess.getDataAccessAccess().getGroup()); 
            // InternalExTwentyOne.g:394:3: ( rule__DataAccess__Group__0 )
            // InternalExTwentyOne.g:394:4: rule__DataAccess__Group__0
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
    // InternalExTwentyOne.g:403:1: entryRuleIfThenElse : ruleIfThenElse EOF ;
    public final void entryRuleIfThenElse() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:404:1: ( ruleIfThenElse EOF )
            // InternalExTwentyOne.g:405:1: ruleIfThenElse EOF
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
    // InternalExTwentyOne.g:412:1: ruleIfThenElse : ( ( rule__IfThenElse__Group__0 ) ) ;
    public final void ruleIfThenElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:416:2: ( ( ( rule__IfThenElse__Group__0 ) ) )
            // InternalExTwentyOne.g:417:2: ( ( rule__IfThenElse__Group__0 ) )
            {
            // InternalExTwentyOne.g:417:2: ( ( rule__IfThenElse__Group__0 ) )
            // InternalExTwentyOne.g:418:3: ( rule__IfThenElse__Group__0 )
            {
             before(grammarAccess.getIfThenElseAccess().getGroup()); 
            // InternalExTwentyOne.g:419:3: ( rule__IfThenElse__Group__0 )
            // InternalExTwentyOne.g:419:4: rule__IfThenElse__Group__0
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
    // InternalExTwentyOne.g:428:1: entryRuleNewInput : ruleNewInput EOF ;
    public final void entryRuleNewInput() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:429:1: ( ruleNewInput EOF )
            // InternalExTwentyOne.g:430:1: ruleNewInput EOF
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
    // InternalExTwentyOne.g:437:1: ruleNewInput : ( ( rule__NewInput__Group__0 ) ) ;
    public final void ruleNewInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:441:2: ( ( ( rule__NewInput__Group__0 ) ) )
            // InternalExTwentyOne.g:442:2: ( ( rule__NewInput__Group__0 ) )
            {
            // InternalExTwentyOne.g:442:2: ( ( rule__NewInput__Group__0 ) )
            // InternalExTwentyOne.g:443:3: ( rule__NewInput__Group__0 )
            {
             before(grammarAccess.getNewInputAccess().getGroup()); 
            // InternalExTwentyOne.g:444:3: ( rule__NewInput__Group__0 )
            // InternalExTwentyOne.g:444:4: rule__NewInput__Group__0
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
    // InternalExTwentyOne.g:453:1: entryRuleLetBinding : ruleLetBinding EOF ;
    public final void entryRuleLetBinding() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:454:1: ( ruleLetBinding EOF )
            // InternalExTwentyOne.g:455:1: ruleLetBinding EOF
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
    // InternalExTwentyOne.g:462:1: ruleLetBinding : ( ( rule__LetBinding__Group__0 ) ) ;
    public final void ruleLetBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:466:2: ( ( ( rule__LetBinding__Group__0 ) ) )
            // InternalExTwentyOne.g:467:2: ( ( rule__LetBinding__Group__0 ) )
            {
            // InternalExTwentyOne.g:467:2: ( ( rule__LetBinding__Group__0 ) )
            // InternalExTwentyOne.g:468:3: ( rule__LetBinding__Group__0 )
            {
             before(grammarAccess.getLetBindingAccess().getGroup()); 
            // InternalExTwentyOne.g:469:3: ( rule__LetBinding__Group__0 )
            // InternalExTwentyOne.g:469:4: rule__LetBinding__Group__0
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
    // InternalExTwentyOne.g:478:1: entryRuleLogicExp : ruleLogicExp EOF ;
    public final void entryRuleLogicExp() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:479:1: ( ruleLogicExp EOF )
            // InternalExTwentyOne.g:480:1: ruleLogicExp EOF
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
    // InternalExTwentyOne.g:487:1: ruleLogicExp : ( ( rule__LogicExp__Group__0 ) ) ;
    public final void ruleLogicExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:491:2: ( ( ( rule__LogicExp__Group__0 ) ) )
            // InternalExTwentyOne.g:492:2: ( ( rule__LogicExp__Group__0 ) )
            {
            // InternalExTwentyOne.g:492:2: ( ( rule__LogicExp__Group__0 ) )
            // InternalExTwentyOne.g:493:3: ( rule__LogicExp__Group__0 )
            {
             before(grammarAccess.getLogicExpAccess().getGroup()); 
            // InternalExTwentyOne.g:494:3: ( rule__LogicExp__Group__0 )
            // InternalExTwentyOne.g:494:4: rule__LogicExp__Group__0
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
    // InternalExTwentyOne.g:502:1: rule__Declaration__Alternatives : ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:506:1: ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 34:
                {
                alt1=5;
                }
                break;
            case 19:
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
                    // InternalExTwentyOne.g:507:2: ( ruleFunction )
                    {
                    // InternalExTwentyOne.g:507:2: ( ruleFunction )
                    // InternalExTwentyOne.g:508:3: ruleFunction
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
                    // InternalExTwentyOne.g:513:2: ( ruleInput )
                    {
                    // InternalExTwentyOne.g:513:2: ( ruleInput )
                    // InternalExTwentyOne.g:514:3: ruleInput
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
                    // InternalExTwentyOne.g:519:2: ( ruleNode )
                    {
                    // InternalExTwentyOne.g:519:2: ( ruleNode )
                    // InternalExTwentyOne.g:520:3: ruleNode
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
                    // InternalExTwentyOne.g:525:2: ( ruleStream )
                    {
                    // InternalExTwentyOne.g:525:2: ( ruleStream )
                    // InternalExTwentyOne.g:526:3: ruleStream
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
                    // InternalExTwentyOne.g:531:2: ( ruleDataDecl )
                    {
                    // InternalExTwentyOne.g:531:2: ( ruleDataDecl )
                    // InternalExTwentyOne.g:532:3: ruleDataDecl
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
                    // InternalExTwentyOne.g:537:2: ( ruleParameter )
                    {
                    // InternalExTwentyOne.g:537:2: ( ruleParameter )
                    // InternalExTwentyOne.g:538:3: ruleParameter
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
    // InternalExTwentyOne.g:547:1: rule__Node__Alternatives_4 : ( ( ( rule__Node__FunctionAssignment_4_0 ) ) | ( ( rule__Node__LambdaAssignment_4_1 ) ) );
    public final void rule__Node__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:551:1: ( ( ( rule__Node__FunctionAssignment_4_0 ) ) | ( ( rule__Node__LambdaAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExTwentyOne.g:552:2: ( ( rule__Node__FunctionAssignment_4_0 ) )
                    {
                    // InternalExTwentyOne.g:552:2: ( ( rule__Node__FunctionAssignment_4_0 ) )
                    // InternalExTwentyOne.g:553:3: ( rule__Node__FunctionAssignment_4_0 )
                    {
                     before(grammarAccess.getNodeAccess().getFunctionAssignment_4_0()); 
                    // InternalExTwentyOne.g:554:3: ( rule__Node__FunctionAssignment_4_0 )
                    // InternalExTwentyOne.g:554:4: rule__Node__FunctionAssignment_4_0
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
                    // InternalExTwentyOne.g:558:2: ( ( rule__Node__LambdaAssignment_4_1 ) )
                    {
                    // InternalExTwentyOne.g:558:2: ( ( rule__Node__LambdaAssignment_4_1 ) )
                    // InternalExTwentyOne.g:559:3: ( rule__Node__LambdaAssignment_4_1 )
                    {
                     before(grammarAccess.getNodeAccess().getLambdaAssignment_4_1()); 
                    // InternalExTwentyOne.g:560:3: ( rule__Node__LambdaAssignment_4_1 )
                    // InternalExTwentyOne.g:560:4: rule__Node__LambdaAssignment_4_1
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
    // InternalExTwentyOne.g:568:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:572:1: ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 33:
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
                    // InternalExTwentyOne.g:573:2: ( ( rule__Element__Group_0__0 ) )
                    {
                    // InternalExTwentyOne.g:573:2: ( ( rule__Element__Group_0__0 ) )
                    // InternalExTwentyOne.g:574:3: ( rule__Element__Group_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_0()); 
                    // InternalExTwentyOne.g:575:3: ( rule__Element__Group_0__0 )
                    // InternalExTwentyOne.g:575:4: rule__Element__Group_0__0
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
                    // InternalExTwentyOne.g:579:2: ( ( rule__Element__Group_1__0 ) )
                    {
                    // InternalExTwentyOne.g:579:2: ( ( rule__Element__Group_1__0 ) )
                    // InternalExTwentyOne.g:580:3: ( rule__Element__Group_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1()); 
                    // InternalExTwentyOne.g:581:3: ( rule__Element__Group_1__0 )
                    // InternalExTwentyOne.g:581:4: rule__Element__Group_1__0
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
                    // InternalExTwentyOne.g:585:2: ( ( rule__Element__Group_2__0 ) )
                    {
                    // InternalExTwentyOne.g:585:2: ( ( rule__Element__Group_2__0 ) )
                    // InternalExTwentyOne.g:586:3: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // InternalExTwentyOne.g:587:3: ( rule__Element__Group_2__0 )
                    // InternalExTwentyOne.g:587:4: rule__Element__Group_2__0
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
    // InternalExTwentyOne.g:595:1: rule__Element__Alternatives_1_1 : ( ( ( rule__Element__NodeAssignment_1_1_0 ) ) | ( ruleLambda ) );
    public final void rule__Element__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:599:1: ( ( ( rule__Element__NodeAssignment_1_1_0 ) ) | ( ruleLambda ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExTwentyOne.g:600:2: ( ( rule__Element__NodeAssignment_1_1_0 ) )
                    {
                    // InternalExTwentyOne.g:600:2: ( ( rule__Element__NodeAssignment_1_1_0 ) )
                    // InternalExTwentyOne.g:601:3: ( rule__Element__NodeAssignment_1_1_0 )
                    {
                     before(grammarAccess.getElementAccess().getNodeAssignment_1_1_0()); 
                    // InternalExTwentyOne.g:602:3: ( rule__Element__NodeAssignment_1_1_0 )
                    // InternalExTwentyOne.g:602:4: rule__Element__NodeAssignment_1_1_0
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
                    // InternalExTwentyOne.g:606:2: ( ruleLambda )
                    {
                    // InternalExTwentyOne.g:606:2: ( ruleLambda )
                    // InternalExTwentyOne.g:607:3: ruleLambda
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
    // InternalExTwentyOne.g:616:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:620:1: ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) | ( RULE_INT ) )
            int alt5=4;
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
            case RULE_INT:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalExTwentyOne.g:621:2: ( 'int' )
                    {
                    // InternalExTwentyOne.g:621:2: ( 'int' )
                    // InternalExTwentyOne.g:622:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:627:2: ( 'string' )
                    {
                    // InternalExTwentyOne.g:627:2: ( 'string' )
                    // InternalExTwentyOne.g:628:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:633:2: ( RULE_ID )
                    {
                    // InternalExTwentyOne.g:633:2: ( RULE_ID )
                    // InternalExTwentyOne.g:634:3: RULE_ID
                    {
                     before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:639:2: ( RULE_INT )
                    {
                    // InternalExTwentyOne.g:639:2: ( RULE_INT )
                    // InternalExTwentyOne.g:640:3: RULE_INT
                    {
                     before(grammarAccess.getTypeAccess().getINTTerminalRuleCall_3()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getINTTerminalRuleCall_3()); 

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
    // InternalExTwentyOne.g:649:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) | ( ( rule__Exp__Group_1_0_2__0 ) ) | ( ( rule__Exp__Group_1_0_3__0 ) ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:653:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) | ( ( rule__Exp__Group_1_0_2__0 ) ) | ( ( rule__Exp__Group_1_0_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 38:
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
                    // InternalExTwentyOne.g:654:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalExTwentyOne.g:654:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalExTwentyOne.g:655:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalExTwentyOne.g:656:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalExTwentyOne.g:656:4: rule__Exp__Group_1_0_0__0
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
                    // InternalExTwentyOne.g:660:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    {
                    // InternalExTwentyOne.g:660:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    // InternalExTwentyOne.g:661:3: ( rule__Exp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_1()); 
                    // InternalExTwentyOne.g:662:3: ( rule__Exp__Group_1_0_1__0 )
                    // InternalExTwentyOne.g:662:4: rule__Exp__Group_1_0_1__0
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
                    // InternalExTwentyOne.g:666:2: ( ( rule__Exp__Group_1_0_2__0 ) )
                    {
                    // InternalExTwentyOne.g:666:2: ( ( rule__Exp__Group_1_0_2__0 ) )
                    // InternalExTwentyOne.g:667:3: ( rule__Exp__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_2()); 
                    // InternalExTwentyOne.g:668:3: ( rule__Exp__Group_1_0_2__0 )
                    // InternalExTwentyOne.g:668:4: rule__Exp__Group_1_0_2__0
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
                    // InternalExTwentyOne.g:672:2: ( ( rule__Exp__Group_1_0_3__0 ) )
                    {
                    // InternalExTwentyOne.g:672:2: ( ( rule__Exp__Group_1_0_3__0 ) )
                    // InternalExTwentyOne.g:673:3: ( rule__Exp__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_3()); 
                    // InternalExTwentyOne.g:674:3: ( rule__Exp__Group_1_0_3__0 )
                    // InternalExTwentyOne.g:674:4: rule__Exp__Group_1_0_3__0
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
    // InternalExTwentyOne.g:682:1: rule__Primary__Alternatives : ( ( ruleLetBinding ) | ( ruleIfThenElse ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleNewInput ) | ( ruleDataAccess ) | ( ( rule__Primary__Group_6__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:686:1: ( ( ruleLetBinding ) | ( ruleIfThenElse ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ruleNewInput ) | ( ruleDataAccess ) | ( ( rule__Primary__Group_6__0 ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 39:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 45:
                {
                alt7=5;
                }
                break;
            case RULE_ID:
                {
                int LA7_6 = input.LA(2);

                if ( (LA7_6==40) ) {
                    alt7=6;
                }
                else if ( (LA7_6==EOF||(LA7_6>=13 && LA7_6<=17)||LA7_6==23||LA7_6==25||LA7_6==29||LA7_6==31||(LA7_6>=35 && LA7_6<=38)||(LA7_6>=42 && LA7_6<=44)||LA7_6==47) ) {
                    alt7=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 11:
            case 12:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalExTwentyOne.g:687:2: ( ruleLetBinding )
                    {
                    // InternalExTwentyOne.g:687:2: ( ruleLetBinding )
                    // InternalExTwentyOne.g:688:3: ruleLetBinding
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
                    // InternalExTwentyOne.g:693:2: ( ruleIfThenElse )
                    {
                    // InternalExTwentyOne.g:693:2: ( ruleIfThenElse )
                    // InternalExTwentyOne.g:694:3: ruleIfThenElse
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
                    // InternalExTwentyOne.g:699:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalExTwentyOne.g:699:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalExTwentyOne.g:700:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalExTwentyOne.g:701:3: ( rule__Primary__Group_2__0 )
                    // InternalExTwentyOne.g:701:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:705:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalExTwentyOne.g:705:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalExTwentyOne.g:706:3: ( rule__Primary__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    // InternalExTwentyOne.g:707:3: ( rule__Primary__Group_3__0 )
                    // InternalExTwentyOne.g:707:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:711:2: ( ruleNewInput )
                    {
                    // InternalExTwentyOne.g:711:2: ( ruleNewInput )
                    // InternalExTwentyOne.g:712:3: ruleNewInput
                    {
                     before(grammarAccess.getPrimaryAccess().getNewInputParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNewInput();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNewInputParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExTwentyOne.g:717:2: ( ruleDataAccess )
                    {
                    // InternalExTwentyOne.g:717:2: ( ruleDataAccess )
                    // InternalExTwentyOne.g:718:3: ruleDataAccess
                    {
                     before(grammarAccess.getPrimaryAccess().getDataAccessParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDataAccess();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getDataAccessParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalExTwentyOne.g:723:2: ( ( rule__Primary__Group_6__0 ) )
                    {
                    // InternalExTwentyOne.g:723:2: ( ( rule__Primary__Group_6__0 ) )
                    // InternalExTwentyOne.g:724:3: ( rule__Primary__Group_6__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_6()); 
                    // InternalExTwentyOne.g:725:3: ( rule__Primary__Group_6__0 )
                    // InternalExTwentyOne.g:725:4: rule__Primary__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_6()); 

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
    // InternalExTwentyOne.g:733:1: rule__LogicExp__Alternatives_1 : ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__LogicExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:737:1: ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
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
                    // InternalExTwentyOne.g:738:2: ( '=' )
                    {
                    // InternalExTwentyOne.g:738:2: ( '=' )
                    // InternalExTwentyOne.g:739:3: '='
                    {
                     before(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:744:2: ( '<' )
                    {
                    // InternalExTwentyOne.g:744:2: ( '<' )
                    // InternalExTwentyOne.g:745:3: '<'
                    {
                     before(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:750:2: ( '>' )
                    {
                    // InternalExTwentyOne.g:750:2: ( '>' )
                    // InternalExTwentyOne.g:751:3: '>'
                    {
                     before(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:756:2: ( '<=' )
                    {
                    // InternalExTwentyOne.g:756:2: ( '<=' )
                    // InternalExTwentyOne.g:757:3: '<='
                    {
                     before(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:762:2: ( '>=' )
                    {
                    // InternalExTwentyOne.g:762:2: ( '>=' )
                    // InternalExTwentyOne.g:763:3: '>='
                    {
                     before(grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalExTwentyOne.g:772:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:776:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalExTwentyOne.g:777:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalExTwentyOne.g:784:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:788:1: ( ( 'program' ) )
            // InternalExTwentyOne.g:789:1: ( 'program' )
            {
            // InternalExTwentyOne.g:789:1: ( 'program' )
            // InternalExTwentyOne.g:790:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExTwentyOne.g:799:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:803:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalExTwentyOne.g:804:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalExTwentyOne.g:811:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:815:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:816:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:816:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalExTwentyOne.g:817:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:818:2: ( rule__Program__NameAssignment_1 )
            // InternalExTwentyOne.g:818:3: rule__Program__NameAssignment_1
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
    // InternalExTwentyOne.g:826:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:830:1: ( rule__Program__Group__2__Impl )
            // InternalExTwentyOne.g:831:2: rule__Program__Group__2__Impl
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
    // InternalExTwentyOne.g:837:1: rule__Program__Group__2__Impl : ( ( rule__Program__DeclarationsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:841:1: ( ( ( rule__Program__DeclarationsAssignment_2 )* ) )
            // InternalExTwentyOne.g:842:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            {
            // InternalExTwentyOne.g:842:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            // InternalExTwentyOne.g:843:2: ( rule__Program__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getDeclarationsAssignment_2()); 
            // InternalExTwentyOne.g:844:2: ( rule__Program__DeclarationsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19||LA9_0==21||(LA9_0>=26 && LA9_0<=27)||LA9_0==30||LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExTwentyOne.g:844:3: rule__Program__DeclarationsAssignment_2
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
    // InternalExTwentyOne.g:853:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:857:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalExTwentyOne.g:858:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalExTwentyOne.g:865:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:869:1: ( ( 'parameter' ) )
            // InternalExTwentyOne.g:870:1: ( 'parameter' )
            {
            // InternalExTwentyOne.g:870:1: ( 'parameter' )
            // InternalExTwentyOne.g:871:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalExTwentyOne.g:880:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:884:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalExTwentyOne.g:885:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalExTwentyOne.g:892:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:896:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:897:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:897:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalExTwentyOne.g:898:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:899:2: ( rule__Parameter__NameAssignment_1 )
            // InternalExTwentyOne.g:899:3: rule__Parameter__NameAssignment_1
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
    // InternalExTwentyOne.g:907:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:911:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalExTwentyOne.g:912:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalExTwentyOne.g:919:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:923:1: ( ( ':' ) )
            // InternalExTwentyOne.g:924:1: ( ':' )
            {
            // InternalExTwentyOne.g:924:1: ( ':' )
            // InternalExTwentyOne.g:925:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalExTwentyOne.g:934:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:938:1: ( rule__Parameter__Group__3__Impl )
            // InternalExTwentyOne.g:939:2: rule__Parameter__Group__3__Impl
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
    // InternalExTwentyOne.g:945:1: rule__Parameter__Group__3__Impl : ( ruleType ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:949:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:950:1: ( ruleType )
            {
            // InternalExTwentyOne.g:950:1: ( ruleType )
            // InternalExTwentyOne.g:951:2: ruleType
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
    // InternalExTwentyOne.g:961:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:965:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalExTwentyOne.g:966:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalExTwentyOne.g:973:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:977:1: ( ( () ) )
            // InternalExTwentyOne.g:978:1: ( () )
            {
            // InternalExTwentyOne.g:978:1: ( () )
            // InternalExTwentyOne.g:979:2: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // InternalExTwentyOne.g:980:2: ()
            // InternalExTwentyOne.g:980:3: 
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
    // InternalExTwentyOne.g:988:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:992:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalExTwentyOne.g:993:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalExTwentyOne.g:1000:1: rule__Function__Group__1__Impl : ( 'function' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1004:1: ( ( 'function' ) )
            // InternalExTwentyOne.g:1005:1: ( 'function' )
            {
            // InternalExTwentyOne.g:1005:1: ( 'function' )
            // InternalExTwentyOne.g:1006:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1015:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1019:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalExTwentyOne.g:1020:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalExTwentyOne.g:1027:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1031:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1032:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1032:1: ( ( rule__Function__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1033:2: ( rule__Function__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1034:2: ( rule__Function__NameAssignment_2 )
            // InternalExTwentyOne.g:1034:3: rule__Function__NameAssignment_2
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
    // InternalExTwentyOne.g:1042:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1046:1: ( rule__Function__Group__3__Impl )
            // InternalExTwentyOne.g:1047:2: rule__Function__Group__3__Impl
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
    // InternalExTwentyOne.g:1053:1: rule__Function__Group__3__Impl : ( ( rule__Function__LambdaAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1057:1: ( ( ( rule__Function__LambdaAssignment_3 ) ) )
            // InternalExTwentyOne.g:1058:1: ( ( rule__Function__LambdaAssignment_3 ) )
            {
            // InternalExTwentyOne.g:1058:1: ( ( rule__Function__LambdaAssignment_3 ) )
            // InternalExTwentyOne.g:1059:2: ( rule__Function__LambdaAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getLambdaAssignment_3()); 
            // InternalExTwentyOne.g:1060:2: ( rule__Function__LambdaAssignment_3 )
            // InternalExTwentyOne.g:1060:3: rule__Function__LambdaAssignment_3
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
    // InternalExTwentyOne.g:1069:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1073:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalExTwentyOne.g:1074:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
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
    // InternalExTwentyOne.g:1081:1: rule__Lambda__Group__0__Impl : ( () ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1085:1: ( ( () ) )
            // InternalExTwentyOne.g:1086:1: ( () )
            {
            // InternalExTwentyOne.g:1086:1: ( () )
            // InternalExTwentyOne.g:1087:2: ()
            {
             before(grammarAccess.getLambdaAccess().getLambdaAction_0()); 
            // InternalExTwentyOne.g:1088:2: ()
            // InternalExTwentyOne.g:1088:3: 
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
    // InternalExTwentyOne.g:1096:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1100:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalExTwentyOne.g:1101:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
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
    // InternalExTwentyOne.g:1108:1: rule__Lambda__Group__1__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1112:1: ( ( '(' ) )
            // InternalExTwentyOne.g:1113:1: ( '(' )
            {
            // InternalExTwentyOne.g:1113:1: ( '(' )
            // InternalExTwentyOne.g:1114:2: '('
            {
             before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1123:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1127:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalExTwentyOne.g:1128:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
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
    // InternalExTwentyOne.g:1135:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__NameAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1139:1: ( ( ( rule__Lambda__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1140:1: ( ( rule__Lambda__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1140:1: ( ( rule__Lambda__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1141:2: ( rule__Lambda__NameAssignment_2 )
            {
             before(grammarAccess.getLambdaAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1142:2: ( rule__Lambda__NameAssignment_2 )
            // InternalExTwentyOne.g:1142:3: rule__Lambda__NameAssignment_2
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
    // InternalExTwentyOne.g:1150:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1154:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalExTwentyOne.g:1155:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
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
    // InternalExTwentyOne.g:1162:1: rule__Lambda__Group__3__Impl : ( ':' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1166:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1167:1: ( ':' )
            {
            // InternalExTwentyOne.g:1167:1: ( ':' )
            // InternalExTwentyOne.g:1168:2: ':'
            {
             before(grammarAccess.getLambdaAccess().getColonKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1177:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1181:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalExTwentyOne.g:1182:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
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
    // InternalExTwentyOne.g:1189:1: rule__Lambda__Group__4__Impl : ( ruleType ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1193:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1194:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1194:1: ( ruleType )
            // InternalExTwentyOne.g:1195:2: ruleType
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
    // InternalExTwentyOne.g:1204:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl rule__Lambda__Group__6 ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1208:1: ( rule__Lambda__Group__5__Impl rule__Lambda__Group__6 )
            // InternalExTwentyOne.g:1209:2: rule__Lambda__Group__5__Impl rule__Lambda__Group__6
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
    // InternalExTwentyOne.g:1216:1: rule__Lambda__Group__5__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1220:1: ( ( ')' ) )
            // InternalExTwentyOne.g:1221:1: ( ')' )
            {
            // InternalExTwentyOne.g:1221:1: ( ')' )
            // InternalExTwentyOne.g:1222:2: ')'
            {
             before(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1231:1: rule__Lambda__Group__6 : rule__Lambda__Group__6__Impl rule__Lambda__Group__7 ;
    public final void rule__Lambda__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1235:1: ( rule__Lambda__Group__6__Impl rule__Lambda__Group__7 )
            // InternalExTwentyOne.g:1236:2: rule__Lambda__Group__6__Impl rule__Lambda__Group__7
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
    // InternalExTwentyOne.g:1243:1: rule__Lambda__Group__6__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1247:1: ( ( '{' ) )
            // InternalExTwentyOne.g:1248:1: ( '{' )
            {
            // InternalExTwentyOne.g:1248:1: ( '{' )
            // InternalExTwentyOne.g:1249:2: '{'
            {
             before(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1258:1: rule__Lambda__Group__7 : rule__Lambda__Group__7__Impl rule__Lambda__Group__8 ;
    public final void rule__Lambda__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1262:1: ( rule__Lambda__Group__7__Impl rule__Lambda__Group__8 )
            // InternalExTwentyOne.g:1263:2: rule__Lambda__Group__7__Impl rule__Lambda__Group__8
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
    // InternalExTwentyOne.g:1270:1: rule__Lambda__Group__7__Impl : ( ( rule__Lambda__LambdaExpAssignment_7 ) ) ;
    public final void rule__Lambda__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1274:1: ( ( ( rule__Lambda__LambdaExpAssignment_7 ) ) )
            // InternalExTwentyOne.g:1275:1: ( ( rule__Lambda__LambdaExpAssignment_7 ) )
            {
            // InternalExTwentyOne.g:1275:1: ( ( rule__Lambda__LambdaExpAssignment_7 ) )
            // InternalExTwentyOne.g:1276:2: ( rule__Lambda__LambdaExpAssignment_7 )
            {
             before(grammarAccess.getLambdaAccess().getLambdaExpAssignment_7()); 
            // InternalExTwentyOne.g:1277:2: ( rule__Lambda__LambdaExpAssignment_7 )
            // InternalExTwentyOne.g:1277:3: rule__Lambda__LambdaExpAssignment_7
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
    // InternalExTwentyOne.g:1285:1: rule__Lambda__Group__8 : rule__Lambda__Group__8__Impl ;
    public final void rule__Lambda__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1289:1: ( rule__Lambda__Group__8__Impl )
            // InternalExTwentyOne.g:1290:2: rule__Lambda__Group__8__Impl
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
    // InternalExTwentyOne.g:1296:1: rule__Lambda__Group__8__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1300:1: ( ( '}' ) )
            // InternalExTwentyOne.g:1301:1: ( '}' )
            {
            // InternalExTwentyOne.g:1301:1: ( '}' )
            // InternalExTwentyOne.g:1302:2: '}'
            {
             before(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1312:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1316:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalExTwentyOne.g:1317:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalExTwentyOne.g:1324:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1328:1: ( ( () ) )
            // InternalExTwentyOne.g:1329:1: ( () )
            {
            // InternalExTwentyOne.g:1329:1: ( () )
            // InternalExTwentyOne.g:1330:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalExTwentyOne.g:1331:2: ()
            // InternalExTwentyOne.g:1331:3: 
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
    // InternalExTwentyOne.g:1339:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1343:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalExTwentyOne.g:1344:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalExTwentyOne.g:1351:1: rule__Input__Group__1__Impl : ( 'input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1355:1: ( ( 'input' ) )
            // InternalExTwentyOne.g:1356:1: ( 'input' )
            {
            // InternalExTwentyOne.g:1356:1: ( 'input' )
            // InternalExTwentyOne.g:1357:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1366:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1370:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalExTwentyOne.g:1371:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalExTwentyOne.g:1378:1: rule__Input__Group__2__Impl : ( ( rule__Input__NameAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1382:1: ( ( ( rule__Input__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1383:1: ( ( rule__Input__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1383:1: ( ( rule__Input__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1384:2: ( rule__Input__NameAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1385:2: ( rule__Input__NameAssignment_2 )
            // InternalExTwentyOne.g:1385:3: rule__Input__NameAssignment_2
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
    // InternalExTwentyOne.g:1393:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1397:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalExTwentyOne.g:1398:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalExTwentyOne.g:1405:1: rule__Input__Group__3__Impl : ( ':' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1409:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1410:1: ( ':' )
            {
            // InternalExTwentyOne.g:1410:1: ( ':' )
            // InternalExTwentyOne.g:1411:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1420:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1424:1: ( rule__Input__Group__4__Impl )
            // InternalExTwentyOne.g:1425:2: rule__Input__Group__4__Impl
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
    // InternalExTwentyOne.g:1431:1: rule__Input__Group__4__Impl : ( ruleType ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1435:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1436:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1436:1: ( ruleType )
            // InternalExTwentyOne.g:1437:2: ruleType
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
    // InternalExTwentyOne.g:1447:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1451:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalExTwentyOne.g:1452:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalExTwentyOne.g:1459:1: rule__Node__Group__0__Impl : ( () ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1463:1: ( ( () ) )
            // InternalExTwentyOne.g:1464:1: ( () )
            {
            // InternalExTwentyOne.g:1464:1: ( () )
            // InternalExTwentyOne.g:1465:2: ()
            {
             before(grammarAccess.getNodeAccess().getNodeAction_0()); 
            // InternalExTwentyOne.g:1466:2: ()
            // InternalExTwentyOne.g:1466:3: 
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
    // InternalExTwentyOne.g:1474:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1478:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalExTwentyOne.g:1479:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalExTwentyOne.g:1486:1: rule__Node__Group__1__Impl : ( 'node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1490:1: ( ( 'node' ) )
            // InternalExTwentyOne.g:1491:1: ( 'node' )
            {
            // InternalExTwentyOne.g:1491:1: ( 'node' )
            // InternalExTwentyOne.g:1492:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1501:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1505:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalExTwentyOne.g:1506:2: rule__Node__Group__2__Impl rule__Node__Group__3
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
    // InternalExTwentyOne.g:1513:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1517:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1518:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1518:1: ( ( rule__Node__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1519:2: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1520:2: ( rule__Node__NameAssignment_2 )
            // InternalExTwentyOne.g:1520:3: rule__Node__NameAssignment_2
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
    // InternalExTwentyOne.g:1528:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1532:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalExTwentyOne.g:1533:2: rule__Node__Group__3__Impl rule__Node__Group__4
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
    // InternalExTwentyOne.g:1540:1: rule__Node__Group__3__Impl : ( '[' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1544:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1545:1: ( '[' )
            {
            // InternalExTwentyOne.g:1545:1: ( '[' )
            // InternalExTwentyOne.g:1546:2: '['
            {
             before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1555:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1559:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // InternalExTwentyOne.g:1560:2: rule__Node__Group__4__Impl rule__Node__Group__5
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
    // InternalExTwentyOne.g:1567:1: rule__Node__Group__4__Impl : ( ( rule__Node__Alternatives_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1571:1: ( ( ( rule__Node__Alternatives_4 ) ) )
            // InternalExTwentyOne.g:1572:1: ( ( rule__Node__Alternatives_4 ) )
            {
            // InternalExTwentyOne.g:1572:1: ( ( rule__Node__Alternatives_4 ) )
            // InternalExTwentyOne.g:1573:2: ( rule__Node__Alternatives_4 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_4()); 
            // InternalExTwentyOne.g:1574:2: ( rule__Node__Alternatives_4 )
            // InternalExTwentyOne.g:1574:3: rule__Node__Alternatives_4
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
    // InternalExTwentyOne.g:1582:1: rule__Node__Group__5 : rule__Node__Group__5__Impl ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1586:1: ( rule__Node__Group__5__Impl )
            // InternalExTwentyOne.g:1587:2: rule__Node__Group__5__Impl
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
    // InternalExTwentyOne.g:1593:1: rule__Node__Group__5__Impl : ( ']' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1597:1: ( ( ']' ) )
            // InternalExTwentyOne.g:1598:1: ( ']' )
            {
            // InternalExTwentyOne.g:1598:1: ( ']' )
            // InternalExTwentyOne.g:1599:2: ']'
            {
             before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1609:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1613:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // InternalExTwentyOne.g:1614:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
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
    // InternalExTwentyOne.g:1621:1: rule__Stream__Group__0__Impl : ( () ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1625:1: ( ( () ) )
            // InternalExTwentyOne.g:1626:1: ( () )
            {
            // InternalExTwentyOne.g:1626:1: ( () )
            // InternalExTwentyOne.g:1627:2: ()
            {
             before(grammarAccess.getStreamAccess().getStreamAction_0()); 
            // InternalExTwentyOne.g:1628:2: ()
            // InternalExTwentyOne.g:1628:3: 
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
    // InternalExTwentyOne.g:1636:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1640:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // InternalExTwentyOne.g:1641:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
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
    // InternalExTwentyOne.g:1648:1: rule__Stream__Group__1__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1652:1: ( ( 'stream' ) )
            // InternalExTwentyOne.g:1653:1: ( 'stream' )
            {
            // InternalExTwentyOne.g:1653:1: ( 'stream' )
            // InternalExTwentyOne.g:1654:2: 'stream'
            {
             before(grammarAccess.getStreamAccess().getStreamKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1663:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1667:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // InternalExTwentyOne.g:1668:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
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
    // InternalExTwentyOne.g:1675:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__InputsOrNodesAssignment_2 ) ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1679:1: ( ( ( rule__Stream__InputsOrNodesAssignment_2 ) ) )
            // InternalExTwentyOne.g:1680:1: ( ( rule__Stream__InputsOrNodesAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1680:1: ( ( rule__Stream__InputsOrNodesAssignment_2 ) )
            // InternalExTwentyOne.g:1681:2: ( rule__Stream__InputsOrNodesAssignment_2 )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_2()); 
            // InternalExTwentyOne.g:1682:2: ( rule__Stream__InputsOrNodesAssignment_2 )
            // InternalExTwentyOne.g:1682:3: rule__Stream__InputsOrNodesAssignment_2
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
    // InternalExTwentyOne.g:1690:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl rule__Stream__Group__4 ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1694:1: ( rule__Stream__Group__3__Impl rule__Stream__Group__4 )
            // InternalExTwentyOne.g:1695:2: rule__Stream__Group__3__Impl rule__Stream__Group__4
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
    // InternalExTwentyOne.g:1702:1: rule__Stream__Group__3__Impl : ( ( rule__Stream__Group_3__0 )* ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1706:1: ( ( ( rule__Stream__Group_3__0 )* ) )
            // InternalExTwentyOne.g:1707:1: ( ( rule__Stream__Group_3__0 )* )
            {
            // InternalExTwentyOne.g:1707:1: ( ( rule__Stream__Group_3__0 )* )
            // InternalExTwentyOne.g:1708:2: ( rule__Stream__Group_3__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalExTwentyOne.g:1709:2: ( rule__Stream__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExTwentyOne.g:1709:3: rule__Stream__Group_3__0
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
    // InternalExTwentyOne.g:1717:1: rule__Stream__Group__4 : rule__Stream__Group__4__Impl ;
    public final void rule__Stream__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1721:1: ( rule__Stream__Group__4__Impl )
            // InternalExTwentyOne.g:1722:2: rule__Stream__Group__4__Impl
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
    // InternalExTwentyOne.g:1728:1: rule__Stream__Group__4__Impl : ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) ) ;
    public final void rule__Stream__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1732:1: ( ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) ) )
            // InternalExTwentyOne.g:1733:1: ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) )
            {
            // InternalExTwentyOne.g:1733:1: ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) )
            // InternalExTwentyOne.g:1734:2: ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* )
            {
            // InternalExTwentyOne.g:1734:2: ( ( rule__Stream__Group_4__0 ) )
            // InternalExTwentyOne.g:1735:3: ( rule__Stream__Group_4__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_4()); 
            // InternalExTwentyOne.g:1736:3: ( rule__Stream__Group_4__0 )
            // InternalExTwentyOne.g:1736:4: rule__Stream__Group_4__0
            {
            pushFollow(FOLLOW_22);
            rule__Stream__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_4()); 

            }

            // InternalExTwentyOne.g:1739:2: ( ( rule__Stream__Group_4__0 )* )
            // InternalExTwentyOne.g:1740:3: ( rule__Stream__Group_4__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_4()); 
            // InternalExTwentyOne.g:1741:3: ( rule__Stream__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExTwentyOne.g:1741:4: rule__Stream__Group_4__0
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
    // InternalExTwentyOne.g:1751:1: rule__Stream__Group_3__0 : rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 ;
    public final void rule__Stream__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1755:1: ( rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 )
            // InternalExTwentyOne.g:1756:2: rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1
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
    // InternalExTwentyOne.g:1763:1: rule__Stream__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1767:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1768:1: ( ',' )
            {
            // InternalExTwentyOne.g:1768:1: ( ',' )
            // InternalExTwentyOne.g:1769:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1778:1: rule__Stream__Group_3__1 : rule__Stream__Group_3__1__Impl ;
    public final void rule__Stream__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1782:1: ( rule__Stream__Group_3__1__Impl )
            // InternalExTwentyOne.g:1783:2: rule__Stream__Group_3__1__Impl
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
    // InternalExTwentyOne.g:1789:1: rule__Stream__Group_3__1__Impl : ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) ) ;
    public final void rule__Stream__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1793:1: ( ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) ) )
            // InternalExTwentyOne.g:1794:1: ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) )
            {
            // InternalExTwentyOne.g:1794:1: ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) )
            // InternalExTwentyOne.g:1795:2: ( rule__Stream__InputsOrNodesAssignment_3_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_3_1()); 
            // InternalExTwentyOne.g:1796:2: ( rule__Stream__InputsOrNodesAssignment_3_1 )
            // InternalExTwentyOne.g:1796:3: rule__Stream__InputsOrNodesAssignment_3_1
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
    // InternalExTwentyOne.g:1805:1: rule__Stream__Group_4__0 : rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1 ;
    public final void rule__Stream__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1809:1: ( rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1 )
            // InternalExTwentyOne.g:1810:2: rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1
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
    // InternalExTwentyOne.g:1817:1: rule__Stream__Group_4__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1821:1: ( ( 'to' ) )
            // InternalExTwentyOne.g:1822:1: ( 'to' )
            {
            // InternalExTwentyOne.g:1822:1: ( 'to' )
            // InternalExTwentyOne.g:1823:2: 'to'
            {
             before(grammarAccess.getStreamAccess().getToKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1832:1: rule__Stream__Group_4__1 : rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2 ;
    public final void rule__Stream__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1836:1: ( rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2 )
            // InternalExTwentyOne.g:1837:2: rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2
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
    // InternalExTwentyOne.g:1844:1: rule__Stream__Group_4__1__Impl : ( ( rule__Stream__ElementsAssignment_4_1 ) ) ;
    public final void rule__Stream__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1848:1: ( ( ( rule__Stream__ElementsAssignment_4_1 ) ) )
            // InternalExTwentyOne.g:1849:1: ( ( rule__Stream__ElementsAssignment_4_1 ) )
            {
            // InternalExTwentyOne.g:1849:1: ( ( rule__Stream__ElementsAssignment_4_1 ) )
            // InternalExTwentyOne.g:1850:2: ( rule__Stream__ElementsAssignment_4_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_4_1()); 
            // InternalExTwentyOne.g:1851:2: ( rule__Stream__ElementsAssignment_4_1 )
            // InternalExTwentyOne.g:1851:3: rule__Stream__ElementsAssignment_4_1
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
    // InternalExTwentyOne.g:1859:1: rule__Stream__Group_4__2 : rule__Stream__Group_4__2__Impl ;
    public final void rule__Stream__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1863:1: ( rule__Stream__Group_4__2__Impl )
            // InternalExTwentyOne.g:1864:2: rule__Stream__Group_4__2__Impl
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
    // InternalExTwentyOne.g:1870:1: rule__Stream__Group_4__2__Impl : ( ( rule__Stream__Group_4_2__0 )* ) ;
    public final void rule__Stream__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1874:1: ( ( ( rule__Stream__Group_4_2__0 )* ) )
            // InternalExTwentyOne.g:1875:1: ( ( rule__Stream__Group_4_2__0 )* )
            {
            // InternalExTwentyOne.g:1875:1: ( ( rule__Stream__Group_4_2__0 )* )
            // InternalExTwentyOne.g:1876:2: ( rule__Stream__Group_4_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_4_2()); 
            // InternalExTwentyOne.g:1877:2: ( rule__Stream__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExTwentyOne.g:1877:3: rule__Stream__Group_4_2__0
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
    // InternalExTwentyOne.g:1886:1: rule__Stream__Group_4_2__0 : rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1 ;
    public final void rule__Stream__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1890:1: ( rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1 )
            // InternalExTwentyOne.g:1891:2: rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1
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
    // InternalExTwentyOne.g:1898:1: rule__Stream__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1902:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1903:1: ( ',' )
            {
            // InternalExTwentyOne.g:1903:1: ( ',' )
            // InternalExTwentyOne.g:1904:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_4_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalExTwentyOne.g:1913:1: rule__Stream__Group_4_2__1 : rule__Stream__Group_4_2__1__Impl ;
    public final void rule__Stream__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1917:1: ( rule__Stream__Group_4_2__1__Impl )
            // InternalExTwentyOne.g:1918:2: rule__Stream__Group_4_2__1__Impl
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
    // InternalExTwentyOne.g:1924:1: rule__Stream__Group_4_2__1__Impl : ( ( rule__Stream__ElementsAssignment_4_2_1 ) ) ;
    public final void rule__Stream__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1928:1: ( ( ( rule__Stream__ElementsAssignment_4_2_1 ) ) )
            // InternalExTwentyOne.g:1929:1: ( ( rule__Stream__ElementsAssignment_4_2_1 ) )
            {
            // InternalExTwentyOne.g:1929:1: ( ( rule__Stream__ElementsAssignment_4_2_1 ) )
            // InternalExTwentyOne.g:1930:2: ( rule__Stream__ElementsAssignment_4_2_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_4_2_1()); 
            // InternalExTwentyOne.g:1931:2: ( rule__Stream__ElementsAssignment_4_2_1 )
            // InternalExTwentyOne.g:1931:3: rule__Stream__ElementsAssignment_4_2_1
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
    // InternalExTwentyOne.g:1940:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1944:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalExTwentyOne.g:1945:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
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
    // InternalExTwentyOne.g:1952:1: rule__Element__Group_0__0__Impl : ( () ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1956:1: ( ( () ) )
            // InternalExTwentyOne.g:1957:1: ( () )
            {
            // InternalExTwentyOne.g:1957:1: ( () )
            // InternalExTwentyOne.g:1958:2: ()
            {
             before(grammarAccess.getElementAccess().getElementAction_0_0()); 
            // InternalExTwentyOne.g:1959:2: ()
            // InternalExTwentyOne.g:1959:3: 
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
    // InternalExTwentyOne.g:1967:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1971:1: ( rule__Element__Group_0__1__Impl )
            // InternalExTwentyOne.g:1972:2: rule__Element__Group_0__1__Impl
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
    // InternalExTwentyOne.g:1978:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__ElementAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1982:1: ( ( ( rule__Element__ElementAssignment_0_1 ) ) )
            // InternalExTwentyOne.g:1983:1: ( ( rule__Element__ElementAssignment_0_1 ) )
            {
            // InternalExTwentyOne.g:1983:1: ( ( rule__Element__ElementAssignment_0_1 ) )
            // InternalExTwentyOne.g:1984:2: ( rule__Element__ElementAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getElementAssignment_0_1()); 
            // InternalExTwentyOne.g:1985:2: ( rule__Element__ElementAssignment_0_1 )
            // InternalExTwentyOne.g:1985:3: rule__Element__ElementAssignment_0_1
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
    // InternalExTwentyOne.g:1994:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1998:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalExTwentyOne.g:1999:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
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
    // InternalExTwentyOne.g:2006:1: rule__Element__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2010:1: ( ( '[' ) )
            // InternalExTwentyOne.g:2011:1: ( '[' )
            {
            // InternalExTwentyOne.g:2011:1: ( '[' )
            // InternalExTwentyOne.g:2012:2: '['
            {
             before(grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2021:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl rule__Element__Group_1__2 ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2025:1: ( rule__Element__Group_1__1__Impl rule__Element__Group_1__2 )
            // InternalExTwentyOne.g:2026:2: rule__Element__Group_1__1__Impl rule__Element__Group_1__2
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
    // InternalExTwentyOne.g:2033:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__Alternatives_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2037:1: ( ( ( rule__Element__Alternatives_1_1 ) ) )
            // InternalExTwentyOne.g:2038:1: ( ( rule__Element__Alternatives_1_1 ) )
            {
            // InternalExTwentyOne.g:2038:1: ( ( rule__Element__Alternatives_1_1 ) )
            // InternalExTwentyOne.g:2039:2: ( rule__Element__Alternatives_1_1 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_1_1()); 
            // InternalExTwentyOne.g:2040:2: ( rule__Element__Alternatives_1_1 )
            // InternalExTwentyOne.g:2040:3: rule__Element__Alternatives_1_1
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
    // InternalExTwentyOne.g:2048:1: rule__Element__Group_1__2 : rule__Element__Group_1__2__Impl ;
    public final void rule__Element__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2052:1: ( rule__Element__Group_1__2__Impl )
            // InternalExTwentyOne.g:2053:2: rule__Element__Group_1__2__Impl
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
    // InternalExTwentyOne.g:2059:1: rule__Element__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Element__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2063:1: ( ( ']' ) )
            // InternalExTwentyOne.g:2064:1: ( ']' )
            {
            // InternalExTwentyOne.g:2064:1: ( ']' )
            // InternalExTwentyOne.g:2065:2: ']'
            {
             before(grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2075:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2079:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalExTwentyOne.g:2080:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
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
    // InternalExTwentyOne.g:2087:1: rule__Element__Group_2__0__Impl : ( 'output' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2091:1: ( ( 'output' ) )
            // InternalExTwentyOne.g:2092:1: ( 'output' )
            {
            // InternalExTwentyOne.g:2092:1: ( 'output' )
            // InternalExTwentyOne.g:2093:2: 'output'
            {
             before(grammarAccess.getElementAccess().getOutputKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2102:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2106:1: ( rule__Element__Group_2__1__Impl )
            // InternalExTwentyOne.g:2107:2: rule__Element__Group_2__1__Impl
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
    // InternalExTwentyOne.g:2113:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__OutputAssignment_2_1 ) ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2117:1: ( ( ( rule__Element__OutputAssignment_2_1 ) ) )
            // InternalExTwentyOne.g:2118:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            {
            // InternalExTwentyOne.g:2118:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            // InternalExTwentyOne.g:2119:2: ( rule__Element__OutputAssignment_2_1 )
            {
             before(grammarAccess.getElementAccess().getOutputAssignment_2_1()); 
            // InternalExTwentyOne.g:2120:2: ( rule__Element__OutputAssignment_2_1 )
            // InternalExTwentyOne.g:2120:3: rule__Element__OutputAssignment_2_1
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
    // InternalExTwentyOne.g:2129:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2133:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalExTwentyOne.g:2134:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
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
    // InternalExTwentyOne.g:2141:1: rule__DataDecl__Group__0__Impl : ( () ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2145:1: ( ( () ) )
            // InternalExTwentyOne.g:2146:1: ( () )
            {
            // InternalExTwentyOne.g:2146:1: ( () )
            // InternalExTwentyOne.g:2147:2: ()
            {
             before(grammarAccess.getDataDeclAccess().getDataDeclAction_0()); 
            // InternalExTwentyOne.g:2148:2: ()
            // InternalExTwentyOne.g:2148:3: 
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
    // InternalExTwentyOne.g:2156:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2160:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalExTwentyOne.g:2161:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
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
    // InternalExTwentyOne.g:2168:1: rule__DataDecl__Group__1__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2172:1: ( ( 'data' ) )
            // InternalExTwentyOne.g:2173:1: ( 'data' )
            {
            // InternalExTwentyOne.g:2173:1: ( 'data' )
            // InternalExTwentyOne.g:2174:2: 'data'
            {
             before(grammarAccess.getDataDeclAccess().getDataKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2183:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2187:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalExTwentyOne.g:2188:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
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
    // InternalExTwentyOne.g:2195:1: rule__DataDecl__Group__2__Impl : ( ( rule__DataDecl__NameAssignment_2 ) ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2199:1: ( ( ( rule__DataDecl__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:2200:1: ( ( rule__DataDecl__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:2200:1: ( ( rule__DataDecl__NameAssignment_2 ) )
            // InternalExTwentyOne.g:2201:2: ( rule__DataDecl__NameAssignment_2 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:2202:2: ( rule__DataDecl__NameAssignment_2 )
            // InternalExTwentyOne.g:2202:3: rule__DataDecl__NameAssignment_2
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
    // InternalExTwentyOne.g:2210:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2214:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalExTwentyOne.g:2215:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
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
    // InternalExTwentyOne.g:2222:1: rule__DataDecl__Group__3__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2226:1: ( ( '{' ) )
            // InternalExTwentyOne.g:2227:1: ( '{' )
            {
            // InternalExTwentyOne.g:2227:1: ( '{' )
            // InternalExTwentyOne.g:2228:2: '{'
            {
             before(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2237:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2241:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalExTwentyOne.g:2242:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
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
    // InternalExTwentyOne.g:2249:1: rule__DataDecl__Group__4__Impl : ( ( rule__DataDecl__DataAssignment_4 ) ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2253:1: ( ( ( rule__DataDecl__DataAssignment_4 ) ) )
            // InternalExTwentyOne.g:2254:1: ( ( rule__DataDecl__DataAssignment_4 ) )
            {
            // InternalExTwentyOne.g:2254:1: ( ( rule__DataDecl__DataAssignment_4 ) )
            // InternalExTwentyOne.g:2255:2: ( rule__DataDecl__DataAssignment_4 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_4()); 
            // InternalExTwentyOne.g:2256:2: ( rule__DataDecl__DataAssignment_4 )
            // InternalExTwentyOne.g:2256:3: rule__DataDecl__DataAssignment_4
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
    // InternalExTwentyOne.g:2264:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2268:1: ( rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 )
            // InternalExTwentyOne.g:2269:2: rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6
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
    // InternalExTwentyOne.g:2276:1: rule__DataDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2280:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2281:1: ( ':' )
            {
            // InternalExTwentyOne.g:2281:1: ( ':' )
            // InternalExTwentyOne.g:2282:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_5()); 
            match(input,20,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2291:1: rule__DataDecl__Group__6 : rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 ;
    public final void rule__DataDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2295:1: ( rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 )
            // InternalExTwentyOne.g:2296:2: rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7
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
    // InternalExTwentyOne.g:2303:1: rule__DataDecl__Group__6__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2307:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2308:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2308:1: ( ruleType )
            // InternalExTwentyOne.g:2309:2: ruleType
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
    // InternalExTwentyOne.g:2318:1: rule__DataDecl__Group__7 : rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8 ;
    public final void rule__DataDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2322:1: ( rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8 )
            // InternalExTwentyOne.g:2323:2: rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8
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
    // InternalExTwentyOne.g:2330:1: rule__DataDecl__Group__7__Impl : ( ( rule__DataDecl__Group_7__0 )* ) ;
    public final void rule__DataDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2334:1: ( ( ( rule__DataDecl__Group_7__0 )* ) )
            // InternalExTwentyOne.g:2335:1: ( ( rule__DataDecl__Group_7__0 )* )
            {
            // InternalExTwentyOne.g:2335:1: ( ( rule__DataDecl__Group_7__0 )* )
            // InternalExTwentyOne.g:2336:2: ( rule__DataDecl__Group_7__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_7()); 
            // InternalExTwentyOne.g:2337:2: ( rule__DataDecl__Group_7__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExTwentyOne.g:2337:3: rule__DataDecl__Group_7__0
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
    // InternalExTwentyOne.g:2345:1: rule__DataDecl__Group__8 : rule__DataDecl__Group__8__Impl ;
    public final void rule__DataDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2349:1: ( rule__DataDecl__Group__8__Impl )
            // InternalExTwentyOne.g:2350:2: rule__DataDecl__Group__8__Impl
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
    // InternalExTwentyOne.g:2356:1: rule__DataDecl__Group__8__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2360:1: ( ( '}' ) )
            // InternalExTwentyOne.g:2361:1: ( '}' )
            {
            // InternalExTwentyOne.g:2361:1: ( '}' )
            // InternalExTwentyOne.g:2362:2: '}'
            {
             before(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2372:1: rule__DataDecl__Group_7__0 : rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1 ;
    public final void rule__DataDecl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2376:1: ( rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1 )
            // InternalExTwentyOne.g:2377:2: rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1
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
    // InternalExTwentyOne.g:2384:1: rule__DataDecl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2388:1: ( ( ',' ) )
            // InternalExTwentyOne.g:2389:1: ( ',' )
            {
            // InternalExTwentyOne.g:2389:1: ( ',' )
            // InternalExTwentyOne.g:2390:2: ','
            {
             before(grammarAccess.getDataDeclAccess().getCommaKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2399:1: rule__DataDecl__Group_7__1 : rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2 ;
    public final void rule__DataDecl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2403:1: ( rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2 )
            // InternalExTwentyOne.g:2404:2: rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2
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
    // InternalExTwentyOne.g:2411:1: rule__DataDecl__Group_7__1__Impl : ( ( rule__DataDecl__DataAssignment_7_1 ) ) ;
    public final void rule__DataDecl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2415:1: ( ( ( rule__DataDecl__DataAssignment_7_1 ) ) )
            // InternalExTwentyOne.g:2416:1: ( ( rule__DataDecl__DataAssignment_7_1 ) )
            {
            // InternalExTwentyOne.g:2416:1: ( ( rule__DataDecl__DataAssignment_7_1 ) )
            // InternalExTwentyOne.g:2417:2: ( rule__DataDecl__DataAssignment_7_1 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_7_1()); 
            // InternalExTwentyOne.g:2418:2: ( rule__DataDecl__DataAssignment_7_1 )
            // InternalExTwentyOne.g:2418:3: rule__DataDecl__DataAssignment_7_1
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
    // InternalExTwentyOne.g:2426:1: rule__DataDecl__Group_7__2 : rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3 ;
    public final void rule__DataDecl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2430:1: ( rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3 )
            // InternalExTwentyOne.g:2431:2: rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3
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
    // InternalExTwentyOne.g:2438:1: rule__DataDecl__Group_7__2__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2442:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2443:1: ( ':' )
            {
            // InternalExTwentyOne.g:2443:1: ( ':' )
            // InternalExTwentyOne.g:2444:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_7_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2453:1: rule__DataDecl__Group_7__3 : rule__DataDecl__Group_7__3__Impl ;
    public final void rule__DataDecl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2457:1: ( rule__DataDecl__Group_7__3__Impl )
            // InternalExTwentyOne.g:2458:2: rule__DataDecl__Group_7__3__Impl
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
    // InternalExTwentyOne.g:2464:1: rule__DataDecl__Group_7__3__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2468:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2469:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2469:1: ( ruleType )
            // InternalExTwentyOne.g:2470:2: ruleType
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
    // InternalExTwentyOne.g:2480:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2484:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalExTwentyOne.g:2485:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
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
    // InternalExTwentyOne.g:2492:1: rule__Exp__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2496:1: ( ( rulePrimary ) )
            // InternalExTwentyOne.g:2497:1: ( rulePrimary )
            {
            // InternalExTwentyOne.g:2497:1: ( rulePrimary )
            // InternalExTwentyOne.g:2498:2: rulePrimary
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
    // InternalExTwentyOne.g:2507:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2511:1: ( rule__Exp__Group__1__Impl )
            // InternalExTwentyOne.g:2512:2: rule__Exp__Group__1__Impl
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
    // InternalExTwentyOne.g:2518:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2522:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalExTwentyOne.g:2523:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalExTwentyOne.g:2523:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalExTwentyOne.g:2524:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalExTwentyOne.g:2525:2: ( rule__Exp__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=35 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExTwentyOne.g:2525:3: rule__Exp__Group_1__0
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
    // InternalExTwentyOne.g:2534:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2538:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalExTwentyOne.g:2539:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
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
    // InternalExTwentyOne.g:2546:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2550:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalExTwentyOne.g:2551:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalExTwentyOne.g:2551:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalExTwentyOne.g:2552:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalExTwentyOne.g:2553:2: ( rule__Exp__Alternatives_1_0 )
            // InternalExTwentyOne.g:2553:3: rule__Exp__Alternatives_1_0
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
    // InternalExTwentyOne.g:2561:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2565:1: ( rule__Exp__Group_1__1__Impl )
            // InternalExTwentyOne.g:2566:2: rule__Exp__Group_1__1__Impl
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
    // InternalExTwentyOne.g:2572:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2576:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalExTwentyOne.g:2577:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalExTwentyOne.g:2577:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalExTwentyOne.g:2578:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalExTwentyOne.g:2579:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalExTwentyOne.g:2579:3: rule__Exp__RightAssignment_1_1
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
    // InternalExTwentyOne.g:2588:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2592:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalExTwentyOne.g:2593:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
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
    // InternalExTwentyOne.g:2600:1: rule__Exp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2604:1: ( ( () ) )
            // InternalExTwentyOne.g:2605:1: ( () )
            {
            // InternalExTwentyOne.g:2605:1: ( () )
            // InternalExTwentyOne.g:2606:2: ()
            {
             before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalExTwentyOne.g:2607:2: ()
            // InternalExTwentyOne.g:2607:3: 
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
    // InternalExTwentyOne.g:2615:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2619:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalExTwentyOne.g:2620:2: rule__Exp__Group_1_0_0__1__Impl
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
    // InternalExTwentyOne.g:2626:1: rule__Exp__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2630:1: ( ( '+' ) )
            // InternalExTwentyOne.g:2631:1: ( '+' )
            {
            // InternalExTwentyOne.g:2631:1: ( '+' )
            // InternalExTwentyOne.g:2632:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2642:1: rule__Exp__Group_1_0_1__0 : rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 ;
    public final void rule__Exp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2646:1: ( rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 )
            // InternalExTwentyOne.g:2647:2: rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1
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
    // InternalExTwentyOne.g:2654:1: rule__Exp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2658:1: ( ( () ) )
            // InternalExTwentyOne.g:2659:1: ( () )
            {
            // InternalExTwentyOne.g:2659:1: ( () )
            // InternalExTwentyOne.g:2660:2: ()
            {
             before(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalExTwentyOne.g:2661:2: ()
            // InternalExTwentyOne.g:2661:3: 
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
    // InternalExTwentyOne.g:2669:1: rule__Exp__Group_1_0_1__1 : rule__Exp__Group_1_0_1__1__Impl ;
    public final void rule__Exp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2673:1: ( rule__Exp__Group_1_0_1__1__Impl )
            // InternalExTwentyOne.g:2674:2: rule__Exp__Group_1_0_1__1__Impl
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
    // InternalExTwentyOne.g:2680:1: rule__Exp__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Exp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2684:1: ( ( '-' ) )
            // InternalExTwentyOne.g:2685:1: ( '-' )
            {
            // InternalExTwentyOne.g:2685:1: ( '-' )
            // InternalExTwentyOne.g:2686:2: '-'
            {
             before(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2696:1: rule__Exp__Group_1_0_2__0 : rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1 ;
    public final void rule__Exp__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2700:1: ( rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1 )
            // InternalExTwentyOne.g:2701:2: rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1
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
    // InternalExTwentyOne.g:2708:1: rule__Exp__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2712:1: ( ( () ) )
            // InternalExTwentyOne.g:2713:1: ( () )
            {
            // InternalExTwentyOne.g:2713:1: ( () )
            // InternalExTwentyOne.g:2714:2: ()
            {
             before(grammarAccess.getExpAccess().getMultLeftAction_1_0_2_0()); 
            // InternalExTwentyOne.g:2715:2: ()
            // InternalExTwentyOne.g:2715:3: 
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
    // InternalExTwentyOne.g:2723:1: rule__Exp__Group_1_0_2__1 : rule__Exp__Group_1_0_2__1__Impl ;
    public final void rule__Exp__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2727:1: ( rule__Exp__Group_1_0_2__1__Impl )
            // InternalExTwentyOne.g:2728:2: rule__Exp__Group_1_0_2__1__Impl
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
    // InternalExTwentyOne.g:2734:1: rule__Exp__Group_1_0_2__1__Impl : ( '*' ) ;
    public final void rule__Exp__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2738:1: ( ( '*' ) )
            // InternalExTwentyOne.g:2739:1: ( '*' )
            {
            // InternalExTwentyOne.g:2739:1: ( '*' )
            // InternalExTwentyOne.g:2740:2: '*'
            {
             before(grammarAccess.getExpAccess().getAsteriskKeyword_1_0_2_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2750:1: rule__Exp__Group_1_0_3__0 : rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1 ;
    public final void rule__Exp__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2754:1: ( rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1 )
            // InternalExTwentyOne.g:2755:2: rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1
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
    // InternalExTwentyOne.g:2762:1: rule__Exp__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2766:1: ( ( () ) )
            // InternalExTwentyOne.g:2767:1: ( () )
            {
            // InternalExTwentyOne.g:2767:1: ( () )
            // InternalExTwentyOne.g:2768:2: ()
            {
             before(grammarAccess.getExpAccess().getDivideLeftAction_1_0_3_0()); 
            // InternalExTwentyOne.g:2769:2: ()
            // InternalExTwentyOne.g:2769:3: 
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
    // InternalExTwentyOne.g:2777:1: rule__Exp__Group_1_0_3__1 : rule__Exp__Group_1_0_3__1__Impl ;
    public final void rule__Exp__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2781:1: ( rule__Exp__Group_1_0_3__1__Impl )
            // InternalExTwentyOne.g:2782:2: rule__Exp__Group_1_0_3__1__Impl
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
    // InternalExTwentyOne.g:2788:1: rule__Exp__Group_1_0_3__1__Impl : ( '/' ) ;
    public final void rule__Exp__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2792:1: ( ( '/' ) )
            // InternalExTwentyOne.g:2793:1: ( '/' )
            {
            // InternalExTwentyOne.g:2793:1: ( '/' )
            // InternalExTwentyOne.g:2794:2: '/'
            {
             before(grammarAccess.getExpAccess().getSolidusKeyword_1_0_3_1()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalExTwentyOne.g:2804:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2808:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalExTwentyOne.g:2809:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalExTwentyOne.g:2816:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2820:1: ( ( () ) )
            // InternalExTwentyOne.g:2821:1: ( () )
            {
            // InternalExTwentyOne.g:2821:1: ( () )
            // InternalExTwentyOne.g:2822:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAction_2_0()); 
            // InternalExTwentyOne.g:2823:2: ()
            // InternalExTwentyOne.g:2823:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getExpressionAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalExTwentyOne.g:2831:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2835:1: ( rule__Primary__Group_2__1__Impl )
            // InternalExTwentyOne.g:2836:2: rule__Primary__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalExTwentyOne.g:2842:1: rule__Primary__Group_2__1__Impl : ( 'none' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2846:1: ( ( 'none' ) )
            // InternalExTwentyOne.g:2847:1: ( 'none' )
            {
            // InternalExTwentyOne.g:2847:1: ( 'none' )
            // InternalExTwentyOne.g:2848:2: 'none'
            {
             before(grammarAccess.getPrimaryAccess().getNoneKeyword_2_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getNoneKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalExTwentyOne.g:2858:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2862:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalExTwentyOne.g:2863:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalExTwentyOne.g:2870:1: rule__Primary__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2874:1: ( ( '(' ) )
            // InternalExTwentyOne.g:2875:1: ( '(' )
            {
            // InternalExTwentyOne.g:2875:1: ( '(' )
            // InternalExTwentyOne.g:2876:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalExTwentyOne.g:2885:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2889:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalExTwentyOne.g:2890:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalExTwentyOne.g:2897:1: rule__Primary__Group_3__1__Impl : ( ruleExp ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2901:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:2902:1: ( ruleExp )
            {
            // InternalExTwentyOne.g:2902:1: ( ruleExp )
            // InternalExTwentyOne.g:2903:2: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getExpParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalExTwentyOne.g:2912:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2916:1: ( rule__Primary__Group_3__2__Impl )
            // InternalExTwentyOne.g:2917:2: rule__Primary__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalExTwentyOne.g:2923:1: rule__Primary__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2927:1: ( ( ')' ) )
            // InternalExTwentyOne.g:2928:1: ( ')' )
            {
            // InternalExTwentyOne.g:2928:1: ( ')' )
            // InternalExTwentyOne.g:2929:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__Primary__Group_6__0"
    // InternalExTwentyOne.g:2939:1: rule__Primary__Group_6__0 : rule__Primary__Group_6__0__Impl rule__Primary__Group_6__1 ;
    public final void rule__Primary__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2943:1: ( rule__Primary__Group_6__0__Impl rule__Primary__Group_6__1 )
            // InternalExTwentyOne.g:2944:2: rule__Primary__Group_6__0__Impl rule__Primary__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__0"


    // $ANTLR start "rule__Primary__Group_6__0__Impl"
    // InternalExTwentyOne.g:2951:1: rule__Primary__Group_6__0__Impl : ( () ) ;
    public final void rule__Primary__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2955:1: ( ( () ) )
            // InternalExTwentyOne.g:2956:1: ( () )
            {
            // InternalExTwentyOne.g:2956:1: ( () )
            // InternalExTwentyOne.g:2957:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAction_6_0()); 
            // InternalExTwentyOne.g:2958:2: ()
            // InternalExTwentyOne.g:2958:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getExpressionAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__0__Impl"


    // $ANTLR start "rule__Primary__Group_6__1"
    // InternalExTwentyOne.g:2966:1: rule__Primary__Group_6__1 : rule__Primary__Group_6__1__Impl ;
    public final void rule__Primary__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2970:1: ( rule__Primary__Group_6__1__Impl )
            // InternalExTwentyOne.g:2971:2: rule__Primary__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__1"


    // $ANTLR start "rule__Primary__Group_6__1__Impl"
    // InternalExTwentyOne.g:2977:1: rule__Primary__Group_6__1__Impl : ( ruleType ) ;
    public final void rule__Primary__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2981:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2982:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2982:1: ( ruleType )
            // InternalExTwentyOne.g:2983:2: ruleType
            {
             before(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_6_1()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__1__Impl"


    // $ANTLR start "rule__DataAccess__Group__0"
    // InternalExTwentyOne.g:2993:1: rule__DataAccess__Group__0 : rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 ;
    public final void rule__DataAccess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2997:1: ( rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1 )
            // InternalExTwentyOne.g:2998:2: rule__DataAccess__Group__0__Impl rule__DataAccess__Group__1
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
    // InternalExTwentyOne.g:3005:1: rule__DataAccess__Group__0__Impl : ( () ) ;
    public final void rule__DataAccess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3009:1: ( ( () ) )
            // InternalExTwentyOne.g:3010:1: ( () )
            {
            // InternalExTwentyOne.g:3010:1: ( () )
            // InternalExTwentyOne.g:3011:2: ()
            {
             before(grammarAccess.getDataAccessAccess().getDataAccessAction_0()); 
            // InternalExTwentyOne.g:3012:2: ()
            // InternalExTwentyOne.g:3012:3: 
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
    // InternalExTwentyOne.g:3020:1: rule__DataAccess__Group__1 : rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2 ;
    public final void rule__DataAccess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3024:1: ( rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2 )
            // InternalExTwentyOne.g:3025:2: rule__DataAccess__Group__1__Impl rule__DataAccess__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalExTwentyOne.g:3032:1: rule__DataAccess__Group__1__Impl : ( ( rule__DataAccess__AccessedDataAssignment_1 ) ) ;
    public final void rule__DataAccess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3036:1: ( ( ( rule__DataAccess__AccessedDataAssignment_1 ) ) )
            // InternalExTwentyOne.g:3037:1: ( ( rule__DataAccess__AccessedDataAssignment_1 ) )
            {
            // InternalExTwentyOne.g:3037:1: ( ( rule__DataAccess__AccessedDataAssignment_1 ) )
            // InternalExTwentyOne.g:3038:2: ( rule__DataAccess__AccessedDataAssignment_1 )
            {
             before(grammarAccess.getDataAccessAccess().getAccessedDataAssignment_1()); 
            // InternalExTwentyOne.g:3039:2: ( rule__DataAccess__AccessedDataAssignment_1 )
            // InternalExTwentyOne.g:3039:3: rule__DataAccess__AccessedDataAssignment_1
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
    // InternalExTwentyOne.g:3047:1: rule__DataAccess__Group__2 : rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3 ;
    public final void rule__DataAccess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3051:1: ( rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3 )
            // InternalExTwentyOne.g:3052:2: rule__DataAccess__Group__2__Impl rule__DataAccess__Group__3
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
    // InternalExTwentyOne.g:3059:1: rule__DataAccess__Group__2__Impl : ( '.' ) ;
    public final void rule__DataAccess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3063:1: ( ( '.' ) )
            // InternalExTwentyOne.g:3064:1: ( '.' )
            {
            // InternalExTwentyOne.g:3064:1: ( '.' )
            // InternalExTwentyOne.g:3065:2: '.'
            {
             before(grammarAccess.getDataAccessAccess().getFullStopKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3074:1: rule__DataAccess__Group__3 : rule__DataAccess__Group__3__Impl ;
    public final void rule__DataAccess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3078:1: ( rule__DataAccess__Group__3__Impl )
            // InternalExTwentyOne.g:3079:2: rule__DataAccess__Group__3__Impl
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
    // InternalExTwentyOne.g:3085:1: rule__DataAccess__Group__3__Impl : ( ( rule__DataAccess__AccessedFieldAssignment_3 ) ) ;
    public final void rule__DataAccess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3089:1: ( ( ( rule__DataAccess__AccessedFieldAssignment_3 ) ) )
            // InternalExTwentyOne.g:3090:1: ( ( rule__DataAccess__AccessedFieldAssignment_3 ) )
            {
            // InternalExTwentyOne.g:3090:1: ( ( rule__DataAccess__AccessedFieldAssignment_3 ) )
            // InternalExTwentyOne.g:3091:2: ( rule__DataAccess__AccessedFieldAssignment_3 )
            {
             before(grammarAccess.getDataAccessAccess().getAccessedFieldAssignment_3()); 
            // InternalExTwentyOne.g:3092:2: ( rule__DataAccess__AccessedFieldAssignment_3 )
            // InternalExTwentyOne.g:3092:3: rule__DataAccess__AccessedFieldAssignment_3
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
    // InternalExTwentyOne.g:3101:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3105:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // InternalExTwentyOne.g:3106:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalExTwentyOne.g:3113:1: rule__IfThenElse__Group__0__Impl : ( () ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3117:1: ( ( () ) )
            // InternalExTwentyOne.g:3118:1: ( () )
            {
            // InternalExTwentyOne.g:3118:1: ( () )
            // InternalExTwentyOne.g:3119:2: ()
            {
             before(grammarAccess.getIfThenElseAccess().getIfThenElseAction_0()); 
            // InternalExTwentyOne.g:3120:2: ()
            // InternalExTwentyOne.g:3120:3: 
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
    // InternalExTwentyOne.g:3128:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3132:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // InternalExTwentyOne.g:3133:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
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
    // InternalExTwentyOne.g:3140:1: rule__IfThenElse__Group__1__Impl : ( 'if' ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3144:1: ( ( 'if' ) )
            // InternalExTwentyOne.g:3145:1: ( 'if' )
            {
            // InternalExTwentyOne.g:3145:1: ( 'if' )
            // InternalExTwentyOne.g:3146:2: 'if'
            {
             before(grammarAccess.getIfThenElseAccess().getIfKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3155:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3159:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // InternalExTwentyOne.g:3160:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalExTwentyOne.g:3167:1: rule__IfThenElse__Group__2__Impl : ( ( rule__IfThenElse__IfLogicExpAssignment_2 ) ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3171:1: ( ( ( rule__IfThenElse__IfLogicExpAssignment_2 ) ) )
            // InternalExTwentyOne.g:3172:1: ( ( rule__IfThenElse__IfLogicExpAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3172:1: ( ( rule__IfThenElse__IfLogicExpAssignment_2 ) )
            // InternalExTwentyOne.g:3173:2: ( rule__IfThenElse__IfLogicExpAssignment_2 )
            {
             before(grammarAccess.getIfThenElseAccess().getIfLogicExpAssignment_2()); 
            // InternalExTwentyOne.g:3174:2: ( rule__IfThenElse__IfLogicExpAssignment_2 )
            // InternalExTwentyOne.g:3174:3: rule__IfThenElse__IfLogicExpAssignment_2
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
    // InternalExTwentyOne.g:3182:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3186:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // InternalExTwentyOne.g:3187:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
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
    // InternalExTwentyOne.g:3194:1: rule__IfThenElse__Group__3__Impl : ( 'then' ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3198:1: ( ( 'then' ) )
            // InternalExTwentyOne.g:3199:1: ( 'then' )
            {
            // InternalExTwentyOne.g:3199:1: ( 'then' )
            // InternalExTwentyOne.g:3200:2: 'then'
            {
             before(grammarAccess.getIfThenElseAccess().getThenKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3209:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3213:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // InternalExTwentyOne.g:3214:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalExTwentyOne.g:3221:1: rule__IfThenElse__Group__4__Impl : ( ( rule__IfThenElse__ThenExpAssignment_4 ) ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3225:1: ( ( ( rule__IfThenElse__ThenExpAssignment_4 ) ) )
            // InternalExTwentyOne.g:3226:1: ( ( rule__IfThenElse__ThenExpAssignment_4 ) )
            {
            // InternalExTwentyOne.g:3226:1: ( ( rule__IfThenElse__ThenExpAssignment_4 ) )
            // InternalExTwentyOne.g:3227:2: ( rule__IfThenElse__ThenExpAssignment_4 )
            {
             before(grammarAccess.getIfThenElseAccess().getThenExpAssignment_4()); 
            // InternalExTwentyOne.g:3228:2: ( rule__IfThenElse__ThenExpAssignment_4 )
            // InternalExTwentyOne.g:3228:3: rule__IfThenElse__ThenExpAssignment_4
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
    // InternalExTwentyOne.g:3236:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3240:1: ( rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 )
            // InternalExTwentyOne.g:3241:2: rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6
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
    // InternalExTwentyOne.g:3248:1: rule__IfThenElse__Group__5__Impl : ( 'else' ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3252:1: ( ( 'else' ) )
            // InternalExTwentyOne.g:3253:1: ( 'else' )
            {
            // InternalExTwentyOne.g:3253:1: ( 'else' )
            // InternalExTwentyOne.g:3254:2: 'else'
            {
             before(grammarAccess.getIfThenElseAccess().getElseKeyword_5()); 
            match(input,43,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3263:1: rule__IfThenElse__Group__6 : rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7 ;
    public final void rule__IfThenElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3267:1: ( rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7 )
            // InternalExTwentyOne.g:3268:2: rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalExTwentyOne.g:3275:1: rule__IfThenElse__Group__6__Impl : ( ( rule__IfThenElse__ElseExpAssignment_6 ) ) ;
    public final void rule__IfThenElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3279:1: ( ( ( rule__IfThenElse__ElseExpAssignment_6 ) ) )
            // InternalExTwentyOne.g:3280:1: ( ( rule__IfThenElse__ElseExpAssignment_6 ) )
            {
            // InternalExTwentyOne.g:3280:1: ( ( rule__IfThenElse__ElseExpAssignment_6 ) )
            // InternalExTwentyOne.g:3281:2: ( rule__IfThenElse__ElseExpAssignment_6 )
            {
             before(grammarAccess.getIfThenElseAccess().getElseExpAssignment_6()); 
            // InternalExTwentyOne.g:3282:2: ( rule__IfThenElse__ElseExpAssignment_6 )
            // InternalExTwentyOne.g:3282:3: rule__IfThenElse__ElseExpAssignment_6
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
    // InternalExTwentyOne.g:3290:1: rule__IfThenElse__Group__7 : rule__IfThenElse__Group__7__Impl ;
    public final void rule__IfThenElse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3294:1: ( rule__IfThenElse__Group__7__Impl )
            // InternalExTwentyOne.g:3295:2: rule__IfThenElse__Group__7__Impl
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
    // InternalExTwentyOne.g:3301:1: rule__IfThenElse__Group__7__Impl : ( 'end' ) ;
    public final void rule__IfThenElse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3305:1: ( ( 'end' ) )
            // InternalExTwentyOne.g:3306:1: ( 'end' )
            {
            // InternalExTwentyOne.g:3306:1: ( 'end' )
            // InternalExTwentyOne.g:3307:2: 'end'
            {
             before(grammarAccess.getIfThenElseAccess().getEndKeyword_7()); 
            match(input,44,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3317:1: rule__NewInput__Group__0 : rule__NewInput__Group__0__Impl rule__NewInput__Group__1 ;
    public final void rule__NewInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3321:1: ( rule__NewInput__Group__0__Impl rule__NewInput__Group__1 )
            // InternalExTwentyOne.g:3322:2: rule__NewInput__Group__0__Impl rule__NewInput__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalExTwentyOne.g:3329:1: rule__NewInput__Group__0__Impl : ( () ) ;
    public final void rule__NewInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3333:1: ( ( () ) )
            // InternalExTwentyOne.g:3334:1: ( () )
            {
            // InternalExTwentyOne.g:3334:1: ( () )
            // InternalExTwentyOne.g:3335:2: ()
            {
             before(grammarAccess.getNewInputAccess().getNewInputAction_0()); 
            // InternalExTwentyOne.g:3336:2: ()
            // InternalExTwentyOne.g:3336:3: 
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
    // InternalExTwentyOne.g:3344:1: rule__NewInput__Group__1 : rule__NewInput__Group__1__Impl rule__NewInput__Group__2 ;
    public final void rule__NewInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3348:1: ( rule__NewInput__Group__1__Impl rule__NewInput__Group__2 )
            // InternalExTwentyOne.g:3349:2: rule__NewInput__Group__1__Impl rule__NewInput__Group__2
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
    // InternalExTwentyOne.g:3356:1: rule__NewInput__Group__1__Impl : ( 'new' ) ;
    public final void rule__NewInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3360:1: ( ( 'new' ) )
            // InternalExTwentyOne.g:3361:1: ( 'new' )
            {
            // InternalExTwentyOne.g:3361:1: ( 'new' )
            // InternalExTwentyOne.g:3362:2: 'new'
            {
             before(grammarAccess.getNewInputAccess().getNewKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3371:1: rule__NewInput__Group__2 : rule__NewInput__Group__2__Impl rule__NewInput__Group__3 ;
    public final void rule__NewInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3375:1: ( rule__NewInput__Group__2__Impl rule__NewInput__Group__3 )
            // InternalExTwentyOne.g:3376:2: rule__NewInput__Group__2__Impl rule__NewInput__Group__3
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
    // InternalExTwentyOne.g:3383:1: rule__NewInput__Group__2__Impl : ( ( rule__NewInput__NewArrayIdAssignment_2 ) ) ;
    public final void rule__NewInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3387:1: ( ( ( rule__NewInput__NewArrayIdAssignment_2 ) ) )
            // InternalExTwentyOne.g:3388:1: ( ( rule__NewInput__NewArrayIdAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3388:1: ( ( rule__NewInput__NewArrayIdAssignment_2 ) )
            // InternalExTwentyOne.g:3389:2: ( rule__NewInput__NewArrayIdAssignment_2 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdAssignment_2()); 
            // InternalExTwentyOne.g:3390:2: ( rule__NewInput__NewArrayIdAssignment_2 )
            // InternalExTwentyOne.g:3390:3: rule__NewInput__NewArrayIdAssignment_2
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
    // InternalExTwentyOne.g:3398:1: rule__NewInput__Group__3 : rule__NewInput__Group__3__Impl rule__NewInput__Group__4 ;
    public final void rule__NewInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3402:1: ( rule__NewInput__Group__3__Impl rule__NewInput__Group__4 )
            // InternalExTwentyOne.g:3403:2: rule__NewInput__Group__3__Impl rule__NewInput__Group__4
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
    // InternalExTwentyOne.g:3410:1: rule__NewInput__Group__3__Impl : ( '[' ) ;
    public final void rule__NewInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3414:1: ( ( '[' ) )
            // InternalExTwentyOne.g:3415:1: ( '[' )
            {
            // InternalExTwentyOne.g:3415:1: ( '[' )
            // InternalExTwentyOne.g:3416:2: '['
            {
             before(grammarAccess.getNewInputAccess().getLeftSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3425:1: rule__NewInput__Group__4 : rule__NewInput__Group__4__Impl rule__NewInput__Group__5 ;
    public final void rule__NewInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3429:1: ( rule__NewInput__Group__4__Impl rule__NewInput__Group__5 )
            // InternalExTwentyOne.g:3430:2: rule__NewInput__Group__4__Impl rule__NewInput__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalExTwentyOne.g:3437:1: rule__NewInput__Group__4__Impl : ( ( rule__NewInput__NewArrayIdsAssignment_4 ) ) ;
    public final void rule__NewInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3441:1: ( ( ( rule__NewInput__NewArrayIdsAssignment_4 ) ) )
            // InternalExTwentyOne.g:3442:1: ( ( rule__NewInput__NewArrayIdsAssignment_4 ) )
            {
            // InternalExTwentyOne.g:3442:1: ( ( rule__NewInput__NewArrayIdsAssignment_4 ) )
            // InternalExTwentyOne.g:3443:2: ( rule__NewInput__NewArrayIdsAssignment_4 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_4()); 
            // InternalExTwentyOne.g:3444:2: ( rule__NewInput__NewArrayIdsAssignment_4 )
            // InternalExTwentyOne.g:3444:3: rule__NewInput__NewArrayIdsAssignment_4
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
    // InternalExTwentyOne.g:3452:1: rule__NewInput__Group__5 : rule__NewInput__Group__5__Impl rule__NewInput__Group__6 ;
    public final void rule__NewInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3456:1: ( rule__NewInput__Group__5__Impl rule__NewInput__Group__6 )
            // InternalExTwentyOne.g:3457:2: rule__NewInput__Group__5__Impl rule__NewInput__Group__6
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
    // InternalExTwentyOne.g:3464:1: rule__NewInput__Group__5__Impl : ( '=' ) ;
    public final void rule__NewInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3468:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3469:1: ( '=' )
            {
            // InternalExTwentyOne.g:3469:1: ( '=' )
            // InternalExTwentyOne.g:3470:2: '='
            {
             before(grammarAccess.getNewInputAccess().getEqualsSignKeyword_5()); 
            match(input,13,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3479:1: rule__NewInput__Group__6 : rule__NewInput__Group__6__Impl rule__NewInput__Group__7 ;
    public final void rule__NewInput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3483:1: ( rule__NewInput__Group__6__Impl rule__NewInput__Group__7 )
            // InternalExTwentyOne.g:3484:2: rule__NewInput__Group__6__Impl rule__NewInput__Group__7
            {
            pushFollow(FOLLOW_40);
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
    // InternalExTwentyOne.g:3491:1: rule__NewInput__Group__6__Impl : ( ( rule__NewInput__NewArrayExpsAssignment_6 ) ) ;
    public final void rule__NewInput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3495:1: ( ( ( rule__NewInput__NewArrayExpsAssignment_6 ) ) )
            // InternalExTwentyOne.g:3496:1: ( ( rule__NewInput__NewArrayExpsAssignment_6 ) )
            {
            // InternalExTwentyOne.g:3496:1: ( ( rule__NewInput__NewArrayExpsAssignment_6 ) )
            // InternalExTwentyOne.g:3497:2: ( rule__NewInput__NewArrayExpsAssignment_6 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_6()); 
            // InternalExTwentyOne.g:3498:2: ( rule__NewInput__NewArrayExpsAssignment_6 )
            // InternalExTwentyOne.g:3498:3: rule__NewInput__NewArrayExpsAssignment_6
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
    // InternalExTwentyOne.g:3506:1: rule__NewInput__Group__7 : rule__NewInput__Group__7__Impl rule__NewInput__Group__8 ;
    public final void rule__NewInput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3510:1: ( rule__NewInput__Group__7__Impl rule__NewInput__Group__8 )
            // InternalExTwentyOne.g:3511:2: rule__NewInput__Group__7__Impl rule__NewInput__Group__8
            {
            pushFollow(FOLLOW_40);
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
    // InternalExTwentyOne.g:3518:1: rule__NewInput__Group__7__Impl : ( ( rule__NewInput__Group_7__0 )* ) ;
    public final void rule__NewInput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3522:1: ( ( ( rule__NewInput__Group_7__0 )* ) )
            // InternalExTwentyOne.g:3523:1: ( ( rule__NewInput__Group_7__0 )* )
            {
            // InternalExTwentyOne.g:3523:1: ( ( rule__NewInput__Group_7__0 )* )
            // InternalExTwentyOne.g:3524:2: ( rule__NewInput__Group_7__0 )*
            {
             before(grammarAccess.getNewInputAccess().getGroup_7()); 
            // InternalExTwentyOne.g:3525:2: ( rule__NewInput__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExTwentyOne.g:3525:3: rule__NewInput__Group_7__0
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
    // InternalExTwentyOne.g:3533:1: rule__NewInput__Group__8 : rule__NewInput__Group__8__Impl ;
    public final void rule__NewInput__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3537:1: ( rule__NewInput__Group__8__Impl )
            // InternalExTwentyOne.g:3538:2: rule__NewInput__Group__8__Impl
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
    // InternalExTwentyOne.g:3544:1: rule__NewInput__Group__8__Impl : ( ']' ) ;
    public final void rule__NewInput__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3548:1: ( ( ']' ) )
            // InternalExTwentyOne.g:3549:1: ( ']' )
            {
            // InternalExTwentyOne.g:3549:1: ( ']' )
            // InternalExTwentyOne.g:3550:2: ']'
            {
             before(grammarAccess.getNewInputAccess().getRightSquareBracketKeyword_8()); 
            match(input,29,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3560:1: rule__NewInput__Group_7__0 : rule__NewInput__Group_7__0__Impl rule__NewInput__Group_7__1 ;
    public final void rule__NewInput__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3564:1: ( rule__NewInput__Group_7__0__Impl rule__NewInput__Group_7__1 )
            // InternalExTwentyOne.g:3565:2: rule__NewInput__Group_7__0__Impl rule__NewInput__Group_7__1
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
    // InternalExTwentyOne.g:3572:1: rule__NewInput__Group_7__0__Impl : ( ',' ) ;
    public final void rule__NewInput__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3576:1: ( ( ',' ) )
            // InternalExTwentyOne.g:3577:1: ( ',' )
            {
            // InternalExTwentyOne.g:3577:1: ( ',' )
            // InternalExTwentyOne.g:3578:2: ','
            {
             before(grammarAccess.getNewInputAccess().getCommaKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3587:1: rule__NewInput__Group_7__1 : rule__NewInput__Group_7__1__Impl rule__NewInput__Group_7__2 ;
    public final void rule__NewInput__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3591:1: ( rule__NewInput__Group_7__1__Impl rule__NewInput__Group_7__2 )
            // InternalExTwentyOne.g:3592:2: rule__NewInput__Group_7__1__Impl rule__NewInput__Group_7__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalExTwentyOne.g:3599:1: rule__NewInput__Group_7__1__Impl : ( ( rule__NewInput__NewArrayIdsAssignment_7_1 ) ) ;
    public final void rule__NewInput__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3603:1: ( ( ( rule__NewInput__NewArrayIdsAssignment_7_1 ) ) )
            // InternalExTwentyOne.g:3604:1: ( ( rule__NewInput__NewArrayIdsAssignment_7_1 ) )
            {
            // InternalExTwentyOne.g:3604:1: ( ( rule__NewInput__NewArrayIdsAssignment_7_1 ) )
            // InternalExTwentyOne.g:3605:2: ( rule__NewInput__NewArrayIdsAssignment_7_1 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_7_1()); 
            // InternalExTwentyOne.g:3606:2: ( rule__NewInput__NewArrayIdsAssignment_7_1 )
            // InternalExTwentyOne.g:3606:3: rule__NewInput__NewArrayIdsAssignment_7_1
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
    // InternalExTwentyOne.g:3614:1: rule__NewInput__Group_7__2 : rule__NewInput__Group_7__2__Impl rule__NewInput__Group_7__3 ;
    public final void rule__NewInput__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3618:1: ( rule__NewInput__Group_7__2__Impl rule__NewInput__Group_7__3 )
            // InternalExTwentyOne.g:3619:2: rule__NewInput__Group_7__2__Impl rule__NewInput__Group_7__3
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
    // InternalExTwentyOne.g:3626:1: rule__NewInput__Group_7__2__Impl : ( '=' ) ;
    public final void rule__NewInput__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3630:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3631:1: ( '=' )
            {
            // InternalExTwentyOne.g:3631:1: ( '=' )
            // InternalExTwentyOne.g:3632:2: '='
            {
             before(grammarAccess.getNewInputAccess().getEqualsSignKeyword_7_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3641:1: rule__NewInput__Group_7__3 : rule__NewInput__Group_7__3__Impl ;
    public final void rule__NewInput__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3645:1: ( rule__NewInput__Group_7__3__Impl )
            // InternalExTwentyOne.g:3646:2: rule__NewInput__Group_7__3__Impl
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
    // InternalExTwentyOne.g:3652:1: rule__NewInput__Group_7__3__Impl : ( ( rule__NewInput__NewArrayExpsAssignment_7_3 ) ) ;
    public final void rule__NewInput__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3656:1: ( ( ( rule__NewInput__NewArrayExpsAssignment_7_3 ) ) )
            // InternalExTwentyOne.g:3657:1: ( ( rule__NewInput__NewArrayExpsAssignment_7_3 ) )
            {
            // InternalExTwentyOne.g:3657:1: ( ( rule__NewInput__NewArrayExpsAssignment_7_3 ) )
            // InternalExTwentyOne.g:3658:2: ( rule__NewInput__NewArrayExpsAssignment_7_3 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_7_3()); 
            // InternalExTwentyOne.g:3659:2: ( rule__NewInput__NewArrayExpsAssignment_7_3 )
            // InternalExTwentyOne.g:3659:3: rule__NewInput__NewArrayExpsAssignment_7_3
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
    // InternalExTwentyOne.g:3668:1: rule__LetBinding__Group__0 : rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 ;
    public final void rule__LetBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3672:1: ( rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 )
            // InternalExTwentyOne.g:3673:2: rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalExTwentyOne.g:3680:1: rule__LetBinding__Group__0__Impl : ( () ) ;
    public final void rule__LetBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3684:1: ( ( () ) )
            // InternalExTwentyOne.g:3685:1: ( () )
            {
            // InternalExTwentyOne.g:3685:1: ( () )
            // InternalExTwentyOne.g:3686:2: ()
            {
             before(grammarAccess.getLetBindingAccess().getLetBindingAction_0()); 
            // InternalExTwentyOne.g:3687:2: ()
            // InternalExTwentyOne.g:3687:3: 
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
    // InternalExTwentyOne.g:3695:1: rule__LetBinding__Group__1 : rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 ;
    public final void rule__LetBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3699:1: ( rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 )
            // InternalExTwentyOne.g:3700:2: rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2
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
    // InternalExTwentyOne.g:3707:1: rule__LetBinding__Group__1__Impl : ( 'let' ) ;
    public final void rule__LetBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3711:1: ( ( 'let' ) )
            // InternalExTwentyOne.g:3712:1: ( 'let' )
            {
            // InternalExTwentyOne.g:3712:1: ( 'let' )
            // InternalExTwentyOne.g:3713:2: 'let'
            {
             before(grammarAccess.getLetBindingAccess().getLetKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3722:1: rule__LetBinding__Group__2 : rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 ;
    public final void rule__LetBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3726:1: ( rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 )
            // InternalExTwentyOne.g:3727:2: rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalExTwentyOne.g:3734:1: rule__LetBinding__Group__2__Impl : ( ( rule__LetBinding__NameAssignment_2 ) ) ;
    public final void rule__LetBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3738:1: ( ( ( rule__LetBinding__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:3739:1: ( ( rule__LetBinding__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3739:1: ( ( rule__LetBinding__NameAssignment_2 ) )
            // InternalExTwentyOne.g:3740:2: ( rule__LetBinding__NameAssignment_2 )
            {
             before(grammarAccess.getLetBindingAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:3741:2: ( rule__LetBinding__NameAssignment_2 )
            // InternalExTwentyOne.g:3741:3: rule__LetBinding__NameAssignment_2
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
    // InternalExTwentyOne.g:3749:1: rule__LetBinding__Group__3 : rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 ;
    public final void rule__LetBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3753:1: ( rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 )
            // InternalExTwentyOne.g:3754:2: rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4
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
    // InternalExTwentyOne.g:3761:1: rule__LetBinding__Group__3__Impl : ( '=' ) ;
    public final void rule__LetBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3765:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3766:1: ( '=' )
            {
            // InternalExTwentyOne.g:3766:1: ( '=' )
            // InternalExTwentyOne.g:3767:2: '='
            {
             before(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3776:1: rule__LetBinding__Group__4 : rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 ;
    public final void rule__LetBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3780:1: ( rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 )
            // InternalExTwentyOne.g:3781:2: rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalExTwentyOne.g:3788:1: rule__LetBinding__Group__4__Impl : ( ( rule__LetBinding__BindingAssignment_4 ) ) ;
    public final void rule__LetBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3792:1: ( ( ( rule__LetBinding__BindingAssignment_4 ) ) )
            // InternalExTwentyOne.g:3793:1: ( ( rule__LetBinding__BindingAssignment_4 ) )
            {
            // InternalExTwentyOne.g:3793:1: ( ( rule__LetBinding__BindingAssignment_4 ) )
            // InternalExTwentyOne.g:3794:2: ( rule__LetBinding__BindingAssignment_4 )
            {
             before(grammarAccess.getLetBindingAccess().getBindingAssignment_4()); 
            // InternalExTwentyOne.g:3795:2: ( rule__LetBinding__BindingAssignment_4 )
            // InternalExTwentyOne.g:3795:3: rule__LetBinding__BindingAssignment_4
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
    // InternalExTwentyOne.g:3803:1: rule__LetBinding__Group__5 : rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 ;
    public final void rule__LetBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3807:1: ( rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 )
            // InternalExTwentyOne.g:3808:2: rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6
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
    // InternalExTwentyOne.g:3815:1: rule__LetBinding__Group__5__Impl : ( 'in' ) ;
    public final void rule__LetBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3819:1: ( ( 'in' ) )
            // InternalExTwentyOne.g:3820:1: ( 'in' )
            {
            // InternalExTwentyOne.g:3820:1: ( 'in' )
            // InternalExTwentyOne.g:3821:2: 'in'
            {
             before(grammarAccess.getLetBindingAccess().getInKeyword_5()); 
            match(input,47,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3830:1: rule__LetBinding__Group__6 : rule__LetBinding__Group__6__Impl rule__LetBinding__Group__7 ;
    public final void rule__LetBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3834:1: ( rule__LetBinding__Group__6__Impl rule__LetBinding__Group__7 )
            // InternalExTwentyOne.g:3835:2: rule__LetBinding__Group__6__Impl rule__LetBinding__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalExTwentyOne.g:3842:1: rule__LetBinding__Group__6__Impl : ( ( rule__LetBinding__BodyAssignment_6 ) ) ;
    public final void rule__LetBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3846:1: ( ( ( rule__LetBinding__BodyAssignment_6 ) ) )
            // InternalExTwentyOne.g:3847:1: ( ( rule__LetBinding__BodyAssignment_6 ) )
            {
            // InternalExTwentyOne.g:3847:1: ( ( rule__LetBinding__BodyAssignment_6 ) )
            // InternalExTwentyOne.g:3848:2: ( rule__LetBinding__BodyAssignment_6 )
            {
             before(grammarAccess.getLetBindingAccess().getBodyAssignment_6()); 
            // InternalExTwentyOne.g:3849:2: ( rule__LetBinding__BodyAssignment_6 )
            // InternalExTwentyOne.g:3849:3: rule__LetBinding__BodyAssignment_6
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
    // InternalExTwentyOne.g:3857:1: rule__LetBinding__Group__7 : rule__LetBinding__Group__7__Impl ;
    public final void rule__LetBinding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3861:1: ( rule__LetBinding__Group__7__Impl )
            // InternalExTwentyOne.g:3862:2: rule__LetBinding__Group__7__Impl
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
    // InternalExTwentyOne.g:3868:1: rule__LetBinding__Group__7__Impl : ( 'end' ) ;
    public final void rule__LetBinding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3872:1: ( ( 'end' ) )
            // InternalExTwentyOne.g:3873:1: ( 'end' )
            {
            // InternalExTwentyOne.g:3873:1: ( 'end' )
            // InternalExTwentyOne.g:3874:2: 'end'
            {
             before(grammarAccess.getLetBindingAccess().getEndKeyword_7()); 
            match(input,44,FOLLOW_2); 
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
    // InternalExTwentyOne.g:3884:1: rule__LogicExp__Group__0 : rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 ;
    public final void rule__LogicExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3888:1: ( rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 )
            // InternalExTwentyOne.g:3889:2: rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalExTwentyOne.g:3896:1: rule__LogicExp__Group__0__Impl : ( ( rule__LogicExp__LeftLogicAssignment_0 ) ) ;
    public final void rule__LogicExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3900:1: ( ( ( rule__LogicExp__LeftLogicAssignment_0 ) ) )
            // InternalExTwentyOne.g:3901:1: ( ( rule__LogicExp__LeftLogicAssignment_0 ) )
            {
            // InternalExTwentyOne.g:3901:1: ( ( rule__LogicExp__LeftLogicAssignment_0 ) )
            // InternalExTwentyOne.g:3902:2: ( rule__LogicExp__LeftLogicAssignment_0 )
            {
             before(grammarAccess.getLogicExpAccess().getLeftLogicAssignment_0()); 
            // InternalExTwentyOne.g:3903:2: ( rule__LogicExp__LeftLogicAssignment_0 )
            // InternalExTwentyOne.g:3903:3: rule__LogicExp__LeftLogicAssignment_0
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
    // InternalExTwentyOne.g:3911:1: rule__LogicExp__Group__1 : rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 ;
    public final void rule__LogicExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3915:1: ( rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 )
            // InternalExTwentyOne.g:3916:2: rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2
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
    // InternalExTwentyOne.g:3923:1: rule__LogicExp__Group__1__Impl : ( ( rule__LogicExp__Alternatives_1 ) ) ;
    public final void rule__LogicExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3927:1: ( ( ( rule__LogicExp__Alternatives_1 ) ) )
            // InternalExTwentyOne.g:3928:1: ( ( rule__LogicExp__Alternatives_1 ) )
            {
            // InternalExTwentyOne.g:3928:1: ( ( rule__LogicExp__Alternatives_1 ) )
            // InternalExTwentyOne.g:3929:2: ( rule__LogicExp__Alternatives_1 )
            {
             before(grammarAccess.getLogicExpAccess().getAlternatives_1()); 
            // InternalExTwentyOne.g:3930:2: ( rule__LogicExp__Alternatives_1 )
            // InternalExTwentyOne.g:3930:3: rule__LogicExp__Alternatives_1
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
    // InternalExTwentyOne.g:3938:1: rule__LogicExp__Group__2 : rule__LogicExp__Group__2__Impl ;
    public final void rule__LogicExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3942:1: ( rule__LogicExp__Group__2__Impl )
            // InternalExTwentyOne.g:3943:2: rule__LogicExp__Group__2__Impl
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
    // InternalExTwentyOne.g:3949:1: rule__LogicExp__Group__2__Impl : ( ( rule__LogicExp__RightLogicAssignment_2 ) ) ;
    public final void rule__LogicExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3953:1: ( ( ( rule__LogicExp__RightLogicAssignment_2 ) ) )
            // InternalExTwentyOne.g:3954:1: ( ( rule__LogicExp__RightLogicAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3954:1: ( ( rule__LogicExp__RightLogicAssignment_2 ) )
            // InternalExTwentyOne.g:3955:2: ( rule__LogicExp__RightLogicAssignment_2 )
            {
             before(grammarAccess.getLogicExpAccess().getRightLogicAssignment_2()); 
            // InternalExTwentyOne.g:3956:2: ( rule__LogicExp__RightLogicAssignment_2 )
            // InternalExTwentyOne.g:3956:3: rule__LogicExp__RightLogicAssignment_2
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
    // InternalExTwentyOne.g:3965:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3969:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3970:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3970:2: ( RULE_ID )
            // InternalExTwentyOne.g:3971:3: RULE_ID
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
    // InternalExTwentyOne.g:3980:1: rule__Program__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Program__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3984:1: ( ( ruleDeclaration ) )
            // InternalExTwentyOne.g:3985:2: ( ruleDeclaration )
            {
            // InternalExTwentyOne.g:3985:2: ( ruleDeclaration )
            // InternalExTwentyOne.g:3986:3: ruleDeclaration
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
    // InternalExTwentyOne.g:3995:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3999:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4000:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4000:2: ( RULE_ID )
            // InternalExTwentyOne.g:4001:3: RULE_ID
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
    // InternalExTwentyOne.g:4010:1: rule__Function__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4014:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4015:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4015:2: ( RULE_ID )
            // InternalExTwentyOne.g:4016:3: RULE_ID
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
    // InternalExTwentyOne.g:4025:1: rule__Function__LambdaAssignment_3 : ( ruleLambda ) ;
    public final void rule__Function__LambdaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4029:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:4030:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:4030:2: ( ruleLambda )
            // InternalExTwentyOne.g:4031:3: ruleLambda
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
    // InternalExTwentyOne.g:4040:1: rule__Lambda__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Lambda__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4044:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4045:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4045:2: ( RULE_ID )
            // InternalExTwentyOne.g:4046:3: RULE_ID
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
    // InternalExTwentyOne.g:4055:1: rule__Lambda__LambdaExpAssignment_7 : ( ruleExp ) ;
    public final void rule__Lambda__LambdaExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4059:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4060:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4060:2: ( ruleExp )
            // InternalExTwentyOne.g:4061:3: ruleExp
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
    // InternalExTwentyOne.g:4070:1: rule__Input__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4074:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4075:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4075:2: ( RULE_ID )
            // InternalExTwentyOne.g:4076:3: RULE_ID
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
    // InternalExTwentyOne.g:4085:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4089:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4090:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4090:2: ( RULE_ID )
            // InternalExTwentyOne.g:4091:3: RULE_ID
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
    // InternalExTwentyOne.g:4100:1: rule__Node__FunctionAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__FunctionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4104:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:4105:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:4105:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4106:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_4_0_0()); 
            // InternalExTwentyOne.g:4107:3: ( RULE_ID )
            // InternalExTwentyOne.g:4108:4: RULE_ID
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
    // InternalExTwentyOne.g:4119:1: rule__Node__LambdaAssignment_4_1 : ( ruleLambda ) ;
    public final void rule__Node__LambdaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4123:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:4124:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:4124:2: ( ruleLambda )
            // InternalExTwentyOne.g:4125:3: ruleLambda
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
    // InternalExTwentyOne.g:4134:1: rule__Stream__InputsOrNodesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsOrNodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4138:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:4139:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:4139:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4140:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_2_0()); 
            // InternalExTwentyOne.g:4141:3: ( RULE_ID )
            // InternalExTwentyOne.g:4142:4: RULE_ID
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
    // InternalExTwentyOne.g:4153:1: rule__Stream__InputsOrNodesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsOrNodesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4157:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:4158:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:4158:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4159:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_3_1_0()); 
            // InternalExTwentyOne.g:4160:3: ( RULE_ID )
            // InternalExTwentyOne.g:4161:4: RULE_ID
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
    // InternalExTwentyOne.g:4172:1: rule__Stream__ElementsAssignment_4_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4176:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:4177:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:4177:2: ( ruleElement )
            // InternalExTwentyOne.g:4178:3: ruleElement
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
    // InternalExTwentyOne.g:4187:1: rule__Stream__ElementsAssignment_4_2_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4191:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:4192:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:4192:2: ( ruleElement )
            // InternalExTwentyOne.g:4193:3: ruleElement
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
    // InternalExTwentyOne.g:4202:1: rule__Element__ElementAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Element__ElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4206:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4207:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4207:2: ( RULE_ID )
            // InternalExTwentyOne.g:4208:3: RULE_ID
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
    // InternalExTwentyOne.g:4217:1: rule__Element__NodeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Element__NodeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4221:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:4222:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:4222:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4223:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getNodeNodeOrFunctionCrossReference_1_1_0_0()); 
            // InternalExTwentyOne.g:4224:3: ( RULE_ID )
            // InternalExTwentyOne.g:4225:4: RULE_ID
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
    // InternalExTwentyOne.g:4236:1: rule__Element__OutputAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Element__OutputAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4240:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4241:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4241:2: ( RULE_ID )
            // InternalExTwentyOne.g:4242:3: RULE_ID
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
    // InternalExTwentyOne.g:4251:1: rule__DataDecl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4255:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4256:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4256:2: ( RULE_ID )
            // InternalExTwentyOne.g:4257:3: RULE_ID
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
    // InternalExTwentyOne.g:4266:1: rule__DataDecl__DataAssignment_4 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4270:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4271:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4271:2: ( RULE_ID )
            // InternalExTwentyOne.g:4272:3: RULE_ID
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
    // InternalExTwentyOne.g:4281:1: rule__DataDecl__DataAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4285:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4286:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4286:2: ( RULE_ID )
            // InternalExTwentyOne.g:4287:3: RULE_ID
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


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalExTwentyOne.g:4296:1: rule__Exp__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4300:1: ( ( rulePrimary ) )
            // InternalExTwentyOne.g:4301:2: ( rulePrimary )
            {
            // InternalExTwentyOne.g:4301:2: ( rulePrimary )
            // InternalExTwentyOne.g:4302:3: rulePrimary
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


    // $ANTLR start "rule__DataAccess__AccessedDataAssignment_1"
    // InternalExTwentyOne.g:4311:1: rule__DataAccess__AccessedDataAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataAccess__AccessedDataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4315:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4316:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4316:2: ( RULE_ID )
            // InternalExTwentyOne.g:4317:3: RULE_ID
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
    // InternalExTwentyOne.g:4326:1: rule__DataAccess__AccessedFieldAssignment_3 : ( RULE_ID ) ;
    public final void rule__DataAccess__AccessedFieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4330:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4331:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4331:2: ( RULE_ID )
            // InternalExTwentyOne.g:4332:3: RULE_ID
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
    // InternalExTwentyOne.g:4341:1: rule__IfThenElse__IfLogicExpAssignment_2 : ( ruleLogicExp ) ;
    public final void rule__IfThenElse__IfLogicExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4345:1: ( ( ruleLogicExp ) )
            // InternalExTwentyOne.g:4346:2: ( ruleLogicExp )
            {
            // InternalExTwentyOne.g:4346:2: ( ruleLogicExp )
            // InternalExTwentyOne.g:4347:3: ruleLogicExp
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
    // InternalExTwentyOne.g:4356:1: rule__IfThenElse__ThenExpAssignment_4 : ( ruleExp ) ;
    public final void rule__IfThenElse__ThenExpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4360:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4361:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4361:2: ( ruleExp )
            // InternalExTwentyOne.g:4362:3: ruleExp
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
    // InternalExTwentyOne.g:4371:1: rule__IfThenElse__ElseExpAssignment_6 : ( ruleExp ) ;
    public final void rule__IfThenElse__ElseExpAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4375:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4376:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4376:2: ( ruleExp )
            // InternalExTwentyOne.g:4377:3: ruleExp
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
    // InternalExTwentyOne.g:4386:1: rule__NewInput__NewArrayIdAssignment_2 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4390:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4391:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4391:2: ( RULE_ID )
            // InternalExTwentyOne.g:4392:3: RULE_ID
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
    // InternalExTwentyOne.g:4401:1: rule__NewInput__NewArrayIdsAssignment_4 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4405:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4406:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4406:2: ( RULE_ID )
            // InternalExTwentyOne.g:4407:3: RULE_ID
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
    // InternalExTwentyOne.g:4416:1: rule__NewInput__NewArrayExpsAssignment_6 : ( ruleExp ) ;
    public final void rule__NewInput__NewArrayExpsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4420:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4421:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4421:2: ( ruleExp )
            // InternalExTwentyOne.g:4422:3: ruleExp
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
    // InternalExTwentyOne.g:4431:1: rule__NewInput__NewArrayIdsAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4435:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4436:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4436:2: ( RULE_ID )
            // InternalExTwentyOne.g:4437:3: RULE_ID
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
    // InternalExTwentyOne.g:4446:1: rule__NewInput__NewArrayExpsAssignment_7_3 : ( ruleExp ) ;
    public final void rule__NewInput__NewArrayExpsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4450:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4451:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4451:2: ( ruleExp )
            // InternalExTwentyOne.g:4452:3: ruleExp
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
    // InternalExTwentyOne.g:4461:1: rule__LetBinding__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LetBinding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4465:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4466:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4466:2: ( RULE_ID )
            // InternalExTwentyOne.g:4467:3: RULE_ID
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
    // InternalExTwentyOne.g:4476:1: rule__LetBinding__BindingAssignment_4 : ( ruleExp ) ;
    public final void rule__LetBinding__BindingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4480:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4481:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4481:2: ( ruleExp )
            // InternalExTwentyOne.g:4482:3: ruleExp
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
    // InternalExTwentyOne.g:4491:1: rule__LetBinding__BodyAssignment_6 : ( ruleExp ) ;
    public final void rule__LetBinding__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4495:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4496:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4496:2: ( ruleExp )
            // InternalExTwentyOne.g:4497:3: ruleExp
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
    // InternalExTwentyOne.g:4506:1: rule__LogicExp__LeftLogicAssignment_0 : ( ruleExp ) ;
    public final void rule__LogicExp__LeftLogicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4510:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4511:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4511:2: ( ruleExp )
            // InternalExTwentyOne.g:4512:3: ruleExp
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
    // InternalExTwentyOne.g:4521:1: rule__LogicExp__RightLogicAssignment_2 : ( ruleExp ) ;
    public final void rule__LogicExp__RightLogicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4525:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4526:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4526:2: ( ruleExp )
            // InternalExTwentyOne.g:4527:3: ruleExp
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000044C280000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000044C280002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000628000401830L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000210000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000000003E000L});

}