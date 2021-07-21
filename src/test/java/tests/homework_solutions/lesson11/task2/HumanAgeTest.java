package tests.homework_solutions.lesson11.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import homework_solution.lesson11.task2.Human;

public class HumanAgeTest {

    @Test
    @DisplayName("Тестирования корректного возраста 0")
    public void testHumanPositiveAge0() {
        Human human = new Human();
        human.setAge(0);

        Assertions.assertEquals(0, human.getAge());
    }

    @Test
    @DisplayName("Тестирования корректного возраста 60")
    public void testHumanPositiveAge60() {
        Human human = new Human();
        human.setAge(60);

        Assertions.assertEquals(60, human.getAge());
    }

    @Test
    @DisplayName("Тестирования корректного возраста 120")
    public void testHumanPositiveAge120() {
        Human human = new Human();
        human.setAge(120);

        Assertions.assertEquals(120, human.getAge());
    }

    @Test
    @DisplayName("Тестирования некорректного возраста -1")
    public void testHumanNegativeAgeMinus1() {
        Human human = new Human();
        try {
            human.setAge(-1);
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            Assertions.assertEquals("Некорректный возраст: -1", exception.getMessage());
        }

        Assertions.assertEquals(0, human.getAge());
    }

    @Test
    @DisplayName("Тестирования некорректного возраста 121")
    public void testHumanNegativeAge121() {
        Human human = new Human();
        try {
            human.setAge(121);
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            Assertions.assertEquals("Некорректный возраст: 121", exception.getMessage());
        }

        Assertions.assertEquals(0, human.getAge());
    }

}
