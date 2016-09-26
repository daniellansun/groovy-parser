package org.apache.groovy.parser.antlr4

import groovy.util.logging.Log
import org.apache.groovy.parser.AbstractParser
import org.apache.groovy.parser.Antlr2Parser
import org.apache.groovy.parser.Antlr4Parser
import org.apache.groovy.parser.antlr4.util.ASTComparatorCategory
import org.apache.groovy.parser.antlr4.util.GroovySourceGenerator
import org.codehaus.groovy.ast.ModuleNode

import java.util.zip.ZipEntry
import java.util.zip.ZipFile

/**
 * Utilities for test
 *
 * @author  <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * @date    2016/09/21
 */

@Log
class TestUtils {
    public static final String RESOURCES_PATH = 'src/test/resources';

    static doTest(String path) {
        doTest(path, ASTComparatorCategory.DEFAULT_CONFIGURATION)
    }

    static doTest(String path, List ignoreClazzList) {
        doTest(path, addIgnore(ignoreClazzList, ASTComparatorCategory.LOCATION_IGNORE_LIST))
    }

    static doTest(String path, conf) {
        AbstractParser antlr4Parser = new Antlr4Parser()
        AbstractParser antlr2Parser = new Antlr2Parser()

        File file = new File("$RESOURCES_PATH/$path");
        def (newAST, newElapsedTime) = profile { antlr4Parser.parse(file) }
        def (oldAST, oldElapsedTime) = profile { antlr2Parser.parse(file) }


        assertAST(newAST, oldAST, conf);

        long diffInMillis = newElapsedTime - oldElapsedTime;

        if (diffInMillis >= 500) {
            log.warning "${path}\t\t\t\t\tdiff:${diffInMillis / 1000}s,\tnew:${newElapsedTime / 1000}s,\told:${oldElapsedTime / 1000}s."
        }
    }

    static unzipAndTest(String path, String entryName) {
        unzipAndTest(path, entryName, ASTComparatorCategory.DEFAULT_CONFIGURATION)
    }

    /*
    static unzipAndTest(String path, String entryName, List ignoreClazzList) {
        unzipAndTest(path, entryName, addIgnore(ignoreClazzList, ASTComparatorCategory.LOCATION_IGNORE_LIST))
    }
    */

    static unzipAndTest(String path, String entryName, conf, Map<String, String> replacementsMap=[:]) {
        AbstractParser antlr4Parser = new Antlr4Parser()
        AbstractParser antlr2Parser = new Antlr2Parser()

        String name = "$path!$entryName";
        String text = readZipEntry(path, entryName);

        replacementsMap?.each {k, v ->
            text = text.replace(k, v);
        }

        def (newAST, newElapsedTime) = profile { antlr4Parser.parse(name, text) }
        def (oldAST, oldElapsedTime) = profile { antlr2Parser.parse(name, text) }


        assertAST(newAST, oldAST, conf);

        long diffInMillis = newElapsedTime - oldElapsedTime;

        if (diffInMillis >= 500) {
            log.warning "${path}!${entryName}\t\t\t\t\tdiff:${diffInMillis / 1000}s,\tnew:${newElapsedTime / 1000}s,\told:${oldElapsedTime / 1000}s."
        }
    }


    static assertAST(ast1, ast2, conf) {
        assert null != ast1 && null != ast2

        ASTComparatorCategory.apply(conf) {
            assert ast1 == ast2
        }

        assert genSrc(ast1) == genSrc(ast2)
    }

    static genSrc(ModuleNode ast) {
        return new GroovySourceGenerator(ast).gen();
    }

    static profile(Closure c) {
        long begin = System.currentTimeMillis()
        def result = c.call()
        long end = System.currentTimeMillis()

        return [result, end - begin];
    }

    static addIgnore(Class aClass, ArrayList<String> ignore, Map<Class, List<String>> c = null) {
        c = c ?: ASTComparatorCategory.DEFAULT_CONFIGURATION.clone() as Map<Class, List<String>>;
        c[aClass].addAll(ignore)
        return c
    }

    static addIgnore(Collection<Class> aClass, ArrayList<String> ignore, Map<Class, List<String>> c = null) {
        c = c ?: ASTComparatorCategory.DEFAULT_CONFIGURATION.clone() as Map<Class, List<String>>;
        aClass.each { c[it].addAll(ignore) }
        return c
    }

    static readZipEntry(String path, String entryName) {
        String result = "";

        def zf = new ZipFile(new File(path));
        zf.withAutoCloseable {
            def is = new BufferedInputStream(zf.getInputStream(new ZipEntry(entryName)));
            is.withAutoCloseable {
                result = is.getText("UTF-8");
            }
        }

        return result;
    }
}
