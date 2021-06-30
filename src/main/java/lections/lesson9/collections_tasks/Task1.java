package lections.lesson9.collections_tasks;

// Есть структура Map<Integer, String>.
// Удалить все записи, в которых длина строки меньше 4.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        Map<Integer, String> dictionary = new HashMap<>();
        dictionary.put(1, "единица");
        dictionary.put(2, "два");
        dictionary.put(3, "три");
        dictionary.put(4, "четыре");
        dictionary.put(5, "пять");

        // Set<Map.Entry<Integer, String>> entrySet = dictionary.entrySet();
        // Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        // while (iterator.hasNext()) {
        //     Map.Entry<Integer, String> entry = iterator.next();
        //     if (entry.getValue().length() < 4) {
        //         iterator.remove();
        //     }
        // }

        Set<Integer> keySet = dictionary.keySet();
        Set<Integer> keySetClone = new HashSet<>(keySet);
        for (Integer current : keySetClone) {
            String value = dictionary.get(current);
            if (value.length() < 4) {
                dictionary.remove(current);
            }
        }

        System.out.println(dictionary);
    }
}
