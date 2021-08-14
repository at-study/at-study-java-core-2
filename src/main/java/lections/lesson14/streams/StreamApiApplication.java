package lections.lesson14.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamApiApplication {

    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(1, 2, 5, 3, 4, 7, 1, 2, 7, 4, 6, 7, 4);
        Integer sum = list.stream()
                .distinct()
                .limit(5)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(sum);

        Map<String, String> map = new HashMap<String, String>() {{
            put("4", "четыре");
            put("3", "три");
            put("8", "восемь");
        }};
        map.entrySet().stream();

        String[] strings = {"один", "два", "три"};
        Stream.of(strings);
        Stream.of("Семь", "пятниц", "на", "неделе").forEach(System.out::println);

        Files.lines(Paths.get("src/main/resources/application.properties"))
                .forEach(System.out::println);

        Stream.empty();

        "Hello, world".chars().forEach(System.out::println);
    }

    // distinct
    // посчитать сумму 5 первых элементов
}
