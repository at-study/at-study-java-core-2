package homework_solution.lesson10.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileHelper {

    public static Map<String, String> readFile(File file) throws IOException {
        List<String> input = Files.readAllLines(Paths.get(file.getAbsolutePath()));
        Map<String, String> content = new HashMap<>();
        for (String line : input) {
            String key = line.split("=")[0];
            if (line.contains("=") && line.split("=").length == 1) {
                content.put(key, "[]");
                continue;
            }
            String value = parse(line.split("=")[1]);
            content.put(key, value);
        }
        return content;
    }

    /**
     * Вспомогательный метод, для определения формата строки
     *
     * @param value - передаваемая строка
     * @return
     */

    private static String parse(String value) {
        String defaultValue = "\"" + value + "\""; // defaultValue - тип String, если не попадет под другие критерии, возвращаем его
        // Проверка на null
        if (value.equals("null")) return null;
        // Проверка на пустую строку (возвращаем пустой массив)
        if (value.equals("")) return "[]";
        // Если содержит точку, возможно это число с плавающей точкой
        if (value.contains(".")) {
            try {
                return String.valueOf(Double.parseDouble(value));
            } catch (NumberFormatException notFloatException) {
                return defaultValue;
            }
        }
        // Может, это целое число?
        try {
            return String.valueOf(Long.parseLong(value));
        } catch (NumberFormatException ignore) {
        }
        // Может, это boolean?
        return value.equals("true") || value.equals("false")
                ? value
                : defaultValue;
    }

    public static void saveFile(File file, Map<String, String> content) {
        StringBuilder sb = new StringBuilder("{");
        sb.append(System.lineSeparator());
        for (Map.Entry<String, String> entry : content.entrySet()) {
            sb.append(String.format("  \"%s\": %s,%n", entry.getKey(), entry.getValue()));
        }
        int lastComma = sb.lastIndexOf(",");
        sb.replace(lastComma, lastComma + 1, "");
        sb.append("}");
        String output = sb.toString();
        System.out.println(output);
        try (FileWriter writer = new FileWriter(file)){
            writer.write(output);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
