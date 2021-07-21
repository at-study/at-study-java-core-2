package tests.homework_solutions.lesson11.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import homework_solution.lesson11.task2.Human;

public class HumanNameTest {

    @Test
    @DisplayName("Тестирования корректного имени")
    public void testHumanPositiveName() {
        Human human = new Human();
        human.setName("Иван");

        Assertions.assertEquals("Иван", human.getName());
    }

    @Test
    @DisplayName("Тестирования невалидного имени Ив")
    public void testHumanNegativeName1() {
        Human human = new Human();
        try {
            human.setName("Ив");
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            Assertions.assertEquals("Некорректное имя: Ив", exception.getMessage());
        }

        Assertions.assertNull(human.getName());
    }

    @Test
    @DisplayName("Тестирования невалидного имени Ивансдлиннымименем")
    public void testHumanNegativeName2() {
        Human human = new Human();
        try {
            human.setName("Ивансдлиннымименем");
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            Assertions.assertEquals("Некорректное имя: Ивансдлиннымименем", exception.getMessage());
        }

        Assertions.assertNull(human.getName());
    }

    @Test
    @DisplayName("Тестирования невалидного имени Иван5аа")
    public void testHumanNegativeName3() {
        Human human = new Human();
        try {
            human.setName("Иван5аа");
            Assertions.fail("Должно быть исключение IllegalArgumentException");
        } catch (IllegalArgumentException exception) {
            Assertions.assertEquals("Некорректное имя: Иван5аа", exception.getMessage());
        }

        Assertions.assertNull(human.getName());
    }

}
