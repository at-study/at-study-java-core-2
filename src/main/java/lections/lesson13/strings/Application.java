package lections.lesson13.strings;

public class Application {

    public static void main(String[] args) {
        StringConsumer printer = s1 -> System.out.println(s1);
        StringConsumer printer1 = System.out::println;

        StringConsumer lengthPrinter = s -> System.out.println(s.length());

        lengthPrinter.consume("abc");
        lengthPrinter.consume("abcdef");
    }

}
