package org.apache.groovy.parser.antlr4.internal.atnmanager;

import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.StarLoopEntryState;
import org.apache.groovy.parser.antlr4.GroovyLangParser;

import static org.apache.groovy.parser.antlr4.GroovyParser.RULE_nls;

/**
 * Manage ATN for parser to avoid memory leak
 */
public class ParserAtnManager extends AtnManager {
    private final AtnWrapper parserAtnWrapper = new AtnManager.AtnWrapper(GroovyLangParser._ATN);
    public static final ParserAtnManager INSTANCE = new ParserAtnManager();

    static {
        GroovyLangParser._ATN.states.stream()
                .filter(e -> (e instanceof StarLoopEntryState) && (RULE_nls == ((StarLoopEntryState) e).ruleIndex))
                .forEach(e -> ((StarLoopEntryState) e).sll = true);

    }

    @Override
    public ATN getATN() {
        return parserAtnWrapper.checkAndClear();
    }

    @Override
    protected boolean shouldClearDfaCache() {
        return true;
    }

    private ParserAtnManager() {}
}
