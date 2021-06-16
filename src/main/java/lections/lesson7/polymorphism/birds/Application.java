package lections.lesson7.polymorphism.birds;

public class Application {

    public static void main(String[] args) {
        Bird chicken = new Chicken();
        chicken.fly();
        chicken.walk();
        chicken.voice();

    }

}
