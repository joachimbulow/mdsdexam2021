/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.ExTwentyOneGrammarAccess;

@SuppressWarnings("all")
public class ExTwentyOneSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ExTwentyOneGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ExTwentyOneGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getExpRule())
			return getExpToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTypeRule())
			return getTypeToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Exp: INT '+' INT;
	 */
	protected String getExpToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * Type: 
	 * 	'int' | 'string' | ID
	 * ;
	 */
	protected String getTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "int";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}