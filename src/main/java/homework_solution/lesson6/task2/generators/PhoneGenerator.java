package homework_solution.lesson6.task2.generators;

import java.util.Random;

public class PhoneGenerator {

    public static String generate() {
        return String.format("+7(%s)%s-%s-%s", randomDigitString(3), randomDigitString(3), randomDigitString(2), randomDigitString(2));
    }

    private static String randomDigitString(int length) {
        String pattern = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }

}
