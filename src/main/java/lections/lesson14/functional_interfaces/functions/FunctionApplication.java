package lections.lesson14.functional_interfaces.functions;

import java.util.function.Function;

import lections.lesson14.functional_interfaces.Passport;

public class FunctionApplication {

    public static void main(String[] args) {
        Function<String, Integer> stringToLengthConverter = (str) -> str.length();

        Function<Object, String> toStringConverter = o -> {
            System.out.println(o);
            return o.toString();
        };

        System.out.println(toStringConverter.apply(new Passport()));

        Function<String, Integer> intParser = str -> {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                return 0;
            }
        };

        System.out.println(intParser.apply("352"));
        System.out.println(intParser.apply("352a"));

    }

    //   "563" -> 563
    //   "asf" -> 0
}
