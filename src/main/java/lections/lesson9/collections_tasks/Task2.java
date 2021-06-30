package lections.lesson9.collections_tasks;

// Реализовать класс JsonHashMap, переопределив toString() таким образом, чтобы он возвращал содержимое в виде Json.

import java.util.Map;
import java.util.TreeMap;

import lections.lesson9.tasks.xml_task.Cat;

public class Task2 {

    public static void main(String[] args) {
        Map<String, Object> entity = new JsonHashMap();
        entity.put("key1", null);
        entity.put("key2", 15);
        entity.put("key3", 5.5d);
        entity.put("key4", false);
        entity.put("key5", "stringValue");
        Map<String, Object> internal = new JsonHashMap();
        internal.put("internalKey1", 10);
        internal.put("internalKey2", true);
        internal.put("internalKey3", null);
        internal.put("internalKey4", new JsonHashMap());

        entity.put("key6", internal);
        entity.put("key7", new Cat("Мурзик", 5));
        System.out.println(entity);
    }

    public interface CanBeJson {

        String toJson();

    }

    private static class JsonHashMap extends TreeMap<String, Object> implements CanBeJson {

        @Override
        public String toJson() {
            return toString();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{").append(System.lineSeparator());
            for (Map.Entry<String, Object> entry : entrySet()) {
                sb.append(String.format("\t\"%s\": %s,%n", entry.getKey(), formatValue(entry.getValue())));
            }
            if (sb.lastIndexOf(",") != -1) {
                sb.deleteCharAt(sb.lastIndexOf(","));
            }
            sb.append("}");
            return sb.toString();
        }

        private String formatValue(Object value) {
            if (value == null) {
                return "null";
            }
            if (value instanceof Boolean) {
                return value.toString();
            }
            if (value instanceof Number) {
                return value.toString();
            }
            if (value instanceof String) {
                return "\"" + value + "\"";
            }
            if (value instanceof CanBeJson) {
                return ((CanBeJson) value).toJson();
            }
            throw new IllegalArgumentException("Value can be only null, primitive, string, json-supported");
        }
    }
}
