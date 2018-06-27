/*
 * generated by Xtext 2.12.0
 */
package fr.inria.diverse.xcore.lang.parser.antlr;

import com.google.inject.Inject;
import fr.inria.diverse.xcore.lang.parser.antlr.internal.InternalLxcoreParser;
import fr.inria.diverse.xcore.lang.services.LxcoreGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LxcoreParser extends AbstractAntlrParser {

	@Inject
	private LxcoreGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLxcoreParser createParser(XtextTokenStream stream) {
		return new InternalLxcoreParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "XPackage";
	}

	public LxcoreGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LxcoreGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}