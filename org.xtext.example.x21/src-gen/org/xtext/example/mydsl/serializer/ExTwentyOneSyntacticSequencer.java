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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.ExTwentyOneGrammarAccess;

@SuppressWarnings("all")
public class ExTwentyOneSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ExTwentyOneGrammarAccess grammarAccess;
	protected AbstractElementAlias match_LogicExp_EqualsSignKeyword_1_0_or_GreaterThanSignEqualsSignKeyword_1_4_or_GreaterThanSignKeyword_1_2_or_LessThanSignEqualsSignKeyword_1_3_or_LessThanSignKeyword_1_1;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_4_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_4_0_p;
	protected AbstractElementAlias match_Primary_NoneKeyword_3_or_TypeParserRuleCall_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ExTwentyOneGrammarAccess) access;
		match_LogicExp_EqualsSignKeyword_1_0_or_GreaterThanSignEqualsSignKeyword_1_4_or_GreaterThanSignKeyword_1_2_or_LessThanSignEqualsSignKeyword_1_3_or_LessThanSignKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1()));
		match_Primary_LeftParenthesisKeyword_4_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0());
		match_Primary_LeftParenthesisKeyword_4_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0());
		match_Primary_NoneKeyword_3_or_TypeParserRuleCall_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPrimaryAccess().getNoneKeyword_3()), new TokenAlias(false, false, grammarAccess.getPrimaryAccess().getTypeParserRuleCall_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getTypeRule())
			return getTypeToken(semanticObject, ruleCall, node);
		return "";
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
			if (match_LogicExp_EqualsSignKeyword_1_0_or_GreaterThanSignEqualsSignKeyword_1_4_or_GreaterThanSignKeyword_1_2_or_LessThanSignEqualsSignKeyword_1_3_or_LessThanSignKeyword_1_1.equals(syntax))
				emit_LogicExp_EqualsSignKeyword_1_0_or_GreaterThanSignEqualsSignKeyword_1_4_or_GreaterThanSignKeyword_1_2_or_LessThanSignEqualsSignKeyword_1_3_or_LessThanSignKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_4_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_4_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_4_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_NoneKeyword_3_or_TypeParserRuleCall_0.equals(syntax))
				emit_Primary_NoneKeyword_3_or_TypeParserRuleCall_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '=' | '&lt;' | '&gt;' | '&lt;=' | '&gt;='
	 *
	 * This ambiguous syntax occurs at:
	 *     leftLogic=Exp (ambiguity) rightLogic=Exp
	 
	 * </pre>
	 */
	protected void emit_LogicExp_EqualsSignKeyword_1_0_or_GreaterThanSignEqualsSignKeyword_1_4_or_GreaterThanSignKeyword_1_2_or_LessThanSignEqualsSignKeyword_1_3_or_LessThanSignKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'if' ifLogicExp=LogicExp
	 *     (rule start) (ambiguity) 'let' name=ID
	 *     (rule start) (ambiguity) 'new' newArrayId=ID
	 *     (rule start) (ambiguity) (Type | 'none') (rule start)
	 *     (rule start) (ambiguity) {Divide.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Mult.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_4_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Divide.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Mult.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     Type | 'none'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '('* (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_Primary_NoneKeyword_3_or_TypeParserRuleCall_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
