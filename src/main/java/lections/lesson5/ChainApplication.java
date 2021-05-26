package lections.lesson5;

import java.io.FileNotFoundException;

public class ChainApplication {

    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
        c();
        try {
            d();
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
    }

    private static void b() {
    }

    private static void c() {
    }

    private static void d() throws FileNotFoundException {
        e();
    }

    private static void e() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

}
