package lections.lesson8.animals;

public class Dog extends HomeAnimal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }

}
