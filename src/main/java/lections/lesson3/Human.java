package lections.lesson3;

import java.util.Random;

public class Human {

    int age = new Random().nextInt(90);
    String name = "АвтоИмя";


    void eat() {

    }

    void voice() {

    }

    Human() {

    }

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void finalize() {
        // Когда сборщик мусора уничтожит этот объект, есть вероятность, что этот метод будет вызван
    }

}
