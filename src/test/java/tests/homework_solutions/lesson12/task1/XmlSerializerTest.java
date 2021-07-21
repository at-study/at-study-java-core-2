package tests.homework_solutions.lesson12.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import homework_solution.lesson12.task1.helpers.XmlHelper;
import homework_solution.lesson12.task1.model.House;

public class XmlSerializerTest {
    private XmlHelper helper = new XmlHelper();
    private final String EXPECTED_RESULT_FILE_PATH = "src/main/java/homework_task/lesson12/task1/expected_xml.txt";

    @Test
    @DisplayName("Проверка сериализации объекта")
    void serializationTest() throws IOException {
        House house = new House().generate();

        String actualHouseXml = helper.serialize(house);
        String expectedHouseXml = Files.readAllLines(Paths.get(EXPECTED_RESULT_FILE_PATH)).get(0);

        Assertions.assertEquals(expectedHouseXml, actualHouseXml);
    }

}
