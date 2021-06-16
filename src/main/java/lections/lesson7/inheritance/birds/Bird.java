package lections.lesson7.inheritance.birds;

public class Bird {

    public void fly() {
        print("Птица летит");
    }

    public void walk() {
        print("Птица гуляет");
    }

    public void voice() {
        print("Птица поет");
    }

    private void print(String input) {
        System.out.println(input);
    }

}
