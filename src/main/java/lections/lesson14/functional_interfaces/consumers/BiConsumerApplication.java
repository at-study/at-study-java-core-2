package lections.lesson14.functional_interfaces.consumers;

import java.util.function.BiConsumer;

import lections.lesson14.functional_interfaces.Passport;

public class BiConsumerApplication {

    public static void main(String[] args) {
        BiConsumer<Integer, String> isLengthEqual = (len, str) -> System.out.println(str.length() == len);
        isLengthEqual.accept(5, "Пять");
        isLengthEqual.accept(4, "Пять");
        isLengthEqual.accept(7, "Пять");

        BiConsumer<Passport, String> setPassportSeries = Passport::setSeries;
        BiConsumer<Passport, String> setPassportNumber = Passport::setNumber;

        Passport passport = new Passport();
        setPassportSeries.accept(passport, "12 34");
        setPassportNumber.accept(passport, "567890");
        System.out.println(passport);

    }
}
