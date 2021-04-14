package homework_solution.lesson5.task3;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        int total = new Random().nextInt(500) + 500;
        int exceptionCount = 0;

        for (int i = 0; i < total; i++) {
            try {
                int m = new Random().nextInt(5);
                int n = new Random().nextInt(5);
                int result = m / n;
            } catch (ArithmeticException divisionByZero) {
                exceptionCount++;
            }
        }

        System.out.printf("Из %d операций деления %d было выполнено с ошибкой", total, exceptionCount);

    }

}
