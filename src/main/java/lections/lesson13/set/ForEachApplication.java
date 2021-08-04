package lections.lesson13.set;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ForEachApplication {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Семь", "пятниц", "на", "неделе");

        strings.forEach(System.out::println);

        for (String s : strings) {
            System.out.println(s);
        }

        Map<Integer, String> ordinals = new TreeMap<Integer, String>() {{
            put(1, "Первый");
            put(2, "Второй");
            put(3, "Третий");
            put(4, "Четвертый");
            put(5, "Пятый");
        }};

        //    1 : Первый

        ordinals.forEach(
                (k, v) -> System.out.printf("%d : %s%n", k, v)
        );

        for (Map.Entry<Integer,String> entry : ordinals.entrySet()) {
            System.out.printf("%d : %s%n", entry.getKey(), entry.getValue());
        }


    }

}
