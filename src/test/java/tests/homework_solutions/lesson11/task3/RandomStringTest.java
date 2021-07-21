package tests.homework_solutions.lesson11.task3;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import homework_solution.lesson11.task3.Generator;

public class RandomStringTest {

    final int ITERATIONS_AMOUNT = 10000;

    @Test
    @DisplayName("Тестирование генерации случайных строк")
    public void randomStringsTest() {
        for (int i = 0; i < ITERATIONS_AMOUNT; i++) {
            int from = new Random().nextInt(20);
            int to = new Random().nextInt(20) + 20;
            String randomString = Generator.randomString(from, to);

            Assertions.assertTrue(randomString.matches("^[A-Za-z]{0,40}$"));
        }
    }

}
