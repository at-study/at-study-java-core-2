package lections.lesson5;

import java.util.Objects;

import lections.lesson5.custom_exceptions.NegativeAgeException;
import lections.lesson5.custom_exceptions.TooHighAgeException;
import lections.lesson5.custom_exceptions.ZeroAgeException;

public class Human {

    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        validateAge(age);
        this.age = age;
    }

    public void setName(String name) {
        Objects.requireNonNull(name, "Имя не может быть null");
        this.name = name;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new NegativeAgeException();
        }
        if (age == 0) {
            throw new ZeroAgeException();
        }
        if (age >= 150) {
            throw new TooHighAgeException();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
