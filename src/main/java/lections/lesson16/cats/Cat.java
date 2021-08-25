package lections.lesson16.cats;

public class Cat {
    private String name;
    private int age;
    private int weight;

    protected Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private int getWeight() {
        return weight;
    }


}
