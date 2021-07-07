package lections.lesson10.sample_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MethodCountApplication {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/main/java/lections/lesson10/Sample.java");
        List<String> content = Files.readAllLines(filePath);
        int counter = 0;
        final String PATTERN = "^.* .*\\(.*\\) \\{$";
        for (String line : content) {
            if (line.matches(PATTERN)) {
                counter++;
            }
        }
        System.out.println("Количество методов в Sample.java: " + counter);
    }
    
}
