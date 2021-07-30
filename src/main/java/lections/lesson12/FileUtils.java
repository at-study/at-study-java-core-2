package lections.lesson12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {

    public static String getFileContent(String path) {
        try {
            List<String> content = Files.readAllLines(Paths.get(path));
            return String.join(System.lineSeparator(), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
