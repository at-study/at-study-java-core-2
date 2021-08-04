package lections.lesson13.flyable;

public class Application {

    public static void main(String[] args) {
        Bird bird = new Bird();
        airplaneFly();
        bird.flyUp();
        bird.flyDown();
    }

    private static void airplaneFly() {
        class Airplane implements Flyable {
            @Override
            public void flyUp() {
                System.out.println("Самолет взлетает");
            }

            @Override
            public void flyDown() {
                System.out.println("Самолет садится");
            }
        }
        Airplane airplane = new Airplane();
        Airplane airplane2 = new Airplane();
        airplane.flyUp();
        airplane.flyDown();
    }
}
