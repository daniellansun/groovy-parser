public class Y {
    public class X {
        def name

        public X(String name) {
            this.name = name
        }
    }

    public static Y createY() {
        return new Y()
    }

    public static X createX(Y y) {
        return y.new X('Daniel')
    }
}

def createY() {
    return new Y()
}

assert 'Daniel' == Y.createX(new Y()).name
assert 'Daniel' == Y.createY().createX(new Y()).name
assert 'Daniel' == createY().createX(new Y()).name
