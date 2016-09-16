import java.sql.SQLException

class AAA {
    public AAA() {

    }

    public AAA(String name) {

    }

    @Test2
    public AAA(String name, int age) throws Exception {

    }

    AAA(String name, int age, String title) throws Exception {

    }

    private AAA(String name, int age, String title, double income) throws Exception {

    }

    @Test2
    public String sayHello(String name) {
        return "Hello, $name";
    }

    @Test2
    public <T> T sayHello2(T name) throws IOException, SQLException {
        return "Hello, $name";
    }
}
