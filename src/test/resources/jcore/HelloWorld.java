import java.util.Arrays;

public class HelloWorld {
    public static String hello() {
        String[] msgs = { "Hello, ", "world!" };
        String result = String.join(" ", msgs);

        return result;
    }
}