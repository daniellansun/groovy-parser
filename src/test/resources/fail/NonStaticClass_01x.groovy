public class Y {
    public class X {
        def name

        public X(String name) {
            this.name = name
        }
    }

    public static X createX(Y y) {
        return y.new X(name:'Daniel')
    }
}
assert 'Daniel' == Y.createX(new Y()).name
