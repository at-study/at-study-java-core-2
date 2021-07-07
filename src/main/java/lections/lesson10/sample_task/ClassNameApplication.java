package lections.lesson10.sample_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ClassNameApplication {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/main/java/lections/lesson10/Sample.java");
        List<String> content = Files.readAllLines(filePath);

        String classSignature = getClassSignatureFromClass(content);
        String className = extractClassName(classSignature);

        System.out.println(className);
    }

    private static String getClassSignatureFromClass(List<String> content) {
        for (String line : content) {
            if (line.matches("^.*class .* \\{")) {
                return line;
            }
        }
        throw new IllegalStateException("No class signature in file");
    }

    private static String extractClassName(String line) {
        String[] split = line.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("class")) {
                return split[i + 1];
            }
        }
        throw new IllegalStateException("No class matching in line");
    }

}
