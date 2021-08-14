package lections.lesson14.functional_interfaces.consumers;

import java.util.function.Consumer;

public class ConsumerApplication {

    public static void main(String[] args) {
        Consumer<String> printer = System.out::println;

        printer.accept("123");
        printer.accept("qwerty");

        Consumer<String> lengthPrinter = (str) -> System.out.println(str.length());
        lengthPrinter.accept("Строка");

        Consumer<Integer> isPositivePrinter = (value) -> System.out.println(value > 0);
        isPositivePrinter.accept(150);
        isPositivePrinter.accept(0);
        isPositivePrinter.accept(-150);

    }

}
