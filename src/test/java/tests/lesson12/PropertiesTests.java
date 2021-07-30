package tests.lesson12;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lections.lesson12.properties.PropertyUtils;

public class PropertiesTests {

    @Test
    public void fileNotFoundTest() {
        try {
            PropertyUtils.getJsonObjectFromPropertiesFile("C:\\asfgasfasf.properties");
            Assertions.fail();
        } catch (RuntimeException e) {
            Assertions.assertEquals("java.io.FileNotFoundException: C:\\asfgasfasf.properties (Не удается найти указанный файл)", e.getMessage());
            Assertions.assertEquals(IllegalStateException.class, e.getClass());
            Assertions.assertEquals(FileNotFoundException.class, e.getCause().getClass());
        }
    }

    @Test
    public void propertiesToJsonObjectTest() {
        final String path = "src/main/resources/application.properties";

        String json = PropertyUtils.getJsonObjectFromPropertiesFile(path);
    }

}
