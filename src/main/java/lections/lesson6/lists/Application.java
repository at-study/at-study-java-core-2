package lections.lesson6.lists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import lections.lesson6.enums.DayOfWeek;

public class Application {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        // Добавление элементов:
        list.add("А");
        list.add("Б");
        list.add("В");
        list.add(2, "Г");
        list.add(2, "Г");
        System.out.println(list);
        list.set(1, "Д");
        System.out.println(list);
        list.remove("Г");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        boolean isEmpty = list.isEmpty();
        int size = list.size();
        int index = list.indexOf("В");
        boolean contains = list.contains("Г");

        String element = list.get(1);

        for (String current : list) {
            System.out.println(current);
        }

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<DayOfWeek> days = Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.FRIDAY, DayOfWeek.MONDAY);

    }

}
