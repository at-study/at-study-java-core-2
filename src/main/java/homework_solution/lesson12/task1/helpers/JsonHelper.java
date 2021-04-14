package homework_solution.lesson12.task1.helpers;

import com.google.gson.Gson;

import homework_solution.lesson12.task1.model.Generatable;

public class JsonHelper implements SerializeHelper {

    @Override
    public Generatable deserialize(String json, Class clazz) {
        return (Generatable) new Gson().fromJson(json, clazz);
    }

    @Override
    public String serialize(Generatable object) {
        return new Gson().toJson(object);
    }
}
