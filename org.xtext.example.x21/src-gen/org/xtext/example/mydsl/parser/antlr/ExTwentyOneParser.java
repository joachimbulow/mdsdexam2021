/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalExTwentyOneParser;
import org.xtext.example.mydsl.services.ExTwentyOneGrammarAccess;

public class ExTwentyOneParser extends AbstractAntlrParser {

	@Inject
	private ExTwentyOneGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalExTwentyOneParser createParser(XtextTokenStream stream) {
		return new InternalExTwentyOneParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public ExTwentyOneGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ExTwentyOneGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
