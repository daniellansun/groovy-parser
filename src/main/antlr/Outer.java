public class Outer {
    public class Inner {
        public String name;
    }

    public static String create(Outer outer) {
        return outer.new Inner().name;
    }
}
