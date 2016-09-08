package org.apache.groovy.parser.antlr4.ui

import groovy.ui.Console
import org.apache.groovy.parser.antlr4.Antlr4PluginFactory
import org.codehaus.groovy.control.CompilerConfiguration

/**
 * Created by Daniel on 2016/9/4.
 */
class GroovyConsole {
    private Console console;

    public GroovyConsole() {
        CompilerConfiguration configuration = new CompilerConfiguration(CompilerConfiguration.DEFAULT);
        configuration.setPluginFactory(new Antlr4PluginFactory());

        this.console = new Console(this.getClass().getClassLoader(), new Binding(), configuration);
    }

    public void run() {
        this.console.run();
    }

    public static void main(String[] args) {
        new GroovyConsole().run();
    }
}
