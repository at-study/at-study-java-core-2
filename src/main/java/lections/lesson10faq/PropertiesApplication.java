package lections.lesson10faq;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApplication {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/resources/application.properties"));
        properties.list(System.out);
        properties.stringPropertyNames();
    }

}
