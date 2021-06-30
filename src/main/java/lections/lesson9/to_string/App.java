package lections.lesson9.to_string;

import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(4);
        integers.add(399);
        integers.add(25);

        System.out.println(integers);

        Set<String> strings = new TreeSet<>();
        strings.add("4");
        strings.add("399");
        strings.add("25");

        System.out.println(strings);
    }

}
