package lections.lesson9.to_string;

public class Cat implements Cloneable {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Имя кота: " + name + ", возраст: " + age + ", вес: " + weight;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
