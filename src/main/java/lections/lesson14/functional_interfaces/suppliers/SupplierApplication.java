package lections.lesson14.functional_interfaces.suppliers;

import java.util.Random;
import java.util.function.Supplier;

import homework_solution.lesson10.task4.helpers.StringGenerator;
import lections.lesson14.functional_interfaces.Passport;


public class SupplierApplication {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Hello, World";
        String result = stringSupplier.get();
        System.out.println(result);

        Supplier<Integer> randomIntegerSupplier = () -> new Random().nextInt(100);
        Supplier<String> randomPassportSeriesGenerator = () -> StringGenerator.generate(4, "0123456789");
        Supplier<String> randomPassportNumberGenerator = () -> StringGenerator.generate(6, "0123456789");

        Supplier<Passport> passportSupplier = () -> new Passport() {{
            setSeries(randomPassportSeriesGenerator.get());
            setNumber(randomPassportNumberGenerator.get());
        }};

        Passport passport = passportSupplier.get();
        System.out.println(passport);

        Passport passport2 = passportSupplier.get();
        System.out.println(passport2);

    }

}
