package lections.lesson8.animals;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            animals.add(AnimalFactory.getRandomAnimal());
        }

        Animal animal = animals.get(0);
        System.out.println(
                animal instanceof Lion
                        ? "Первое животное в списке - Лев"
                        : "Первое животное в списке - Не лев"
        );

        int lionCount = 0;
        for (Animal current : animals) {
            if (current instanceof Lion) {
                lionCount++;
            }
        }
        System.out.println("В списке львов: " + lionCount);

        List<HomeAnimal> homeAnimals = new ArrayList<>();
        for (Animal current : animals) {
            if (current instanceof HomeAnimal) {
                homeAnimals.add((HomeAnimal) current);
            }
        }
        System.out.println("В списке домашних животных: " + homeAnimals);

    }

}
