package homework_solution.lesson9.task2;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            objects.add(Generator.generate());
        }
        for (Object object : objects)
            Action.doAction(object);
    }

}
