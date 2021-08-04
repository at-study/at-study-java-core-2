package lections.lesson13.processor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;

public class ProcessorApplication {

    public static void main(String[] args) {
        // "abcdef", 6 -> true
        Processor<String, Integer, Boolean> stringLengthValidator = (s, len) -> s.length() == len;

        Processor<String, String, String> stringConcatenator = (s1, s2) -> s1 + s2;

        // List<T>, List<T> -> Map<T, T>

        Processor<List<String>, List<String>, Map<String, String>> listsToMapConverter =
                (list1, list2) -> {
                    Map<String, String> result = new HashMap<>();
                    for (int i = 0; i < list1.size(); i++) {
                        result.put(list1.get(i), list2.get(i));
                    }
                    return result;
                };

        Processor<String, Integer, Cat> catGenerator = Cat::new;

        Processor<Object, Object, Object> asserter = (o1, o2) -> {
            Assertions.assertEquals(o1, o2);
            return null;
        };

    }

}
