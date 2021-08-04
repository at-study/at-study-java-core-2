package lections.lesson13.flyable;

public class Bird implements Flyable {

    @Override
    public void flyUp() {
        System.out.println("Птица взлетает");
    }

    @Override
    public void flyDown() {
        System.out.println("Птица садится");
    }
}
