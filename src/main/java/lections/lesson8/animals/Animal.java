package lections.lesson8.animals;

// отношение IS A
// Home Animal IS Animal
public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void voice();

}
