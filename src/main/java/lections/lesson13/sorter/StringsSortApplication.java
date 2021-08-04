package lections.lesson13.sorter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringsSortApplication {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Иван", "Петр", "Алексей", "василий", "артем");

        names.sort(
                Comparator.comparing(String::toLowerCase)
        );

        System.out.println(names);
    }

}
