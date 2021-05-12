package lections.lesson3;

import java.util.Random;

public class Cat {
    int age;
    int weight;
    final String name;

    final static String description = "Кот";
    static int count = 0;
    final static int FINAL_COUNT;

    static {
        FINAL_COUNT = 5;
        System.out.println("Статический блок кота");
    }

    Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        count++;
    }

    void voice() {
        System.out.println("Мяу: " + age);
    }

    static void printCatCount() {
        System.out.println("Текущее количество котов: " + count);
    }

    static Cat generateYoungCat() {
        Random random = new Random();
        int age = random.nextInt(10);
        int weight = random.nextInt(10);
        return new Cat("Автокот", age, weight);
    }

    static Cat[] generateCats(int amount) {
        Cat[] cats = new Cat[amount];
        for (int i = 0; i < amount; i++) {
            cats[i] = generateYoungCat();
        }
        return cats;
    }

}
