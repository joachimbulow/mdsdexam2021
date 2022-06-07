/*
 * generated by Xtext 2.26.0
 */
grammar InternalExTwentyOne;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.ExTwentyOneGrammarAccess;

}

@parser::members {

 	private ExTwentyOneGrammarAccess grammarAccess;

    public InternalExTwentyOneParser(TokenStream input, ExTwentyOneGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected ExTwentyOneGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='program'
		{
			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProgramRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_2_0());
				}
				lv_declarations_2_0=ruleDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"declarations",
						lv_declarations_2_0,
						"org.xtext.example.mydsl.ExTwentyOne.Declaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current; }
	EOF;

// Rule Declaration
ruleDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0());
		}
		this_Function_0=ruleFunction
		{
			$current = $this_Function_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1());
		}
		this_Input_1=ruleInput
		{
			$current = $this_Input_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2());
		}
		this_Node_2=ruleNode
		{
			$current = $this_Node_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3());
		}
		this_Stream_3=ruleStream
		{
			$current = $this_Stream_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4());
		}
		this_DataDecl_4=ruleDataDecl
		{
			$current = $this_DataDecl_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5());
		}
		this_Parameter_5=ruleParameter
		{
			$current = $this_Parameter_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='parameter'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
		}
		{
			newCompositeNode(grammarAccess.getParameterAccess().getTypeParserRuleCall_3());
		}
		ruleType
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFunctionAccess().getFunctionAction_0(),
					$current);
			}
		)
		otherlv_1='function'
		{
			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFunctionKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_3_0());
				}
				lv_lambda_3_0=ruleLambda
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"lambda",
						lv_lambda_3_0,
						"org.xtext.example.mydsl.ExTwentyOne.Lambda");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLambda
entryRuleLambda returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLambdaRule()); }
	iv_ruleLambda=ruleLambda
	{ $current=$iv_ruleLambda.current; }
	EOF;

// Rule Lambda
ruleLambda returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLambdaAccess().getLambdaAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLambdaRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getLambdaAccess().getColonKeyword_3());
		}
		{
			newCompositeNode(grammarAccess.getLambdaAccess().getTypeParserRuleCall_4());
		}
		ruleType
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getLambdaAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLambdaAccess().getLambdaExpExpParserRuleCall_7_0());
				}
				lv_lambdaExp_7_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLambdaRule());
					}
					set(
						$current,
						"lambdaExp",
						lv_lambdaExp_7_0,
						"org.xtext.example.mydsl.ExTwentyOne.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current; }
	EOF;

// Rule Input
ruleInput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInputAccess().getInputAction_0(),
					$current);
			}
		)
		otherlv_1='input'
		{
			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getInputKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getInputAccess().getColonKeyword_3());
		}
		{
			newCompositeNode(grammarAccess.getInputAccess().getTypeParserRuleCall_4());
		}
		ruleType
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNode
entryRuleNode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeRule()); }
	iv_ruleNode=ruleNode
	{ $current=$iv_ruleNode.current; }
	EOF;

// Rule Node
ruleNode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNodeAccess().getNodeAction_0(),
					$current);
			}
		)
		otherlv_1='node'
		{
			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNodeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='['
		{
			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_3());
		}
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNodeRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getFunctionFunctionCrossReference_4_0_0());
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getNodeAccess().getLambdaLambdaParserRuleCall_4_1_0());
					}
					lv_lambda_5_0=ruleLambda
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNodeRule());
						}
						set(
							$current,
							"lambda",
							lv_lambda_5_0,
							"org.xtext.example.mydsl.ExTwentyOne.Lambda");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_6=']'
		{
			newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getRightSquareBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleStream
entryRuleStream returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStreamRule()); }
	iv_ruleStream=ruleStream
	{ $current=$iv_ruleStream.current; }
	EOF;

