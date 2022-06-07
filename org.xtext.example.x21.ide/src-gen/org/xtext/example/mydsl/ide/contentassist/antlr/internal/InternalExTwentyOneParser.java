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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'none'", "'='", "'<'", "'>'", "'<='", "'>='", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'+'", "'-'", "'*'", "'/'", "'if'", "'then'", "'else'", "'end'", "'new'", "'let'", "'in'"
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


    // $ANTLR start "entryRuleIfThenElse"
    // InternalExTwentyOne.g:378:1: entryRuleIfThenElse : ruleIfThenElse EOF ;
    public final void entryRuleIfThenElse() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:379:1: ( ruleIfThenElse EOF )
            // InternalExTwentyOne.g:380:1: ruleIfThenElse EOF
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
    // InternalExTwentyOne.g:387:1: ruleIfThenElse : ( ( rule__IfThenElse__Group__0 ) ) ;
    public final void ruleIfThenElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:391:2: ( ( ( rule__IfThenElse__Group__0 ) ) )
            // InternalExTwentyOne.g:392:2: ( ( rule__IfThenElse__Group__0 ) )
            {
            // InternalExTwentyOne.g:392:2: ( ( rule__IfThenElse__Group__0 ) )
            // InternalExTwentyOne.g:393:3: ( rule__IfThenElse__Group__0 )
            {
             before(grammarAccess.getIfThenElseAccess().getGroup()); 
            // InternalExTwentyOne.g:394:3: ( rule__IfThenElse__Group__0 )
            // InternalExTwentyOne.g:394:4: rule__IfThenElse__Group__0
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
    // InternalExTwentyOne.g:403:1: entryRuleNewInput : ruleNewInput EOF ;
    public final void entryRuleNewInput() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:404:1: ( ruleNewInput EOF )
            // InternalExTwentyOne.g:405:1: ruleNewInput EOF
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
    // InternalExTwentyOne.g:412:1: ruleNewInput : ( ( rule__NewInput__Group__0 ) ) ;
    public final void ruleNewInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:416:2: ( ( ( rule__NewInput__Group__0 ) ) )
            // InternalExTwentyOne.g:417:2: ( ( rule__NewInput__Group__0 ) )
            {
            // InternalExTwentyOne.g:417:2: ( ( rule__NewInput__Group__0 ) )
            // InternalExTwentyOne.g:418:3: ( rule__NewInput__Group__0 )
            {
             before(grammarAccess.getNewInputAccess().getGroup()); 
            // InternalExTwentyOne.g:419:3: ( rule__NewInput__Group__0 )
            // InternalExTwentyOne.g:419:4: rule__NewInput__Group__0
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
    // InternalExTwentyOne.g:428:1: entryRuleLetBinding : ruleLetBinding EOF ;
    public final void entryRuleLetBinding() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:429:1: ( ruleLetBinding EOF )
            // InternalExTwentyOne.g:430:1: ruleLetBinding EOF
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
    // InternalExTwentyOne.g:437:1: ruleLetBinding : ( ( rule__LetBinding__Group__0 ) ) ;
    public final void ruleLetBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:441:2: ( ( ( rule__LetBinding__Group__0 ) ) )
            // InternalExTwentyOne.g:442:2: ( ( rule__LetBinding__Group__0 ) )
            {
            // InternalExTwentyOne.g:442:2: ( ( rule__LetBinding__Group__0 ) )
            // InternalExTwentyOne.g:443:3: ( rule__LetBinding__Group__0 )
            {
             before(grammarAccess.getLetBindingAccess().getGroup()); 
            // InternalExTwentyOne.g:444:3: ( rule__LetBinding__Group__0 )
            // InternalExTwentyOne.g:444:4: rule__LetBinding__Group__0
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
    // InternalExTwentyOne.g:453:1: entryRuleLogicExp : ruleLogicExp EOF ;
    public final void entryRuleLogicExp() throws RecognitionException {
        try {
            // InternalExTwentyOne.g:454:1: ( ruleLogicExp EOF )
            // InternalExTwentyOne.g:455:1: ruleLogicExp EOF
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
    // InternalExTwentyOne.g:462:1: ruleLogicExp : ( ( rule__LogicExp__Group__0 ) ) ;
    public final void ruleLogicExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:466:2: ( ( ( rule__LogicExp__Group__0 ) ) )
            // InternalExTwentyOne.g:467:2: ( ( rule__LogicExp__Group__0 ) )
            {
            // InternalExTwentyOne.g:467:2: ( ( rule__LogicExp__Group__0 ) )
            // InternalExTwentyOne.g:468:3: ( rule__LogicExp__Group__0 )
            {
             before(grammarAccess.getLogicExpAccess().getGroup()); 
            // InternalExTwentyOne.g:469:3: ( rule__LogicExp__Group__0 )
            // InternalExTwentyOne.g:469:4: rule__LogicExp__Group__0
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
    // InternalExTwentyOne.g:477:1: rule__Declaration__Alternatives : ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:481:1: ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) )
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
                    // InternalExTwentyOne.g:482:2: ( ruleFunction )
                    {
                    // InternalExTwentyOne.g:482:2: ( ruleFunction )
                    // InternalExTwentyOne.g:483:3: ruleFunction
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
                    // InternalExTwentyOne.g:488:2: ( ruleInput )
                    {
                    // InternalExTwentyOne.g:488:2: ( ruleInput )
                    // InternalExTwentyOne.g:489:3: ruleInput
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
                    // InternalExTwentyOne.g:494:2: ( ruleNode )
                    {
                    // InternalExTwentyOne.g:494:2: ( ruleNode )
                    // InternalExTwentyOne.g:495:3: ruleNode
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
                    // InternalExTwentyOne.g:500:2: ( ruleStream )
                    {
                    // InternalExTwentyOne.g:500:2: ( ruleStream )
                    // InternalExTwentyOne.g:501:3: ruleStream
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
                    // InternalExTwentyOne.g:506:2: ( ruleDataDecl )
                    {
                    // InternalExTwentyOne.g:506:2: ( ruleDataDecl )
                    // InternalExTwentyOne.g:507:3: ruleDataDecl
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
                    // InternalExTwentyOne.g:512:2: ( ruleParameter )
                    {
                    // InternalExTwentyOne.g:512:2: ( ruleParameter )
                    // InternalExTwentyOne.g:513:3: ruleParameter
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
    // InternalExTwentyOne.g:522:1: rule__Node__Alternatives_4 : ( ( ( rule__Node__FunctionAssignment_4_0 ) ) | ( ( rule__Node__LambdaAssignment_4_1 ) ) );
    public final void rule__Node__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:526:1: ( ( ( rule__Node__FunctionAssignment_4_0 ) ) | ( ( rule__Node__LambdaAssignment_4_1 ) ) )
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
                    // InternalExTwentyOne.g:527:2: ( ( rule__Node__FunctionAssignment_4_0 ) )
                    {
                    // InternalExTwentyOne.g:527:2: ( ( rule__Node__FunctionAssignment_4_0 ) )
                    // InternalExTwentyOne.g:528:3: ( rule__Node__FunctionAssignment_4_0 )
                    {
                     before(grammarAccess.getNodeAccess().getFunctionAssignment_4_0()); 
                    // InternalExTwentyOne.g:529:3: ( rule__Node__FunctionAssignment_4_0 )
                    // InternalExTwentyOne.g:529:4: rule__Node__FunctionAssignment_4_0
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
                    // InternalExTwentyOne.g:533:2: ( ( rule__Node__LambdaAssignment_4_1 ) )
                    {
                    // InternalExTwentyOne.g:533:2: ( ( rule__Node__LambdaAssignment_4_1 ) )
                    // InternalExTwentyOne.g:534:3: ( rule__Node__LambdaAssignment_4_1 )
                    {
                     before(grammarAccess.getNodeAccess().getLambdaAssignment_4_1()); 
                    // InternalExTwentyOne.g:535:3: ( rule__Node__LambdaAssignment_4_1 )
                    // InternalExTwentyOne.g:535:4: rule__Node__LambdaAssignment_4_1
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
    // InternalExTwentyOne.g:543:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:547:1: ( ( ( rule__Element__Group_0__0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) )
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
                    // InternalExTwentyOne.g:548:2: ( ( rule__Element__Group_0__0 ) )
                    {
                    // InternalExTwentyOne.g:548:2: ( ( rule__Element__Group_0__0 ) )
                    // InternalExTwentyOne.g:549:3: ( rule__Element__Group_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_0()); 
                    // InternalExTwentyOne.g:550:3: ( rule__Element__Group_0__0 )
                    // InternalExTwentyOne.g:550:4: rule__Element__Group_0__0
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
                    // InternalExTwentyOne.g:554:2: ( ( rule__Element__Group_1__0 ) )
                    {
                    // InternalExTwentyOne.g:554:2: ( ( rule__Element__Group_1__0 ) )
                    // InternalExTwentyOne.g:555:3: ( rule__Element__Group_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1()); 
                    // InternalExTwentyOne.g:556:3: ( rule__Element__Group_1__0 )
                    // InternalExTwentyOne.g:556:4: rule__Element__Group_1__0
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
                    // InternalExTwentyOne.g:560:2: ( ( rule__Element__Group_2__0 ) )
                    {
                    // InternalExTwentyOne.g:560:2: ( ( rule__Element__Group_2__0 ) )
                    // InternalExTwentyOne.g:561:3: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // InternalExTwentyOne.g:562:3: ( rule__Element__Group_2__0 )
                    // InternalExTwentyOne.g:562:4: rule__Element__Group_2__0
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
    // InternalExTwentyOne.g:570:1: rule__Element__Alternatives_1_1 : ( ( ( rule__Element__NodeAssignment_1_1_0 ) ) | ( ruleLambda ) );
    public final void rule__Element__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:574:1: ( ( ( rule__Element__NodeAssignment_1_1_0 ) ) | ( ruleLambda ) )
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
                    // InternalExTwentyOne.g:575:2: ( ( rule__Element__NodeAssignment_1_1_0 ) )
                    {
                    // InternalExTwentyOne.g:575:2: ( ( rule__Element__NodeAssignment_1_1_0 ) )
                    // InternalExTwentyOne.g:576:3: ( rule__Element__NodeAssignment_1_1_0 )
                    {
                     before(grammarAccess.getElementAccess().getNodeAssignment_1_1_0()); 
                    // InternalExTwentyOne.g:577:3: ( rule__Element__NodeAssignment_1_1_0 )
                    // InternalExTwentyOne.g:577:4: rule__Element__NodeAssignment_1_1_0
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
                    // InternalExTwentyOne.g:581:2: ( ruleLambda )
                    {
                    // InternalExTwentyOne.g:581:2: ( ruleLambda )
                    // InternalExTwentyOne.g:582:3: ruleLambda
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
    // InternalExTwentyOne.g:591:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:595:1: ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) | ( RULE_INT ) )
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
                    // InternalExTwentyOne.g:596:2: ( 'int' )
                    {
                    // InternalExTwentyOne.g:596:2: ( 'int' )
                    // InternalExTwentyOne.g:597:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:602:2: ( 'string' )
                    {
                    // InternalExTwentyOne.g:602:2: ( 'string' )
                    // InternalExTwentyOne.g:603:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:608:2: ( RULE_ID )
                    {
                    // InternalExTwentyOne.g:608:2: ( RULE_ID )
                    // InternalExTwentyOne.g:609:3: RULE_ID
                    {
                     before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:614:2: ( RULE_INT )
                    {
                    // InternalExTwentyOne.g:614:2: ( RULE_INT )
                    // InternalExTwentyOne.g:615:3: RULE_INT
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
    // InternalExTwentyOne.g:624:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) | ( ( rule__Exp__Group_1_0_2__0 ) ) | ( ( rule__Exp__Group_1_0_3__0 ) ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:628:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) | ( ( rule__Exp__Group_1_0_2__0 ) ) | ( ( rule__Exp__Group_1_0_3__0 ) ) )
            int alt6=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalExTwentyOne.g:629:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalExTwentyOne.g:629:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalExTwentyOne.g:630:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalExTwentyOne.g:631:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalExTwentyOne.g:631:4: rule__Exp__Group_1_0_0__0
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
                    // InternalExTwentyOne.g:635:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    {
                    // InternalExTwentyOne.g:635:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    // InternalExTwentyOne.g:636:3: ( rule__Exp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_1()); 
                    // InternalExTwentyOne.g:637:3: ( rule__Exp__Group_1_0_1__0 )
                    // InternalExTwentyOne.g:637:4: rule__Exp__Group_1_0_1__0
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
                    // InternalExTwentyOne.g:641:2: ( ( rule__Exp__Group_1_0_2__0 ) )
                    {
                    // InternalExTwentyOne.g:641:2: ( ( rule__Exp__Group_1_0_2__0 ) )
                    // InternalExTwentyOne.g:642:3: ( rule__Exp__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_2()); 
                    // InternalExTwentyOne.g:643:3: ( rule__Exp__Group_1_0_2__0 )
                    // InternalExTwentyOne.g:643:4: rule__Exp__Group_1_0_2__0
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
                    // InternalExTwentyOne.g:647:2: ( ( rule__Exp__Group_1_0_3__0 ) )
                    {
                    // InternalExTwentyOne.g:647:2: ( ( rule__Exp__Group_1_0_3__0 ) )
                    // InternalExTwentyOne.g:648:3: ( rule__Exp__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_3()); 
                    // InternalExTwentyOne.g:649:3: ( rule__Exp__Group_1_0_3__0 )
                    // InternalExTwentyOne.g:649:4: rule__Exp__Group_1_0_3__0
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
    // InternalExTwentyOne.g:657:1: rule__Primary__Alternatives : ( ( ruleType ) | ( ruleLetBinding ) | ( ruleIfThenElse ) | ( 'none' ) | ( ( rule__Primary__Group_4__0 ) ) | ( ruleNewInput ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:661:1: ( ( ruleType ) | ( ruleLetBinding ) | ( ruleIfThenElse ) | ( 'none' ) | ( ( rule__Primary__Group_4__0 ) ) | ( ruleNewInput ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case 11:
            case 12:
                {
                alt7=1;
                }
                break;
            case 45:
                {
                alt7=2;
                }
                break;
            case 40:
                {
                alt7=3;
                }
                break;
            case 13:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 44:
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
                    // InternalExTwentyOne.g:662:2: ( ruleType )
                    {
                    // InternalExTwentyOne.g:662:2: ( ruleType )
                    // InternalExTwentyOne.g:663:3: ruleType
                    {
                     before(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:668:2: ( ruleLetBinding )
                    {
                    // InternalExTwentyOne.g:668:2: ( ruleLetBinding )
                    // InternalExTwentyOne.g:669:3: ruleLetBinding
                    {
                     before(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLetBinding();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:674:2: ( ruleIfThenElse )
                    {
                    // InternalExTwentyOne.g:674:2: ( ruleIfThenElse )
                    // InternalExTwentyOne.g:675:3: ruleIfThenElse
                    {
                     before(grammarAccess.getPrimaryAccess().getIfThenElseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIfThenElse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getIfThenElseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:680:2: ( 'none' )
                    {
                    // InternalExTwentyOne.g:680:2: ( 'none' )
                    // InternalExTwentyOne.g:681:3: 'none'
                    {
                     before(grammarAccess.getPrimaryAccess().getNoneKeyword_3()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPrimaryAccess().getNoneKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:686:2: ( ( rule__Primary__Group_4__0 ) )
                    {
                    // InternalExTwentyOne.g:686:2: ( ( rule__Primary__Group_4__0 ) )
                    // InternalExTwentyOne.g:687:3: ( rule__Primary__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_4()); 
                    // InternalExTwentyOne.g:688:3: ( rule__Primary__Group_4__0 )
                    // InternalExTwentyOne.g:688:4: rule__Primary__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalExTwentyOne.g:692:2: ( ruleNewInput )
                    {
                    // InternalExTwentyOne.g:692:2: ( ruleNewInput )
                    // InternalExTwentyOne.g:693:3: ruleNewInput
                    {
                     before(grammarAccess.getPrimaryAccess().getNewInputParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNewInput();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNewInputParserRuleCall_5()); 

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
    // InternalExTwentyOne.g:702:1: rule__LogicExp__Alternatives_1 : ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__LogicExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:706:1: ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
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
                    // InternalExTwentyOne.g:707:2: ( '=' )
                    {
                    // InternalExTwentyOne.g:707:2: ( '=' )
                    // InternalExTwentyOne.g:708:3: '='
                    {
                     before(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:713:2: ( '<' )
                    {
                    // InternalExTwentyOne.g:713:2: ( '<' )
                    // InternalExTwentyOne.g:714:3: '<'
                    {
                     before(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:719:2: ( '>' )
                    {
                    // InternalExTwentyOne.g:719:2: ( '>' )
                    // InternalExTwentyOne.g:720:3: '>'
                    {
                     before(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:725:2: ( '<=' )
                    {
                    // InternalExTwentyOne.g:725:2: ( '<=' )
                    // InternalExTwentyOne.g:726:3: '<='
                    {
                     before(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:731:2: ( '>=' )
                    {
                    // InternalExTwentyOne.g:731:2: ( '>=' )
                    // InternalExTwentyOne.g:732:3: '>='
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
    // InternalExTwentyOne.g:741:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:745:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalExTwentyOne.g:746:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalExTwentyOne.g:753:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:757:1: ( ( 'program' ) )
            // InternalExTwentyOne.g:758:1: ( 'program' )
            {
            // InternalExTwentyOne.g:758:1: ( 'program' )
            // InternalExTwentyOne.g:759:2: 'program'
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
    // InternalExTwentyOne.g:768:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:772:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalExTwentyOne.g:773:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalExTwentyOne.g:780:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:784:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:785:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:785:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalExTwentyOne.g:786:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:787:2: ( rule__Program__NameAssignment_1 )
            // InternalExTwentyOne.g:787:3: rule__Program__NameAssignment_1
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
    // InternalExTwentyOne.g:795:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:799:1: ( rule__Program__Group__2__Impl )
            // InternalExTwentyOne.g:800:2: rule__Program__Group__2__Impl
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
    // InternalExTwentyOne.g:806:1: rule__Program__Group__2__Impl : ( ( rule__Program__DeclarationsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:810:1: ( ( ( rule__Program__DeclarationsAssignment_2 )* ) )
            // InternalExTwentyOne.g:811:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            {
            // InternalExTwentyOne.g:811:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            // InternalExTwentyOne.g:812:2: ( rule__Program__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getDeclarationsAssignment_2()); 
            // InternalExTwentyOne.g:813:2: ( rule__Program__DeclarationsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20||LA9_0==22||(LA9_0>=27 && LA9_0<=28)||LA9_0==31||LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExTwentyOne.g:813:3: rule__Program__DeclarationsAssignment_2
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
    // InternalExTwentyOne.g:822:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:826:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalExTwentyOne.g:827:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalExTwentyOne.g:834:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:838:1: ( ( 'parameter' ) )
            // InternalExTwentyOne.g:839:1: ( 'parameter' )
            {
            // InternalExTwentyOne.g:839:1: ( 'parameter' )
            // InternalExTwentyOne.g:840:2: 'parameter'
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
    // InternalExTwentyOne.g:849:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:853:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalExTwentyOne.g:854:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalExTwentyOne.g:861:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:865:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:866:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:866:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalExTwentyOne.g:867:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:868:2: ( rule__Parameter__NameAssignment_1 )
            // InternalExTwentyOne.g:868:3: rule__Parameter__NameAssignment_1
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
    // InternalExTwentyOne.g:876:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:880:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalExTwentyOne.g:881:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalExTwentyOne.g:888:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:892:1: ( ( ':' ) )
            // InternalExTwentyOne.g:893:1: ( ':' )
            {
            // InternalExTwentyOne.g:893:1: ( ':' )
            // InternalExTwentyOne.g:894:2: ':'
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
    // InternalExTwentyOne.g:903:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:907:1: ( rule__Parameter__Group__3__Impl )
            // InternalExTwentyOne.g:908:2: rule__Parameter__Group__3__Impl
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
    // InternalExTwentyOne.g:914:1: rule__Parameter__Group__3__Impl : ( ruleType ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:918:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:919:1: ( ruleType )
            {
            // InternalExTwentyOne.g:919:1: ( ruleType )
            // InternalExTwentyOne.g:920:2: ruleType
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
    // InternalExTwentyOne.g:930:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:934:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalExTwentyOne.g:935:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalExTwentyOne.g:942:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:946:1: ( ( () ) )
            // InternalExTwentyOne.g:947:1: ( () )
            {
            // InternalExTwentyOne.g:947:1: ( () )
            // InternalExTwentyOne.g:948:2: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // InternalExTwentyOne.g:949:2: ()
            // InternalExTwentyOne.g:949:3: 
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
    // InternalExTwentyOne.g:957:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:961:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalExTwentyOne.g:962:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalExTwentyOne.g:969:1: rule__Function__Group__1__Impl : ( 'function' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:973:1: ( ( 'function' ) )
            // InternalExTwentyOne.g:974:1: ( 'function' )
            {
            // InternalExTwentyOne.g:974:1: ( 'function' )
            // InternalExTwentyOne.g:975:2: 'function'
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
    // InternalExTwentyOne.g:984:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:988:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalExTwentyOne.g:989:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalExTwentyOne.g:996:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1000:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1001:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1001:1: ( ( rule__Function__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1002:2: ( rule__Function__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1003:2: ( rule__Function__NameAssignment_2 )
            // InternalExTwentyOne.g:1003:3: rule__Function__NameAssignment_2
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
    // InternalExTwentyOne.g:1011:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1015:1: ( rule__Function__Group__3__Impl )
            // InternalExTwentyOne.g:1016:2: rule__Function__Group__3__Impl
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
    // InternalExTwentyOne.g:1022:1: rule__Function__Group__3__Impl : ( ( rule__Function__LambdaAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1026:1: ( ( ( rule__Function__LambdaAssignment_3 ) ) )
            // InternalExTwentyOne.g:1027:1: ( ( rule__Function__LambdaAssignment_3 ) )
            {
            // InternalExTwentyOne.g:1027:1: ( ( rule__Function__LambdaAssignment_3 ) )
            // InternalExTwentyOne.g:1028:2: ( rule__Function__LambdaAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getLambdaAssignment_3()); 
            // InternalExTwentyOne.g:1029:2: ( rule__Function__LambdaAssignment_3 )
            // InternalExTwentyOne.g:1029:3: rule__Function__LambdaAssignment_3
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
    // InternalExTwentyOne.g:1038:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1042:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalExTwentyOne.g:1043:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
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
    // InternalExTwentyOne.g:1050:1: rule__Lambda__Group__0__Impl : ( () ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1054:1: ( ( () ) )
            // InternalExTwentyOne.g:1055:1: ( () )
            {
            // InternalExTwentyOne.g:1055:1: ( () )
            // InternalExTwentyOne.g:1056:2: ()
            {
             before(grammarAccess.getLambdaAccess().getLambdaAction_0()); 
            // InternalExTwentyOne.g:1057:2: ()
            // InternalExTwentyOne.g:1057:3: 
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
    // InternalExTwentyOne.g:1065:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1069:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalExTwentyOne.g:1070:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
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
    // InternalExTwentyOne.g:1077:1: rule__Lambda__Group__1__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1081:1: ( ( '(' ) )
            // InternalExTwentyOne.g:1082:1: ( '(' )
            {
            // InternalExTwentyOne.g:1082:1: ( '(' )
            // InternalExTwentyOne.g:1083:2: '('
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
    // InternalExTwentyOne.g:1092:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1096:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalExTwentyOne.g:1097:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
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
    // InternalExTwentyOne.g:1104:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__NameAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1108:1: ( ( ( rule__Lambda__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1109:1: ( ( rule__Lambda__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1109:1: ( ( rule__Lambda__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1110:2: ( rule__Lambda__NameAssignment_2 )
            {
             before(grammarAccess.getLambdaAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1111:2: ( rule__Lambda__NameAssignment_2 )
            // InternalExTwentyOne.g:1111:3: rule__Lambda__NameAssignment_2
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
    // InternalExTwentyOne.g:1119:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1123:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalExTwentyOne.g:1124:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
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
    // InternalExTwentyOne.g:1131:1: rule__Lambda__Group__3__Impl : ( ':' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1135:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1136:1: ( ':' )
            {
            // InternalExTwentyOne.g:1136:1: ( ':' )
            // InternalExTwentyOne.g:1137:2: ':'
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
    // InternalExTwentyOne.g:1146:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1150:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalExTwentyOne.g:1151:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
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
    // InternalExTwentyOne.g:1158:1: rule__Lambda__Group__4__Impl : ( ruleType ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1162:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1163:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1163:1: ( ruleType )
            // InternalExTwentyOne.g:1164:2: ruleType
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
    // InternalExTwentyOne.g:1173:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl rule__Lambda__Group__6 ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1177:1: ( rule__Lambda__Group__5__Impl rule__Lambda__Group__6 )
            // InternalExTwentyOne.g:1178:2: rule__Lambda__Group__5__Impl rule__Lambda__Group__6
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
    // InternalExTwentyOne.g:1185:1: rule__Lambda__Group__5__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1189:1: ( ( ')' ) )
            // InternalExTwentyOne.g:1190:1: ( ')' )
            {
            // InternalExTwentyOne.g:1190:1: ( ')' )
            // InternalExTwentyOne.g:1191:2: ')'
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
    // InternalExTwentyOne.g:1200:1: rule__Lambda__Group__6 : rule__Lambda__Group__6__Impl rule__Lambda__Group__7 ;
    public final void rule__Lambda__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1204:1: ( rule__Lambda__Group__6__Impl rule__Lambda__Group__7 )
            // InternalExTwentyOne.g:1205:2: rule__Lambda__Group__6__Impl rule__Lambda__Group__7
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
    // InternalExTwentyOne.g:1212:1: rule__Lambda__Group__6__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1216:1: ( ( '{' ) )
            // InternalExTwentyOne.g:1217:1: ( '{' )
            {
            // InternalExTwentyOne.g:1217:1: ( '{' )
            // InternalExTwentyOne.g:1218:2: '{'
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
    // InternalExTwentyOne.g:1227:1: rule__Lambda__Group__7 : rule__Lambda__Group__7__Impl rule__Lambda__Group__8 ;
    public final void rule__Lambda__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1231:1: ( rule__Lambda__Group__7__Impl rule__Lambda__Group__8 )
            // InternalExTwentyOne.g:1232:2: rule__Lambda__Group__7__Impl rule__Lambda__Group__8
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
    // InternalExTwentyOne.g:1239:1: rule__Lambda__Group__7__Impl : ( ( rule__Lambda__LambdaExpAssignment_7 ) ) ;
    public final void rule__Lambda__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1243:1: ( ( ( rule__Lambda__LambdaExpAssignment_7 ) ) )
            // InternalExTwentyOne.g:1244:1: ( ( rule__Lambda__LambdaExpAssignment_7 ) )
            {
            // InternalExTwentyOne.g:1244:1: ( ( rule__Lambda__LambdaExpAssignment_7 ) )
            // InternalExTwentyOne.g:1245:2: ( rule__Lambda__LambdaExpAssignment_7 )
            {
             before(grammarAccess.getLambdaAccess().getLambdaExpAssignment_7()); 
            // InternalExTwentyOne.g:1246:2: ( rule__Lambda__LambdaExpAssignment_7 )
            // InternalExTwentyOne.g:1246:3: rule__Lambda__LambdaExpAssignment_7
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
    // InternalExTwentyOne.g:1254:1: rule__Lambda__Group__8 : rule__Lambda__Group__8__Impl ;
    public final void rule__Lambda__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1258:1: ( rule__Lambda__Group__8__Impl )
            // InternalExTwentyOne.g:1259:2: rule__Lambda__Group__8__Impl
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
    // InternalExTwentyOne.g:1265:1: rule__Lambda__Group__8__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1269:1: ( ( '}' ) )
            // InternalExTwentyOne.g:1270:1: ( '}' )
            {
            // InternalExTwentyOne.g:1270:1: ( '}' )
            // InternalExTwentyOne.g:1271:2: '}'
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
    // InternalExTwentyOne.g:1281:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1285:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalExTwentyOne.g:1286:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalExTwentyOne.g:1293:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1297:1: ( ( () ) )
            // InternalExTwentyOne.g:1298:1: ( () )
            {
            // InternalExTwentyOne.g:1298:1: ( () )
            // InternalExTwentyOne.g:1299:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalExTwentyOne.g:1300:2: ()
            // InternalExTwentyOne.g:1300:3: 
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
    // InternalExTwentyOne.g:1308:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1312:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalExTwentyOne.g:1313:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalExTwentyOne.g:1320:1: rule__Input__Group__1__Impl : ( 'input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1324:1: ( ( 'input' ) )
            // InternalExTwentyOne.g:1325:1: ( 'input' )
            {
            // InternalExTwentyOne.g:1325:1: ( 'input' )
            // InternalExTwentyOne.g:1326:2: 'input'
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
    // InternalExTwentyOne.g:1335:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1339:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalExTwentyOne.g:1340:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalExTwentyOne.g:1347:1: rule__Input__Group__2__Impl : ( ( rule__Input__NameAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1351:1: ( ( ( rule__Input__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1352:1: ( ( rule__Input__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1352:1: ( ( rule__Input__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1353:2: ( rule__Input__NameAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1354:2: ( rule__Input__NameAssignment_2 )
            // InternalExTwentyOne.g:1354:3: rule__Input__NameAssignment_2
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
    // InternalExTwentyOne.g:1362:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1366:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalExTwentyOne.g:1367:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalExTwentyOne.g:1374:1: rule__Input__Group__3__Impl : ( ':' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1378:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1379:1: ( ':' )
            {
            // InternalExTwentyOne.g:1379:1: ( ':' )
            // InternalExTwentyOne.g:1380:2: ':'
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
    // InternalExTwentyOne.g:1389:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1393:1: ( rule__Input__Group__4__Impl )
            // InternalExTwentyOne.g:1394:2: rule__Input__Group__4__Impl
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
    // InternalExTwentyOne.g:1400:1: rule__Input__Group__4__Impl : ( ruleType ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1404:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1405:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1405:1: ( ruleType )
            // InternalExTwentyOne.g:1406:2: ruleType
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
    // InternalExTwentyOne.g:1416:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1420:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalExTwentyOne.g:1421:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalExTwentyOne.g:1428:1: rule__Node__Group__0__Impl : ( () ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1432:1: ( ( () ) )
            // InternalExTwentyOne.g:1433:1: ( () )
            {
            // InternalExTwentyOne.g:1433:1: ( () )
            // InternalExTwentyOne.g:1434:2: ()
            {
             before(grammarAccess.getNodeAccess().getNodeAction_0()); 
            // InternalExTwentyOne.g:1435:2: ()
            // InternalExTwentyOne.g:1435:3: 
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
    // InternalExTwentyOne.g:1443:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1447:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalExTwentyOne.g:1448:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalExTwentyOne.g:1455:1: rule__Node__Group__1__Impl : ( 'node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1459:1: ( ( 'node' ) )
            // InternalExTwentyOne.g:1460:1: ( 'node' )
            {
            // InternalExTwentyOne.g:1460:1: ( 'node' )
            // InternalExTwentyOne.g:1461:2: 'node'
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
    // InternalExTwentyOne.g:1470:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1474:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalExTwentyOne.g:1475:2: rule__Node__Group__2__Impl rule__Node__Group__3
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
    // InternalExTwentyOne.g:1482:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1486:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1487:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1487:1: ( ( rule__Node__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1488:2: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1489:2: ( rule__Node__NameAssignment_2 )
            // InternalExTwentyOne.g:1489:3: rule__Node__NameAssignment_2
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
    // InternalExTwentyOne.g:1497:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1501:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalExTwentyOne.g:1502:2: rule__Node__Group__3__Impl rule__Node__Group__4
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
    // InternalExTwentyOne.g:1509:1: rule__Node__Group__3__Impl : ( '[' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1513:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1514:1: ( '[' )
            {
            // InternalExTwentyOne.g:1514:1: ( '[' )
            // InternalExTwentyOne.g:1515:2: '['
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
    // InternalExTwentyOne.g:1524:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1528:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // InternalExTwentyOne.g:1529:2: rule__Node__Group__4__Impl rule__Node__Group__5
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
    // InternalExTwentyOne.g:1536:1: rule__Node__Group__4__Impl : ( ( rule__Node__Alternatives_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1540:1: ( ( ( rule__Node__Alternatives_4 ) ) )
            // InternalExTwentyOne.g:1541:1: ( ( rule__Node__Alternatives_4 ) )
            {
            // InternalExTwentyOne.g:1541:1: ( ( rule__Node__Alternatives_4 ) )
            // InternalExTwentyOne.g:1542:2: ( rule__Node__Alternatives_4 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_4()); 
            // InternalExTwentyOne.g:1543:2: ( rule__Node__Alternatives_4 )
            // InternalExTwentyOne.g:1543:3: rule__Node__Alternatives_4
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
    // InternalExTwentyOne.g:1551:1: rule__Node__Group__5 : rule__Node__Group__5__Impl ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1555:1: ( rule__Node__Group__5__Impl )
            // InternalExTwentyOne.g:1556:2: rule__Node__Group__5__Impl
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
    // InternalExTwentyOne.g:1562:1: rule__Node__Group__5__Impl : ( ']' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1566:1: ( ( ']' ) )
            // InternalExTwentyOne.g:1567:1: ( ']' )
            {
            // InternalExTwentyOne.g:1567:1: ( ']' )
            // InternalExTwentyOne.g:1568:2: ']'
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
    // InternalExTwentyOne.g:1578:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1582:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // InternalExTwentyOne.g:1583:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
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
    // InternalExTwentyOne.g:1590:1: rule__Stream__Group__0__Impl : ( () ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1594:1: ( ( () ) )
            // InternalExTwentyOne.g:1595:1: ( () )
            {
            // InternalExTwentyOne.g:1595:1: ( () )
            // InternalExTwentyOne.g:1596:2: ()
            {
             before(grammarAccess.getStreamAccess().getStreamAction_0()); 
            // InternalExTwentyOne.g:1597:2: ()
            // InternalExTwentyOne.g:1597:3: 
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
    // InternalExTwentyOne.g:1605:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1609:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // InternalExTwentyOne.g:1610:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
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
    // InternalExTwentyOne.g:1617:1: rule__Stream__Group__1__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1621:1: ( ( 'stream' ) )
            // InternalExTwentyOne.g:1622:1: ( 'stream' )
            {
            // InternalExTwentyOne.g:1622:1: ( 'stream' )
            // InternalExTwentyOne.g:1623:2: 'stream'
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
    // InternalExTwentyOne.g:1632:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1636:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // InternalExTwentyOne.g:1637:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
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
    // InternalExTwentyOne.g:1644:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__InputsOrNodesAssignment_2 ) ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1648:1: ( ( ( rule__Stream__InputsOrNodesAssignment_2 ) ) )
            // InternalExTwentyOne.g:1649:1: ( ( rule__Stream__InputsOrNodesAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1649:1: ( ( rule__Stream__InputsOrNodesAssignment_2 ) )
            // InternalExTwentyOne.g:1650:2: ( rule__Stream__InputsOrNodesAssignment_2 )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_2()); 
            // InternalExTwentyOne.g:1651:2: ( rule__Stream__InputsOrNodesAssignment_2 )
            // InternalExTwentyOne.g:1651:3: rule__Stream__InputsOrNodesAssignment_2
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
    // InternalExTwentyOne.g:1659:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl rule__Stream__Group__4 ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1663:1: ( rule__Stream__Group__3__Impl rule__Stream__Group__4 )
            // InternalExTwentyOne.g:1664:2: rule__Stream__Group__3__Impl rule__Stream__Group__4
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
    // InternalExTwentyOne.g:1671:1: rule__Stream__Group__3__Impl : ( ( rule__Stream__Group_3__0 )* ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1675:1: ( ( ( rule__Stream__Group_3__0 )* ) )
            // InternalExTwentyOne.g:1676:1: ( ( rule__Stream__Group_3__0 )* )
            {
            // InternalExTwentyOne.g:1676:1: ( ( rule__Stream__Group_3__0 )* )
            // InternalExTwentyOne.g:1677:2: ( rule__Stream__Group_3__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalExTwentyOne.g:1678:2: ( rule__Stream__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExTwentyOne.g:1678:3: rule__Stream__Group_3__0
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
    // InternalExTwentyOne.g:1686:1: rule__Stream__Group__4 : rule__Stream__Group__4__Impl ;
    public final void rule__Stream__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1690:1: ( rule__Stream__Group__4__Impl )
            // InternalExTwentyOne.g:1691:2: rule__Stream__Group__4__Impl
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
    // InternalExTwentyOne.g:1697:1: rule__Stream__Group__4__Impl : ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) ) ;
    public final void rule__Stream__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1701:1: ( ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) ) )
            // InternalExTwentyOne.g:1702:1: ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) )
            {
            // InternalExTwentyOne.g:1702:1: ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) )
            // InternalExTwentyOne.g:1703:2: ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* )
            {
            // InternalExTwentyOne.g:1703:2: ( ( rule__Stream__Group_4__0 ) )
            // InternalExTwentyOne.g:1704:3: ( rule__Stream__Group_4__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_4()); 
            // InternalExTwentyOne.g:1705:3: ( rule__Stream__Group_4__0 )
            // InternalExTwentyOne.g:1705:4: rule__Stream__Group_4__0
            {
            pushFollow(FOLLOW_22);
            rule__Stream__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_4()); 

            }

            // InternalExTwentyOne.g:1708:2: ( ( rule__Stream__Group_4__0 )* )
            // InternalExTwentyOne.g:1709:3: ( rule__Stream__Group_4__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_4()); 
            // InternalExTwentyOne.g:1710:3: ( rule__Stream__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExTwentyOne.g:1710:4: rule__Stream__Group_4__0
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
    // InternalExTwentyOne.g:1720:1: rule__Stream__Group_3__0 : rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 ;
    public final void rule__Stream__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1724:1: ( rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 )
            // InternalExTwentyOne.g:1725:2: rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1
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
    // InternalExTwentyOne.g:1732:1: rule__Stream__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1736:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1737:1: ( ',' )
            {
            // InternalExTwentyOne.g:1737:1: ( ',' )
            // InternalExTwentyOne.g:1738:2: ','
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
    // InternalExTwentyOne.g:1747:1: rule__Stream__Group_3__1 : rule__Stream__Group_3__1__Impl ;
    public final void rule__Stream__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1751:1: ( rule__Stream__Group_3__1__Impl )
            // InternalExTwentyOne.g:1752:2: rule__Stream__Group_3__1__Impl
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
    // InternalExTwentyOne.g:1758:1: rule__Stream__Group_3__1__Impl : ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) ) ;
    public final void rule__Stream__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1762:1: ( ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) ) )
            // InternalExTwentyOne.g:1763:1: ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) )
            {
            // InternalExTwentyOne.g:1763:1: ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) )
            // InternalExTwentyOne.g:1764:2: ( rule__Stream__InputsOrNodesAssignment_3_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_3_1()); 
            // InternalExTwentyOne.g:1765:2: ( rule__Stream__InputsOrNodesAssignment_3_1 )
            // InternalExTwentyOne.g:1765:3: rule__Stream__InputsOrNodesAssignment_3_1
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
    // InternalExTwentyOne.g:1774:1: rule__Stream__Group_4__0 : rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1 ;
    public final void rule__Stream__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1778:1: ( rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1 )
            // InternalExTwentyOne.g:1779:2: rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1
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
    // InternalExTwentyOne.g:1786:1: rule__Stream__Group_4__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1790:1: ( ( 'to' ) )
            // InternalExTwentyOne.g:1791:1: ( 'to' )
            {
            // InternalExTwentyOne.g:1791:1: ( 'to' )
            // InternalExTwentyOne.g:1792:2: 'to'
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
    // InternalExTwentyOne.g:1801:1: rule__Stream__Group_4__1 : rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2 ;
    public final void rule__Stream__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1805:1: ( rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2 )
            // InternalExTwentyOne.g:1806:2: rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2
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
    // InternalExTwentyOne.g:1813:1: rule__Stream__Group_4__1__Impl : ( ( rule__Stream__ElementsAssignment_4_1 ) ) ;
    public final void rule__Stream__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1817:1: ( ( ( rule__Stream__ElementsAssignment_4_1 ) ) )
            // InternalExTwentyOne.g:1818:1: ( ( rule__Stream__ElementsAssignment_4_1 ) )
            {
            // InternalExTwentyOne.g:1818:1: ( ( rule__Stream__ElementsAssignment_4_1 ) )
            // InternalExTwentyOne.g:1819:2: ( rule__Stream__ElementsAssignment_4_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_4_1()); 
            // InternalExTwentyOne.g:1820:2: ( rule__Stream__ElementsAssignment_4_1 )
            // InternalExTwentyOne.g:1820:3: rule__Stream__ElementsAssignment_4_1
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
    // InternalExTwentyOne.g:1828:1: rule__Stream__Group_4__2 : rule__Stream__Group_4__2__Impl ;
    public final void rule__Stream__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1832:1: ( rule__Stream__Group_4__2__Impl )
            // InternalExTwentyOne.g:1833:2: rule__Stream__Group_4__2__Impl
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
    // InternalExTwentyOne.g:1839:1: rule__Stream__Group_4__2__Impl : ( ( rule__Stream__Group_4_2__0 )* ) ;
    public final void rule__Stream__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1843:1: ( ( ( rule__Stream__Group_4_2__0 )* ) )
            // InternalExTwentyOne.g:1844:1: ( ( rule__Stream__Group_4_2__0 )* )
            {
            // InternalExTwentyOne.g:1844:1: ( ( rule__Stream__Group_4_2__0 )* )
            // InternalExTwentyOne.g:1845:2: ( rule__Stream__Group_4_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_4_2()); 
            // InternalExTwentyOne.g:1846:2: ( rule__Stream__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExTwentyOne.g:1846:3: rule__Stream__Group_4_2__0
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
    // InternalExTwentyOne.g:1855:1: rule__Stream__Group_4_2__0 : rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1 ;
    public final void rule__Stream__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1859:1: ( rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1 )
            // InternalExTwentyOne.g:1860:2: rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1
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
    // InternalExTwentyOne.g:1867:1: rule__Stream__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1871:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1872:1: ( ',' )
            {
            // InternalExTwentyOne.g:1872:1: ( ',' )
            // InternalExTwentyOne.g:1873:2: ','
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
    // InternalExTwentyOne.g:1882:1: rule__Stream__Group_4_2__1 : rule__Stream__Group_4_2__1__Impl ;
    public final void rule__Stream__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1886:1: ( rule__Stream__Group_4_2__1__Impl )
            // InternalExTwentyOne.g:1887:2: rule__Stream__Group_4_2__1__Impl
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
    // InternalExTwentyOne.g:1893:1: rule__Stream__Group_4_2__1__Impl : ( ( rule__Stream__ElementsAssignment_4_2_1 ) ) ;
    public final void rule__Stream__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1897:1: ( ( ( rule__Stream__ElementsAssignment_4_2_1 ) ) )
            // InternalExTwentyOne.g:1898:1: ( ( rule__Stream__ElementsAssignment_4_2_1 ) )
            {
            // InternalExTwentyOne.g:1898:1: ( ( rule__Stream__ElementsAssignment_4_2_1 ) )
            // InternalExTwentyOne.g:1899:2: ( rule__Stream__ElementsAssignment_4_2_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_4_2_1()); 
            // InternalExTwentyOne.g:1900:2: ( rule__Stream__ElementsAssignment_4_2_1 )
            // InternalExTwentyOne.g:1900:3: rule__Stream__ElementsAssignment_4_2_1
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
    // InternalExTwentyOne.g:1909:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1913:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalExTwentyOne.g:1914:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
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
    // InternalExTwentyOne.g:1921:1: rule__Element__Group_0__0__Impl : ( () ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1925:1: ( ( () ) )
            // InternalExTwentyOne.g:1926:1: ( () )
            {
            // InternalExTwentyOne.g:1926:1: ( () )
            // InternalExTwentyOne.g:1927:2: ()
            {
             before(grammarAccess.getElementAccess().getElementAction_0_0()); 
            // InternalExTwentyOne.g:1928:2: ()
            // InternalExTwentyOne.g:1928:3: 
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
    // InternalExTwentyOne.g:1936:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1940:1: ( rule__Element__Group_0__1__Impl )
            // InternalExTwentyOne.g:1941:2: rule__Element__Group_0__1__Impl
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
    // InternalExTwentyOne.g:1947:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__ElementAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1951:1: ( ( ( rule__Element__ElementAssignment_0_1 ) ) )
            // InternalExTwentyOne.g:1952:1: ( ( rule__Element__ElementAssignment_0_1 ) )
            {
            // InternalExTwentyOne.g:1952:1: ( ( rule__Element__ElementAssignment_0_1 ) )
            // InternalExTwentyOne.g:1953:2: ( rule__Element__ElementAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getElementAssignment_0_1()); 
            // InternalExTwentyOne.g:1954:2: ( rule__Element__ElementAssignment_0_1 )
            // InternalExTwentyOne.g:1954:3: rule__Element__ElementAssignment_0_1
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
    // InternalExTwentyOne.g:1963:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1967:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalExTwentyOne.g:1968:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
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
    // InternalExTwentyOne.g:1975:1: rule__Element__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1979:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1980:1: ( '[' )
            {
            // InternalExTwentyOne.g:1980:1: ( '[' )
            // InternalExTwentyOne.g:1981:2: '['
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
    // InternalExTwentyOne.g:1990:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl rule__Element__Group_1__2 ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1994:1: ( rule__Element__Group_1__1__Impl rule__Element__Group_1__2 )
            // InternalExTwentyOne.g:1995:2: rule__Element__Group_1__1__Impl rule__Element__Group_1__2
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
    // InternalExTwentyOne.g:2002:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__Alternatives_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2006:1: ( ( ( rule__Element__Alternatives_1_1 ) ) )
            // InternalExTwentyOne.g:2007:1: ( ( rule__Element__Alternatives_1_1 ) )
            {
            // InternalExTwentyOne.g:2007:1: ( ( rule__Element__Alternatives_1_1 ) )
            // InternalExTwentyOne.g:2008:2: ( rule__Element__Alternatives_1_1 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_1_1()); 
            // InternalExTwentyOne.g:2009:2: ( rule__Element__Alternatives_1_1 )
            // InternalExTwentyOne.g:2009:3: rule__Element__Alternatives_1_1
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
    // InternalExTwentyOne.g:2017:1: rule__Element__Group_1__2 : rule__Element__Group_1__2__Impl ;
    public final void rule__Element__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2021:1: ( rule__Element__Group_1__2__Impl )
            // InternalExTwentyOne.g:2022:2: rule__Element__Group_1__2__Impl
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
    // InternalExTwentyOne.g:2028:1: rule__Element__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Element__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2032:1: ( ( ']' ) )
            // InternalExTwentyOne.g:2033:1: ( ']' )
            {
            // InternalExTwentyOne.g:2033:1: ( ']' )
            // InternalExTwentyOne.g:2034:2: ']'
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
    // InternalExTwentyOne.g:2044:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2048:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalExTwentyOne.g:2049:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
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
    // InternalExTwentyOne.g:2056:1: rule__Element__Group_2__0__Impl : ( 'output' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2060:1: ( ( 'output' ) )
            // InternalExTwentyOne.g:2061:1: ( 'output' )
            {
            // InternalExTwentyOne.g:2061:1: ( 'output' )
            // InternalExTwentyOne.g:2062:2: 'output'
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
    // InternalExTwentyOne.g:2071:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2075:1: ( rule__Element__Group_2__1__Impl )
            // InternalExTwentyOne.g:2076:2: rule__Element__Group_2__1__Impl
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
    // InternalExTwentyOne.g:2082:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__OutputAssignment_2_1 ) ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2086:1: ( ( ( rule__Element__OutputAssignment_2_1 ) ) )
            // InternalExTwentyOne.g:2087:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            {
            // InternalExTwentyOne.g:2087:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            // InternalExTwentyOne.g:2088:2: ( rule__Element__OutputAssignment_2_1 )
            {
             before(grammarAccess.getElementAccess().getOutputAssignment_2_1()); 
            // InternalExTwentyOne.g:2089:2: ( rule__Element__OutputAssignment_2_1 )
            // InternalExTwentyOne.g:2089:3: rule__Element__OutputAssignment_2_1
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
    // InternalExTwentyOne.g:2098:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2102:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalExTwentyOne.g:2103:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
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
    // InternalExTwentyOne.g:2110:1: rule__DataDecl__Group__0__Impl : ( () ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2114:1: ( ( () ) )
            // InternalExTwentyOne.g:2115:1: ( () )
            {
            // InternalExTwentyOne.g:2115:1: ( () )
            // InternalExTwentyOne.g:2116:2: ()
            {
             before(grammarAccess.getDataDeclAccess().getDataDeclAction_0()); 
            // InternalExTwentyOne.g:2117:2: ()
            // InternalExTwentyOne.g:2117:3: 
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
    // InternalExTwentyOne.g:2125:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2129:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalExTwentyOne.g:2130:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
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
    // InternalExTwentyOne.g:2137:1: rule__DataDecl__Group__1__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2141:1: ( ( 'data' ) )
            // InternalExTwentyOne.g:2142:1: ( 'data' )
            {
            // InternalExTwentyOne.g:2142:1: ( 'data' )
            // InternalExTwentyOne.g:2143:2: 'data'
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
    // InternalExTwentyOne.g:2152:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2156:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalExTwentyOne.g:2157:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
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
    // InternalExTwentyOne.g:2164:1: rule__DataDecl__Group__2__Impl : ( ( rule__DataDecl__NameAssignment_2 ) ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2168:1: ( ( ( rule__DataDecl__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:2169:1: ( ( rule__DataDecl__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:2169:1: ( ( rule__DataDecl__NameAssignment_2 ) )
            // InternalExTwentyOne.g:2170:2: ( rule__DataDecl__NameAssignment_2 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:2171:2: ( rule__DataDecl__NameAssignment_2 )
            // InternalExTwentyOne.g:2171:3: rule__DataDecl__NameAssignment_2
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
    // InternalExTwentyOne.g:2179:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2183:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalExTwentyOne.g:2184:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
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
    // InternalExTwentyOne.g:2191:1: rule__DataDecl__Group__3__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2195:1: ( ( '{' ) )
            // InternalExTwentyOne.g:2196:1: ( '{' )
            {
            // InternalExTwentyOne.g:2196:1: ( '{' )
            // InternalExTwentyOne.g:2197:2: '{'
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
    // InternalExTwentyOne.g:2206:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2210:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalExTwentyOne.g:2211:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
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
    // InternalExTwentyOne.g:2218:1: rule__DataDecl__Group__4__Impl : ( ( rule__DataDecl__DataAssignment_4 ) ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2222:1: ( ( ( rule__DataDecl__DataAssignment_4 ) ) )
            // InternalExTwentyOne.g:2223:1: ( ( rule__DataDecl__DataAssignment_4 ) )
            {
            // InternalExTwentyOne.g:2223:1: ( ( rule__DataDecl__DataAssignment_4 ) )
            // InternalExTwentyOne.g:2224:2: ( rule__DataDecl__DataAssignment_4 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_4()); 
            // InternalExTwentyOne.g:2225:2: ( rule__DataDecl__DataAssignment_4 )
            // InternalExTwentyOne.g:2225:3: rule__DataDecl__DataAssignment_4
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
    // InternalExTwentyOne.g:2233:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2237:1: ( rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 )
            // InternalExTwentyOne.g:2238:2: rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6
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
    // InternalExTwentyOne.g:2245:1: rule__DataDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2249:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2250:1: ( ':' )
            {
            // InternalExTwentyOne.g:2250:1: ( ':' )
            // InternalExTwentyOne.g:2251:2: ':'
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
    // InternalExTwentyOne.g:2260:1: rule__DataDecl__Group__6 : rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 ;
    public final void rule__DataDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2264:1: ( rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 )
            // InternalExTwentyOne.g:2265:2: rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7
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
    // InternalExTwentyOne.g:2272:1: rule__DataDecl__Group__6__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2276:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2277:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2277:1: ( ruleType )
            // InternalExTwentyOne.g:2278:2: ruleType
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
    // InternalExTwentyOne.g:2287:1: rule__DataDecl__Group__7 : rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8 ;
    public final void rule__DataDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2291:1: ( rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8 )
            // InternalExTwentyOne.g:2292:2: rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8
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
    // InternalExTwentyOne.g:2299:1: rule__DataDecl__Group__7__Impl : ( ( rule__DataDecl__Group_7__0 )* ) ;
    public final void rule__DataDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2303:1: ( ( ( rule__DataDecl__Group_7__0 )* ) )
            // InternalExTwentyOne.g:2304:1: ( ( rule__DataDecl__Group_7__0 )* )
            {
            // InternalExTwentyOne.g:2304:1: ( ( rule__DataDecl__Group_7__0 )* )
            // InternalExTwentyOne.g:2305:2: ( rule__DataDecl__Group_7__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_7()); 
            // InternalExTwentyOne.g:2306:2: ( rule__DataDecl__Group_7__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExTwentyOne.g:2306:3: rule__DataDecl__Group_7__0
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
    // InternalExTwentyOne.g:2314:1: rule__DataDecl__Group__8 : rule__DataDecl__Group__8__Impl ;
    public final void rule__DataDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2318:1: ( rule__DataDecl__Group__8__Impl )
            // InternalExTwentyOne.g:2319:2: rule__DataDecl__Group__8__Impl
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
    // InternalExTwentyOne.g:2325:1: rule__DataDecl__Group__8__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2329:1: ( ( '}' ) )
            // InternalExTwentyOne.g:2330:1: ( '}' )
            {
            // InternalExTwentyOne.g:2330:1: ( '}' )
            // InternalExTwentyOne.g:2331:2: '}'
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
    // InternalExTwentyOne.g:2341:1: rule__DataDecl__Group_7__0 : rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1 ;
    public final void rule__DataDecl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2345:1: ( rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1 )
            // InternalExTwentyOne.g:2346:2: rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1
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
    // InternalExTwentyOne.g:2353:1: rule__DataDecl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2357:1: ( ( ',' ) )
            // InternalExTwentyOne.g:2358:1: ( ',' )
            {
            // InternalExTwentyOne.g:2358:1: ( ',' )
            // InternalExTwentyOne.g:2359:2: ','
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
    // InternalExTwentyOne.g:2368:1: rule__DataDecl__Group_7__1 : rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2 ;
    public final void rule__DataDecl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2372:1: ( rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2 )
            // InternalExTwentyOne.g:2373:2: rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2
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
    // InternalExTwentyOne.g:2380:1: rule__DataDecl__Group_7__1__Impl : ( ( rule__DataDecl__DataAssignment_7_1 ) ) ;
    public final void rule__DataDecl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2384:1: ( ( ( rule__DataDecl__DataAssignment_7_1 ) ) )
            // InternalExTwentyOne.g:2385:1: ( ( rule__DataDecl__DataAssignment_7_1 ) )
            {
            // InternalExTwentyOne.g:2385:1: ( ( rule__DataDecl__DataAssignment_7_1 ) )
            // InternalExTwentyOne.g:2386:2: ( rule__DataDecl__DataAssignment_7_1 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_7_1()); 
            // InternalExTwentyOne.g:2387:2: ( rule__DataDecl__DataAssignment_7_1 )
            // InternalExTwentyOne.g:2387:3: rule__DataDecl__DataAssignment_7_1
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
    // InternalExTwentyOne.g:2395:1: rule__DataDecl__Group_7__2 : rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3 ;
    public final void rule__DataDecl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2399:1: ( rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3 )
            // InternalExTwentyOne.g:2400:2: rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3
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
    // InternalExTwentyOne.g:2407:1: rule__DataDecl__Group_7__2__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2411:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2412:1: ( ':' )
            {
            // InternalExTwentyOne.g:2412:1: ( ':' )
            // InternalExTwentyOne.g:2413:2: ':'
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
    // InternalExTwentyOne.g:2422:1: rule__DataDecl__Group_7__3 : rule__DataDecl__Group_7__3__Impl ;
    public final void rule__DataDecl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2426:1: ( rule__DataDecl__Group_7__3__Impl )
            // InternalExTwentyOne.g:2427:2: rule__DataDecl__Group_7__3__Impl
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
    // InternalExTwentyOne.g:2433:1: rule__DataDecl__Group_7__3__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2437:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2438:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2438:1: ( ruleType )
            // InternalExTwentyOne.g:2439:2: ruleType
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
    // InternalExTwentyOne.g:2449:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2453:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalExTwentyOne.g:2454:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
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
    // InternalExTwentyOne.g:2461:1: rule__Exp__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2465:1: ( ( rulePrimary ) )
            // InternalExTwentyOne.g:2466:1: ( rulePrimary )
            {
            // InternalExTwentyOne.g:2466:1: ( rulePrimary )
            // InternalExTwentyOne.g:2467:2: rulePrimary
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
    // InternalExTwentyOne.g:2476:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2480:1: ( rule__Exp__Group__1__Impl )
            // InternalExTwentyOne.g:2481:2: rule__Exp__Group__1__Impl
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
    // InternalExTwentyOne.g:2487:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2491:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalExTwentyOne.g:2492:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalExTwentyOne.g:2492:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalExTwentyOne.g:2493:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalExTwentyOne.g:2494:2: ( rule__Exp__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=36 && LA14_0<=39)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExTwentyOne.g:2494:3: rule__Exp__Group_1__0
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
    // InternalExTwentyOne.g:2503:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2507:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalExTwentyOne.g:2508:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
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
    // InternalExTwentyOne.g:2515:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2519:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalExTwentyOne.g:2520:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalExTwentyOne.g:2520:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalExTwentyOne.g:2521:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalExTwentyOne.g:2522:2: ( rule__Exp__Alternatives_1_0 )
            // InternalExTwentyOne.g:2522:3: rule__Exp__Alternatives_1_0
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
    // InternalExTwentyOne.g:2530:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2534:1: ( rule__Exp__Group_1__1__Impl )
            // InternalExTwentyOne.g:2535:2: rule__Exp__Group_1__1__Impl
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
    // InternalExTwentyOne.g:2541:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2545:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalExTwentyOne.g:2546:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalExTwentyOne.g:2546:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalExTwentyOne.g:2547:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalExTwentyOne.g:2548:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalExTwentyOne.g:2548:3: rule__Exp__RightAssignment_1_1
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
    // InternalExTwentyOne.g:2557:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2561:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalExTwentyOne.g:2562:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
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
    // InternalExTwentyOne.g:2569:1: rule__Exp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2573:1: ( ( () ) )
            // InternalExTwentyOne.g:2574:1: ( () )
            {
            // InternalExTwentyOne.g:2574:1: ( () )
            // InternalExTwentyOne.g:2575:2: ()
            {
             before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalExTwentyOne.g:2576:2: ()
            // InternalExTwentyOne.g:2576:3: 
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
    // InternalExTwentyOne.g:2584:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2588:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalExTwentyOne.g:2589:2: rule__Exp__Group_1_0_0__1__Impl
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
    // InternalExTwentyOne.g:2595:1: rule__Exp__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2599:1: ( ( '+' ) )
            // InternalExTwentyOne.g:2600:1: ( '+' )
            {
            // InternalExTwentyOne.g:2600:1: ( '+' )
            // InternalExTwentyOne.g:2601:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2611:1: rule__Exp__Group_1_0_1__0 : rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 ;
    public final void rule__Exp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2615:1: ( rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 )
            // InternalExTwentyOne.g:2616:2: rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1
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
    // InternalExTwentyOne.g:2623:1: rule__Exp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2627:1: ( ( () ) )
            // InternalExTwentyOne.g:2628:1: ( () )
            {
            // InternalExTwentyOne.g:2628:1: ( () )
            // InternalExTwentyOne.g:2629:2: ()
            {
             before(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalExTwentyOne.g:2630:2: ()
            // InternalExTwentyOne.g:2630:3: 
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
    // InternalExTwentyOne.g:2638:1: rule__Exp__Group_1_0_1__1 : rule__Exp__Group_1_0_1__1__Impl ;
    public final void rule__Exp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2642:1: ( rule__Exp__Group_1_0_1__1__Impl )
            // InternalExTwentyOne.g:2643:2: rule__Exp__Group_1_0_1__1__Impl
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
    // InternalExTwentyOne.g:2649:1: rule__Exp__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Exp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2653:1: ( ( '-' ) )
            // InternalExTwentyOne.g:2654:1: ( '-' )
            {
            // InternalExTwentyOne.g:2654:1: ( '-' )
            // InternalExTwentyOne.g:2655:2: '-'
            {
             before(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2665:1: rule__Exp__Group_1_0_2__0 : rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1 ;
    public final void rule__Exp__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2669:1: ( rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1 )
            // InternalExTwentyOne.g:2670:2: rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1
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
    // InternalExTwentyOne.g:2677:1: rule__Exp__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2681:1: ( ( () ) )
            // InternalExTwentyOne.g:2682:1: ( () )
            {
            // InternalExTwentyOne.g:2682:1: ( () )
            // InternalExTwentyOne.g:2683:2: ()
            {
             before(grammarAccess.getExpAccess().getMultLeftAction_1_0_2_0()); 
            // InternalExTwentyOne.g:2684:2: ()
            // InternalExTwentyOne.g:2684:3: 
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
    // InternalExTwentyOne.g:2692:1: rule__Exp__Group_1_0_2__1 : rule__Exp__Group_1_0_2__1__Impl ;
    public final void rule__Exp__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2696:1: ( rule__Exp__Group_1_0_2__1__Impl )
            // InternalExTwentyOne.g:2697:2: rule__Exp__Group_1_0_2__1__Impl
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
    // InternalExTwentyOne.g:2703:1: rule__Exp__Group_1_0_2__1__Impl : ( '*' ) ;
    public final void rule__Exp__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2707:1: ( ( '*' ) )
            // InternalExTwentyOne.g:2708:1: ( '*' )
            {
            // InternalExTwentyOne.g:2708:1: ( '*' )
            // InternalExTwentyOne.g:2709:2: '*'
            {
             before(grammarAccess.getExpAccess().getAsteriskKeyword_1_0_2_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalExTwentyOne.g:2719:1: rule__Exp__Group_1_0_3__0 : rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1 ;
    public final void rule__Exp__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2723:1: ( rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1 )
            // InternalExTwentyOne.g:2724:2: rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1
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
    // InternalExTwentyOne.g:2731:1: rule__Exp__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2735:1: ( ( () ) )
            // InternalExTwentyOne.g:2736:1: ( () )
            {
            // InternalExTwentyOne.g:2736:1: ( () )
            // InternalExTwentyOne.g:2737:2: ()
            {
             before(grammarAccess.getExpAccess().getDivideLeftAction_1_0_3_0()); 
            // InternalExTwentyOne.g:2738:2: ()
            // InternalExTwentyOne.g:2738:3: 
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
    // InternalExTwentyOne.g:2746:1: rule__Exp__Group_1_0_3__1 : rule__Exp__Group_1_0_3__1__Impl ;
    public final void rule__Exp__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2750:1: ( rule__Exp__Group_1_0_3__1__Impl )
            // InternalExTwentyOne.g:2751:2: rule__Exp__Group_1_0_3__1__Impl
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
    // InternalExTwentyOne.g:2757:1: rule__Exp__Group_1_0_3__1__Impl : ( '/' ) ;
    public final void rule__Exp__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2761:1: ( ( '/' ) )
            // InternalExTwentyOne.g:2762:1: ( '/' )
            {
            // InternalExTwentyOne.g:2762:1: ( '/' )
            // InternalExTwentyOne.g:2763:2: '/'
            {
             before(grammarAccess.getExpAccess().getSolidusKeyword_1_0_3_1()); 
            match(input,39,FOLLOW_2); 
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


    // $ANTLR start "rule__Primary__Group_4__0"
    // InternalExTwentyOne.g:2773:1: rule__Primary__Group_4__0 : rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 ;
    public final void rule__Primary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2777:1: ( rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 )
            // InternalExTwentyOne.g:2778:2: rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Primary__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__0"


    // $ANTLR start "rule__Primary__Group_4__0__Impl"
    // InternalExTwentyOne.g:2785:1: rule__Primary__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2789:1: ( ( '(' ) )
            // InternalExTwentyOne.g:2790:1: ( '(' )
            {
            // InternalExTwentyOne.g:2790:1: ( '(' )
            // InternalExTwentyOne.g:2791:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__0__Impl"


    // $ANTLR start "rule__Primary__Group_4__1"
    // InternalExTwentyOne.g:2800:1: rule__Primary__Group_4__1 : rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 ;
    public final void rule__Primary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2804:1: ( rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 )
            // InternalExTwentyOne.g:2805:2: rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Primary__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__1"


    // $ANTLR start "rule__Primary__Group_4__1__Impl"
    // InternalExTwentyOne.g:2812:1: rule__Primary__Group_4__1__Impl : ( ruleExp ) ;
    public final void rule__Primary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2816:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:2817:1: ( ruleExp )
            {
            // InternalExTwentyOne.g:2817:1: ( ruleExp )
            // InternalExTwentyOne.g:2818:2: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getExpParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpParserRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__1__Impl"


    // $ANTLR start "rule__Primary__Group_4__2"
    // InternalExTwentyOne.g:2827:1: rule__Primary__Group_4__2 : rule__Primary__Group_4__2__Impl ;
    public final void rule__Primary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2831:1: ( rule__Primary__Group_4__2__Impl )
            // InternalExTwentyOne.g:2832:2: rule__Primary__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__2"


    // $ANTLR start "rule__Primary__Group_4__2__Impl"
    // InternalExTwentyOne.g:2838:1: rule__Primary__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2842:1: ( ( ')' ) )
            // InternalExTwentyOne.g:2843:1: ( ')' )
            {
            // InternalExTwentyOne.g:2843:1: ( ')' )
            // InternalExTwentyOne.g:2844:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__2__Impl"


    // $ANTLR start "rule__IfThenElse__Group__0"
    // InternalExTwentyOne.g:2854:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2858:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // InternalExTwentyOne.g:2859:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalExTwentyOne.g:2866:1: rule__IfThenElse__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2870:1: ( ( 'if' ) )
            // InternalExTwentyOne.g:2871:1: ( 'if' )
            {
            // InternalExTwentyOne.g:2871:1: ( 'if' )
            // InternalExTwentyOne.g:2872:2: 'if'
            {
             before(grammarAccess.getIfThenElseAccess().getIfKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIfThenElseAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0__Impl"


    // $ANTLR start "rule__IfThenElse__Group__1"
    // InternalExTwentyOne.g:2881:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2885:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // InternalExTwentyOne.g:2886:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalExTwentyOne.g:2893:1: rule__IfThenElse__Group__1__Impl : ( ( rule__IfThenElse__IfLogicExpAssignment_1 ) ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2897:1: ( ( ( rule__IfThenElse__IfLogicExpAssignment_1 ) ) )
            // InternalExTwentyOne.g:2898:1: ( ( rule__IfThenElse__IfLogicExpAssignment_1 ) )
            {
            // InternalExTwentyOne.g:2898:1: ( ( rule__IfThenElse__IfLogicExpAssignment_1 ) )
            // InternalExTwentyOne.g:2899:2: ( rule__IfThenElse__IfLogicExpAssignment_1 )
            {
             before(grammarAccess.getIfThenElseAccess().getIfLogicExpAssignment_1()); 
            // InternalExTwentyOne.g:2900:2: ( rule__IfThenElse__IfLogicExpAssignment_1 )
            // InternalExTwentyOne.g:2900:3: rule__IfThenElse__IfLogicExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__IfLogicExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfThenElseAccess().getIfLogicExpAssignment_1()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:2908:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2912:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // InternalExTwentyOne.g:2913:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalExTwentyOne.g:2920:1: rule__IfThenElse__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2924:1: ( ( 'then' ) )
            // InternalExTwentyOne.g:2925:1: ( 'then' )
            {
            // InternalExTwentyOne.g:2925:1: ( 'then' )
            // InternalExTwentyOne.g:2926:2: 'then'
            {
             before(grammarAccess.getIfThenElseAccess().getThenKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getIfThenElseAccess().getThenKeyword_2()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:2935:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2939:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // InternalExTwentyOne.g:2940:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalExTwentyOne.g:2947:1: rule__IfThenElse__Group__3__Impl : ( ( rule__IfThenElse__ThenExpAssignment_3 ) ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2951:1: ( ( ( rule__IfThenElse__ThenExpAssignment_3 ) ) )
            // InternalExTwentyOne.g:2952:1: ( ( rule__IfThenElse__ThenExpAssignment_3 ) )
            {
            // InternalExTwentyOne.g:2952:1: ( ( rule__IfThenElse__ThenExpAssignment_3 ) )
            // InternalExTwentyOne.g:2953:2: ( rule__IfThenElse__ThenExpAssignment_3 )
            {
             before(grammarAccess.getIfThenElseAccess().getThenExpAssignment_3()); 
            // InternalExTwentyOne.g:2954:2: ( rule__IfThenElse__ThenExpAssignment_3 )
            // InternalExTwentyOne.g:2954:3: rule__IfThenElse__ThenExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__ThenExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfThenElseAccess().getThenExpAssignment_3()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:2962:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2966:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // InternalExTwentyOne.g:2967:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalExTwentyOne.g:2974:1: rule__IfThenElse__Group__4__Impl : ( 'else' ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2978:1: ( ( 'else' ) )
            // InternalExTwentyOne.g:2979:1: ( 'else' )
            {
            // InternalExTwentyOne.g:2979:1: ( 'else' )
            // InternalExTwentyOne.g:2980:2: 'else'
            {
             before(grammarAccess.getIfThenElseAccess().getElseKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getIfThenElseAccess().getElseKeyword_4()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:2989:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2993:1: ( rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 )
            // InternalExTwentyOne.g:2994:2: rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalExTwentyOne.g:3001:1: rule__IfThenElse__Group__5__Impl : ( ( rule__IfThenElse__ElseExpAssignment_5 ) ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3005:1: ( ( ( rule__IfThenElse__ElseExpAssignment_5 ) ) )
            // InternalExTwentyOne.g:3006:1: ( ( rule__IfThenElse__ElseExpAssignment_5 ) )
            {
            // InternalExTwentyOne.g:3006:1: ( ( rule__IfThenElse__ElseExpAssignment_5 ) )
            // InternalExTwentyOne.g:3007:2: ( rule__IfThenElse__ElseExpAssignment_5 )
            {
             before(grammarAccess.getIfThenElseAccess().getElseExpAssignment_5()); 
            // InternalExTwentyOne.g:3008:2: ( rule__IfThenElse__ElseExpAssignment_5 )
            // InternalExTwentyOne.g:3008:3: rule__IfThenElse__ElseExpAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__ElseExpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIfThenElseAccess().getElseExpAssignment_5()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3016:1: rule__IfThenElse__Group__6 : rule__IfThenElse__Group__6__Impl ;
    public final void rule__IfThenElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3020:1: ( rule__IfThenElse__Group__6__Impl )
            // InternalExTwentyOne.g:3021:2: rule__IfThenElse__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalExTwentyOne.g:3027:1: rule__IfThenElse__Group__6__Impl : ( 'end' ) ;
    public final void rule__IfThenElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3031:1: ( ( 'end' ) )
            // InternalExTwentyOne.g:3032:1: ( 'end' )
            {
            // InternalExTwentyOne.g:3032:1: ( 'end' )
            // InternalExTwentyOne.g:3033:2: 'end'
            {
             before(grammarAccess.getIfThenElseAccess().getEndKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getIfThenElseAccess().getEndKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__NewInput__Group__0"
    // InternalExTwentyOne.g:3043:1: rule__NewInput__Group__0 : rule__NewInput__Group__0__Impl rule__NewInput__Group__1 ;
    public final void rule__NewInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3047:1: ( rule__NewInput__Group__0__Impl rule__NewInput__Group__1 )
            // InternalExTwentyOne.g:3048:2: rule__NewInput__Group__0__Impl rule__NewInput__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalExTwentyOne.g:3055:1: rule__NewInput__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3059:1: ( ( 'new' ) )
            // InternalExTwentyOne.g:3060:1: ( 'new' )
            {
            // InternalExTwentyOne.g:3060:1: ( 'new' )
            // InternalExTwentyOne.g:3061:2: 'new'
            {
             before(grammarAccess.getNewInputAccess().getNewKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getNewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group__0__Impl"


    // $ANTLR start "rule__NewInput__Group__1"
    // InternalExTwentyOne.g:3070:1: rule__NewInput__Group__1 : rule__NewInput__Group__1__Impl rule__NewInput__Group__2 ;
    public final void rule__NewInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3074:1: ( rule__NewInput__Group__1__Impl rule__NewInput__Group__2 )
            // InternalExTwentyOne.g:3075:2: rule__NewInput__Group__1__Impl rule__NewInput__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalExTwentyOne.g:3082:1: rule__NewInput__Group__1__Impl : ( ( rule__NewInput__NewArrayIdAssignment_1 ) ) ;
    public final void rule__NewInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3086:1: ( ( ( rule__NewInput__NewArrayIdAssignment_1 ) ) )
            // InternalExTwentyOne.g:3087:1: ( ( rule__NewInput__NewArrayIdAssignment_1 ) )
            {
            // InternalExTwentyOne.g:3087:1: ( ( rule__NewInput__NewArrayIdAssignment_1 ) )
            // InternalExTwentyOne.g:3088:2: ( rule__NewInput__NewArrayIdAssignment_1 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdAssignment_1()); 
            // InternalExTwentyOne.g:3089:2: ( rule__NewInput__NewArrayIdAssignment_1 )
            // InternalExTwentyOne.g:3089:3: rule__NewInput__NewArrayIdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__NewArrayIdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getNewArrayIdAssignment_1()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3097:1: rule__NewInput__Group__2 : rule__NewInput__Group__2__Impl rule__NewInput__Group__3 ;
    public final void rule__NewInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3101:1: ( rule__NewInput__Group__2__Impl rule__NewInput__Group__3 )
            // InternalExTwentyOne.g:3102:2: rule__NewInput__Group__2__Impl rule__NewInput__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalExTwentyOne.g:3109:1: rule__NewInput__Group__2__Impl : ( '[' ) ;
    public final void rule__NewInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3113:1: ( ( '[' ) )
            // InternalExTwentyOne.g:3114:1: ( '[' )
            {
            // InternalExTwentyOne.g:3114:1: ( '[' )
            // InternalExTwentyOne.g:3115:2: '['
            {
             before(grammarAccess.getNewInputAccess().getLeftSquareBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3124:1: rule__NewInput__Group__3 : rule__NewInput__Group__3__Impl rule__NewInput__Group__4 ;
    public final void rule__NewInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3128:1: ( rule__NewInput__Group__3__Impl rule__NewInput__Group__4 )
            // InternalExTwentyOne.g:3129:2: rule__NewInput__Group__3__Impl rule__NewInput__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalExTwentyOne.g:3136:1: rule__NewInput__Group__3__Impl : ( ( rule__NewInput__NewArrayIdsAssignment_3 ) ) ;
    public final void rule__NewInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3140:1: ( ( ( rule__NewInput__NewArrayIdsAssignment_3 ) ) )
            // InternalExTwentyOne.g:3141:1: ( ( rule__NewInput__NewArrayIdsAssignment_3 ) )
            {
            // InternalExTwentyOne.g:3141:1: ( ( rule__NewInput__NewArrayIdsAssignment_3 ) )
            // InternalExTwentyOne.g:3142:2: ( rule__NewInput__NewArrayIdsAssignment_3 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_3()); 
            // InternalExTwentyOne.g:3143:2: ( rule__NewInput__NewArrayIdsAssignment_3 )
            // InternalExTwentyOne.g:3143:3: rule__NewInput__NewArrayIdsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__NewArrayIdsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_3()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3151:1: rule__NewInput__Group__4 : rule__NewInput__Group__4__Impl rule__NewInput__Group__5 ;
    public final void rule__NewInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3155:1: ( rule__NewInput__Group__4__Impl rule__NewInput__Group__5 )
            // InternalExTwentyOne.g:3156:2: rule__NewInput__Group__4__Impl rule__NewInput__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalExTwentyOne.g:3163:1: rule__NewInput__Group__4__Impl : ( '=' ) ;
    public final void rule__NewInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3167:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3168:1: ( '=' )
            {
            // InternalExTwentyOne.g:3168:1: ( '=' )
            // InternalExTwentyOne.g:3169:2: '='
            {
             before(grammarAccess.getNewInputAccess().getEqualsSignKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3178:1: rule__NewInput__Group__5 : rule__NewInput__Group__5__Impl rule__NewInput__Group__6 ;
    public final void rule__NewInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3182:1: ( rule__NewInput__Group__5__Impl rule__NewInput__Group__6 )
            // InternalExTwentyOne.g:3183:2: rule__NewInput__Group__5__Impl rule__NewInput__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalExTwentyOne.g:3190:1: rule__NewInput__Group__5__Impl : ( ( rule__NewInput__NewArrayExpsAssignment_5 ) ) ;
    public final void rule__NewInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3194:1: ( ( ( rule__NewInput__NewArrayExpsAssignment_5 ) ) )
            // InternalExTwentyOne.g:3195:1: ( ( rule__NewInput__NewArrayExpsAssignment_5 ) )
            {
            // InternalExTwentyOne.g:3195:1: ( ( rule__NewInput__NewArrayExpsAssignment_5 ) )
            // InternalExTwentyOne.g:3196:2: ( rule__NewInput__NewArrayExpsAssignment_5 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_5()); 
            // InternalExTwentyOne.g:3197:2: ( rule__NewInput__NewArrayExpsAssignment_5 )
            // InternalExTwentyOne.g:3197:3: rule__NewInput__NewArrayExpsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__NewArrayExpsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_5()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3205:1: rule__NewInput__Group__6 : rule__NewInput__Group__6__Impl rule__NewInput__Group__7 ;
    public final void rule__NewInput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3209:1: ( rule__NewInput__Group__6__Impl rule__NewInput__Group__7 )
            // InternalExTwentyOne.g:3210:2: rule__NewInput__Group__6__Impl rule__NewInput__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalExTwentyOne.g:3217:1: rule__NewInput__Group__6__Impl : ( ( rule__NewInput__Group_6__0 )* ) ;
    public final void rule__NewInput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3221:1: ( ( ( rule__NewInput__Group_6__0 )* ) )
            // InternalExTwentyOne.g:3222:1: ( ( rule__NewInput__Group_6__0 )* )
            {
            // InternalExTwentyOne.g:3222:1: ( ( rule__NewInput__Group_6__0 )* )
            // InternalExTwentyOne.g:3223:2: ( rule__NewInput__Group_6__0 )*
            {
             before(grammarAccess.getNewInputAccess().getGroup_6()); 
            // InternalExTwentyOne.g:3224:2: ( rule__NewInput__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExTwentyOne.g:3224:3: rule__NewInput__Group_6__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__NewInput__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNewInputAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3232:1: rule__NewInput__Group__7 : rule__NewInput__Group__7__Impl ;
    public final void rule__NewInput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3236:1: ( rule__NewInput__Group__7__Impl )
            // InternalExTwentyOne.g:3237:2: rule__NewInput__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalExTwentyOne.g:3243:1: rule__NewInput__Group__7__Impl : ( ']' ) ;
    public final void rule__NewInput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3247:1: ( ( ']' ) )
            // InternalExTwentyOne.g:3248:1: ( ']' )
            {
            // InternalExTwentyOne.g:3248:1: ( ']' )
            // InternalExTwentyOne.g:3249:2: ']'
            {
             before(grammarAccess.getNewInputAccess().getRightSquareBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__NewInput__Group_6__0"
    // InternalExTwentyOne.g:3259:1: rule__NewInput__Group_6__0 : rule__NewInput__Group_6__0__Impl rule__NewInput__Group_6__1 ;
    public final void rule__NewInput__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3263:1: ( rule__NewInput__Group_6__0__Impl rule__NewInput__Group_6__1 )
            // InternalExTwentyOne.g:3264:2: rule__NewInput__Group_6__0__Impl rule__NewInput__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__NewInput__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_6__0"


    // $ANTLR start "rule__NewInput__Group_6__0__Impl"
    // InternalExTwentyOne.g:3271:1: rule__NewInput__Group_6__0__Impl : ( ',' ) ;
    public final void rule__NewInput__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3275:1: ( ( ',' ) )
            // InternalExTwentyOne.g:3276:1: ( ',' )
            {
            // InternalExTwentyOne.g:3276:1: ( ',' )
            // InternalExTwentyOne.g:3277:2: ','
            {
             before(grammarAccess.getNewInputAccess().getCommaKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_6__0__Impl"


    // $ANTLR start "rule__NewInput__Group_6__1"
    // InternalExTwentyOne.g:3286:1: rule__NewInput__Group_6__1 : rule__NewInput__Group_6__1__Impl rule__NewInput__Group_6__2 ;
    public final void rule__NewInput__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3290:1: ( rule__NewInput__Group_6__1__Impl rule__NewInput__Group_6__2 )
            // InternalExTwentyOne.g:3291:2: rule__NewInput__Group_6__1__Impl rule__NewInput__Group_6__2
            {
            pushFollow(FOLLOW_35);
            rule__NewInput__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_6__1"


    // $ANTLR start "rule__NewInput__Group_6__1__Impl"
    // InternalExTwentyOne.g:3298:1: rule__NewInput__Group_6__1__Impl : ( ( rule__NewInput__NewArrayIdsAssignment_6_1 ) ) ;
    public final void rule__NewInput__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3302:1: ( ( ( rule__NewInput__NewArrayIdsAssignment_6_1 ) ) )
            // InternalExTwentyOne.g:3303:1: ( ( rule__NewInput__NewArrayIdsAssignment_6_1 ) )
            {
            // InternalExTwentyOne.g:3303:1: ( ( rule__NewInput__NewArrayIdsAssignment_6_1 ) )
            // InternalExTwentyOne.g:3304:2: ( rule__NewInput__NewArrayIdsAssignment_6_1 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_6_1()); 
            // InternalExTwentyOne.g:3305:2: ( rule__NewInput__NewArrayIdsAssignment_6_1 )
            // InternalExTwentyOne.g:3305:3: rule__NewInput__NewArrayIdsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__NewArrayIdsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_6__1__Impl"


    // $ANTLR start "rule__NewInput__Group_6__2"
    // InternalExTwentyOne.g:3313:1: rule__NewInput__Group_6__2 : rule__NewInput__Group_6__2__Impl rule__NewInput__Group_6__3 ;
    public final void rule__NewInput__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3317:1: ( rule__NewInput__Group_6__2__Impl rule__NewInput__Group_6__3 )
            // InternalExTwentyOne.g:3318:2: rule__NewInput__Group_6__2__Impl rule__NewInput__Group_6__3
            {
            pushFollow(FOLLOW_12);
            rule__NewInput__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewInput__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_6__2"


    // $ANTLR start "rule__NewInput__Group_6__2__Impl"
    // InternalExTwentyOne.g:3325:1: rule__NewInput__Group_6__2__Impl : ( '=' ) ;
    public final void rule__NewInput__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3329:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3330:1: ( '=' )
            {
            // InternalExTwentyOne.g:3330:1: ( '=' )
            // InternalExTwentyOne.g:3331:2: '='
            {
             before(grammarAccess.getNewInputAccess().getEqualsSignKeyword_6_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getEqualsSignKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_6__2__Impl"


    // $ANTLR start "rule__NewInput__Group_6__3"
    // InternalExTwentyOne.g:3340:1: rule__NewInput__Group_6__3 : rule__NewInput__Group_6__3__Impl ;
    public final void rule__NewInput__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3344:1: ( rule__NewInput__Group_6__3__Impl )
            // InternalExTwentyOne.g:3345:2: rule__NewInput__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_6__3"


    // $ANTLR start "rule__NewInput__Group_6__3__Impl"
    // InternalExTwentyOne.g:3351:1: rule__NewInput__Group_6__3__Impl : ( ( rule__NewInput__NewArrayExpsAssignment_6_3 ) ) ;
    public final void rule__NewInput__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3355:1: ( ( ( rule__NewInput__NewArrayExpsAssignment_6_3 ) ) )
            // InternalExTwentyOne.g:3356:1: ( ( rule__NewInput__NewArrayExpsAssignment_6_3 ) )
            {
            // InternalExTwentyOne.g:3356:1: ( ( rule__NewInput__NewArrayExpsAssignment_6_3 ) )
            // InternalExTwentyOne.g:3357:2: ( rule__NewInput__NewArrayExpsAssignment_6_3 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_6_3()); 
            // InternalExTwentyOne.g:3358:2: ( rule__NewInput__NewArrayExpsAssignment_6_3 )
            // InternalExTwentyOne.g:3358:3: rule__NewInput__NewArrayExpsAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__NewInput__NewArrayExpsAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__Group_6__3__Impl"


    // $ANTLR start "rule__LetBinding__Group__0"
    // InternalExTwentyOne.g:3367:1: rule__LetBinding__Group__0 : rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 ;
    public final void rule__LetBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3371:1: ( rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 )
            // InternalExTwentyOne.g:3372:2: rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalExTwentyOne.g:3379:1: rule__LetBinding__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3383:1: ( ( 'let' ) )
            // InternalExTwentyOne.g:3384:1: ( 'let' )
            {
            // InternalExTwentyOne.g:3384:1: ( 'let' )
            // InternalExTwentyOne.g:3385:2: 'let'
            {
             before(grammarAccess.getLetBindingAccess().getLetKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__0__Impl"


    // $ANTLR start "rule__LetBinding__Group__1"
    // InternalExTwentyOne.g:3394:1: rule__LetBinding__Group__1 : rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 ;
    public final void rule__LetBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3398:1: ( rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 )
            // InternalExTwentyOne.g:3399:2: rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalExTwentyOne.g:3406:1: rule__LetBinding__Group__1__Impl : ( ( rule__LetBinding__NameAssignment_1 ) ) ;
    public final void rule__LetBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3410:1: ( ( ( rule__LetBinding__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:3411:1: ( ( rule__LetBinding__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:3411:1: ( ( rule__LetBinding__NameAssignment_1 ) )
            // InternalExTwentyOne.g:3412:2: ( rule__LetBinding__NameAssignment_1 )
            {
             before(grammarAccess.getLetBindingAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:3413:2: ( rule__LetBinding__NameAssignment_1 )
            // InternalExTwentyOne.g:3413:3: rule__LetBinding__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3421:1: rule__LetBinding__Group__2 : rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 ;
    public final void rule__LetBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3425:1: ( rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 )
            // InternalExTwentyOne.g:3426:2: rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalExTwentyOne.g:3433:1: rule__LetBinding__Group__2__Impl : ( '=' ) ;
    public final void rule__LetBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3437:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3438:1: ( '=' )
            {
            // InternalExTwentyOne.g:3438:1: ( '=' )
            // InternalExTwentyOne.g:3439:2: '='
            {
             before(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3448:1: rule__LetBinding__Group__3 : rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 ;
    public final void rule__LetBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3452:1: ( rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 )
            // InternalExTwentyOne.g:3453:2: rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalExTwentyOne.g:3460:1: rule__LetBinding__Group__3__Impl : ( ( rule__LetBinding__BindingAssignment_3 ) ) ;
    public final void rule__LetBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3464:1: ( ( ( rule__LetBinding__BindingAssignment_3 ) ) )
            // InternalExTwentyOne.g:3465:1: ( ( rule__LetBinding__BindingAssignment_3 ) )
            {
            // InternalExTwentyOne.g:3465:1: ( ( rule__LetBinding__BindingAssignment_3 ) )
            // InternalExTwentyOne.g:3466:2: ( rule__LetBinding__BindingAssignment_3 )
            {
             before(grammarAccess.getLetBindingAccess().getBindingAssignment_3()); 
            // InternalExTwentyOne.g:3467:2: ( rule__LetBinding__BindingAssignment_3 )
            // InternalExTwentyOne.g:3467:3: rule__LetBinding__BindingAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__BindingAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getBindingAssignment_3()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3475:1: rule__LetBinding__Group__4 : rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 ;
    public final void rule__LetBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3479:1: ( rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 )
            // InternalExTwentyOne.g:3480:2: rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalExTwentyOne.g:3487:1: rule__LetBinding__Group__4__Impl : ( 'in' ) ;
    public final void rule__LetBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3491:1: ( ( 'in' ) )
            // InternalExTwentyOne.g:3492:1: ( 'in' )
            {
            // InternalExTwentyOne.g:3492:1: ( 'in' )
            // InternalExTwentyOne.g:3493:2: 'in'
            {
             before(grammarAccess.getLetBindingAccess().getInKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getInKeyword_4()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3502:1: rule__LetBinding__Group__5 : rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 ;
    public final void rule__LetBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3506:1: ( rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 )
            // InternalExTwentyOne.g:3507:2: rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalExTwentyOne.g:3514:1: rule__LetBinding__Group__5__Impl : ( ( rule__LetBinding__BodyAssignment_5 ) ) ;
    public final void rule__LetBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3518:1: ( ( ( rule__LetBinding__BodyAssignment_5 ) ) )
            // InternalExTwentyOne.g:3519:1: ( ( rule__LetBinding__BodyAssignment_5 ) )
            {
            // InternalExTwentyOne.g:3519:1: ( ( rule__LetBinding__BodyAssignment_5 ) )
            // InternalExTwentyOne.g:3520:2: ( rule__LetBinding__BodyAssignment_5 )
            {
             before(grammarAccess.getLetBindingAccess().getBodyAssignment_5()); 
            // InternalExTwentyOne.g:3521:2: ( rule__LetBinding__BodyAssignment_5 )
            // InternalExTwentyOne.g:3521:3: rule__LetBinding__BodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__BodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getBodyAssignment_5()); 

            }


            }

        }
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
    // InternalExTwentyOne.g:3529:1: rule__LetBinding__Group__6 : rule__LetBinding__Group__6__Impl ;
    public final void rule__LetBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3533:1: ( rule__LetBinding__Group__6__Impl )
            // InternalExTwentyOne.g:3534:2: rule__LetBinding__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalExTwentyOne.g:3540:1: rule__LetBinding__Group__6__Impl : ( 'end' ) ;
    public final void rule__LetBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3544:1: ( ( 'end' ) )
            // InternalExTwentyOne.g:3545:1: ( 'end' )
            {
            // InternalExTwentyOne.g:3545:1: ( 'end' )
            // InternalExTwentyOne.g:3546:2: 'end'
            {
             before(grammarAccess.getLetBindingAccess().getEndKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getEndKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__LogicExp__Group__0"
    // InternalExTwentyOne.g:3556:1: rule__LogicExp__Group__0 : rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 ;
    public final void rule__LogicExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3560:1: ( rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 )
            // InternalExTwentyOne.g:3561:2: rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalExTwentyOne.g:3568:1: rule__LogicExp__Group__0__Impl : ( ( rule__LogicExp__LeftLogicAssignment_0 ) ) ;
    public final void rule__LogicExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3572:1: ( ( ( rule__LogicExp__LeftLogicAssignment_0 ) ) )
            // InternalExTwentyOne.g:3573:1: ( ( rule__LogicExp__LeftLogicAssignment_0 ) )
            {
            // InternalExTwentyOne.g:3573:1: ( ( rule__LogicExp__LeftLogicAssignment_0 ) )
            // InternalExTwentyOne.g:3574:2: ( rule__LogicExp__LeftLogicAssignment_0 )
            {
             before(grammarAccess.getLogicExpAccess().getLeftLogicAssignment_0()); 
            // InternalExTwentyOne.g:3575:2: ( rule__LogicExp__LeftLogicAssignment_0 )
            // InternalExTwentyOne.g:3575:3: rule__LogicExp__LeftLogicAssignment_0
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
    // InternalExTwentyOne.g:3583:1: rule__LogicExp__Group__1 : rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 ;
    public final void rule__LogicExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3587:1: ( rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 )
            // InternalExTwentyOne.g:3588:2: rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2
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
    // InternalExTwentyOne.g:3595:1: rule__LogicExp__Group__1__Impl : ( ( rule__LogicExp__Alternatives_1 ) ) ;
    public final void rule__LogicExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3599:1: ( ( ( rule__LogicExp__Alternatives_1 ) ) )
            // InternalExTwentyOne.g:3600:1: ( ( rule__LogicExp__Alternatives_1 ) )
            {
            // InternalExTwentyOne.g:3600:1: ( ( rule__LogicExp__Alternatives_1 ) )
            // InternalExTwentyOne.g:3601:2: ( rule__LogicExp__Alternatives_1 )
            {
             before(grammarAccess.getLogicExpAccess().getAlternatives_1()); 
            // InternalExTwentyOne.g:3602:2: ( rule__LogicExp__Alternatives_1 )
            // InternalExTwentyOne.g:3602:3: rule__LogicExp__Alternatives_1
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
    // InternalExTwentyOne.g:3610:1: rule__LogicExp__Group__2 : rule__LogicExp__Group__2__Impl ;
    public final void rule__LogicExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3614:1: ( rule__LogicExp__Group__2__Impl )
            // InternalExTwentyOne.g:3615:2: rule__LogicExp__Group__2__Impl
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
    // InternalExTwentyOne.g:3621:1: rule__LogicExp__Group__2__Impl : ( ( rule__LogicExp__RightLogicAssignment_2 ) ) ;
    public final void rule__LogicExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3625:1: ( ( ( rule__LogicExp__RightLogicAssignment_2 ) ) )
            // InternalExTwentyOne.g:3626:1: ( ( rule__LogicExp__RightLogicAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3626:1: ( ( rule__LogicExp__RightLogicAssignment_2 ) )
            // InternalExTwentyOne.g:3627:2: ( rule__LogicExp__RightLogicAssignment_2 )
            {
             before(grammarAccess.getLogicExpAccess().getRightLogicAssignment_2()); 
            // InternalExTwentyOne.g:3628:2: ( rule__LogicExp__RightLogicAssignment_2 )
            // InternalExTwentyOne.g:3628:3: rule__LogicExp__RightLogicAssignment_2
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
    // InternalExTwentyOne.g:3637:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3641:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3642:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3642:2: ( RULE_ID )
            // InternalExTwentyOne.g:3643:3: RULE_ID
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
    // InternalExTwentyOne.g:3652:1: rule__Program__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Program__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3656:1: ( ( ruleDeclaration ) )
            // InternalExTwentyOne.g:3657:2: ( ruleDeclaration )
            {
            // InternalExTwentyOne.g:3657:2: ( ruleDeclaration )
            // InternalExTwentyOne.g:3658:3: ruleDeclaration
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
    // InternalExTwentyOne.g:3667:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3671:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3672:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3672:2: ( RULE_ID )
            // InternalExTwentyOne.g:3673:3: RULE_ID
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
    // InternalExTwentyOne.g:3682:1: rule__Function__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3686:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3687:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3687:2: ( RULE_ID )
            // InternalExTwentyOne.g:3688:3: RULE_ID
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
    // InternalExTwentyOne.g:3697:1: rule__Function__LambdaAssignment_3 : ( ruleLambda ) ;
    public final void rule__Function__LambdaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3701:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:3702:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:3702:2: ( ruleLambda )
            // InternalExTwentyOne.g:3703:3: ruleLambda
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
    // InternalExTwentyOne.g:3712:1: rule__Lambda__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Lambda__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3716:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3717:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3717:2: ( RULE_ID )
            // InternalExTwentyOne.g:3718:3: RULE_ID
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
    // InternalExTwentyOne.g:3727:1: rule__Lambda__LambdaExpAssignment_7 : ( ruleExp ) ;
    public final void rule__Lambda__LambdaExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3731:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:3732:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:3732:2: ( ruleExp )
            // InternalExTwentyOne.g:3733:3: ruleExp
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
    // InternalExTwentyOne.g:3742:1: rule__Input__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3746:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3747:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3747:2: ( RULE_ID )
            // InternalExTwentyOne.g:3748:3: RULE_ID
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
    // InternalExTwentyOne.g:3757:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3761:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3762:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3762:2: ( RULE_ID )
            // InternalExTwentyOne.g:3763:3: RULE_ID
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
    // InternalExTwentyOne.g:3772:1: rule__Node__FunctionAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__FunctionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3776:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3777:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3777:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3778:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_4_0_0()); 
            // InternalExTwentyOne.g:3779:3: ( RULE_ID )
            // InternalExTwentyOne.g:3780:4: RULE_ID
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
    // InternalExTwentyOne.g:3791:1: rule__Node__LambdaAssignment_4_1 : ( ruleLambda ) ;
    public final void rule__Node__LambdaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3795:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:3796:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:3796:2: ( ruleLambda )
            // InternalExTwentyOne.g:3797:3: ruleLambda
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
    // InternalExTwentyOne.g:3806:1: rule__Stream__InputsOrNodesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsOrNodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3810:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3811:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3811:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3812:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_2_0()); 
            // InternalExTwentyOne.g:3813:3: ( RULE_ID )
            // InternalExTwentyOne.g:3814:4: RULE_ID
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
    // InternalExTwentyOne.g:3825:1: rule__Stream__InputsOrNodesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsOrNodesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3829:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3830:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3830:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3831:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_3_1_0()); 
            // InternalExTwentyOne.g:3832:3: ( RULE_ID )
            // InternalExTwentyOne.g:3833:4: RULE_ID
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
    // InternalExTwentyOne.g:3844:1: rule__Stream__ElementsAssignment_4_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3848:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:3849:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:3849:2: ( ruleElement )
            // InternalExTwentyOne.g:3850:3: ruleElement
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
    // InternalExTwentyOne.g:3859:1: rule__Stream__ElementsAssignment_4_2_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3863:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:3864:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:3864:2: ( ruleElement )
            // InternalExTwentyOne.g:3865:3: ruleElement
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
    // InternalExTwentyOne.g:3874:1: rule__Element__ElementAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Element__ElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3878:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3879:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3879:2: ( RULE_ID )
            // InternalExTwentyOne.g:3880:3: RULE_ID
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
    // InternalExTwentyOne.g:3889:1: rule__Element__NodeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Element__NodeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3893:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3894:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3894:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3895:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getNodeNodeOrFunctionCrossReference_1_1_0_0()); 
            // InternalExTwentyOne.g:3896:3: ( RULE_ID )
            // InternalExTwentyOne.g:3897:4: RULE_ID
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
    // InternalExTwentyOne.g:3908:1: rule__Element__OutputAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Element__OutputAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3912:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3913:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3913:2: ( RULE_ID )
            // InternalExTwentyOne.g:3914:3: RULE_ID
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
    // InternalExTwentyOne.g:3923:1: rule__DataDecl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3927:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3928:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3928:2: ( RULE_ID )
            // InternalExTwentyOne.g:3929:3: RULE_ID
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
    // InternalExTwentyOne.g:3938:1: rule__DataDecl__DataAssignment_4 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3942:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3943:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3943:2: ( RULE_ID )
            // InternalExTwentyOne.g:3944:3: RULE_ID
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
    // InternalExTwentyOne.g:3953:1: rule__DataDecl__DataAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3957:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3958:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3958:2: ( RULE_ID )
            // InternalExTwentyOne.g:3959:3: RULE_ID
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
    // InternalExTwentyOne.g:3968:1: rule__Exp__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3972:1: ( ( rulePrimary ) )
            // InternalExTwentyOne.g:3973:2: ( rulePrimary )
            {
            // InternalExTwentyOne.g:3973:2: ( rulePrimary )
            // InternalExTwentyOne.g:3974:3: rulePrimary
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


    // $ANTLR start "rule__IfThenElse__IfLogicExpAssignment_1"
    // InternalExTwentyOne.g:3983:1: rule__IfThenElse__IfLogicExpAssignment_1 : ( ruleLogicExp ) ;
    public final void rule__IfThenElse__IfLogicExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3987:1: ( ( ruleLogicExp ) )
            // InternalExTwentyOne.g:3988:2: ( ruleLogicExp )
            {
            // InternalExTwentyOne.g:3988:2: ( ruleLogicExp )
            // InternalExTwentyOne.g:3989:3: ruleLogicExp
            {
             before(grammarAccess.getIfThenElseAccess().getIfLogicExpLogicExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicExp();

            state._fsp--;

             after(grammarAccess.getIfThenElseAccess().getIfLogicExpLogicExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__IfLogicExpAssignment_1"


    // $ANTLR start "rule__IfThenElse__ThenExpAssignment_3"
    // InternalExTwentyOne.g:3998:1: rule__IfThenElse__ThenExpAssignment_3 : ( ruleExp ) ;
    public final void rule__IfThenElse__ThenExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4002:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4003:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4003:2: ( ruleExp )
            // InternalExTwentyOne.g:4004:3: ruleExp
            {
             before(grammarAccess.getIfThenElseAccess().getThenExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getIfThenElseAccess().getThenExpExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ThenExpAssignment_3"


    // $ANTLR start "rule__IfThenElse__ElseExpAssignment_5"
    // InternalExTwentyOne.g:4013:1: rule__IfThenElse__ElseExpAssignment_5 : ( ruleExp ) ;
    public final void rule__IfThenElse__ElseExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4017:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4018:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4018:2: ( ruleExp )
            // InternalExTwentyOne.g:4019:3: ruleExp
            {
             before(grammarAccess.getIfThenElseAccess().getElseExpExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getIfThenElseAccess().getElseExpExpParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ElseExpAssignment_5"


    // $ANTLR start "rule__NewInput__NewArrayIdAssignment_1"
    // InternalExTwentyOne.g:4028:1: rule__NewInput__NewArrayIdAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4032:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4033:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4033:2: ( RULE_ID )
            // InternalExTwentyOne.g:4034:3: RULE_ID
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getNewArrayIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__NewArrayIdAssignment_1"


    // $ANTLR start "rule__NewInput__NewArrayIdsAssignment_3"
    // InternalExTwentyOne.g:4043:1: rule__NewInput__NewArrayIdsAssignment_3 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4047:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4048:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4048:2: ( RULE_ID )
            // InternalExTwentyOne.g:4049:3: RULE_ID
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__NewArrayIdsAssignment_3"


    // $ANTLR start "rule__NewInput__NewArrayExpsAssignment_5"
    // InternalExTwentyOne.g:4058:1: rule__NewInput__NewArrayExpsAssignment_5 : ( ruleExp ) ;
    public final void rule__NewInput__NewArrayExpsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4062:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4063:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4063:2: ( ruleExp )
            // InternalExTwentyOne.g:4064:3: ruleExp
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__NewArrayExpsAssignment_5"


    // $ANTLR start "rule__NewInput__NewArrayIdsAssignment_6_1"
    // InternalExTwentyOne.g:4073:1: rule__NewInput__NewArrayIdsAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4077:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4078:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4078:2: ( RULE_ID )
            // InternalExTwentyOne.g:4079:3: RULE_ID
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__NewArrayIdsAssignment_6_1"


    // $ANTLR start "rule__NewInput__NewArrayExpsAssignment_6_3"
    // InternalExTwentyOne.g:4088:1: rule__NewInput__NewArrayExpsAssignment_6_3 : ( ruleExp ) ;
    public final void rule__NewInput__NewArrayExpsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4092:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4093:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4093:2: ( ruleExp )
            // InternalExTwentyOne.g:4094:3: ruleExp
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewInput__NewArrayExpsAssignment_6_3"


    // $ANTLR start "rule__LetBinding__NameAssignment_1"
    // InternalExTwentyOne.g:4103:1: rule__LetBinding__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LetBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4107:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4108:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4108:2: ( RULE_ID )
            // InternalExTwentyOne.g:4109:3: RULE_ID
            {
             before(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__NameAssignment_1"


    // $ANTLR start "rule__LetBinding__BindingAssignment_3"
    // InternalExTwentyOne.g:4118:1: rule__LetBinding__BindingAssignment_3 : ( ruleExp ) ;
    public final void rule__LetBinding__BindingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4122:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4123:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4123:2: ( ruleExp )
            // InternalExTwentyOne.g:4124:3: ruleExp
            {
             before(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__BindingAssignment_3"


    // $ANTLR start "rule__LetBinding__BodyAssignment_5"
    // InternalExTwentyOne.g:4133:1: rule__LetBinding__BodyAssignment_5 : ( ruleExp ) ;
    public final void rule__LetBinding__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4137:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4138:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4138:2: ( ruleExp )
            // InternalExTwentyOne.g:4139:3: ruleExp
            {
             before(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__BodyAssignment_5"


    // $ANTLR start "rule__LogicExp__LeftLogicAssignment_0"
    // InternalExTwentyOne.g:4148:1: rule__LogicExp__LeftLogicAssignment_0 : ( ruleExp ) ;
    public final void rule__LogicExp__LeftLogicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4152:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4153:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4153:2: ( ruleExp )
            // InternalExTwentyOne.g:4154:3: ruleExp
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
    // InternalExTwentyOne.g:4163:1: rule__LogicExp__RightLogicAssignment_2 : ( ruleExp ) ;
    public final void rule__LogicExp__RightLogicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4167:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4168:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4168:2: ( ruleExp )
            // InternalExTwentyOne.g:4169:3: ruleExp
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000310000803830L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000420000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000007C000L});

}