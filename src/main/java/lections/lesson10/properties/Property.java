package lections.lesson10.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

    private static Properties properties = new Properties();
    private static boolean isLoaded = false;

    private static void loadProperties() {
        try {
            String propertyFileName = System.getProperty("properties", "application.properties");
            properties.load(new FileInputStream("src/main/resources/" + propertyFileName));
            isLoaded = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getStringProperty(String key) {
        if (!isLoaded) {
            loadProperties();
        }
        return System.getProperty(key, properties.getProperty(key));
    }

    public static Integer getIntegerProperty(String key) {
        return Integer.parseInt(getStringProperty(key));
    }

    public static Boolean getBooleanProperty(String key) {
        return Boolean.parseBoolean(getStringProperty(key));
    }

}
