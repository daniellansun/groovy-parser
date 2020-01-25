interface Koo {
    class Inner {}
}

interface Koo2 {
    public static final Inner INNER = new Inner() {}
}

interface Koo3 {
    List<String> gttr()
}