// Rule Stream
ruleStream returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStreamAccess().getStreamAction_0(),
					$current);
			}
		)
		otherlv_1='stream'
		{
			newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getStreamKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStreamRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_2_0());
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStreamRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getStreamAccess().getInputsOrNodesInputOrNodeCrossReference_3_1_0());
					}
				)
			)
		)*
		(
			otherlv_5='to'
			{
				newLeafNode(otherlv_5, grammarAccess.getStreamAccess().getToKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_4_1_0());
					}
					lv_elements_6_0=ruleElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStreamRule());
						}
						add(
							$current,
							"elements",
							lv_elements_6_0,
							"org.xtext.example.mydsl.ExTwentyOne.Element");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getStreamAccess().getCommaKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_4_2_1_0());
						}
						lv_elements_8_0=ruleElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStreamRule());
							}
							add(
								$current,
								"elements",
								lv_elements_8_0,
								"org.xtext.example.mydsl.ExTwentyOne.Element");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)+
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getElementAccess().getElementAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_element_1_0=RULE_ID
					{
						newLeafNode(lv_element_1_0, grammarAccess.getElementAccess().getElementIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
						setWithLastConsumed(
							$current,
							"element",
							lv_element_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		    |
		(
			otherlv_2='['
			{
				newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0());
			}
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getElementRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getElementAccess().getNodeNodeOrFunctionCrossReference_1_1_0_0());
						}
					)
				)
				    |
				{
					newCompositeNode(grammarAccess.getElementAccess().getLambdaParserRuleCall_1_1_1());
				}
				this_Lambda_4=ruleLambda
				{
					$current = $this_Lambda_4.current;
					afterParserOrEnumRuleCall();
				}
			)
			otherlv_5=']'
			{
				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2());
			}
		)
		    |
		(
			otherlv_6='output'
			{
				newLeafNode(otherlv_6, grammarAccess.getElementAccess().getOutputKeyword_2_0());
			}
			(
				(
					lv_output_7_0=RULE_ID
					{
						newLeafNode(lv_output_7_0, grammarAccess.getElementAccess().getOutputIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
						setWithLastConsumed(
							$current,
							"output",
							lv_output_7_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleDataDecl
entryRuleDataDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataDeclRule()); }
	iv_ruleDataDecl=ruleDataDecl
	{ $current=$iv_ruleDataDecl.current; }
	EOF;

// Rule DataDecl
ruleDataDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDataDeclAccess().getDataDeclAction_0(),
					$current);
			}
		)
		otherlv_1='data'
		{
			newLeafNode(otherlv_1, grammarAccess.getDataDeclAccess().getDataKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataDeclRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				lv_data_4_0=RULE_ID
				{
					newLeafNode(lv_data_4_0, grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataDeclRule());
					}
					addWithLastConsumed(
						$current,
						"data",
						lv_data_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getDataDeclAccess().getColonKeyword_5());
		}
		{
			newCompositeNode(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_6());
		}
		ruleType
		{
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getDataDeclAccess().getCommaKeyword_7_0());
			}
			(
				(
					lv_data_8_0=RULE_ID
					{
						newLeafNode(lv_data_8_0, grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataDeclRule());
						}
						addWithLastConsumed(
							$current,
							"data",
							lv_data_8_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_9=':'
			{
				newLeafNode(otherlv_9, grammarAccess.getDataDeclAccess().getColonKeyword_7_2());
			}
			{
				newCompositeNode(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_7_3());
			}
			ruleType
			{
				afterParserOrEnumRuleCall();
			}
		)*
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current.getText(); }
	EOF;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='int'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
		}
		    |
		kw='string'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
		}
		    |
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getTypeAccess().getIDTerminalRuleCall_2());
		}
		    |
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getTypeAccess().getINTTerminalRuleCall_3());
		}
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='+'
					{
						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
								$current);
						}
					)
					otherlv_4='-'
					{
						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getMultLeftAction_1_0_2_0(),
								$current);
						}
					)
					otherlv_6='*'
					{
						newLeafNode(otherlv_6, grammarAccess.getExpAccess().getAsteriskKeyword_1_0_2_1());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getDivideLeftAction_1_0_3_0(),
								$current);
						}
					)
					otherlv_8='/'
					{
						newLeafNode(otherlv_8, grammarAccess.getExpAccess().getSolidusKeyword_1_0_3_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpAccess().getRightPrimaryParserRuleCall_1_1_0());
					}
					lv_right_9_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpRule());
						}
						set(
							$current,
							"right",
							lv_right_9_0,
							"org.xtext.example.mydsl.ExTwentyOne.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getTypeParserRuleCall_0());
		}
		ruleType
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_1());
		}
		this_LetBinding_1=ruleLetBinding
		{
			$current = $this_LetBinding_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getIfThenElseParserRuleCall_2());
		}
		this_IfThenElse_2=ruleIfThenElse
		{
			$current = $this_IfThenElse_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		otherlv_3='none'
		{
			newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getNoneKeyword_3());
		}
		    |
		(
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryAccess().getExpParserRuleCall_4_1());
			}
			this_Exp_5=ruleExp
			{
				$current = $this_Exp_5.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_2());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getNewInputParserRuleCall_5());
		}
		this_NewInput_7=ruleNewInput
		{
			$current = $this_NewInput_7.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIfThenElse
entryRuleIfThenElse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfThenElseRule()); }
	iv_ruleIfThenElse=ruleIfThenElse
	{ $current=$iv_ruleIfThenElse.current; }
	EOF;

// Rule IfThenElse
ruleIfThenElse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfThenElseAccess().getIfLogicExpLogicExpParserRuleCall_1_0());
				}
				lv_ifLogicExp_1_0=ruleLogicExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
					}
					set(
						$current,
						"ifLogicExp",
						lv_ifLogicExp_1_0,
						"org.xtext.example.mydsl.ExTwentyOne.LogicExp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='then'
		{
			newLeafNode(otherlv_2, grammarAccess.getIfThenElseAccess().getThenKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfThenElseAccess().getThenExpExpParserRuleCall_3_0());
				}
				lv_thenExp_3_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
					}
					set(
						$current,
						"thenExp",
						lv_thenExp_3_0,
						"org.xtext.example.mydsl.ExTwentyOne.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='else'
		{
			newLeafNode(otherlv_4, grammarAccess.getIfThenElseAccess().getElseKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfThenElseAccess().getElseExpExpParserRuleCall_5_0());
				}
				lv_elseExp_5_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfThenElseRule());
					}
					set(
						$current,
						"elseExp",
						lv_elseExp_5_0,
						"org.xtext.example.mydsl.ExTwentyOne.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='end'
		{
			newLeafNode(otherlv_6, grammarAccess.getIfThenElseAccess().getEndKeyword_6());
		}
	)
