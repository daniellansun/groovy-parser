package org.apache.groovy.parser.antlr4;

import org.codehaus.groovy.control.ParserPlugin;
import org.codehaus.groovy.control.ParserPluginFactory;

/**
 * Created by Daniel.Sun on 2016/8/14.
 */
public class Antlr4PluginFactory extends ParserPluginFactory {
    @Override
    public ParserPlugin createParserPlugin() {
        return new Antlr4ParserPlugin();
    }
}
