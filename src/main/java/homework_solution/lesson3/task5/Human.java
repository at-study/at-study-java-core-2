package homework_solution.lesson3.task5;

import java.util.Random;

public class Human {
    String name;
    Cat[] cats;
    Dog[] dogs;

    public Human() {
        name = Names.getRandomHumanName();
        cats = new Cat[new Random().nextInt(4)];
        dogs = new Dog[new Random().nextInt(4)];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }
    }
}
