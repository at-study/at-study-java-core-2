package lections.lesson7.inheritance.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Барсик", 3));
        animals.add(new Dog("Бобик", 4));

        Animal animal = animals.get(0);
        Cat cat = (Cat) animal;
        cat.meow();

        animals.clear();
        for (int i = 0; i < 10; i++) {
            animals.add(getRandomAnimal());
        }

    }

    public static Animal getRandomAnimal() {
        return new Random().nextBoolean()
                ? new Dog("Случайная собака", 1)
                : new Cat("Случайная кошка", 2);
    }
}
