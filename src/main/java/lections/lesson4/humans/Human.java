package lections.lesson4.humans;

import java.util.Objects;

public class Human {

    private String name;
    private int age;

    public Human() {
    }

    public void setName(String name) {
        Objects.requireNonNull(name, "Имя не может быть null");
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст некорректный: " + age);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
