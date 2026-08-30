/*
 * JDK 8 (and the JVM class-file spec) rejects method names containing
 * '/', '.', ';' or '['. The *SourcesTest classes use quoted names like
 * void "test buildSrc/build_gradle"() so that JUnit labels match zip
 * entry paths. Sanitize those names at compile time so the classes can
 * load; unzipAndTest(...) still receives the original entry path.
 */
withConfig(configuration) {
    inline(phase: 'CONVERSION') { source, context, classNode ->
        def nameField = org.codehaus.groovy.ast.MethodNode.getDeclaredField('name')
        nameField.accessible = true
        classNode.methods.each { method ->
            String name = method.name
            if (name.indexOf('/') >= 0 || name.indexOf('.') >= 0
                    || name.indexOf(';') >= 0 || name.indexOf('[') >= 0) {
                nameField.set(method, name.replace('/' as char, '$' as char)
                        .replace('.' as char, '$' as char)
                        .replace(';' as char, '$' as char)
                        .replace('[' as char, '$' as char))
            }
        }
    }
}
