package lections.lesson13.flyable;

public class AnonApplication {

    public static void main(String[] args) {
        Bird bird = new Bird();
        airplaneFly();
        bird.flyUp();
        bird.flyDown();
    }

    private static void airplaneFly() {
        Flyable airplane = new Flyable() {
            @Override
            public void flyUp() {
                System.out.println("Самолет взлетает");
            }

            @Override
            public void flyDown() {
                System.out.println("Самолет садится");
            }
        };
        Bird chicken = new Bird() {
            @Override
            public void flyUp() {
                throw new IllegalStateException("Курица летать не умеет");
            }

            @Override
            public void flyDown() {
                throw new IllegalStateException("Курица летать не умеет");
            }
        };

        Bird bird1 = new Bird();
        Bird bird2 = new Bird() {
        };
        Bird bird3 = new Bird() {
        };
        airplane.flyUp();
        airplane.flyDown();
    }
}
