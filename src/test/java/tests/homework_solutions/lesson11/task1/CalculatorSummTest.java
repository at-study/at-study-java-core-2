package tests.homework_solutions.lesson11.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import homework_solution.lesson11.task1.Calculator;

public class CalculatorSummTest {

    @Test
    @DisplayName("Проверка метода суммирования с 2 числами")
    public void testSumm2() {
        int value1 = 5;
        int value2 = 3;

        int result = Calculator.calculateAll(value1, value2);
        Assertions.assertEquals(8, result);
    }

    @Test
    @DisplayName("Проверка метода суммирования с 6 числами")
    public void testSumm6() {
        int[] values = {1, 2, 3, 4, 5, 6};
        int result = Calculator.calculateAll(values);

        Assertions.assertEquals(21, result);
    }

}
