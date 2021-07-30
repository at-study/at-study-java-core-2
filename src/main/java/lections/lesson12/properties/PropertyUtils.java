package lections.lesson12.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lections.lesson11.json.JsonUtils;

public class PropertyUtils {
    /**
     * maps properties file content to json object
     *
     * @param path - path to properties file
     * @return json object presented in string.
     */
    public static String getJsonObjectFromPropertiesFile(String path) {
        Map<String, String> properties = getPropertiesAsMap(path);
        return JsonUtils.serialize(properties);
    }

    private static Map<String, String> getPropertiesAsMap(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(fis);
            Set<String> keys = properties.stringPropertyNames();
            Map<String, String> result = new LinkedHashMap<>();
            for (String key : keys) {
                String value = properties.getProperty(key);
                result.put(key, value);
            }
            return result;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

}
