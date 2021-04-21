package lections.lesson1;

public class Human {

    public String lastName;
    public String firstName;
    public String patronymic;
    public int age;
    public double weight;

    void sayMyName() {
        System.out.println(firstName);
    }

    void sayMyAge() {
        System.out.println(age);
    }

    void becomeOlder() {
        age++;
    }

    void becomeLighter() {
        weight = weight - 10;
        weight -= 10;
    }

    public static void main(String[] args) {
        Human newHuman = new Human();
        newHuman.firstName = "Иван";
        newHuman.sayMyName();
        newHuman.sayMyAge();
    }

}
