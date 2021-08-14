package lections.lesson14.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import homework_solution.lesson10.task4.helpers.StringGenerator;
import lections.lesson14.functional_interfaces.Passport;

public class Application {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Семь", "Пятниц", "На", "Неделе");
        Map<String, Integer> map = strings.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> s.length()
                ));

        Supplier<String> randomPassportSeriesGenerator = () -> StringGenerator.generate(4, "0123456789");
        Supplier<String> randomPassportNumberGenerator = () -> StringGenerator.generate(6, "0123456789");
        Supplier<Passport> passportSupplier = () -> new Passport() {{
            setSeries(randomPassportSeriesGenerator.get());
            setNumber(randomPassportNumberGenerator.get());
        }};

        boolean result = IntStream.range(0, 3000)
                .mapToObj(i -> passportSupplier.get())
                .sorted()
                .peek(System.out::println)
                .anyMatch(p -> p.getSeries().equals("9988"));
        System.out.println(result);


        // Отсортировать по серии и номеру
        // Вывести каждый на экран
        // Вернуть результат, есть ли в списке паспорт с серией "5555"
    }

}
