package lections.lesson12.inheritance;

public class Cat extends Animal {

    private String name = "Мурзик";

    public Cat() {
        super();
    }

    public Cat(String name, Integer age, Integer weight) {
        super(age, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
