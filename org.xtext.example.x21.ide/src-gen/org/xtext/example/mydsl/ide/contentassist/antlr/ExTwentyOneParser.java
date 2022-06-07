/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalExTwentyOneParser;
import org.xtext.example.mydsl.services.ExTwentyOneGrammarAccess;

public class ExTwentyOneParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ExTwentyOneGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ExTwentyOneGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getNodeAccess().getAlternatives_3(), "rule__Node__Alternatives_3");
			builder.put(grammarAccess.getStreamAccess().getAlternatives(), "rule__Stream__Alternatives");
			builder.put(grammarAccess.getStreamAccess().getAlternatives_1_1(), "rule__Stream__Alternatives_1_1");
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getElementAccess().getAlternatives_1_1(), "rule__Element__Alternatives_1_1");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getLogicExpAccess().getAlternatives_1(), "rule__LogicExp__Alternatives_1");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getLambdaAccess().getGroup(), "rule__Lambda__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
			builder.put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
			builder.put(grammarAccess.getStreamAccess().getGroup_0(), "rule__Stream__Group_0__0");
			builder.put(grammarAccess.getStreamAccess().getGroup_1(), "rule__Stream__Group_1__0");
			builder.put(grammarAccess.getStreamAccess().getGroup_1_1_0(), "rule__Stream__Group_1_1_0__0");
			builder.put(grammarAccess.getStreamAccess().getGroup_1_2(), "rule__Stream__Group_1_2__0");
			builder.put(grammarAccess.getStreamAccess().getGroup_1_2_2(), "rule__Stream__Group_1_2_2__0");
			builder.put(grammarAccess.getElementAccess().getGroup_1(), "rule__Element__Group_1__0");
			builder.put(grammarAccess.getElementAccess().getGroup_2(), "rule__Element__Group_2__0");
			builder.put(grammarAccess.getDataDeclAccess().getGroup(), "rule__DataDecl__Group__0");
			builder.put(grammarAccess.getDataDeclAccess().getGroup_6(), "rule__DataDecl__Group_6__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getLogicExpAccess().getGroup(), "rule__LogicExp__Group__0");
			builder.put(grammarAccess.getProgramAccess().getNameAssignment_1(), "rule__Program__NameAssignment_1");
			builder.put(grammarAccess.getProgramAccess().getDeclarationsAssignment_2(), "rule__Program__DeclarationsAssignment_2");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getLambdaAssignment_2(), "rule__Function__LambdaAssignment_2");
			builder.put(grammarAccess.getLambdaAccess().getNameAssignment_1(), "rule__Lambda__NameAssignment_1");
			builder.put(grammarAccess.getInputAccess().getNameAssignment_1(), "rule__Input__NameAssignment_1");
			builder.put(grammarAccess.getNodeAccess().getNameAssignment_1(), "rule__Node__NameAssignment_1");
			builder.put(grammarAccess.getNodeAccess().getFunctionAssignment_3_0(), "rule__Node__FunctionAssignment_3_0");
			builder.put(grammarAccess.getNodeAccess().getLambdaAssignment_3_1(), "rule__Node__LambdaAssignment_3_1");
			builder.put(grammarAccess.getStreamAccess().getInputsAssignment_0_1(), "rule__Stream__InputsAssignment_0_1");
			builder.put(grammarAccess.getStreamAccess().getInputsAssignment_1_0(), "rule__Stream__InputsAssignment_1_0");
			builder.put(grammarAccess.getStreamAccess().getInputsAssignment_1_1_0_1(), "rule__Stream__InputsAssignment_1_1_0_1");
			builder.put(grammarAccess.getStreamAccess().getInputsAssignment_1_1_1(), "rule__Stream__InputsAssignment_1_1_1");
			builder.put(grammarAccess.getStreamAccess().getElementsAssignment_1_2_1(), "rule__Stream__ElementsAssignment_1_2_1");
			builder.put(grammarAccess.getStreamAccess().getElementsAssignment_1_2_2_1(), "rule__Stream__ElementsAssignment_1_2_2_1");
			builder.put(grammarAccess.getElementAccess().getElementAssignment_0(), "rule__Element__ElementAssignment_0");
			builder.put(grammarAccess.getElementAccess().getNodeAssignment_1_1_0(), "rule__Element__NodeAssignment_1_1_0");
			builder.put(grammarAccess.getElementAccess().getOutputAssignment_2_1(), "rule__Element__OutputAssignment_2_1");
			builder.put(grammarAccess.getDataDeclAccess().getNameAssignment_1(), "rule__DataDecl__NameAssignment_1");
			builder.put(grammarAccess.getDataDeclAccess().getDataAssignment_3(), "rule__DataDecl__DataAssignment_3");
			builder.put(grammarAccess.getDataDeclAccess().getDataAssignment_6_1(), "rule__DataDecl__DataAssignment_6_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ExTwentyOneGrammarAccess grammarAccess;

	@Override
	protected InternalExTwentyOneParser createParser() {
		InternalExTwentyOneParser result = new InternalExTwentyOneParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ExTwentyOneGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ExTwentyOneGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
