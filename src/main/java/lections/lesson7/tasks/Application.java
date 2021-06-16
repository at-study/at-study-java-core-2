package lections.lesson7.tasks;

import java.util.List;

import lections.lesson7.inheritance.animals.Animal;

import static lections.lesson7.inheritance.animals.Application.getRandomAnimal;

public class Application {

    public static void main(String[] args) {
        Object a = new Point(2, 3);
        Object b = new Point(2, 3);
        Object c = new Point(4, 4);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));

        List<Animal> animals = new AnimalList<>();
        for (int i = 0; i < 5; i++) {
            animals.add(getRandomAnimal());
        }
        System.out.println("=========");
        for (int i = 0; i < 5; i++) {
            animals.get(i);
        }

    }

}
