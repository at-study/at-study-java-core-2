package lections.lesson10faq;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileApplication {
    public static void main(String[] args) {
        File generatedFile = new File("src/main/java/lections/lesson10faq/output.txt");
        try (FileOutputStream writer = new FileOutputStream(generatedFile)) {
            byte[] buffer = new byte[100];
            new Random().nextBytes(buffer);
            writer.write(buffer);
            writer.flush();
            System.out.printf("%s: %d%n", generatedFile.getName(), generatedFile.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
