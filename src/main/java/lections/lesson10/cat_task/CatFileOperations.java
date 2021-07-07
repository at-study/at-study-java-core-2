package lections.lesson10.cat_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import lections.lesson9.tasks.xml_task.Cat;

public class CatFileOperations {

    public static void saveCat(Cat cat) {
        try {
            byte[] content = cat.toXml().getBytes();
            Files.write(Paths.get("src/main/java/lections/lesson10/cat.txt"), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Cat readCat() {
        try {
            List<String> content = Files.readAllLines(Paths.get("src/main/java/lections/lesson10/cat.txt"));
            String xml = String.join("", content);
            return new Cat(xml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
