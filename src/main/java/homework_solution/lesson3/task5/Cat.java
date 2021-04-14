package homework_solution.lesson3.task5;

import java.util.Random;

public class Cat {
    String name;
    int age;

    public Cat() {
        name = Names.getRandomCatName();
        age = new Random().nextInt(15);
    }
}
