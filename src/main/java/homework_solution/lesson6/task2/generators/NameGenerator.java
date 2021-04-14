package homework_solution.lesson6.task2.generators;

import java.util.Random;

public class NameGenerator {
    private static final int CAPITAL_MIN = 'А';
    private static final int CAPITAL_MAX = 'Я';
    private static final int LETTER_MIN = 'а';
    private static final int LETTER_MAX = 'я';

    public static String generate() {
        StringBuilder sb = new StringBuilder().append(randomChar(CAPITAL_MIN, CAPITAL_MAX));
        int length = new Random().nextInt(8) + 4; // От 5 до 12 символов. Первый символ создается в new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(randomChar(LETTER_MIN, LETTER_MAX));
        }
        return sb.toString();
    }

    private static char randomChar(int min, int max) {
        return (char) (new Random().nextInt(max - min) + min);
    }

}
