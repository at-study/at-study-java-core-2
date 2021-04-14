package homework_solution.lesson14.helpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import homework_solution.lesson14.model.Person;

public class JsonHelper {

    public static List<Person> getPersonsFromFile(String path) {
        try {
            String json = String.join("", Files.readAllLines(Paths.get(path)));
            return new Gson().fromJson(json, new TypeToken<List<Person>>(){}.getType());
        } catch (IOException exc) {
            return null;
        }
    }

}
