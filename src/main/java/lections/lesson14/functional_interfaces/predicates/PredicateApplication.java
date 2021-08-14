package lections.lesson14.functional_interfaces.predicates;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import lections.lesson14.functional_interfaces.Passport;

public class PredicateApplication {

    public static void main(String[] args) {
        Predicate<Integer> isPositive = n -> n > 0;
        isPositive.test(25);

        Predicate<Boolean> predicate = b -> b == null ? false : b;

        Predicate<String> upperCaseValidator =
                str -> str.toUpperCase().equals(str);

        Predicate<Passport> passportChecker =
                pass -> pass.getSeries() != null && pass.getNumber() != null;

        Passport p1 = new Passport();
        Passport p2 = new Passport();
        Passport p3 = new Passport();
        Passport p4 = new Passport();

        p2.setSeries("1234");
        p3.setNumber("567890");
        p4.setSeries("1234");
        p4.setNumber("567890");

        System.out.println(passportChecker.test(p1));
        System.out.println(passportChecker.test(p2));
        System.out.println(passportChecker.test(p3));
        System.out.println(passportChecker.test(p4));

        BiPredicate<String, Integer> lengthChecker = (str, len) -> str.length() == len;
        BiPredicate<List<String>, String> twiceContainsChecker =
                (list, str) -> {
                    int count = 0;
                    for (String current : list) {
                        if (current.equals(str)) {
                            count++;
                        }
                    }
                    return count == 2;
                };


    }

    // ["a", "b", "c", "a"]
    // "ABCD" -> true,
    // "abCD" -> false
}
