package lections.lesson7.polymorphism.birds;

public class Chicken extends Bird {

    public void giveEgg() {
        System.out.println("Курица снесла яйцо");
    }

    @Override
    public void fly() {
        throw new IllegalStateException("Курицы летать не умеют");
    }

}
