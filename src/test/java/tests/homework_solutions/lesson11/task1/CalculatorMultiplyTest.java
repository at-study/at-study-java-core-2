package tests.homework_solutions.lesson11.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import homework_solution.lesson11.task1.Calculator;

public class CalculatorMultiplyTest {

    @Test
    @DisplayName("Проверка метода произведения двух чисел")
    public void testMultiply2() {
        int value1 = 3;
        int value2 = 2;

        int result = Calculator.multiplyAll(value1, value2);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Проверка метода произведения шести чисел")
    public void testMultiply6() {
        int[] values = {1, 2, 3, 4, 5, 6};

        int result = Calculator.multiplyAll(values);
        Assertions.assertEquals(720, result);
    }

}
