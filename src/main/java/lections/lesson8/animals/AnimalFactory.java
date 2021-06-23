package lections.lesson8.animals;

import java.util.Random;

public class AnimalFactory {

    public static Animal getRandomAnimal() {
        int seed = new Random().nextInt(3);
        switch (seed) {
            case 0:
                return new Cat("Мурзик", 2);
            case 1:
                return new Dog("Шарик", 4);
            case 2:
                return new Lion(5);
            default:
                throw new IllegalStateException("Cannot be here");
        }
    }

}
