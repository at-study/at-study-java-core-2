package lections.lesson2;

import lections.lesson1.Human;

public class Conditions {

    public static void main(String[] args) {
        int age = 15;
        Human human = new Human();
        if (age > 0) {
            human.age = age;
        } else if (age < 0) {
            System.out.println("Возраст не может быть отрицательным");
        } else {
            System.out.println("Возраст не может быть равен нулю.");
        }

        System.out.println(human.age);
    }
}
