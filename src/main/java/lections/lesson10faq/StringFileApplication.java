package lections.lesson10faq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StringFileApplication {

    public static void main(String[] args) throws IOException {
        List<String> content = Files.readAllLines(Paths.get("src/main/java/lections/lesson10faq/output.txt"));
        String result = String.join("#", content);

        File file = new File("src/main/java/lections/lesson10faq/output.txt");
        BufferedReader fileReader = new BufferedReader(new FileReader(file));


        StringBuilder sb = new StringBuilder();
        String delimiter = "##";
        while (fileReader.ready()) {
            sb.append(fileReader.readLine()).append(delimiter);
        }
        sb.delete(sb.length() - delimiter.length(), sb.length());
    }
}
