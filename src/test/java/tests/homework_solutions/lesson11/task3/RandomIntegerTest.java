package tests.homework_solutions.lesson11.task3;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import homework_solution.lesson11.task3.Generator;

public class RandomIntegerTest {
    final int ITERATIONS_AMOUNT = 10000;

    @Test
    @DisplayName("Тестирование генерации случайных чисел")
    public void randomNumberTest() {
        for (int i = 0; i < ITERATIONS_AMOUNT; i++) {
            int from = new Random().nextInt(1000);
            int to = new Random().nextInt(1000) + 1000;
            int random = Generator.randomInteger(from, to);

            Assertions.assertEquals(1000, random, 1000);
        }
    }



}