;

// Entry rule entryRuleNewInput
entryRuleNewInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNewInputRule()); }
	iv_ruleNewInput=ruleNewInput
	{ $current=$iv_ruleNewInput.current; }
	EOF;

// Rule NewInput
ruleNewInput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='new'
		{
			newLeafNode(otherlv_0, grammarAccess.getNewInputAccess().getNewKeyword_0());
		}
		(
			(
				lv_newArrayId_1_0=RULE_ID
				{
					newLeafNode(lv_newArrayId_1_0, grammarAccess.getNewInputAccess().getNewArrayIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNewInputRule());
					}
					setWithLastConsumed(
						$current,
						"newArrayId",
						lv_newArrayId_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getNewInputAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				lv_newArrayIds_3_0=RULE_ID
				{
					newLeafNode(lv_newArrayIds_3_0, grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNewInputRule());
					}
					addWithLastConsumed(
						$current,
						"newArrayIds",
						lv_newArrayIds_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getNewInputAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_5_0());
				}
				lv_newArrayExps_5_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNewInputRule());
					}
					add(
						$current,
						"newArrayExps",
						lv_newArrayExps_5_0,
						"org.xtext.example.mydsl.ExTwentyOne.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getNewInputAccess().getCommaKeyword_6_0());
			}
			(
				(
					lv_newArrayIds_7_0=RULE_ID
					{
						newLeafNode(lv_newArrayIds_7_0, grammarAccess.getNewInputAccess().getNewArrayIdsIDTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNewInputRule());
						}
						addWithLastConsumed(
							$current,
							"newArrayIds",
							lv_newArrayIds_7_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_8='='
			{
				newLeafNode(otherlv_8, grammarAccess.getNewInputAccess().getEqualsSignKeyword_6_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNewInputAccess().getNewArrayExpsExpParserRuleCall_6_3_0());
					}
					lv_newArrayExps_9_0=ruleExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNewInputRule());
						}
						add(
							$current,
							"newArrayExps",
							lv_newArrayExps_9_0,
							"org.xtext.example.mydsl.ExTwentyOne.Exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_10=']'
		{
			newLeafNode(otherlv_10, grammarAccess.getNewInputAccess().getRightSquareBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleLetBinding
entryRuleLetBinding returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLetBindingRule()); }
	iv_ruleLetBinding=ruleLetBinding
	{ $current=$iv_ruleLetBinding.current; }
	EOF;

// Rule LetBinding
ruleLetBinding returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='let'
		{
			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLetBindingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
				}
				lv_binding_3_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLetBindingRule());
					}
					set(
						$current,
						"binding",
						lv_binding_3_0,
						"org.xtext.example.mydsl.ExTwentyOne.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='in'
		{
			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
				}
				lv_body_5_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLetBindingRule());
					}
					set(
						$current,
						"body",
						lv_body_5_0,
						"org.xtext.example.mydsl.ExTwentyOne.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='end'
		{
			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
		}
	)
;

// Entry rule entryRuleLogicExp
entryRuleLogicExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLogicExpRule()); }
	iv_ruleLogicExp=ruleLogicExp
	{ $current=$iv_ruleLogicExp.current; }
	EOF;

// Rule LogicExp
ruleLogicExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getLogicExpAccess().getLeftLogicExpParserRuleCall_0_0());
				}
				lv_leftLogic_0_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLogicExpRule());
					}
					set(
						$current,
						"leftLogic",
						lv_leftLogic_0_0,
						"org.xtext.example.mydsl.ExTwentyOne.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='='
			{
				newLeafNode(otherlv_1, grammarAccess.getLogicExpAccess().getEqualsSignKeyword_1_0());
			}
			    |
			otherlv_2='<'
			{
				newLeafNode(otherlv_2, grammarAccess.getLogicExpAccess().getLessThanSignKeyword_1_1());
			}
			    |
			otherlv_3='>'
			{
				newLeafNode(otherlv_3, grammarAccess.getLogicExpAccess().getGreaterThanSignKeyword_1_2());
			}
			    |
			otherlv_4='<='
			{
				newLeafNode(otherlv_4, grammarAccess.getLogicExpAccess().getLessThanSignEqualsSignKeyword_1_3());
			}
			    |
			otherlv_5='>='
			{
				newLeafNode(otherlv_5, grammarAccess.getLogicExpAccess().getGreaterThanSignEqualsSignKeyword_1_4());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLogicExpAccess().getRightLogicExpParserRuleCall_2_0());
				}
				lv_rightLogic_6_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLogicExpRule());
					}
					set(
						$current,
						"rightLogic",
						lv_rightLogic_6_0,
						"org.xtext.example.mydsl.ExTwentyOne.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
