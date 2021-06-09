package lections.lesson6.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lections.lesson6.enums.DayOfWeek;

public class Application {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(15, "Пятнадцать");
        map.put(2, "Два");

        String value = map.get(2);

        boolean containsKey = map.containsKey(2);
        boolean containsValue = map.containsValue("Два");

        // Множество ключей мапы
        Set<Integer> keys = map.keySet();

        // Коллекция значений мапы
        Collection<String> values = map.values();

        // Множество всех пар <ключ, значение из мапы>
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(map.entrySet());
        System.out.println(map);

        map.put(1, "Единица");
        String previous = map.put(1, "Один");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Если ключа в мапе нет, то get по нему вернет null
        String nullString = map.get(13);

        Map<DayOfWeek, String> days = new HashMap<>();
        days.put(DayOfWeek.MONDAY, "Понедельник");
        days.put(DayOfWeek.TUESDAY, "Вторник");
        days.put(DayOfWeek.WEDNESDAY, "Среда");
        days.put(DayOfWeek.THURSDAY, "Четверг");
        String str = days.get(DayOfWeek.WEDNESDAY); // "Среда"
        System.out.println(str);
    }

}
