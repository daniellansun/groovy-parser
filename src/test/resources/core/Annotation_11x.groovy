import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention

@Retention(RetentionPolicy.RUNTIME)
public @interface PropertySource {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
public @interface PropertySources {
    PropertySource[] value();
}

@PropertySources({
    @PropertySource("classpath:1.properties"),
    @PropertySource("file:2.properties")
})
public class Test {
}

def propertySources = Test.getAnnotation(PropertySources).value()
assert 2 == propertySources.length
def values = propertySources.collect { it.value() }
assert values.contains('classpath:1.properties')
assert values.contains('file:2.properties')

@PropertySources({
    @PropertySource("classpath:1.properties")
})
public class Test2 {
}
def propertySources2 = Test2.getAnnotation(PropertySources).value()
assert 1 == propertySources2.length
def values2 = propertySources.collect { it.value() }
assert values2.contains('classpath:1.properties')
