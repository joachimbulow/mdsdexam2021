/*
 * generated by Xtext 2.26.0
 */
grammar InternalExTwentyOne;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleProgram
entryRuleProgram
:
{ before(grammarAccess.getProgramRule()); }
	 ruleProgram
{ after(grammarAccess.getProgramRule()); } 
	 EOF 
;

// Rule Program
ruleProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProgramAccess().getGroup()); }
		(rule__Program__Group__0)
		{ after(grammarAccess.getProgramAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeclaration
entryRuleDeclaration
:
{ before(grammarAccess.getDeclarationRule()); }
	 ruleDeclaration
{ after(grammarAccess.getDeclarationRule()); } 
	 EOF 
;

// Rule Declaration
ruleDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclarationAccess().getAlternatives()); }
		(rule__Declaration__Alternatives)
		{ after(grammarAccess.getDeclarationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameter
entryRuleParameter
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterAccess().getGroup()); }
		(rule__Parameter__Group__0)
		{ after(grammarAccess.getParameterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction
entryRuleFunction
:
{ before(grammarAccess.getFunctionRule()); }
	 ruleFunction
{ after(grammarAccess.getFunctionRule()); } 
	 EOF 
;

// Rule Function
ruleFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionAccess().getGroup()); }
		(rule__Function__Group__0)
		{ after(grammarAccess.getFunctionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLambda
entryRuleLambda
:
{ before(grammarAccess.getLambdaRule()); }
	 ruleLambda
{ after(grammarAccess.getLambdaRule()); } 
	 EOF 
;

// Rule Lambda
ruleLambda 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLambdaAccess().getGroup()); }
		(rule__Lambda__Group__0)
		{ after(grammarAccess.getLambdaAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInput
entryRuleInput
:
{ before(grammarAccess.getInputRule()); }
	 ruleInput
{ after(grammarAccess.getInputRule()); } 
	 EOF 
;

// Rule Input
ruleInput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInputAccess().getGroup()); }
		(rule__Input__Group__0)
		{ after(grammarAccess.getInputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNode
entryRuleNode
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNodeAccess().getAlternatives()); }
		(rule__Node__Alternatives)
		{ after(grammarAccess.getNodeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStream
entryRuleStream
:
{ before(grammarAccess.getStreamRule()); }
	 ruleStream
{ after(grammarAccess.getStreamRule()); } 
	 EOF 
;

// Rule Stream
ruleStream 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStreamAccess().getGroup()); }
		(rule__Stream__Group__0)
		{ after(grammarAccess.getStreamAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataDecl
entryRuleDataDecl
:
{ before(grammarAccess.getDataDeclRule()); }
	 ruleDataDecl
{ after(grammarAccess.getDataDeclRule()); } 
	 EOF 
;

// Rule DataDecl
ruleDataDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataDeclAccess().getGroup()); }
		(rule__DataDecl__Group__0)
		{ after(grammarAccess.getDataDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExp
entryRuleExp
:
{ before(grammarAccess.getExpRule()); }
	 ruleExp
{ after(grammarAccess.getExpRule()); } 
	 EOF 
;

// Rule Exp
ruleExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpAccess().getGroup()); }
		(rule__Exp__Group__0)
		{ after(grammarAccess.getExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0()); }
		ruleFunction
		{ after(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1()); }
		ruleInput
		{ after(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2()); }
		ruleNode
		{ after(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3()); }
		ruleStream
		{ after(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4()); }
		ruleDataDecl
		{ after(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5()); }
		ruleParameter
		{ after(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getGroup_0()); }
		(rule__Node__Group_0__0)
		{ after(grammarAccess.getNodeAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getNodeAccess().getGroup_1()); }
		(rule__Node__Group_1__0)
		{ after(grammarAccess.getNodeAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getIntKeyword_0()); }
		'int'
		{ after(grammarAccess.getTypeAccess().getIntKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getStringKeyword_1()); }
		'string'
		{ after(grammarAccess.getTypeAccess().getStringKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_2()); }
		RULE_ID
		{ after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__0__Impl
	rule__Program__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getProgramKeyword_0()); }
	'program'
	{ after(grammarAccess.getProgramAccess().getProgramKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__1__Impl
	rule__Program__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getNameAssignment_1()); }
	(rule__Program__NameAssignment_1)
	{ after(grammarAccess.getProgramAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Program__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProgramAccess().getDeclarationsAssignment_2()); }
	(rule__Program__DeclarationsAssignment_2)*
	{ after(grammarAccess.getProgramAccess().getDeclarationsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__0__Impl
	rule__Parameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getParameterKeyword_0()); }
	'parameter'
	{ after(grammarAccess.getParameterAccess().getParameterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__1__Impl
	rule__Parameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getNameAssignment_1()); }
	(rule__Parameter__NameAssignment_1)
	{ after(grammarAccess.getParameterAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__2__Impl
	rule__Parameter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getParameterAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getTypeParserRuleCall_3()); }
	ruleType
	{ after(grammarAccess.getParameterAccess().getTypeParserRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__0__Impl
	rule__Function__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); }
	'function'
	{ after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__1__Impl
	rule__Function__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getNameAssignment_1()); }
	(rule__Function__NameAssignment_1)
	{ after(grammarAccess.getFunctionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getLambdaAssignment_2()); }
	(rule__Function__LambdaAssignment_2)
	{ after(grammarAccess.getFunctionAccess().getLambdaAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Lambda__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lambda__Group__0__Impl
	rule__Lambda__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lambda__Group__1__Impl
	rule__Lambda__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLambdaAccess().getNameAssignment_1()); }
	(rule__Lambda__NameAssignment_1)
	{ after(grammarAccess.getLambdaAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lambda__Group__2__Impl
	rule__Lambda__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLambdaAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getLambdaAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lambda__Group__3__Impl
	rule__Lambda__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLambdaAccess().getTypeParserRuleCall_3()); }
	ruleType
	{ after(grammarAccess.getLambdaAccess().getTypeParserRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lambda__Group__4__Impl
	rule__Lambda__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lambda__Group__5__Impl
	rule__Lambda__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lambda__Group__6__Impl
	rule__Lambda__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLambdaAccess().getExpParserRuleCall_6()); }
	ruleExp
	{ after(grammarAccess.getLambdaAccess().getExpParserRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Lambda__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__0__Impl
	rule__Input__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getInputKeyword_0()); }
	'input'
	{ after(grammarAccess.getInputAccess().getInputKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__1__Impl
	rule__Input__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getNameAssignment_1()); }
	(rule__Input__NameAssignment_1)
	{ after(grammarAccess.getInputAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__2__Impl
	rule__Input__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getInputAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Input__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInputAccess().getTypeParserRuleCall_3()); }
	ruleType
	{ after(grammarAccess.getInputAccess().getTypeParserRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_0__0__Impl
	rule__Node__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getNodeKeyword_0_0()); }
	'node'
	{ after(grammarAccess.getNodeAccess().getNodeKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_0__1__Impl
	rule__Node__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getNameAssignment_0_1()); }
	(rule__Node__NameAssignment_0_1)
	{ after(grammarAccess.getNodeAccess().getNameAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_0__2__Impl
	rule__Node__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_0_2()); }
	'['
	{ after(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getLambdaAssignment_0_3()); }
	(rule__Node__LambdaAssignment_0_3)
	{ after(grammarAccess.getNodeAccess().getLambdaAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1__0__Impl
	rule__Node__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getLambdaParserRuleCall_1_0()); }
	ruleLambda
	{ after(grammarAccess.getNodeAccess().getLambdaParserRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_1()); }
	']'
	{ after(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stream__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group__0__Impl
	rule__Stream__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStreamAccess().getStreamKeyword_0()); }
	'stream'
	{ after(grammarAccess.getStreamAccess().getStreamKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group__1__Impl
	rule__Stream__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStreamAccess().getInputsAssignment_1()); }
	(rule__Stream__InputsAssignment_1)
	{ after(grammarAccess.getStreamAccess().getInputsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group__2__Impl
	rule__Stream__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStreamAccess().getGroup_2()); }
	(rule__Stream__Group_2__0)*
	{ after(grammarAccess.getStreamAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getStreamAccess().getGroup_3()); }
		(rule__Stream__Group_3__0)
		{ after(grammarAccess.getStreamAccess().getGroup_3()); }
	)
	(
		{ before(grammarAccess.getStreamAccess().getGroup_3()); }
		(rule__Stream__Group_3__0)*
		{ after(grammarAccess.getStreamAccess().getGroup_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stream__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group_2__0__Impl
	rule__Stream__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStreamAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getStreamAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStreamAccess().getInputsAssignment_2_1()); }
	(rule__Stream__InputsAssignment_2_1)
	{ after(grammarAccess.getStreamAccess().getInputsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stream__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group_3__0__Impl
	rule__Stream__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStreamAccess().getToKeyword_3_0()); }
	'to'
	{ after(grammarAccess.getStreamAccess().getToKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group_3__1__Impl
	rule__Stream__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStreamAccess().getElementsAssignment_3_1()); }
	(rule__Stream__ElementsAssignment_3_1)
	{ after(grammarAccess.getStreamAccess().getElementsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStreamAccess().getGroup_3_2()); }
	(rule__Stream__Group_3_2__0)*
	{ after(grammarAccess.getStreamAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Stream__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group_3_2__0__Impl
	rule__Stream__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStreamAccess().getCommaKeyword_3_2_0()); }
	','
	{ after(grammarAccess.getStreamAccess().getCommaKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Stream__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStreamAccess().getElementsAssignment_3_2_1()); }
	(rule__Stream__ElementsAssignment_3_2_1)
	{ after(grammarAccess.getStreamAccess().getElementsAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group__0__Impl
	rule__DataDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getDataKeyword_0()); }
	'data'
	{ after(grammarAccess.getDataDeclAccess().getDataKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group__1__Impl
	rule__DataDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getNameAssignment_1()); }
	(rule__DataDecl__NameAssignment_1)
	{ after(grammarAccess.getDataDeclAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group__2__Impl
	rule__DataDecl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group__3__Impl
	rule__DataDecl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getDataAssignment_3()); }
	(rule__DataDecl__DataAssignment_3)
	{ after(grammarAccess.getDataDeclAccess().getDataAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group__4__Impl
	rule__DataDecl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getColonKeyword_4()); }
	':'
	{ after(grammarAccess.getDataDeclAccess().getColonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group__5__Impl
	rule__DataDecl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_5()); }
	ruleType
	{ after(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group__6__Impl
	rule__DataDecl__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getGroup_6()); }
	(rule__DataDecl__Group_6__0)*
	{ after(grammarAccess.getDataDeclAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataDecl__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group_6__0__Impl
	rule__DataDecl__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getCommaKeyword_6_0()); }
	','
	{ after(grammarAccess.getDataDeclAccess().getCommaKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group_6__1__Impl
	rule__DataDecl__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getDataAssignment_6_1()); }
	(rule__DataDecl__DataAssignment_6_1)
	{ after(grammarAccess.getDataDeclAccess().getDataAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group_6__2__Impl
	rule__DataDecl__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getColonKeyword_6_2()); }
	':'
	{ after(grammarAccess.getDataDeclAccess().getColonKeyword_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataDecl__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_6_3()); }
	ruleType
	{ after(grammarAccess.getDataDeclAccess().getTypeParserRuleCall_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__0__Impl
	rule__Exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
	{ after(grammarAccess.getExpAccess().getINTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__1__Impl
	rule__Exp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getPlusSignKeyword_1()); }
	'+'
	{ after(grammarAccess.getExpAccess().getPlusSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
	{ after(grammarAccess.getExpAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Program__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Program__DeclarationsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_2_0()); }
		ruleDeclaration
		{ after(grammarAccess.getProgramAccess().getDeclarationsDeclarationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__LambdaAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_2_0()); }
		ruleLambda
		{ after(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Lambda__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__NameAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__LambdaAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getLambdaLambdaCrossReference_0_3_0()); }
		(
			{ before(grammarAccess.getNodeAccess().getLambdaLambdaIDTerminalRuleCall_0_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getNodeAccess().getLambdaLambdaIDTerminalRuleCall_0_3_0_1()); }
		)
		{ after(grammarAccess.getNodeAccess().getLambdaLambdaCrossReference_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__InputsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStreamAccess().getInputsInputCrossReference_1_0()); }
		(
			{ before(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getStreamAccess().getInputsInputCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__InputsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStreamAccess().getInputsInputCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStreamAccess().getInputsInputIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getStreamAccess().getInputsInputCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__ElementsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStreamAccess().getElementsElementCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getStreamAccess().getElementsElementIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStreamAccess().getElementsElementIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getStreamAccess().getElementsElementCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__ElementsAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStreamAccess().getElementsElementCrossReference_3_2_1_0()); }
		(
			{ before(grammarAccess.getStreamAccess().getElementsElementIDTerminalRuleCall_3_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStreamAccess().getElementsElementIDTerminalRuleCall_3_2_1_0_1()); }
		)
		{ after(grammarAccess.getStreamAccess().getElementsElementCrossReference_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__DataAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataDecl__DataAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_6_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDataDeclAccess().getDataIDTerminalRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;