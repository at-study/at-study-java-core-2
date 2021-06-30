package lections.lesson9.to_string;

public class BirdApplication {

    public static void main(String[] args) {
        Bird bird1 = new Bird(4, true, 4);
        Bird bird2 = new Bird(4, true, 4);

        boolean areEquals = bird1.equals(bird2);

        System.out.println(areEquals);
    }

}
