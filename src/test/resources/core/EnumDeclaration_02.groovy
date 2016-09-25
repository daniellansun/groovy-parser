enum E {
    A() {}, B(1) {{}},
    C(1, 2) {
        public void prt() {
            println "$x, $y"
        }
    }

    protected int x;
    protected int y;

    E() {}
    E(int x) {
        this.x = x;
    }
    E(int x, y) {
        this(x)
        this.y = y;
    }
}

enum F {
    @Test2
    A
}

enum G implements I<T> {

}