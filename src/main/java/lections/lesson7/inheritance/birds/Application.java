package lections.lesson7.inheritance.birds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Bird chicken = new Chicken();
        chicken.fly();
        chicken.walk();
        chicken.voice();

        List<String> strings = new ArrayList<>();

        strings = new LinkedList<>();
    }

}
