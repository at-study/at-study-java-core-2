package lections.lesson16.humans;

import java.util.Random;

public class Human {

    private String firstName;
    private int age;

    private Human() {
        this.firstName = "Иван";
        this.age = new Random().nextInt(25);
    }

    public Human(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    private String getFirstName() {
        return firstName;
    }

    private void greet() {
        System.out.println("Привет, меня зовут " + firstName + ", мне " + age + " лет");
    }

    private void greet(String param1, int param2) {
        System.out.println(param1 + param2);
    }

}
