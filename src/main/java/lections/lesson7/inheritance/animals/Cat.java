package lections.lesson7.inheritance.animals;

public class Cat extends Animal {

    public void meow() {
        System.out.println("meow");
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        meow();
    }
}
