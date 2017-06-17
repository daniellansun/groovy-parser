import java.lang.annotation.Retention
import java.lang.annotation.Target

import static java.lang.annotation.ElementType.*
import static java.lang.annotation.RetentionPolicy.RUNTIME

@Target([PARAMETER, FIELD, METHOD, ANNOTATION_TYPE, TYPE_USE, LOCAL_VARIABLE])
@Retention(RUNTIME)
@interface JSR308 { }

class JSR308BaseClass<T> {}
interface JSR308Interface1<T> {}
interface JSR308Interface2<T> {}

class JSR308Class extends @JSR308 JSR308BaseClass<@JSR308 List> implements @JSR308 JSR308Interface1<@JSR308 String>, @JSR308 JSR308Interface2<@JSR308 String> {
    def test(List<? extends @JSR308 Object> list) throws @JSR308 IOException, @JSR308 java.sql.SQLException {
        @JSR308 List<@JSR308 String> localVar = new @JSR308 ArrayList<@JSR308 String>();

        try {
            for (e in list) {
                String t = (@JSR308 String) e;
                localVar.add(t);
            }
        } catch (@JSR308 Exception e) {
        }

        return localVar
    }
}

def jsr308Class = new JSR308Class();
def list = new ArrayList<@JSR308 String>();
list.addAll(["1", "2"]);
def result = jsr308Class.test(list)
assert list == result
