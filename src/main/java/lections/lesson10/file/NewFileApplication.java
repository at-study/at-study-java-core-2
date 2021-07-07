package lections.lesson10.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NewFileApplication {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/lections/lesson10/sample.txt");
        //byte[] content = Files.readAllBytes(path);
        List<String> content = Files.readAllLines(path);
        String fileContent = String.join("\r\n", content);
        System.out.println(fileContent);
    }

}
