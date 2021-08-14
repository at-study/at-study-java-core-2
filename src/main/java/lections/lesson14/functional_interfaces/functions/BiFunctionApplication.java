package lections.lesson14.functional_interfaces.functions;

import java.util.function.BiFunction;

import lections.lesson14.functional_interfaces.Passport;

public class BiFunctionApplication {

    public static void main(String[] args) {
        BiFunction<String, String, Passport> passportGenerator =
                (series, number) -> new Passport() {{
                    setSeries(series);
                    setNumber(number);
                }};

        System.out.println(passportGenerator.apply("12 34", "567890"));

        BiFunction<Integer, Float, Boolean> comparator = (a, b) -> a > b;

        BiFunction<Object, Object, Boolean> equalizer = Object::equals;

        Passport passport1 = new Passport() {{
                setNumber("1234");
                setNumber("567890");
            }};
        Passport passport2 = new Passport() {{
                setNumber("1234");
                setNumber("567890");
            }};



        System.out.println(equalizer.apply(passport1, passport2));
    }

}
