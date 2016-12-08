
interface Greetable {
    String name();
    default String hello() {
        return 'hello'
    }
}



class Person implements Greetable {
    @Override
    public String name() {
        return 'Daniel'
    }
}

def p = new Person()
assert 'hello, Daniel' == "${p.hello()}, ${p.name()}"