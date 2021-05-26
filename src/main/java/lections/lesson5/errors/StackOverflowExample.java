package lections.lesson5.errors;

public class StackOverflowExample {

    public static void main(String[] args) {
        a();
    }


    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        a();
    }

}
