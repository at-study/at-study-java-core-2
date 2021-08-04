package lections.lesson13.sorter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.time.format.DateTimeFormatter.ofPattern;

public class Application {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "22.08.1991",
                "21.08.1991",
                "22.08.1992",
                "18.04.1980",
                "16.07.2002",
                "14.11.1999",
                "17.01.2003"
        );

        Comparator<String> reverseOrderComparator = Comparator.reverseOrder();
        Comparator<String> dateOrderComparator = (s1, s2) -> {
            LocalDate d1 = LocalDate.parse(s1, ofPattern("dd.MM.yyyy"));
            LocalDate d2 = LocalDate.parse(s2, ofPattern("dd.MM.yyyy"));
            return d1.compareTo(d2);
        };

        strings.sort(dateOrderComparator);

        System.out.println(strings);
    }
}
