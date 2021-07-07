package lections.lesson10.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileApplication {

    public static void main(String[] args) {
        // Чтение из файла
        File inputFile = new File("src/main/java/lections/lesson10/sample.txt");
        byte[] content;
        // try-with-resources
        try (InputStream is = new FileInputStream(inputFile)) {
            int size = is.available();
            content = new byte[size];
            is.read(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String fileContent = new String(content);
        System.out.println(Arrays.toString(content));
        System.out.println(fileContent);
        String replacedString = fileContent.replace("\r\n", " ");

        // Запись в файл
        File outputFile = new File("src/main/java/lections/lesson10/output.txt");
        try (OutputStream os = new FileOutputStream(outputFile)) {
            byte[] outputContent = replacedString.getBytes(StandardCharsets.US_ASCII);
            System.out.println(Arrays.toString(outputContent));
            os.write(outputContent);
            os.flush(); // Завершение записи потока. Записывает, если в потоке остались недозаписанные байты.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
