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

    public static X createX() {
        return createY().new X('Daniel')
    }

    public static String getXName() {
        return createY().new X('Daniel').name
    }

    public static String getXName2() {
        return createY().
                        new X('Daniel')
                                        .name
    }
}

def createY() {
    return new Y()
}

assert 'Daniel' == Y.createX(new Y()).name
assert 'Daniel' == Y.createX().name
assert 'Daniel' == Y.getXName()
assert 'Daniel' == Y.getXName2()
