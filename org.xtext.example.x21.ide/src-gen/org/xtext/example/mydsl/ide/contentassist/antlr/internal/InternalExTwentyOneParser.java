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
    // InternalExTwentyOne.g:591:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:595:1: ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) )
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

            }
        }
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
    // InternalExTwentyOne.g:618:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) | ( ( rule__Exp__Group_1_0_2__0 ) ) | ( ( rule__Exp__Group_1_0_3__0 ) ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:622:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) | ( ( rule__Exp__Group_1_0_2__0 ) ) | ( ( rule__Exp__Group_1_0_3__0 ) ) )
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
                    // InternalExTwentyOne.g:623:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalExTwentyOne.g:623:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalExTwentyOne.g:624:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalExTwentyOne.g:625:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalExTwentyOne.g:625:4: rule__Exp__Group_1_0_0__0
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
                    // InternalExTwentyOne.g:629:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    {
                    // InternalExTwentyOne.g:629:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    // InternalExTwentyOne.g:630:3: ( rule__Exp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_1()); 
                    // InternalExTwentyOne.g:631:3: ( rule__Exp__Group_1_0_1__0 )
                    // InternalExTwentyOne.g:631:4: rule__Exp__Group_1_0_1__0
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
                    // InternalExTwentyOne.g:635:2: ( ( rule__Exp__Group_1_0_2__0 ) )
                    {
                    // InternalExTwentyOne.g:635:2: ( ( rule__Exp__Group_1_0_2__0 ) )
                    // InternalExTwentyOne.g:636:3: ( rule__Exp__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_2()); 
                    // InternalExTwentyOne.g:637:3: ( rule__Exp__Group_1_0_2__0 )
                    // InternalExTwentyOne.g:637:4: rule__Exp__Group_1_0_2__0
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
                    // InternalExTwentyOne.g:641:2: ( ( rule__Exp__Group_1_0_3__0 ) )
                    {
                    // InternalExTwentyOne.g:641:2: ( ( rule__Exp__Group_1_0_3__0 ) )
                    // InternalExTwentyOne.g:642:3: ( rule__Exp__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_3()); 
                    // InternalExTwentyOne.g:643:3: ( rule__Exp__Group_1_0_3__0 )
                    // InternalExTwentyOne.g:643:4: rule__Exp__Group_1_0_3__0
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
    // InternalExTwentyOne.g:651:1: rule__Primary__Alternatives : ( ( ruleType ) | ( ruleLetBinding ) | ( ruleIfThenElse ) | ( 'none' ) | ( ( rule__Primary__Group_4__0 ) ) | ( ruleNewInput ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:655:1: ( ( ruleType ) | ( ruleLetBinding ) | ( ruleIfThenElse ) | ( 'none' ) | ( ( rule__Primary__Group_4__0 ) ) | ( ruleNewInput ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
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
                    // InternalExTwentyOne.g:656:2: ( ruleType )
                    {
                    // InternalExTwentyOne.g:656:2: ( ruleType )
                    // InternalExTwentyOne.g:657:3: ruleType
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
                    // InternalExTwentyOne.g:662:2: ( ruleLetBinding )
                    {
                    // InternalExTwentyOne.g:662:2: ( ruleLetBinding )
                    // InternalExTwentyOne.g:663:3: ruleLetBinding
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
                    // InternalExTwentyOne.g:668:2: ( ruleIfThenElse )
                    {
                    // InternalExTwentyOne.g:668:2: ( ruleIfThenElse )
                    // InternalExTwentyOne.g:669:3: ruleIfThenElse
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
                    // InternalExTwentyOne.g:674:2: ( 'none' )
                    {
                    // InternalExTwentyOne.g:674:2: ( 'none' )
                    // InternalExTwentyOne.g:675:3: 'none'
                    {
                     before(grammarAccess.getPrimaryAccess().getNoneKeyword_3()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPrimaryAccess().getNoneKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:680:2: ( ( rule__Primary__Group_4__0 ) )
                    {
                    // InternalExTwentyOne.g:680:2: ( ( rule__Primary__Group_4__0 ) )
                    // InternalExTwentyOne.g:681:3: ( rule__Primary__Group_4__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_4()); 
                    // InternalExTwentyOne.g:682:3: ( rule__Primary__Group_4__0 )
                    // InternalExTwentyOne.g:682:4: rule__Primary__Group_4__0
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
                    // InternalExTwentyOne.g:686:2: ( ruleNewInput )
                    {
                    // InternalExTwentyOne.g:686:2: ( ruleNewInput )
                    // InternalExTwentyOne.g:687:3: ruleNewInput
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
    // InternalExTwentyOne.g:696:1: rule__LogicExp__Alternatives_1 : ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__LogicExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:700:1: ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
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
                    // InternalExTwentyOne.g:701:2: ( '=' )
                    {
                    // InternalExTwentyOne.g:701:2: ( '=' )
                    // InternalExTwentyOne.g:702:3: '='
                    {
                     before(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExTwentyOne.g:707:2: ( '<' )
                    {
                    // InternalExTwentyOne.g:707:2: ( '<' )
                    // InternalExTwentyOne.g:708:3: '<'
                    {
                     before(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExTwentyOne.g:713:2: ( '>' )
                    {
                    // InternalExTwentyOne.g:713:2: ( '>' )
                    // InternalExTwentyOne.g:714:3: '>'
                    {
                     before(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExTwentyOne.g:719:2: ( '<=' )
                    {
                    // InternalExTwentyOne.g:719:2: ( '<=' )
                    // InternalExTwentyOne.g:720:3: '<='
                    {
                     before(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalExTwentyOne.g:725:2: ( '>=' )
                    {
                    // InternalExTwentyOne.g:725:2: ( '>=' )
                    // InternalExTwentyOne.g:726:3: '>='
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
    // InternalExTwentyOne.g:735:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:739:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalExTwentyOne.g:740:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalExTwentyOne.g:747:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:751:1: ( ( 'program' ) )
            // InternalExTwentyOne.g:752:1: ( 'program' )
            {
            // InternalExTwentyOne.g:752:1: ( 'program' )
            // InternalExTwentyOne.g:753:2: 'program'
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
    // InternalExTwentyOne.g:762:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:766:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalExTwentyOne.g:767:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalExTwentyOne.g:774:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:778:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:779:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:779:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalExTwentyOne.g:780:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:781:2: ( rule__Program__NameAssignment_1 )
            // InternalExTwentyOne.g:781:3: rule__Program__NameAssignment_1
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
    // InternalExTwentyOne.g:789:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:793:1: ( rule__Program__Group__2__Impl )
            // InternalExTwentyOne.g:794:2: rule__Program__Group__2__Impl
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
    // InternalExTwentyOne.g:800:1: rule__Program__Group__2__Impl : ( ( rule__Program__DeclarationsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:804:1: ( ( ( rule__Program__DeclarationsAssignment_2 )* ) )
            // InternalExTwentyOne.g:805:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            {
            // InternalExTwentyOne.g:805:1: ( ( rule__Program__DeclarationsAssignment_2 )* )
            // InternalExTwentyOne.g:806:2: ( rule__Program__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getDeclarationsAssignment_2()); 
            // InternalExTwentyOne.g:807:2: ( rule__Program__DeclarationsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20||LA9_0==22||(LA9_0>=27 && LA9_0<=28)||LA9_0==31||LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExTwentyOne.g:807:3: rule__Program__DeclarationsAssignment_2
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
    // InternalExTwentyOne.g:816:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:820:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalExTwentyOne.g:821:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalExTwentyOne.g:828:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:832:1: ( ( 'parameter' ) )
            // InternalExTwentyOne.g:833:1: ( 'parameter' )
            {
            // InternalExTwentyOne.g:833:1: ( 'parameter' )
            // InternalExTwentyOne.g:834:2: 'parameter'
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
    // InternalExTwentyOne.g:843:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:847:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalExTwentyOne.g:848:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalExTwentyOne.g:855:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:859:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:860:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:860:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalExTwentyOne.g:861:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:862:2: ( rule__Parameter__NameAssignment_1 )
            // InternalExTwentyOne.g:862:3: rule__Parameter__NameAssignment_1
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
    // InternalExTwentyOne.g:870:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:874:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalExTwentyOne.g:875:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalExTwentyOne.g:882:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:886:1: ( ( ':' ) )
            // InternalExTwentyOne.g:887:1: ( ':' )
            {
            // InternalExTwentyOne.g:887:1: ( ':' )
            // InternalExTwentyOne.g:888:2: ':'
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
    // InternalExTwentyOne.g:897:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:901:1: ( rule__Parameter__Group__3__Impl )
            // InternalExTwentyOne.g:902:2: rule__Parameter__Group__3__Impl
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
    // InternalExTwentyOne.g:908:1: rule__Parameter__Group__3__Impl : ( ruleType ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:912:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:913:1: ( ruleType )
            {
            // InternalExTwentyOne.g:913:1: ( ruleType )
            // InternalExTwentyOne.g:914:2: ruleType
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
    // InternalExTwentyOne.g:924:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:928:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalExTwentyOne.g:929:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalExTwentyOne.g:936:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:940:1: ( ( () ) )
            // InternalExTwentyOne.g:941:1: ( () )
            {
            // InternalExTwentyOne.g:941:1: ( () )
            // InternalExTwentyOne.g:942:2: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // InternalExTwentyOne.g:943:2: ()
            // InternalExTwentyOne.g:943:3: 
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
    // InternalExTwentyOne.g:951:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:955:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalExTwentyOne.g:956:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalExTwentyOne.g:963:1: rule__Function__Group__1__Impl : ( 'function' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:967:1: ( ( 'function' ) )
            // InternalExTwentyOne.g:968:1: ( 'function' )
            {
            // InternalExTwentyOne.g:968:1: ( 'function' )
            // InternalExTwentyOne.g:969:2: 'function'
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
    // InternalExTwentyOne.g:978:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:982:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalExTwentyOne.g:983:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalExTwentyOne.g:990:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:994:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:995:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:995:1: ( ( rule__Function__NameAssignment_2 ) )
            // InternalExTwentyOne.g:996:2: ( rule__Function__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:997:2: ( rule__Function__NameAssignment_2 )
            // InternalExTwentyOne.g:997:3: rule__Function__NameAssignment_2
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
    // InternalExTwentyOne.g:1005:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1009:1: ( rule__Function__Group__3__Impl )
            // InternalExTwentyOne.g:1010:2: rule__Function__Group__3__Impl
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
    // InternalExTwentyOne.g:1016:1: rule__Function__Group__3__Impl : ( ( rule__Function__LambdaAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1020:1: ( ( ( rule__Function__LambdaAssignment_3 ) ) )
            // InternalExTwentyOne.g:1021:1: ( ( rule__Function__LambdaAssignment_3 ) )
            {
            // InternalExTwentyOne.g:1021:1: ( ( rule__Function__LambdaAssignment_3 ) )
            // InternalExTwentyOne.g:1022:2: ( rule__Function__LambdaAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getLambdaAssignment_3()); 
            // InternalExTwentyOne.g:1023:2: ( rule__Function__LambdaAssignment_3 )
            // InternalExTwentyOne.g:1023:3: rule__Function__LambdaAssignment_3
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
    // InternalExTwentyOne.g:1032:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1036:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalExTwentyOne.g:1037:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
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
    // InternalExTwentyOne.g:1044:1: rule__Lambda__Group__0__Impl : ( () ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1048:1: ( ( () ) )
            // InternalExTwentyOne.g:1049:1: ( () )
            {
            // InternalExTwentyOne.g:1049:1: ( () )
            // InternalExTwentyOne.g:1050:2: ()
            {
             before(grammarAccess.getLambdaAccess().getLambdaAction_0()); 
            // InternalExTwentyOne.g:1051:2: ()
            // InternalExTwentyOne.g:1051:3: 
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
    // InternalExTwentyOne.g:1059:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1063:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalExTwentyOne.g:1064:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
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
    // InternalExTwentyOne.g:1071:1: rule__Lambda__Group__1__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1075:1: ( ( '(' ) )
            // InternalExTwentyOne.g:1076:1: ( '(' )
            {
            // InternalExTwentyOne.g:1076:1: ( '(' )
            // InternalExTwentyOne.g:1077:2: '('
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
    // InternalExTwentyOne.g:1086:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1090:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalExTwentyOne.g:1091:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
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
    // InternalExTwentyOne.g:1098:1: rule__Lambda__Group__2__Impl : ( ( rule__Lambda__NameAssignment_2 ) ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1102:1: ( ( ( rule__Lambda__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1103:1: ( ( rule__Lambda__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1103:1: ( ( rule__Lambda__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1104:2: ( rule__Lambda__NameAssignment_2 )
            {
             before(grammarAccess.getLambdaAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1105:2: ( rule__Lambda__NameAssignment_2 )
            // InternalExTwentyOne.g:1105:3: rule__Lambda__NameAssignment_2
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
    // InternalExTwentyOne.g:1113:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1117:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalExTwentyOne.g:1118:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
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
    // InternalExTwentyOne.g:1125:1: rule__Lambda__Group__3__Impl : ( ':' ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1129:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1130:1: ( ':' )
            {
            // InternalExTwentyOne.g:1130:1: ( ':' )
            // InternalExTwentyOne.g:1131:2: ':'
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
    // InternalExTwentyOne.g:1140:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1144:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalExTwentyOne.g:1145:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
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
    // InternalExTwentyOne.g:1152:1: rule__Lambda__Group__4__Impl : ( ruleType ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1156:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1157:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1157:1: ( ruleType )
            // InternalExTwentyOne.g:1158:2: ruleType
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
    // InternalExTwentyOne.g:1167:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl rule__Lambda__Group__6 ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1171:1: ( rule__Lambda__Group__5__Impl rule__Lambda__Group__6 )
            // InternalExTwentyOne.g:1172:2: rule__Lambda__Group__5__Impl rule__Lambda__Group__6
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
    // InternalExTwentyOne.g:1179:1: rule__Lambda__Group__5__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1183:1: ( ( ')' ) )
            // InternalExTwentyOne.g:1184:1: ( ')' )
            {
            // InternalExTwentyOne.g:1184:1: ( ')' )
            // InternalExTwentyOne.g:1185:2: ')'
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
    // InternalExTwentyOne.g:1194:1: rule__Lambda__Group__6 : rule__Lambda__Group__6__Impl rule__Lambda__Group__7 ;
    public final void rule__Lambda__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1198:1: ( rule__Lambda__Group__6__Impl rule__Lambda__Group__7 )
            // InternalExTwentyOne.g:1199:2: rule__Lambda__Group__6__Impl rule__Lambda__Group__7
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
    // InternalExTwentyOne.g:1206:1: rule__Lambda__Group__6__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1210:1: ( ( '{' ) )
            // InternalExTwentyOne.g:1211:1: ( '{' )
            {
            // InternalExTwentyOne.g:1211:1: ( '{' )
            // InternalExTwentyOne.g:1212:2: '{'
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
    // InternalExTwentyOne.g:1221:1: rule__Lambda__Group__7 : rule__Lambda__Group__7__Impl rule__Lambda__Group__8 ;
    public final void rule__Lambda__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1225:1: ( rule__Lambda__Group__7__Impl rule__Lambda__Group__8 )
            // InternalExTwentyOne.g:1226:2: rule__Lambda__Group__7__Impl rule__Lambda__Group__8
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
    // InternalExTwentyOne.g:1233:1: rule__Lambda__Group__7__Impl : ( ( rule__Lambda__LambdaExpAssignment_7 ) ) ;
    public final void rule__Lambda__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1237:1: ( ( ( rule__Lambda__LambdaExpAssignment_7 ) ) )
            // InternalExTwentyOne.g:1238:1: ( ( rule__Lambda__LambdaExpAssignment_7 ) )
            {
            // InternalExTwentyOne.g:1238:1: ( ( rule__Lambda__LambdaExpAssignment_7 ) )
            // InternalExTwentyOne.g:1239:2: ( rule__Lambda__LambdaExpAssignment_7 )
            {
             before(grammarAccess.getLambdaAccess().getLambdaExpAssignment_7()); 
            // InternalExTwentyOne.g:1240:2: ( rule__Lambda__LambdaExpAssignment_7 )
            // InternalExTwentyOne.g:1240:3: rule__Lambda__LambdaExpAssignment_7
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
    // InternalExTwentyOne.g:1248:1: rule__Lambda__Group__8 : rule__Lambda__Group__8__Impl ;
    public final void rule__Lambda__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1252:1: ( rule__Lambda__Group__8__Impl )
            // InternalExTwentyOne.g:1253:2: rule__Lambda__Group__8__Impl
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
    // InternalExTwentyOne.g:1259:1: rule__Lambda__Group__8__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1263:1: ( ( '}' ) )
            // InternalExTwentyOne.g:1264:1: ( '}' )
            {
            // InternalExTwentyOne.g:1264:1: ( '}' )
            // InternalExTwentyOne.g:1265:2: '}'
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
    // InternalExTwentyOne.g:1275:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1279:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalExTwentyOne.g:1280:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalExTwentyOne.g:1287:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1291:1: ( ( () ) )
            // InternalExTwentyOne.g:1292:1: ( () )
            {
            // InternalExTwentyOne.g:1292:1: ( () )
            // InternalExTwentyOne.g:1293:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalExTwentyOne.g:1294:2: ()
            // InternalExTwentyOne.g:1294:3: 
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
    // InternalExTwentyOne.g:1302:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1306:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalExTwentyOne.g:1307:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalExTwentyOne.g:1314:1: rule__Input__Group__1__Impl : ( 'input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1318:1: ( ( 'input' ) )
            // InternalExTwentyOne.g:1319:1: ( 'input' )
            {
            // InternalExTwentyOne.g:1319:1: ( 'input' )
            // InternalExTwentyOne.g:1320:2: 'input'
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
    // InternalExTwentyOne.g:1329:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1333:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalExTwentyOne.g:1334:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalExTwentyOne.g:1341:1: rule__Input__Group__2__Impl : ( ( rule__Input__NameAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1345:1: ( ( ( rule__Input__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1346:1: ( ( rule__Input__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1346:1: ( ( rule__Input__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1347:2: ( rule__Input__NameAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1348:2: ( rule__Input__NameAssignment_2 )
            // InternalExTwentyOne.g:1348:3: rule__Input__NameAssignment_2
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
    // InternalExTwentyOne.g:1356:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1360:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalExTwentyOne.g:1361:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalExTwentyOne.g:1368:1: rule__Input__Group__3__Impl : ( ':' ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1372:1: ( ( ':' ) )
            // InternalExTwentyOne.g:1373:1: ( ':' )
            {
            // InternalExTwentyOne.g:1373:1: ( ':' )
            // InternalExTwentyOne.g:1374:2: ':'
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
    // InternalExTwentyOne.g:1383:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1387:1: ( rule__Input__Group__4__Impl )
            // InternalExTwentyOne.g:1388:2: rule__Input__Group__4__Impl
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
    // InternalExTwentyOne.g:1394:1: rule__Input__Group__4__Impl : ( ruleType ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1398:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:1399:1: ( ruleType )
            {
            // InternalExTwentyOne.g:1399:1: ( ruleType )
            // InternalExTwentyOne.g:1400:2: ruleType
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
    // InternalExTwentyOne.g:1410:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1414:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalExTwentyOne.g:1415:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalExTwentyOne.g:1422:1: rule__Node__Group__0__Impl : ( () ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1426:1: ( ( () ) )
            // InternalExTwentyOne.g:1427:1: ( () )
            {
            // InternalExTwentyOne.g:1427:1: ( () )
            // InternalExTwentyOne.g:1428:2: ()
            {
             before(grammarAccess.getNodeAccess().getNodeAction_0()); 
            // InternalExTwentyOne.g:1429:2: ()
            // InternalExTwentyOne.g:1429:3: 
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
    // InternalExTwentyOne.g:1437:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1441:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalExTwentyOne.g:1442:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalExTwentyOne.g:1449:1: rule__Node__Group__1__Impl : ( 'node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1453:1: ( ( 'node' ) )
            // InternalExTwentyOne.g:1454:1: ( 'node' )
            {
            // InternalExTwentyOne.g:1454:1: ( 'node' )
            // InternalExTwentyOne.g:1455:2: 'node'
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
    // InternalExTwentyOne.g:1464:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1468:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalExTwentyOne.g:1469:2: rule__Node__Group__2__Impl rule__Node__Group__3
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
    // InternalExTwentyOne.g:1476:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1480:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:1481:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1481:1: ( ( rule__Node__NameAssignment_2 ) )
            // InternalExTwentyOne.g:1482:2: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:1483:2: ( rule__Node__NameAssignment_2 )
            // InternalExTwentyOne.g:1483:3: rule__Node__NameAssignment_2
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
    // InternalExTwentyOne.g:1491:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1495:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalExTwentyOne.g:1496:2: rule__Node__Group__3__Impl rule__Node__Group__4
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
    // InternalExTwentyOne.g:1503:1: rule__Node__Group__3__Impl : ( '[' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1507:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1508:1: ( '[' )
            {
            // InternalExTwentyOne.g:1508:1: ( '[' )
            // InternalExTwentyOne.g:1509:2: '['
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
    // InternalExTwentyOne.g:1518:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1522:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // InternalExTwentyOne.g:1523:2: rule__Node__Group__4__Impl rule__Node__Group__5
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
    // InternalExTwentyOne.g:1530:1: rule__Node__Group__4__Impl : ( ( rule__Node__Alternatives_4 ) ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1534:1: ( ( ( rule__Node__Alternatives_4 ) ) )
            // InternalExTwentyOne.g:1535:1: ( ( rule__Node__Alternatives_4 ) )
            {
            // InternalExTwentyOne.g:1535:1: ( ( rule__Node__Alternatives_4 ) )
            // InternalExTwentyOne.g:1536:2: ( rule__Node__Alternatives_4 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_4()); 
            // InternalExTwentyOne.g:1537:2: ( rule__Node__Alternatives_4 )
            // InternalExTwentyOne.g:1537:3: rule__Node__Alternatives_4
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
    // InternalExTwentyOne.g:1545:1: rule__Node__Group__5 : rule__Node__Group__5__Impl ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1549:1: ( rule__Node__Group__5__Impl )
            // InternalExTwentyOne.g:1550:2: rule__Node__Group__5__Impl
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
    // InternalExTwentyOne.g:1556:1: rule__Node__Group__5__Impl : ( ']' ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1560:1: ( ( ']' ) )
            // InternalExTwentyOne.g:1561:1: ( ']' )
            {
            // InternalExTwentyOne.g:1561:1: ( ']' )
            // InternalExTwentyOne.g:1562:2: ']'
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
    // InternalExTwentyOne.g:1572:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1576:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // InternalExTwentyOne.g:1577:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
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
    // InternalExTwentyOne.g:1584:1: rule__Stream__Group__0__Impl : ( () ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1588:1: ( ( () ) )
            // InternalExTwentyOne.g:1589:1: ( () )
            {
            // InternalExTwentyOne.g:1589:1: ( () )
            // InternalExTwentyOne.g:1590:2: ()
            {
             before(grammarAccess.getStreamAccess().getStreamAction_0()); 
            // InternalExTwentyOne.g:1591:2: ()
            // InternalExTwentyOne.g:1591:3: 
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
    // InternalExTwentyOne.g:1599:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1603:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // InternalExTwentyOne.g:1604:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
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
    // InternalExTwentyOne.g:1611:1: rule__Stream__Group__1__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1615:1: ( ( 'stream' ) )
            // InternalExTwentyOne.g:1616:1: ( 'stream' )
            {
            // InternalExTwentyOne.g:1616:1: ( 'stream' )
            // InternalExTwentyOne.g:1617:2: 'stream'
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
    // InternalExTwentyOne.g:1626:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1630:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // InternalExTwentyOne.g:1631:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
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
    // InternalExTwentyOne.g:1638:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__InputsOrNodesAssignment_2 ) ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1642:1: ( ( ( rule__Stream__InputsOrNodesAssignment_2 ) ) )
            // InternalExTwentyOne.g:1643:1: ( ( rule__Stream__InputsOrNodesAssignment_2 ) )
            {
            // InternalExTwentyOne.g:1643:1: ( ( rule__Stream__InputsOrNodesAssignment_2 ) )
            // InternalExTwentyOne.g:1644:2: ( rule__Stream__InputsOrNodesAssignment_2 )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_2()); 
            // InternalExTwentyOne.g:1645:2: ( rule__Stream__InputsOrNodesAssignment_2 )
            // InternalExTwentyOne.g:1645:3: rule__Stream__InputsOrNodesAssignment_2
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
    // InternalExTwentyOne.g:1653:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl rule__Stream__Group__4 ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1657:1: ( rule__Stream__Group__3__Impl rule__Stream__Group__4 )
            // InternalExTwentyOne.g:1658:2: rule__Stream__Group__3__Impl rule__Stream__Group__4
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
    // InternalExTwentyOne.g:1665:1: rule__Stream__Group__3__Impl : ( ( rule__Stream__Group_3__0 )* ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1669:1: ( ( ( rule__Stream__Group_3__0 )* ) )
            // InternalExTwentyOne.g:1670:1: ( ( rule__Stream__Group_3__0 )* )
            {
            // InternalExTwentyOne.g:1670:1: ( ( rule__Stream__Group_3__0 )* )
            // InternalExTwentyOne.g:1671:2: ( rule__Stream__Group_3__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalExTwentyOne.g:1672:2: ( rule__Stream__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExTwentyOne.g:1672:3: rule__Stream__Group_3__0
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
    // InternalExTwentyOne.g:1680:1: rule__Stream__Group__4 : rule__Stream__Group__4__Impl ;
    public final void rule__Stream__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1684:1: ( rule__Stream__Group__4__Impl )
            // InternalExTwentyOne.g:1685:2: rule__Stream__Group__4__Impl
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
    // InternalExTwentyOne.g:1691:1: rule__Stream__Group__4__Impl : ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) ) ;
    public final void rule__Stream__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1695:1: ( ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) ) )
            // InternalExTwentyOne.g:1696:1: ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) )
            {
            // InternalExTwentyOne.g:1696:1: ( ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* ) )
            // InternalExTwentyOne.g:1697:2: ( ( rule__Stream__Group_4__0 ) ) ( ( rule__Stream__Group_4__0 )* )
            {
            // InternalExTwentyOne.g:1697:2: ( ( rule__Stream__Group_4__0 ) )
            // InternalExTwentyOne.g:1698:3: ( rule__Stream__Group_4__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_4()); 
            // InternalExTwentyOne.g:1699:3: ( rule__Stream__Group_4__0 )
            // InternalExTwentyOne.g:1699:4: rule__Stream__Group_4__0
            {
            pushFollow(FOLLOW_22);
            rule__Stream__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_4()); 

            }

            // InternalExTwentyOne.g:1702:2: ( ( rule__Stream__Group_4__0 )* )
            // InternalExTwentyOne.g:1703:3: ( rule__Stream__Group_4__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_4()); 
            // InternalExTwentyOne.g:1704:3: ( rule__Stream__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExTwentyOne.g:1704:4: rule__Stream__Group_4__0
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
    // InternalExTwentyOne.g:1714:1: rule__Stream__Group_3__0 : rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 ;
    public final void rule__Stream__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1718:1: ( rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 )
            // InternalExTwentyOne.g:1719:2: rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1
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
    // InternalExTwentyOne.g:1726:1: rule__Stream__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1730:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1731:1: ( ',' )
            {
            // InternalExTwentyOne.g:1731:1: ( ',' )
            // InternalExTwentyOne.g:1732:2: ','
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
    // InternalExTwentyOne.g:1741:1: rule__Stream__Group_3__1 : rule__Stream__Group_3__1__Impl ;
    public final void rule__Stream__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1745:1: ( rule__Stream__Group_3__1__Impl )
            // InternalExTwentyOne.g:1746:2: rule__Stream__Group_3__1__Impl
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
    // InternalExTwentyOne.g:1752:1: rule__Stream__Group_3__1__Impl : ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) ) ;
    public final void rule__Stream__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1756:1: ( ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) ) )
            // InternalExTwentyOne.g:1757:1: ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) )
            {
            // InternalExTwentyOne.g:1757:1: ( ( rule__Stream__InputsOrNodesAssignment_3_1 ) )
            // InternalExTwentyOne.g:1758:2: ( rule__Stream__InputsOrNodesAssignment_3_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesAssignment_3_1()); 
            // InternalExTwentyOne.g:1759:2: ( rule__Stream__InputsOrNodesAssignment_3_1 )
            // InternalExTwentyOne.g:1759:3: rule__Stream__InputsOrNodesAssignment_3_1
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
    // InternalExTwentyOne.g:1768:1: rule__Stream__Group_4__0 : rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1 ;
    public final void rule__Stream__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1772:1: ( rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1 )
            // InternalExTwentyOne.g:1773:2: rule__Stream__Group_4__0__Impl rule__Stream__Group_4__1
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
    // InternalExTwentyOne.g:1780:1: rule__Stream__Group_4__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1784:1: ( ( 'to' ) )
            // InternalExTwentyOne.g:1785:1: ( 'to' )
            {
            // InternalExTwentyOne.g:1785:1: ( 'to' )
            // InternalExTwentyOne.g:1786:2: 'to'
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
    // InternalExTwentyOne.g:1795:1: rule__Stream__Group_4__1 : rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2 ;
    public final void rule__Stream__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1799:1: ( rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2 )
            // InternalExTwentyOne.g:1800:2: rule__Stream__Group_4__1__Impl rule__Stream__Group_4__2
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
    // InternalExTwentyOne.g:1807:1: rule__Stream__Group_4__1__Impl : ( ( rule__Stream__ElementsAssignment_4_1 ) ) ;
    public final void rule__Stream__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1811:1: ( ( ( rule__Stream__ElementsAssignment_4_1 ) ) )
            // InternalExTwentyOne.g:1812:1: ( ( rule__Stream__ElementsAssignment_4_1 ) )
            {
            // InternalExTwentyOne.g:1812:1: ( ( rule__Stream__ElementsAssignment_4_1 ) )
            // InternalExTwentyOne.g:1813:2: ( rule__Stream__ElementsAssignment_4_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_4_1()); 
            // InternalExTwentyOne.g:1814:2: ( rule__Stream__ElementsAssignment_4_1 )
            // InternalExTwentyOne.g:1814:3: rule__Stream__ElementsAssignment_4_1
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
    // InternalExTwentyOne.g:1822:1: rule__Stream__Group_4__2 : rule__Stream__Group_4__2__Impl ;
    public final void rule__Stream__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1826:1: ( rule__Stream__Group_4__2__Impl )
            // InternalExTwentyOne.g:1827:2: rule__Stream__Group_4__2__Impl
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
    // InternalExTwentyOne.g:1833:1: rule__Stream__Group_4__2__Impl : ( ( rule__Stream__Group_4_2__0 )* ) ;
    public final void rule__Stream__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1837:1: ( ( ( rule__Stream__Group_4_2__0 )* ) )
            // InternalExTwentyOne.g:1838:1: ( ( rule__Stream__Group_4_2__0 )* )
            {
            // InternalExTwentyOne.g:1838:1: ( ( rule__Stream__Group_4_2__0 )* )
            // InternalExTwentyOne.g:1839:2: ( rule__Stream__Group_4_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_4_2()); 
            // InternalExTwentyOne.g:1840:2: ( rule__Stream__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExTwentyOne.g:1840:3: rule__Stream__Group_4_2__0
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
    // InternalExTwentyOne.g:1849:1: rule__Stream__Group_4_2__0 : rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1 ;
    public final void rule__Stream__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1853:1: ( rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1 )
            // InternalExTwentyOne.g:1854:2: rule__Stream__Group_4_2__0__Impl rule__Stream__Group_4_2__1
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
    // InternalExTwentyOne.g:1861:1: rule__Stream__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1865:1: ( ( ',' ) )
            // InternalExTwentyOne.g:1866:1: ( ',' )
            {
            // InternalExTwentyOne.g:1866:1: ( ',' )
            // InternalExTwentyOne.g:1867:2: ','
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
    // InternalExTwentyOne.g:1876:1: rule__Stream__Group_4_2__1 : rule__Stream__Group_4_2__1__Impl ;
    public final void rule__Stream__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1880:1: ( rule__Stream__Group_4_2__1__Impl )
            // InternalExTwentyOne.g:1881:2: rule__Stream__Group_4_2__1__Impl
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
    // InternalExTwentyOne.g:1887:1: rule__Stream__Group_4_2__1__Impl : ( ( rule__Stream__ElementsAssignment_4_2_1 ) ) ;
    public final void rule__Stream__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1891:1: ( ( ( rule__Stream__ElementsAssignment_4_2_1 ) ) )
            // InternalExTwentyOne.g:1892:1: ( ( rule__Stream__ElementsAssignment_4_2_1 ) )
            {
            // InternalExTwentyOne.g:1892:1: ( ( rule__Stream__ElementsAssignment_4_2_1 ) )
            // InternalExTwentyOne.g:1893:2: ( rule__Stream__ElementsAssignment_4_2_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_4_2_1()); 
            // InternalExTwentyOne.g:1894:2: ( rule__Stream__ElementsAssignment_4_2_1 )
            // InternalExTwentyOne.g:1894:3: rule__Stream__ElementsAssignment_4_2_1
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
    // InternalExTwentyOne.g:1903:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1907:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // InternalExTwentyOne.g:1908:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
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
    // InternalExTwentyOne.g:1915:1: rule__Element__Group_0__0__Impl : ( () ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1919:1: ( ( () ) )
            // InternalExTwentyOne.g:1920:1: ( () )
            {
            // InternalExTwentyOne.g:1920:1: ( () )
            // InternalExTwentyOne.g:1921:2: ()
            {
             before(grammarAccess.getElementAccess().getElementAction_0_0()); 
            // InternalExTwentyOne.g:1922:2: ()
            // InternalExTwentyOne.g:1922:3: 
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
    // InternalExTwentyOne.g:1930:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1934:1: ( rule__Element__Group_0__1__Impl )
            // InternalExTwentyOne.g:1935:2: rule__Element__Group_0__1__Impl
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
    // InternalExTwentyOne.g:1941:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__ElementAssignment_0_1 ) ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1945:1: ( ( ( rule__Element__ElementAssignment_0_1 ) ) )
            // InternalExTwentyOne.g:1946:1: ( ( rule__Element__ElementAssignment_0_1 ) )
            {
            // InternalExTwentyOne.g:1946:1: ( ( rule__Element__ElementAssignment_0_1 ) )
            // InternalExTwentyOne.g:1947:2: ( rule__Element__ElementAssignment_0_1 )
            {
             before(grammarAccess.getElementAccess().getElementAssignment_0_1()); 
            // InternalExTwentyOne.g:1948:2: ( rule__Element__ElementAssignment_0_1 )
            // InternalExTwentyOne.g:1948:3: rule__Element__ElementAssignment_0_1
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
    // InternalExTwentyOne.g:1957:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1961:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalExTwentyOne.g:1962:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
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
    // InternalExTwentyOne.g:1969:1: rule__Element__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1973:1: ( ( '[' ) )
            // InternalExTwentyOne.g:1974:1: ( '[' )
            {
            // InternalExTwentyOne.g:1974:1: ( '[' )
            // InternalExTwentyOne.g:1975:2: '['
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
    // InternalExTwentyOne.g:1984:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl rule__Element__Group_1__2 ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:1988:1: ( rule__Element__Group_1__1__Impl rule__Element__Group_1__2 )
            // InternalExTwentyOne.g:1989:2: rule__Element__Group_1__1__Impl rule__Element__Group_1__2
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
    // InternalExTwentyOne.g:1996:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__Alternatives_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2000:1: ( ( ( rule__Element__Alternatives_1_1 ) ) )
            // InternalExTwentyOne.g:2001:1: ( ( rule__Element__Alternatives_1_1 ) )
            {
            // InternalExTwentyOne.g:2001:1: ( ( rule__Element__Alternatives_1_1 ) )
            // InternalExTwentyOne.g:2002:2: ( rule__Element__Alternatives_1_1 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_1_1()); 
            // InternalExTwentyOne.g:2003:2: ( rule__Element__Alternatives_1_1 )
            // InternalExTwentyOne.g:2003:3: rule__Element__Alternatives_1_1
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
    // InternalExTwentyOne.g:2011:1: rule__Element__Group_1__2 : rule__Element__Group_1__2__Impl ;
    public final void rule__Element__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2015:1: ( rule__Element__Group_1__2__Impl )
            // InternalExTwentyOne.g:2016:2: rule__Element__Group_1__2__Impl
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
    // InternalExTwentyOne.g:2022:1: rule__Element__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Element__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2026:1: ( ( ']' ) )
            // InternalExTwentyOne.g:2027:1: ( ']' )
            {
            // InternalExTwentyOne.g:2027:1: ( ']' )
            // InternalExTwentyOne.g:2028:2: ']'
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
    // InternalExTwentyOne.g:2038:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2042:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalExTwentyOne.g:2043:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
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
    // InternalExTwentyOne.g:2050:1: rule__Element__Group_2__0__Impl : ( 'output' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2054:1: ( ( 'output' ) )
            // InternalExTwentyOne.g:2055:1: ( 'output' )
            {
            // InternalExTwentyOne.g:2055:1: ( 'output' )
            // InternalExTwentyOne.g:2056:2: 'output'
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
    // InternalExTwentyOne.g:2065:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2069:1: ( rule__Element__Group_2__1__Impl )
            // InternalExTwentyOne.g:2070:2: rule__Element__Group_2__1__Impl
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
    // InternalExTwentyOne.g:2076:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__OutputAssignment_2_1 ) ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2080:1: ( ( ( rule__Element__OutputAssignment_2_1 ) ) )
            // InternalExTwentyOne.g:2081:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            {
            // InternalExTwentyOne.g:2081:1: ( ( rule__Element__OutputAssignment_2_1 ) )
            // InternalExTwentyOne.g:2082:2: ( rule__Element__OutputAssignment_2_1 )
            {
             before(grammarAccess.getElementAccess().getOutputAssignment_2_1()); 
            // InternalExTwentyOne.g:2083:2: ( rule__Element__OutputAssignment_2_1 )
            // InternalExTwentyOne.g:2083:3: rule__Element__OutputAssignment_2_1
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
    // InternalExTwentyOne.g:2092:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2096:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalExTwentyOne.g:2097:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
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
    // InternalExTwentyOne.g:2104:1: rule__DataDecl__Group__0__Impl : ( () ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2108:1: ( ( () ) )
            // InternalExTwentyOne.g:2109:1: ( () )
            {
            // InternalExTwentyOne.g:2109:1: ( () )
            // InternalExTwentyOne.g:2110:2: ()
            {
             before(grammarAccess.getDataDeclAccess().getDataDeclAction_0()); 
            // InternalExTwentyOne.g:2111:2: ()
            // InternalExTwentyOne.g:2111:3: 
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
    // InternalExTwentyOne.g:2119:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2123:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalExTwentyOne.g:2124:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
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
    // InternalExTwentyOne.g:2131:1: rule__DataDecl__Group__1__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2135:1: ( ( 'data' ) )
            // InternalExTwentyOne.g:2136:1: ( 'data' )
            {
            // InternalExTwentyOne.g:2136:1: ( 'data' )
            // InternalExTwentyOne.g:2137:2: 'data'
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
    // InternalExTwentyOne.g:2146:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2150:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalExTwentyOne.g:2151:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
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
    // InternalExTwentyOne.g:2158:1: rule__DataDecl__Group__2__Impl : ( ( rule__DataDecl__NameAssignment_2 ) ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2162:1: ( ( ( rule__DataDecl__NameAssignment_2 ) ) )
            // InternalExTwentyOne.g:2163:1: ( ( rule__DataDecl__NameAssignment_2 ) )
            {
            // InternalExTwentyOne.g:2163:1: ( ( rule__DataDecl__NameAssignment_2 ) )
            // InternalExTwentyOne.g:2164:2: ( rule__DataDecl__NameAssignment_2 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_2()); 
            // InternalExTwentyOne.g:2165:2: ( rule__DataDecl__NameAssignment_2 )
            // InternalExTwentyOne.g:2165:3: rule__DataDecl__NameAssignment_2
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
    // InternalExTwentyOne.g:2173:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2177:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalExTwentyOne.g:2178:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
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
    // InternalExTwentyOne.g:2185:1: rule__DataDecl__Group__3__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2189:1: ( ( '{' ) )
            // InternalExTwentyOne.g:2190:1: ( '{' )
            {
            // InternalExTwentyOne.g:2190:1: ( '{' )
            // InternalExTwentyOne.g:2191:2: '{'
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
    // InternalExTwentyOne.g:2200:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2204:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalExTwentyOne.g:2205:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
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
    // InternalExTwentyOne.g:2212:1: rule__DataDecl__Group__4__Impl : ( ( rule__DataDecl__DataAssignment_4 ) ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2216:1: ( ( ( rule__DataDecl__DataAssignment_4 ) ) )
            // InternalExTwentyOne.g:2217:1: ( ( rule__DataDecl__DataAssignment_4 ) )
            {
            // InternalExTwentyOne.g:2217:1: ( ( rule__DataDecl__DataAssignment_4 ) )
            // InternalExTwentyOne.g:2218:2: ( rule__DataDecl__DataAssignment_4 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_4()); 
            // InternalExTwentyOne.g:2219:2: ( rule__DataDecl__DataAssignment_4 )
            // InternalExTwentyOne.g:2219:3: rule__DataDecl__DataAssignment_4
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
    // InternalExTwentyOne.g:2227:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2231:1: ( rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 )
            // InternalExTwentyOne.g:2232:2: rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6
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
    // InternalExTwentyOne.g:2239:1: rule__DataDecl__Group__5__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2243:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2244:1: ( ':' )
            {
            // InternalExTwentyOne.g:2244:1: ( ':' )
            // InternalExTwentyOne.g:2245:2: ':'
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
    // InternalExTwentyOne.g:2254:1: rule__DataDecl__Group__6 : rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 ;
    public final void rule__DataDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2258:1: ( rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 )
            // InternalExTwentyOne.g:2259:2: rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7
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
    // InternalExTwentyOne.g:2266:1: rule__DataDecl__Group__6__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2270:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2271:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2271:1: ( ruleType )
            // InternalExTwentyOne.g:2272:2: ruleType
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
    // InternalExTwentyOne.g:2281:1: rule__DataDecl__Group__7 : rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8 ;
    public final void rule__DataDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2285:1: ( rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8 )
            // InternalExTwentyOne.g:2286:2: rule__DataDecl__Group__7__Impl rule__DataDecl__Group__8
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
    // InternalExTwentyOne.g:2293:1: rule__DataDecl__Group__7__Impl : ( ( rule__DataDecl__Group_7__0 )* ) ;
    public final void rule__DataDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2297:1: ( ( ( rule__DataDecl__Group_7__0 )* ) )
            // InternalExTwentyOne.g:2298:1: ( ( rule__DataDecl__Group_7__0 )* )
            {
            // InternalExTwentyOne.g:2298:1: ( ( rule__DataDecl__Group_7__0 )* )
            // InternalExTwentyOne.g:2299:2: ( rule__DataDecl__Group_7__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_7()); 
            // InternalExTwentyOne.g:2300:2: ( rule__DataDecl__Group_7__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExTwentyOne.g:2300:3: rule__DataDecl__Group_7__0
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
    // InternalExTwentyOne.g:2308:1: rule__DataDecl__Group__8 : rule__DataDecl__Group__8__Impl ;
    public final void rule__DataDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2312:1: ( rule__DataDecl__Group__8__Impl )
            // InternalExTwentyOne.g:2313:2: rule__DataDecl__Group__8__Impl
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
    // InternalExTwentyOne.g:2319:1: rule__DataDecl__Group__8__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2323:1: ( ( '}' ) )
            // InternalExTwentyOne.g:2324:1: ( '}' )
            {
            // InternalExTwentyOne.g:2324:1: ( '}' )
            // InternalExTwentyOne.g:2325:2: '}'
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
    // InternalExTwentyOne.g:2335:1: rule__DataDecl__Group_7__0 : rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1 ;
    public final void rule__DataDecl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2339:1: ( rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1 )
            // InternalExTwentyOne.g:2340:2: rule__DataDecl__Group_7__0__Impl rule__DataDecl__Group_7__1
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
    // InternalExTwentyOne.g:2347:1: rule__DataDecl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2351:1: ( ( ',' ) )
            // InternalExTwentyOne.g:2352:1: ( ',' )
            {
            // InternalExTwentyOne.g:2352:1: ( ',' )
            // InternalExTwentyOne.g:2353:2: ','
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
    // InternalExTwentyOne.g:2362:1: rule__DataDecl__Group_7__1 : rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2 ;
    public final void rule__DataDecl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2366:1: ( rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2 )
            // InternalExTwentyOne.g:2367:2: rule__DataDecl__Group_7__1__Impl rule__DataDecl__Group_7__2
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
    // InternalExTwentyOne.g:2374:1: rule__DataDecl__Group_7__1__Impl : ( ( rule__DataDecl__DataAssignment_7_1 ) ) ;
    public final void rule__DataDecl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2378:1: ( ( ( rule__DataDecl__DataAssignment_7_1 ) ) )
            // InternalExTwentyOne.g:2379:1: ( ( rule__DataDecl__DataAssignment_7_1 ) )
            {
            // InternalExTwentyOne.g:2379:1: ( ( rule__DataDecl__DataAssignment_7_1 ) )
            // InternalExTwentyOne.g:2380:2: ( rule__DataDecl__DataAssignment_7_1 )
            {
             before(grammarAccess.getDataDeclAccess().getDataAssignment_7_1()); 
            // InternalExTwentyOne.g:2381:2: ( rule__DataDecl__DataAssignment_7_1 )
            // InternalExTwentyOne.g:2381:3: rule__DataDecl__DataAssignment_7_1
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
    // InternalExTwentyOne.g:2389:1: rule__DataDecl__Group_7__2 : rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3 ;
    public final void rule__DataDecl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2393:1: ( rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3 )
            // InternalExTwentyOne.g:2394:2: rule__DataDecl__Group_7__2__Impl rule__DataDecl__Group_7__3
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
    // InternalExTwentyOne.g:2401:1: rule__DataDecl__Group_7__2__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2405:1: ( ( ':' ) )
            // InternalExTwentyOne.g:2406:1: ( ':' )
            {
            // InternalExTwentyOne.g:2406:1: ( ':' )
            // InternalExTwentyOne.g:2407:2: ':'
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
    // InternalExTwentyOne.g:2416:1: rule__DataDecl__Group_7__3 : rule__DataDecl__Group_7__3__Impl ;
    public final void rule__DataDecl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2420:1: ( rule__DataDecl__Group_7__3__Impl )
            // InternalExTwentyOne.g:2421:2: rule__DataDecl__Group_7__3__Impl
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
    // InternalExTwentyOne.g:2427:1: rule__DataDecl__Group_7__3__Impl : ( ruleType ) ;
    public final void rule__DataDecl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2431:1: ( ( ruleType ) )
            // InternalExTwentyOne.g:2432:1: ( ruleType )
            {
            // InternalExTwentyOne.g:2432:1: ( ruleType )
            // InternalExTwentyOne.g:2433:2: ruleType
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
    // InternalExTwentyOne.g:2443:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2447:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalExTwentyOne.g:2448:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
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
    // InternalExTwentyOne.g:2455:1: rule__Exp__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2459:1: ( ( rulePrimary ) )
            // InternalExTwentyOne.g:2460:1: ( rulePrimary )
            {
            // InternalExTwentyOne.g:2460:1: ( rulePrimary )
            // InternalExTwentyOne.g:2461:2: rulePrimary
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
    // InternalExTwentyOne.g:2470:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2474:1: ( rule__Exp__Group__1__Impl )
            // InternalExTwentyOne.g:2475:2: rule__Exp__Group__1__Impl
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
    // InternalExTwentyOne.g:2481:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2485:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalExTwentyOne.g:2486:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalExTwentyOne.g:2486:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalExTwentyOne.g:2487:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalExTwentyOne.g:2488:2: ( rule__Exp__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=36 && LA14_0<=39)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExTwentyOne.g:2488:3: rule__Exp__Group_1__0
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
    // InternalExTwentyOne.g:2497:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2501:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalExTwentyOne.g:2502:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
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
    // InternalExTwentyOne.g:2509:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2513:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalExTwentyOne.g:2514:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalExTwentyOne.g:2514:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalExTwentyOne.g:2515:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalExTwentyOne.g:2516:2: ( rule__Exp__Alternatives_1_0 )
            // InternalExTwentyOne.g:2516:3: rule__Exp__Alternatives_1_0
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
    // InternalExTwentyOne.g:2524:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2528:1: ( rule__Exp__Group_1__1__Impl )
            // InternalExTwentyOne.g:2529:2: rule__Exp__Group_1__1__Impl
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
    // InternalExTwentyOne.g:2535:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2539:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalExTwentyOne.g:2540:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalExTwentyOne.g:2540:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalExTwentyOne.g:2541:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalExTwentyOne.g:2542:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalExTwentyOne.g:2542:3: rule__Exp__RightAssignment_1_1
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
    // InternalExTwentyOne.g:2551:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2555:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalExTwentyOne.g:2556:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
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
    // InternalExTwentyOne.g:2563:1: rule__Exp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2567:1: ( ( () ) )
            // InternalExTwentyOne.g:2568:1: ( () )
            {
            // InternalExTwentyOne.g:2568:1: ( () )
            // InternalExTwentyOne.g:2569:2: ()
            {
             before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalExTwentyOne.g:2570:2: ()
            // InternalExTwentyOne.g:2570:3: 
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
    // InternalExTwentyOne.g:2578:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2582:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalExTwentyOne.g:2583:2: rule__Exp__Group_1_0_0__1__Impl
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
    // InternalExTwentyOne.g:2589:1: rule__Exp__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2593:1: ( ( '+' ) )
            // InternalExTwentyOne.g:2594:1: ( '+' )
            {
            // InternalExTwentyOne.g:2594:1: ( '+' )
            // InternalExTwentyOne.g:2595:2: '+'
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
    // InternalExTwentyOne.g:2605:1: rule__Exp__Group_1_0_1__0 : rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 ;
    public final void rule__Exp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2609:1: ( rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 )
            // InternalExTwentyOne.g:2610:2: rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1
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
    // InternalExTwentyOne.g:2617:1: rule__Exp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2621:1: ( ( () ) )
            // InternalExTwentyOne.g:2622:1: ( () )
            {
            // InternalExTwentyOne.g:2622:1: ( () )
            // InternalExTwentyOne.g:2623:2: ()
            {
             before(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalExTwentyOne.g:2624:2: ()
            // InternalExTwentyOne.g:2624:3: 
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
    // InternalExTwentyOne.g:2632:1: rule__Exp__Group_1_0_1__1 : rule__Exp__Group_1_0_1__1__Impl ;
    public final void rule__Exp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2636:1: ( rule__Exp__Group_1_0_1__1__Impl )
            // InternalExTwentyOne.g:2637:2: rule__Exp__Group_1_0_1__1__Impl
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
    // InternalExTwentyOne.g:2643:1: rule__Exp__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Exp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2647:1: ( ( '-' ) )
            // InternalExTwentyOne.g:2648:1: ( '-' )
            {
            // InternalExTwentyOne.g:2648:1: ( '-' )
            // InternalExTwentyOne.g:2649:2: '-'
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
    // InternalExTwentyOne.g:2659:1: rule__Exp__Group_1_0_2__0 : rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1 ;
    public final void rule__Exp__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2663:1: ( rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1 )
            // InternalExTwentyOne.g:2664:2: rule__Exp__Group_1_0_2__0__Impl rule__Exp__Group_1_0_2__1
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
    // InternalExTwentyOne.g:2671:1: rule__Exp__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2675:1: ( ( () ) )
            // InternalExTwentyOne.g:2676:1: ( () )
            {
            // InternalExTwentyOne.g:2676:1: ( () )
            // InternalExTwentyOne.g:2677:2: ()
            {
             before(grammarAccess.getExpAccess().getMultLeftAction_1_0_2_0()); 
            // InternalExTwentyOne.g:2678:2: ()
            // InternalExTwentyOne.g:2678:3: 
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
    // InternalExTwentyOne.g:2686:1: rule__Exp__Group_1_0_2__1 : rule__Exp__Group_1_0_2__1__Impl ;
    public final void rule__Exp__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2690:1: ( rule__Exp__Group_1_0_2__1__Impl )
            // InternalExTwentyOne.g:2691:2: rule__Exp__Group_1_0_2__1__Impl
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
    // InternalExTwentyOne.g:2697:1: rule__Exp__Group_1_0_2__1__Impl : ( '*' ) ;
    public final void rule__Exp__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2701:1: ( ( '*' ) )
            // InternalExTwentyOne.g:2702:1: ( '*' )
            {
            // InternalExTwentyOne.g:2702:1: ( '*' )
            // InternalExTwentyOne.g:2703:2: '*'
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
    // InternalExTwentyOne.g:2713:1: rule__Exp__Group_1_0_3__0 : rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1 ;
    public final void rule__Exp__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2717:1: ( rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1 )
            // InternalExTwentyOne.g:2718:2: rule__Exp__Group_1_0_3__0__Impl rule__Exp__Group_1_0_3__1
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
    // InternalExTwentyOne.g:2725:1: rule__Exp__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2729:1: ( ( () ) )
            // InternalExTwentyOne.g:2730:1: ( () )
            {
            // InternalExTwentyOne.g:2730:1: ( () )
            // InternalExTwentyOne.g:2731:2: ()
            {
             before(grammarAccess.getExpAccess().getDivideLeftAction_1_0_3_0()); 
            // InternalExTwentyOne.g:2732:2: ()
            // InternalExTwentyOne.g:2732:3: 
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
    // InternalExTwentyOne.g:2740:1: rule__Exp__Group_1_0_3__1 : rule__Exp__Group_1_0_3__1__Impl ;
    public final void rule__Exp__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2744:1: ( rule__Exp__Group_1_0_3__1__Impl )
            // InternalExTwentyOne.g:2745:2: rule__Exp__Group_1_0_3__1__Impl
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
    // InternalExTwentyOne.g:2751:1: rule__Exp__Group_1_0_3__1__Impl : ( '/' ) ;
    public final void rule__Exp__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2755:1: ( ( '/' ) )
            // InternalExTwentyOne.g:2756:1: ( '/' )
            {
            // InternalExTwentyOne.g:2756:1: ( '/' )
            // InternalExTwentyOne.g:2757:2: '/'
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
    // InternalExTwentyOne.g:2767:1: rule__Primary__Group_4__0 : rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 ;
    public final void rule__Primary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2771:1: ( rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 )
            // InternalExTwentyOne.g:2772:2: rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1
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
    // InternalExTwentyOne.g:2779:1: rule__Primary__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2783:1: ( ( '(' ) )
            // InternalExTwentyOne.g:2784:1: ( '(' )
            {
            // InternalExTwentyOne.g:2784:1: ( '(' )
            // InternalExTwentyOne.g:2785:2: '('
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
    // InternalExTwentyOne.g:2794:1: rule__Primary__Group_4__1 : rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 ;
    public final void rule__Primary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2798:1: ( rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 )
            // InternalExTwentyOne.g:2799:2: rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2
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
    // InternalExTwentyOne.g:2806:1: rule__Primary__Group_4__1__Impl : ( ruleExp ) ;
    public final void rule__Primary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2810:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:2811:1: ( ruleExp )
            {
            // InternalExTwentyOne.g:2811:1: ( ruleExp )
            // InternalExTwentyOne.g:2812:2: ruleExp
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
    // InternalExTwentyOne.g:2821:1: rule__Primary__Group_4__2 : rule__Primary__Group_4__2__Impl ;
    public final void rule__Primary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2825:1: ( rule__Primary__Group_4__2__Impl )
            // InternalExTwentyOne.g:2826:2: rule__Primary__Group_4__2__Impl
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
    // InternalExTwentyOne.g:2832:1: rule__Primary__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2836:1: ( ( ')' ) )
            // InternalExTwentyOne.g:2837:1: ( ')' )
            {
            // InternalExTwentyOne.g:2837:1: ( ')' )
            // InternalExTwentyOne.g:2838:2: ')'
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
    // InternalExTwentyOne.g:2848:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2852:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // InternalExTwentyOne.g:2853:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
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
    // InternalExTwentyOne.g:2860:1: rule__IfThenElse__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2864:1: ( ( 'if' ) )
            // InternalExTwentyOne.g:2865:1: ( 'if' )
            {
            // InternalExTwentyOne.g:2865:1: ( 'if' )
            // InternalExTwentyOne.g:2866:2: 'if'
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
    // InternalExTwentyOne.g:2875:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2879:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // InternalExTwentyOne.g:2880:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
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
    // InternalExTwentyOne.g:2887:1: rule__IfThenElse__Group__1__Impl : ( ( rule__IfThenElse__IfLogicExpAssignment_1 ) ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2891:1: ( ( ( rule__IfThenElse__IfLogicExpAssignment_1 ) ) )
            // InternalExTwentyOne.g:2892:1: ( ( rule__IfThenElse__IfLogicExpAssignment_1 ) )
            {
            // InternalExTwentyOne.g:2892:1: ( ( rule__IfThenElse__IfLogicExpAssignment_1 ) )
            // InternalExTwentyOne.g:2893:2: ( rule__IfThenElse__IfLogicExpAssignment_1 )
            {
             before(grammarAccess.getIfThenElseAccess().getIfLogicExpAssignment_1()); 
            // InternalExTwentyOne.g:2894:2: ( rule__IfThenElse__IfLogicExpAssignment_1 )
            // InternalExTwentyOne.g:2894:3: rule__IfThenElse__IfLogicExpAssignment_1
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
    // InternalExTwentyOne.g:2902:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2906:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // InternalExTwentyOne.g:2907:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
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
    // InternalExTwentyOne.g:2914:1: rule__IfThenElse__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2918:1: ( ( 'then' ) )
            // InternalExTwentyOne.g:2919:1: ( 'then' )
            {
            // InternalExTwentyOne.g:2919:1: ( 'then' )
            // InternalExTwentyOne.g:2920:2: 'then'
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
    // InternalExTwentyOne.g:2929:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2933:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // InternalExTwentyOne.g:2934:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
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
    // InternalExTwentyOne.g:2941:1: rule__IfThenElse__Group__3__Impl : ( ( rule__IfThenElse__ThenExpAssignment_3 ) ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2945:1: ( ( ( rule__IfThenElse__ThenExpAssignment_3 ) ) )
            // InternalExTwentyOne.g:2946:1: ( ( rule__IfThenElse__ThenExpAssignment_3 ) )
            {
            // InternalExTwentyOne.g:2946:1: ( ( rule__IfThenElse__ThenExpAssignment_3 ) )
            // InternalExTwentyOne.g:2947:2: ( rule__IfThenElse__ThenExpAssignment_3 )
            {
             before(grammarAccess.getIfThenElseAccess().getThenExpAssignment_3()); 
            // InternalExTwentyOne.g:2948:2: ( rule__IfThenElse__ThenExpAssignment_3 )
            // InternalExTwentyOne.g:2948:3: rule__IfThenElse__ThenExpAssignment_3
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
    // InternalExTwentyOne.g:2956:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2960:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // InternalExTwentyOne.g:2961:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
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
    // InternalExTwentyOne.g:2968:1: rule__IfThenElse__Group__4__Impl : ( 'else' ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2972:1: ( ( 'else' ) )
            // InternalExTwentyOne.g:2973:1: ( 'else' )
            {
            // InternalExTwentyOne.g:2973:1: ( 'else' )
            // InternalExTwentyOne.g:2974:2: 'else'
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
    // InternalExTwentyOne.g:2983:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2987:1: ( rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 )
            // InternalExTwentyOne.g:2988:2: rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6
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
    // InternalExTwentyOne.g:2995:1: rule__IfThenElse__Group__5__Impl : ( ( rule__IfThenElse__ElseExpAssignment_5 ) ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:2999:1: ( ( ( rule__IfThenElse__ElseExpAssignment_5 ) ) )
            // InternalExTwentyOne.g:3000:1: ( ( rule__IfThenElse__ElseExpAssignment_5 ) )
            {
            // InternalExTwentyOne.g:3000:1: ( ( rule__IfThenElse__ElseExpAssignment_5 ) )
            // InternalExTwentyOne.g:3001:2: ( rule__IfThenElse__ElseExpAssignment_5 )
            {
             before(grammarAccess.getIfThenElseAccess().getElseExpAssignment_5()); 
            // InternalExTwentyOne.g:3002:2: ( rule__IfThenElse__ElseExpAssignment_5 )
            // InternalExTwentyOne.g:3002:3: rule__IfThenElse__ElseExpAssignment_5
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
    // InternalExTwentyOne.g:3010:1: rule__IfThenElse__Group__6 : rule__IfThenElse__Group__6__Impl ;
    public final void rule__IfThenElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3014:1: ( rule__IfThenElse__Group__6__Impl )
            // InternalExTwentyOne.g:3015:2: rule__IfThenElse__Group__6__Impl
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
    // InternalExTwentyOne.g:3021:1: rule__IfThenElse__Group__6__Impl : ( 'end' ) ;
    public final void rule__IfThenElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3025:1: ( ( 'end' ) )
            // InternalExTwentyOne.g:3026:1: ( 'end' )
            {
            // InternalExTwentyOne.g:3026:1: ( 'end' )
            // InternalExTwentyOne.g:3027:2: 'end'
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
    // InternalExTwentyOne.g:3037:1: rule__NewInput__Group__0 : rule__NewInput__Group__0__Impl rule__NewInput__Group__1 ;
    public final void rule__NewInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3041:1: ( rule__NewInput__Group__0__Impl rule__NewInput__Group__1 )
            // InternalExTwentyOne.g:3042:2: rule__NewInput__Group__0__Impl rule__NewInput__Group__1
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
    // InternalExTwentyOne.g:3049:1: rule__NewInput__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3053:1: ( ( 'new' ) )
            // InternalExTwentyOne.g:3054:1: ( 'new' )
            {
            // InternalExTwentyOne.g:3054:1: ( 'new' )
            // InternalExTwentyOne.g:3055:2: 'new'
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
    // InternalExTwentyOne.g:3064:1: rule__NewInput__Group__1 : rule__NewInput__Group__1__Impl rule__NewInput__Group__2 ;
    public final void rule__NewInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3068:1: ( rule__NewInput__Group__1__Impl rule__NewInput__Group__2 )
            // InternalExTwentyOne.g:3069:2: rule__NewInput__Group__1__Impl rule__NewInput__Group__2
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
    // InternalExTwentyOne.g:3076:1: rule__NewInput__Group__1__Impl : ( ( rule__NewInput__NewArrayIdAssignment_1 ) ) ;
    public final void rule__NewInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3080:1: ( ( ( rule__NewInput__NewArrayIdAssignment_1 ) ) )
            // InternalExTwentyOne.g:3081:1: ( ( rule__NewInput__NewArrayIdAssignment_1 ) )
            {
            // InternalExTwentyOne.g:3081:1: ( ( rule__NewInput__NewArrayIdAssignment_1 ) )
            // InternalExTwentyOne.g:3082:2: ( rule__NewInput__NewArrayIdAssignment_1 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdAssignment_1()); 
            // InternalExTwentyOne.g:3083:2: ( rule__NewInput__NewArrayIdAssignment_1 )
            // InternalExTwentyOne.g:3083:3: rule__NewInput__NewArrayIdAssignment_1
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
    // InternalExTwentyOne.g:3091:1: rule__NewInput__Group__2 : rule__NewInput__Group__2__Impl rule__NewInput__Group__3 ;
    public final void rule__NewInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3095:1: ( rule__NewInput__Group__2__Impl rule__NewInput__Group__3 )
            // InternalExTwentyOne.g:3096:2: rule__NewInput__Group__2__Impl rule__NewInput__Group__3
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
    // InternalExTwentyOne.g:3103:1: rule__NewInput__Group__2__Impl : ( '[' ) ;
    public final void rule__NewInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3107:1: ( ( '[' ) )
            // InternalExTwentyOne.g:3108:1: ( '[' )
            {
            // InternalExTwentyOne.g:3108:1: ( '[' )
            // InternalExTwentyOne.g:3109:2: '['
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
    // InternalExTwentyOne.g:3118:1: rule__NewInput__Group__3 : rule__NewInput__Group__3__Impl rule__NewInput__Group__4 ;
    public final void rule__NewInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3122:1: ( rule__NewInput__Group__3__Impl rule__NewInput__Group__4 )
            // InternalExTwentyOne.g:3123:2: rule__NewInput__Group__3__Impl rule__NewInput__Group__4
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
    // InternalExTwentyOne.g:3130:1: rule__NewInput__Group__3__Impl : ( ( rule__NewInput__NewArrayIdsAssignment_3 ) ) ;
    public final void rule__NewInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3134:1: ( ( ( rule__NewInput__NewArrayIdsAssignment_3 ) ) )
            // InternalExTwentyOne.g:3135:1: ( ( rule__NewInput__NewArrayIdsAssignment_3 ) )
            {
            // InternalExTwentyOne.g:3135:1: ( ( rule__NewInput__NewArrayIdsAssignment_3 ) )
            // InternalExTwentyOne.g:3136:2: ( rule__NewInput__NewArrayIdsAssignment_3 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_3()); 
            // InternalExTwentyOne.g:3137:2: ( rule__NewInput__NewArrayIdsAssignment_3 )
            // InternalExTwentyOne.g:3137:3: rule__NewInput__NewArrayIdsAssignment_3
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
    // InternalExTwentyOne.g:3145:1: rule__NewInput__Group__4 : rule__NewInput__Group__4__Impl rule__NewInput__Group__5 ;
    public final void rule__NewInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3149:1: ( rule__NewInput__Group__4__Impl rule__NewInput__Group__5 )
            // InternalExTwentyOne.g:3150:2: rule__NewInput__Group__4__Impl rule__NewInput__Group__5
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
    // InternalExTwentyOne.g:3157:1: rule__NewInput__Group__4__Impl : ( '=' ) ;
    public final void rule__NewInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3161:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3162:1: ( '=' )
            {
            // InternalExTwentyOne.g:3162:1: ( '=' )
            // InternalExTwentyOne.g:3163:2: '='
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
    // InternalExTwentyOne.g:3172:1: rule__NewInput__Group__5 : rule__NewInput__Group__5__Impl rule__NewInput__Group__6 ;
    public final void rule__NewInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3176:1: ( rule__NewInput__Group__5__Impl rule__NewInput__Group__6 )
            // InternalExTwentyOne.g:3177:2: rule__NewInput__Group__5__Impl rule__NewInput__Group__6
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
    // InternalExTwentyOne.g:3184:1: rule__NewInput__Group__5__Impl : ( ( rule__NewInput__NewArrayExpsAssignment_5 ) ) ;
    public final void rule__NewInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3188:1: ( ( ( rule__NewInput__NewArrayExpsAssignment_5 ) ) )
            // InternalExTwentyOne.g:3189:1: ( ( rule__NewInput__NewArrayExpsAssignment_5 ) )
            {
            // InternalExTwentyOne.g:3189:1: ( ( rule__NewInput__NewArrayExpsAssignment_5 ) )
            // InternalExTwentyOne.g:3190:2: ( rule__NewInput__NewArrayExpsAssignment_5 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_5()); 
            // InternalExTwentyOne.g:3191:2: ( rule__NewInput__NewArrayExpsAssignment_5 )
            // InternalExTwentyOne.g:3191:3: rule__NewInput__NewArrayExpsAssignment_5
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
    // InternalExTwentyOne.g:3199:1: rule__NewInput__Group__6 : rule__NewInput__Group__6__Impl rule__NewInput__Group__7 ;
    public final void rule__NewInput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3203:1: ( rule__NewInput__Group__6__Impl rule__NewInput__Group__7 )
            // InternalExTwentyOne.g:3204:2: rule__NewInput__Group__6__Impl rule__NewInput__Group__7
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
    // InternalExTwentyOne.g:3211:1: rule__NewInput__Group__6__Impl : ( ( rule__NewInput__Group_6__0 )* ) ;
    public final void rule__NewInput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3215:1: ( ( ( rule__NewInput__Group_6__0 )* ) )
            // InternalExTwentyOne.g:3216:1: ( ( rule__NewInput__Group_6__0 )* )
            {
            // InternalExTwentyOne.g:3216:1: ( ( rule__NewInput__Group_6__0 )* )
            // InternalExTwentyOne.g:3217:2: ( rule__NewInput__Group_6__0 )*
            {
             before(grammarAccess.getNewInputAccess().getGroup_6()); 
            // InternalExTwentyOne.g:3218:2: ( rule__NewInput__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExTwentyOne.g:3218:3: rule__NewInput__Group_6__0
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
    // InternalExTwentyOne.g:3226:1: rule__NewInput__Group__7 : rule__NewInput__Group__7__Impl ;
    public final void rule__NewInput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3230:1: ( rule__NewInput__Group__7__Impl )
            // InternalExTwentyOne.g:3231:2: rule__NewInput__Group__7__Impl
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
    // InternalExTwentyOne.g:3237:1: rule__NewInput__Group__7__Impl : ( ']' ) ;
    public final void rule__NewInput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3241:1: ( ( ']' ) )
            // InternalExTwentyOne.g:3242:1: ( ']' )
            {
            // InternalExTwentyOne.g:3242:1: ( ']' )
            // InternalExTwentyOne.g:3243:2: ']'
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
    // InternalExTwentyOne.g:3253:1: rule__NewInput__Group_6__0 : rule__NewInput__Group_6__0__Impl rule__NewInput__Group_6__1 ;
    public final void rule__NewInput__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3257:1: ( rule__NewInput__Group_6__0__Impl rule__NewInput__Group_6__1 )
            // InternalExTwentyOne.g:3258:2: rule__NewInput__Group_6__0__Impl rule__NewInput__Group_6__1
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
    // InternalExTwentyOne.g:3265:1: rule__NewInput__Group_6__0__Impl : ( ',' ) ;
    public final void rule__NewInput__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3269:1: ( ( ',' ) )
            // InternalExTwentyOne.g:3270:1: ( ',' )
            {
            // InternalExTwentyOne.g:3270:1: ( ',' )
            // InternalExTwentyOne.g:3271:2: ','
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
    // InternalExTwentyOne.g:3280:1: rule__NewInput__Group_6__1 : rule__NewInput__Group_6__1__Impl rule__NewInput__Group_6__2 ;
    public final void rule__NewInput__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3284:1: ( rule__NewInput__Group_6__1__Impl rule__NewInput__Group_6__2 )
            // InternalExTwentyOne.g:3285:2: rule__NewInput__Group_6__1__Impl rule__NewInput__Group_6__2
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
    // InternalExTwentyOne.g:3292:1: rule__NewInput__Group_6__1__Impl : ( ( rule__NewInput__NewArrayIdsAssignment_6_1 ) ) ;
    public final void rule__NewInput__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3296:1: ( ( ( rule__NewInput__NewArrayIdsAssignment_6_1 ) ) )
            // InternalExTwentyOne.g:3297:1: ( ( rule__NewInput__NewArrayIdsAssignment_6_1 ) )
            {
            // InternalExTwentyOne.g:3297:1: ( ( rule__NewInput__NewArrayIdsAssignment_6_1 ) )
            // InternalExTwentyOne.g:3298:2: ( rule__NewInput__NewArrayIdsAssignment_6_1 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayIdsAssignment_6_1()); 
            // InternalExTwentyOne.g:3299:2: ( rule__NewInput__NewArrayIdsAssignment_6_1 )
            // InternalExTwentyOne.g:3299:3: rule__NewInput__NewArrayIdsAssignment_6_1
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
    // InternalExTwentyOne.g:3307:1: rule__NewInput__Group_6__2 : rule__NewInput__Group_6__2__Impl rule__NewInput__Group_6__3 ;
    public final void rule__NewInput__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3311:1: ( rule__NewInput__Group_6__2__Impl rule__NewInput__Group_6__3 )
            // InternalExTwentyOne.g:3312:2: rule__NewInput__Group_6__2__Impl rule__NewInput__Group_6__3
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
    // InternalExTwentyOne.g:3319:1: rule__NewInput__Group_6__2__Impl : ( '=' ) ;
    public final void rule__NewInput__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3323:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3324:1: ( '=' )
            {
            // InternalExTwentyOne.g:3324:1: ( '=' )
            // InternalExTwentyOne.g:3325:2: '='
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
    // InternalExTwentyOne.g:3334:1: rule__NewInput__Group_6__3 : rule__NewInput__Group_6__3__Impl ;
    public final void rule__NewInput__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3338:1: ( rule__NewInput__Group_6__3__Impl )
            // InternalExTwentyOne.g:3339:2: rule__NewInput__Group_6__3__Impl
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
    // InternalExTwentyOne.g:3345:1: rule__NewInput__Group_6__3__Impl : ( ( rule__NewInput__NewArrayExpsAssignment_6_3 ) ) ;
    public final void rule__NewInput__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3349:1: ( ( ( rule__NewInput__NewArrayExpsAssignment_6_3 ) ) )
            // InternalExTwentyOne.g:3350:1: ( ( rule__NewInput__NewArrayExpsAssignment_6_3 ) )
            {
            // InternalExTwentyOne.g:3350:1: ( ( rule__NewInput__NewArrayExpsAssignment_6_3 ) )
            // InternalExTwentyOne.g:3351:2: ( rule__NewInput__NewArrayExpsAssignment_6_3 )
            {
             before(grammarAccess.getNewInputAccess().getNewArrayExpsAssignment_6_3()); 
            // InternalExTwentyOne.g:3352:2: ( rule__NewInput__NewArrayExpsAssignment_6_3 )
            // InternalExTwentyOne.g:3352:3: rule__NewInput__NewArrayExpsAssignment_6_3
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
    // InternalExTwentyOne.g:3361:1: rule__LetBinding__Group__0 : rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 ;
    public final void rule__LetBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3365:1: ( rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 )
            // InternalExTwentyOne.g:3366:2: rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1
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
    // InternalExTwentyOne.g:3373:1: rule__LetBinding__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3377:1: ( ( 'let' ) )
            // InternalExTwentyOne.g:3378:1: ( 'let' )
            {
            // InternalExTwentyOne.g:3378:1: ( 'let' )
            // InternalExTwentyOne.g:3379:2: 'let'
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
    // InternalExTwentyOne.g:3388:1: rule__LetBinding__Group__1 : rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 ;
    public final void rule__LetBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3392:1: ( rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 )
            // InternalExTwentyOne.g:3393:2: rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2
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
    // InternalExTwentyOne.g:3400:1: rule__LetBinding__Group__1__Impl : ( ( rule__LetBinding__NameAssignment_1 ) ) ;
    public final void rule__LetBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3404:1: ( ( ( rule__LetBinding__NameAssignment_1 ) ) )
            // InternalExTwentyOne.g:3405:1: ( ( rule__LetBinding__NameAssignment_1 ) )
            {
            // InternalExTwentyOne.g:3405:1: ( ( rule__LetBinding__NameAssignment_1 ) )
            // InternalExTwentyOne.g:3406:2: ( rule__LetBinding__NameAssignment_1 )
            {
             before(grammarAccess.getLetBindingAccess().getNameAssignment_1()); 
            // InternalExTwentyOne.g:3407:2: ( rule__LetBinding__NameAssignment_1 )
            // InternalExTwentyOne.g:3407:3: rule__LetBinding__NameAssignment_1
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
    // InternalExTwentyOne.g:3415:1: rule__LetBinding__Group__2 : rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 ;
    public final void rule__LetBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3419:1: ( rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 )
            // InternalExTwentyOne.g:3420:2: rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3
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
    // InternalExTwentyOne.g:3427:1: rule__LetBinding__Group__2__Impl : ( '=' ) ;
    public final void rule__LetBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3431:1: ( ( '=' ) )
            // InternalExTwentyOne.g:3432:1: ( '=' )
            {
            // InternalExTwentyOne.g:3432:1: ( '=' )
            // InternalExTwentyOne.g:3433:2: '='
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
    // InternalExTwentyOne.g:3442:1: rule__LetBinding__Group__3 : rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 ;
    public final void rule__LetBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3446:1: ( rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 )
            // InternalExTwentyOne.g:3447:2: rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4
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
    // InternalExTwentyOne.g:3454:1: rule__LetBinding__Group__3__Impl : ( ( rule__LetBinding__BindingAssignment_3 ) ) ;
    public final void rule__LetBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3458:1: ( ( ( rule__LetBinding__BindingAssignment_3 ) ) )
            // InternalExTwentyOne.g:3459:1: ( ( rule__LetBinding__BindingAssignment_3 ) )
            {
            // InternalExTwentyOne.g:3459:1: ( ( rule__LetBinding__BindingAssignment_3 ) )
            // InternalExTwentyOne.g:3460:2: ( rule__LetBinding__BindingAssignment_3 )
            {
             before(grammarAccess.getLetBindingAccess().getBindingAssignment_3()); 
            // InternalExTwentyOne.g:3461:2: ( rule__LetBinding__BindingAssignment_3 )
            // InternalExTwentyOne.g:3461:3: rule__LetBinding__BindingAssignment_3
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
    // InternalExTwentyOne.g:3469:1: rule__LetBinding__Group__4 : rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 ;
    public final void rule__LetBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3473:1: ( rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 )
            // InternalExTwentyOne.g:3474:2: rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5
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
    // InternalExTwentyOne.g:3481:1: rule__LetBinding__Group__4__Impl : ( 'in' ) ;
    public final void rule__LetBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3485:1: ( ( 'in' ) )
            // InternalExTwentyOne.g:3486:1: ( 'in' )
            {
            // InternalExTwentyOne.g:3486:1: ( 'in' )
            // InternalExTwentyOne.g:3487:2: 'in'
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
    // InternalExTwentyOne.g:3496:1: rule__LetBinding__Group__5 : rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 ;
    public final void rule__LetBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3500:1: ( rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 )
            // InternalExTwentyOne.g:3501:2: rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6
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
    // InternalExTwentyOne.g:3508:1: rule__LetBinding__Group__5__Impl : ( ( rule__LetBinding__BodyAssignment_5 ) ) ;
    public final void rule__LetBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3512:1: ( ( ( rule__LetBinding__BodyAssignment_5 ) ) )
            // InternalExTwentyOne.g:3513:1: ( ( rule__LetBinding__BodyAssignment_5 ) )
            {
            // InternalExTwentyOne.g:3513:1: ( ( rule__LetBinding__BodyAssignment_5 ) )
            // InternalExTwentyOne.g:3514:2: ( rule__LetBinding__BodyAssignment_5 )
            {
             before(grammarAccess.getLetBindingAccess().getBodyAssignment_5()); 
            // InternalExTwentyOne.g:3515:2: ( rule__LetBinding__BodyAssignment_5 )
            // InternalExTwentyOne.g:3515:3: rule__LetBinding__BodyAssignment_5
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
    // InternalExTwentyOne.g:3523:1: rule__LetBinding__Group__6 : rule__LetBinding__Group__6__Impl ;
    public final void rule__LetBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3527:1: ( rule__LetBinding__Group__6__Impl )
            // InternalExTwentyOne.g:3528:2: rule__LetBinding__Group__6__Impl
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
    // InternalExTwentyOne.g:3534:1: rule__LetBinding__Group__6__Impl : ( 'end' ) ;
    public final void rule__LetBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3538:1: ( ( 'end' ) )
            // InternalExTwentyOne.g:3539:1: ( 'end' )
            {
            // InternalExTwentyOne.g:3539:1: ( 'end' )
            // InternalExTwentyOne.g:3540:2: 'end'
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
    // InternalExTwentyOne.g:3550:1: rule__LogicExp__Group__0 : rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 ;
    public final void rule__LogicExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3554:1: ( rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 )
            // InternalExTwentyOne.g:3555:2: rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1
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
    // InternalExTwentyOne.g:3562:1: rule__LogicExp__Group__0__Impl : ( ( rule__LogicExp__LeftLogicAssignment_0 ) ) ;
    public final void rule__LogicExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3566:1: ( ( ( rule__LogicExp__LeftLogicAssignment_0 ) ) )
            // InternalExTwentyOne.g:3567:1: ( ( rule__LogicExp__LeftLogicAssignment_0 ) )
            {
            // InternalExTwentyOne.g:3567:1: ( ( rule__LogicExp__LeftLogicAssignment_0 ) )
            // InternalExTwentyOne.g:3568:2: ( rule__LogicExp__LeftLogicAssignment_0 )
            {
             before(grammarAccess.getLogicExpAccess().getLeftLogicAssignment_0()); 
            // InternalExTwentyOne.g:3569:2: ( rule__LogicExp__LeftLogicAssignment_0 )
            // InternalExTwentyOne.g:3569:3: rule__LogicExp__LeftLogicAssignment_0
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
    // InternalExTwentyOne.g:3577:1: rule__LogicExp__Group__1 : rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 ;
    public final void rule__LogicExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3581:1: ( rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 )
            // InternalExTwentyOne.g:3582:2: rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2
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
    // InternalExTwentyOne.g:3589:1: rule__LogicExp__Group__1__Impl : ( ( rule__LogicExp__Alternatives_1 ) ) ;
    public final void rule__LogicExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3593:1: ( ( ( rule__LogicExp__Alternatives_1 ) ) )
            // InternalExTwentyOne.g:3594:1: ( ( rule__LogicExp__Alternatives_1 ) )
            {
            // InternalExTwentyOne.g:3594:1: ( ( rule__LogicExp__Alternatives_1 ) )
            // InternalExTwentyOne.g:3595:2: ( rule__LogicExp__Alternatives_1 )
            {
             before(grammarAccess.getLogicExpAccess().getAlternatives_1()); 
            // InternalExTwentyOne.g:3596:2: ( rule__LogicExp__Alternatives_1 )
            // InternalExTwentyOne.g:3596:3: rule__LogicExp__Alternatives_1
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
    // InternalExTwentyOne.g:3604:1: rule__LogicExp__Group__2 : rule__LogicExp__Group__2__Impl ;
    public final void rule__LogicExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3608:1: ( rule__LogicExp__Group__2__Impl )
            // InternalExTwentyOne.g:3609:2: rule__LogicExp__Group__2__Impl
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
    // InternalExTwentyOne.g:3615:1: rule__LogicExp__Group__2__Impl : ( ( rule__LogicExp__RightLogicAssignment_2 ) ) ;
    public final void rule__LogicExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3619:1: ( ( ( rule__LogicExp__RightLogicAssignment_2 ) ) )
            // InternalExTwentyOne.g:3620:1: ( ( rule__LogicExp__RightLogicAssignment_2 ) )
            {
            // InternalExTwentyOne.g:3620:1: ( ( rule__LogicExp__RightLogicAssignment_2 ) )
            // InternalExTwentyOne.g:3621:2: ( rule__LogicExp__RightLogicAssignment_2 )
            {
             before(grammarAccess.getLogicExpAccess().getRightLogicAssignment_2()); 
            // InternalExTwentyOne.g:3622:2: ( rule__LogicExp__RightLogicAssignment_2 )
            // InternalExTwentyOne.g:3622:3: rule__LogicExp__RightLogicAssignment_2
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
    // InternalExTwentyOne.g:3631:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3635:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3636:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3636:2: ( RULE_ID )
            // InternalExTwentyOne.g:3637:3: RULE_ID
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
    // InternalExTwentyOne.g:3646:1: rule__Program__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__Program__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3650:1: ( ( ruleDeclaration ) )
            // InternalExTwentyOne.g:3651:2: ( ruleDeclaration )
            {
            // InternalExTwentyOne.g:3651:2: ( ruleDeclaration )
            // InternalExTwentyOne.g:3652:3: ruleDeclaration
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
    // InternalExTwentyOne.g:3661:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3665:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3666:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3666:2: ( RULE_ID )
            // InternalExTwentyOne.g:3667:3: RULE_ID
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
    // InternalExTwentyOne.g:3676:1: rule__Function__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3680:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3681:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3681:2: ( RULE_ID )
            // InternalExTwentyOne.g:3682:3: RULE_ID
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
    // InternalExTwentyOne.g:3691:1: rule__Function__LambdaAssignment_3 : ( ruleLambda ) ;
    public final void rule__Function__LambdaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3695:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:3696:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:3696:2: ( ruleLambda )
            // InternalExTwentyOne.g:3697:3: ruleLambda
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
    // InternalExTwentyOne.g:3706:1: rule__Lambda__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Lambda__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3710:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3711:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3711:2: ( RULE_ID )
            // InternalExTwentyOne.g:3712:3: RULE_ID
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
    // InternalExTwentyOne.g:3721:1: rule__Lambda__LambdaExpAssignment_7 : ( ruleExp ) ;
    public final void rule__Lambda__LambdaExpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3725:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:3726:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:3726:2: ( ruleExp )
            // InternalExTwentyOne.g:3727:3: ruleExp
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
    // InternalExTwentyOne.g:3736:1: rule__Input__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3740:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3741:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3741:2: ( RULE_ID )
            // InternalExTwentyOne.g:3742:3: RULE_ID
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
    // InternalExTwentyOne.g:3751:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3755:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3756:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3756:2: ( RULE_ID )
            // InternalExTwentyOne.g:3757:3: RULE_ID
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
    // InternalExTwentyOne.g:3766:1: rule__Node__FunctionAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Node__FunctionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3770:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3771:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3771:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3772:3: ( RULE_ID )
            {
             before(grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_4_0_0()); 
            // InternalExTwentyOne.g:3773:3: ( RULE_ID )
            // InternalExTwentyOne.g:3774:4: RULE_ID
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
    // InternalExTwentyOne.g:3785:1: rule__Node__LambdaAssignment_4_1 : ( ruleLambda ) ;
    public final void rule__Node__LambdaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3789:1: ( ( ruleLambda ) )
            // InternalExTwentyOne.g:3790:2: ( ruleLambda )
            {
            // InternalExTwentyOne.g:3790:2: ( ruleLambda )
            // InternalExTwentyOne.g:3791:3: ruleLambda
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
    // InternalExTwentyOne.g:3800:1: rule__Stream__InputsOrNodesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsOrNodesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3804:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3805:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3805:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3806:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_2_0()); 
            // InternalExTwentyOne.g:3807:3: ( RULE_ID )
            // InternalExTwentyOne.g:3808:4: RULE_ID
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
    // InternalExTwentyOne.g:3819:1: rule__Stream__InputsOrNodesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Stream__InputsOrNodesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3823:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3824:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3824:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3825:3: ( RULE_ID )
            {
             before(grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_3_1_0()); 
            // InternalExTwentyOne.g:3826:3: ( RULE_ID )
            // InternalExTwentyOne.g:3827:4: RULE_ID
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
    // InternalExTwentyOne.g:3838:1: rule__Stream__ElementsAssignment_4_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3842:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:3843:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:3843:2: ( ruleElement )
            // InternalExTwentyOne.g:3844:3: ruleElement
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
    // InternalExTwentyOne.g:3853:1: rule__Stream__ElementsAssignment_4_2_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3857:1: ( ( ruleElement ) )
            // InternalExTwentyOne.g:3858:2: ( ruleElement )
            {
            // InternalExTwentyOne.g:3858:2: ( ruleElement )
            // InternalExTwentyOne.g:3859:3: ruleElement
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
    // InternalExTwentyOne.g:3868:1: rule__Element__ElementAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Element__ElementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3872:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3873:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3873:2: ( RULE_ID )
            // InternalExTwentyOne.g:3874:3: RULE_ID
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
    // InternalExTwentyOne.g:3883:1: rule__Element__NodeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Element__NodeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3887:1: ( ( ( RULE_ID ) ) )
            // InternalExTwentyOne.g:3888:2: ( ( RULE_ID ) )
            {
            // InternalExTwentyOne.g:3888:2: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3889:3: ( RULE_ID )
            {
             before(grammarAccess.getElementAccess().getNodeNodeCrossReference_1_1_0_0()); 
            // InternalExTwentyOne.g:3890:3: ( RULE_ID )
            // InternalExTwentyOne.g:3891:4: RULE_ID
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
    // InternalExTwentyOne.g:3902:1: rule__Element__OutputAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Element__OutputAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3906:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3907:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3907:2: ( RULE_ID )
            // InternalExTwentyOne.g:3908:3: RULE_ID
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
    // InternalExTwentyOne.g:3917:1: rule__DataDecl__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3921:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3922:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3922:2: ( RULE_ID )
            // InternalExTwentyOne.g:3923:3: RULE_ID
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
    // InternalExTwentyOne.g:3932:1: rule__DataDecl__DataAssignment_4 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3936:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3937:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3937:2: ( RULE_ID )
            // InternalExTwentyOne.g:3938:3: RULE_ID
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
    // InternalExTwentyOne.g:3947:1: rule__DataDecl__DataAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__DataAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3951:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:3952:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:3952:2: ( RULE_ID )
            // InternalExTwentyOne.g:3953:3: RULE_ID
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
    // InternalExTwentyOne.g:3962:1: rule__Exp__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3966:1: ( ( rulePrimary ) )
            // InternalExTwentyOne.g:3967:2: ( rulePrimary )
            {
            // InternalExTwentyOne.g:3967:2: ( rulePrimary )
            // InternalExTwentyOne.g:3968:3: rulePrimary
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
    // InternalExTwentyOne.g:3977:1: rule__IfThenElse__IfLogicExpAssignment_1 : ( ruleLogicExp ) ;
    public final void rule__IfThenElse__IfLogicExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3981:1: ( ( ruleLogicExp ) )
            // InternalExTwentyOne.g:3982:2: ( ruleLogicExp )
            {
            // InternalExTwentyOne.g:3982:2: ( ruleLogicExp )
            // InternalExTwentyOne.g:3983:3: ruleLogicExp
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
    // InternalExTwentyOne.g:3992:1: rule__IfThenElse__ThenExpAssignment_3 : ( ruleExp ) ;
    public final void rule__IfThenElse__ThenExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:3996:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:3997:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:3997:2: ( ruleExp )
            // InternalExTwentyOne.g:3998:3: ruleExp
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
    // InternalExTwentyOne.g:4007:1: rule__IfThenElse__ElseExpAssignment_5 : ( ruleExp ) ;
    public final void rule__IfThenElse__ElseExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4011:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4012:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4012:2: ( ruleExp )
            // InternalExTwentyOne.g:4013:3: ruleExp
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
    // InternalExTwentyOne.g:4022:1: rule__NewInput__NewArrayIdAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4026:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4027:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4027:2: ( RULE_ID )
            // InternalExTwentyOne.g:4028:3: RULE_ID
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
    // InternalExTwentyOne.g:4037:1: rule__NewInput__NewArrayIdsAssignment_3 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4041:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4042:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4042:2: ( RULE_ID )
            // InternalExTwentyOne.g:4043:3: RULE_ID
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
    // InternalExTwentyOne.g:4052:1: rule__NewInput__NewArrayExpsAssignment_5 : ( ruleExp ) ;
    public final void rule__NewInput__NewArrayExpsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4056:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4057:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4057:2: ( ruleExp )
            // InternalExTwentyOne.g:4058:3: ruleExp
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
    // InternalExTwentyOne.g:4067:1: rule__NewInput__NewArrayIdsAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__NewInput__NewArrayIdsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4071:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4072:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4072:2: ( RULE_ID )
            // InternalExTwentyOne.g:4073:3: RULE_ID
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
    // InternalExTwentyOne.g:4082:1: rule__NewInput__NewArrayExpsAssignment_6_3 : ( ruleExp ) ;
    public final void rule__NewInput__NewArrayExpsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4086:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4087:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4087:2: ( ruleExp )
            // InternalExTwentyOne.g:4088:3: ruleExp
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
    // InternalExTwentyOne.g:4097:1: rule__LetBinding__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LetBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4101:1: ( ( RULE_ID ) )
            // InternalExTwentyOne.g:4102:2: ( RULE_ID )
            {
            // InternalExTwentyOne.g:4102:2: ( RULE_ID )
            // InternalExTwentyOne.g:4103:3: RULE_ID
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
    // InternalExTwentyOne.g:4112:1: rule__LetBinding__BindingAssignment_3 : ( ruleExp ) ;
    public final void rule__LetBinding__BindingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4116:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4117:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4117:2: ( ruleExp )
            // InternalExTwentyOne.g:4118:3: ruleExp
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
    // InternalExTwentyOne.g:4127:1: rule__LetBinding__BodyAssignment_5 : ( ruleExp ) ;
    public final void rule__LetBinding__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4131:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4132:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4132:2: ( ruleExp )
            // InternalExTwentyOne.g:4133:3: ruleExp
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
    // InternalExTwentyOne.g:4142:1: rule__LogicExp__LeftLogicAssignment_0 : ( ruleExp ) ;
    public final void rule__LogicExp__LeftLogicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4146:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4147:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4147:2: ( ruleExp )
            // InternalExTwentyOne.g:4148:3: ruleExp
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
    // InternalExTwentyOne.g:4157:1: rule__LogicExp__RightLogicAssignment_2 : ( ruleExp ) ;
    public final void rule__LogicExp__RightLogicAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExTwentyOne.g:4161:1: ( ( ruleExp ) )
            // InternalExTwentyOne.g:4162:2: ( ruleExp )
            {
            // InternalExTwentyOne.g:4162:2: ( ruleExp )
            // InternalExTwentyOne.g:4163:3: ruleExp
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000310000803810L});
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