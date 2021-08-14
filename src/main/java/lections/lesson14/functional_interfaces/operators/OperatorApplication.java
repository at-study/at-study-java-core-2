package lections.lesson14.functional_interfaces.operators;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorApplication {

    public static void main(String[] args) {
        UnaryOperator<Integer> multiplierOn2 = i -> i * 2;
        UnaryOperator<Integer> powerOn2 = i -> i * i;

        UnaryOperator<String> reverser =
                str -> new StringBuilder(str).reverse().toString();

        System.out.println(reverser.apply("Hello, world"));

        UnaryOperator<Boolean> inverter = b -> b != null ? !b : null;

        System.out.println(inverter.apply(true));
        System.out.println(inverter.apply(false));
        System.out.println(inverter.apply(null));

        BinaryOperator<Integer> max = Math::max;
        BinaryOperator<Integer> pow = (a, b) -> (int) Math.pow(a, b);

    }
}
