package lections.lesson13.swimmable;

public class Application {

    public static void main(String[] args) {
        Swimmable fish = new Swimmable() {
            @Override
            public void swim() {
                System.out.println("Рыба плывет");
            }
        };
        fish.swim();

        Swimmable sportsman = new Swimmable() {
            @Override
            public void swim() {
                System.out.println("Спортсмен плывет");
            }
        };

        sportsman.swimTwice();
    }

}
