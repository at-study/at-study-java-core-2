package tests.homework_solutions.lesson12.task3;

import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import homework_solution.lesson12.task3.FileHelper;
import homework_solution.lesson12.task3.person.Mother;
import homework_solution.lesson12.task3.person.Person;

public class PersonTest {
    private final String PATH = "src\\main\\java\\homework_task\\lesson12\\task3\\person.json";

    @Test
    @DisplayName("Проверка правильности составления модельных классов person")
    void testPersonDeserialization() throws IOException {
        FileHelper<Person> helper = new FileHelper<>();
        Person person = helper.getObjectFromJsonInFile(PATH, Person.class);

        Person expectedPerson = new Person()
                .setName("Иван")
                .setAge(37)
                .setMother(new Mother().setName("Ольга").setAge(58))
                .setChildren(Arrays.asList("Маша", "Игорь", "Таня"))
                .setMarried(true);

        Assertions.assertEquals(expectedPerson, person);
    }
}
