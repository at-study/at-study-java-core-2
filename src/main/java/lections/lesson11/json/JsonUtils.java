package lections.lesson11.json;

import static lections.lesson11.json.GsonHelper.getGson;

public class JsonUtils {

    public static String toJson(Object person) {
        return getGson().toJson(person);
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        return getGson().fromJson(json, clazz);
    }

}
