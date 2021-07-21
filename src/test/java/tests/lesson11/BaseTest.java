package tests.lesson11;

import org.junit.jupiter.api.BeforeEach;

import homework_solution.lesson3.task1.Calculator;

public class BaseTest {
    protected Calculator calculator;

    @BeforeEach
    public void prepareFixture() {
        calculator = new Calculator();
    }
}
