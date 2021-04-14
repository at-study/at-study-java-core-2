package homework_solution.lesson3.task5;

import java.util.Random;

public class Dog {
    String name;
    int age;

    public Dog() {
        name = Names.getRandomDogName();
        age = new Random().nextInt(15);
    }
}
