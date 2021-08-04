package lections.lesson13.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetApplication {

    public static void main(String[] args) {
        Set<Integer> randomNumbers = new TreeSet<>((n1, n2) -> n2 - n1);
        for (int i = 0; i < 100; i++) {
            randomNumbers.add(new Random().nextInt(500));
        }

        randomNumbers.removeIf(n -> n < 200);

        System.out.println(randomNumbers);
    }

}
