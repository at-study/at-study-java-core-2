package lections.lesson8.animals;

public class Cat extends HomeAnimal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}
