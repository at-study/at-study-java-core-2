package homework_solution.lesson6.task2.generators;

import java.util.Random;

public class AgeGenerator {

    public static int generate() {
        return 20 + new Random().nextInt(55);
    }

}
