package lections.lesson4.humans;

import java.util.Random;

public class Cat {

    private String name;
    private int age;

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public static Cat getRandomCat() {
        Cat cat = new Cat();
        cat.name = "Случайный кот";
        cat.age = new Random().nextInt(15);
        return cat;
    }
}
