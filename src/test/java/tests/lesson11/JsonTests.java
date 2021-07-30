package tests.lesson11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lections.lesson11.Human;
import lections.lesson11.Passport;
import lections.lesson11.Person;
import lections.lesson11.excel.Excel;
import lections.lesson11.json.JsonUtils;
import lections.lesson11.json.id.Id;

public class JsonTests {

    @Test
    public void serializationTest() {
        Passport passport = new Passport("1234", "567890");
        Human human = new Human("Иванов", "Владимир", "Петрович", passport);
        String json = JsonUtils.serialize(human);

        Assertions.assertEquals(
                "{\"lastName\":\"Иванов\",\"firstName\":\"Владимир\",\"patronymic\":\"Петрович\",\"passport\":{\"series\":\"1234\",\"number\":\"567890\",\"issueDate\":\"21.07.2021\"}}",
                json
        );
    }

    @Test
    public void deserializationTest() {
        String json = "{\"lastName\":\"Иванов\",\"firstName\":\"Владимир\",\"patronymic\":\"Петрович\",\"passport\":{\"series\":\"1234\",\"number\":\"567890\",\"issueDate\":\"21.07.2021\"}}";
        Human human = JsonUtils.deserialize(json, Human.class);

        Assertions.assertNotNull(human);
        Assertions.assertEquals("Иванов", human.getLastName());
        Assertions.assertEquals("Владимир", human.getFirstName());
        Assertions.assertEquals("Петрович", human.getPatronymic());
        Assertions.assertEquals("1234", human.getPassport().getSeries());
        Assertions.assertEquals("567890", human.getPassport().getNumber());
        Assertions.assertEquals(LocalDate.now(), human.getPassport().getIssueDate());
    }

    @Test
    public void personSerializationTest() {
        Person person = Excel.getThreeFirstPersons("src/main/java/homework_task/lesson11/persons.xlsx").get(0);
        String json = JsonUtils.serialize(person);
    }

    @Test
    public void personDeserializationTest() {
        String json = "{\n" +
                "\t\"lastName\": \"Иванов\",\n" +
                "\t\"firstName\": \"Владимир\",\n" +
                "\t\"patronymic\": \"Михайлович\",\n" +
                "\t\"birthDate\": \"14.01.1990\",\n" +
                "\t\"series\": \"4510\",\n" +
                "\t\"number\": \"155442\"\n" +
                "}";
        Person person = JsonUtils.deserialize(json, Person.class);

        Assertions.assertEquals("Иванов", person.getLastName());
        Assertions.assertEquals("Владимир", person.getFirstName());
        Assertions.assertEquals("Михайлович", person.getPatronymic());
        Assertions.assertEquals(
                LocalDate.of(1990, Month.JANUARY, 14),
                person.getBirthDate()
        );
        Assertions.assertEquals("4510", person.getSeries());
        Assertions.assertEquals("155442", person.getNumber());
    }

    @Test
    public void idDeserializationTest() throws IOException {
        final String PATH = "src/main/java/lections/lesson11/json/id/id.json";
        String content = String.join("", Files.readAllLines(Paths.get(PATH)));

        Id id = JsonUtils.deserialize(content, Id.class);

        Assertions.assertNotNull(id);
        Assertions.assertNotNull(id.getAddress());
        Assertions.assertNotNull(id.getPassport());

        Assertions.assertNull(id.getRegistration());

        Assertions.assertEquals("value1", id.getFirstName());

        Assertions.assertEquals("5400", id.getPassport().getSeria());
        Assertions.assertEquals("123000", id.getPassport().getNumber());

        Assertions.assertEquals("ул.Мясницкая", id.getAddress().getStreet());
        Assertions.assertEquals(15, id.getAddress().getHouseNumber());
        Assertions.assertEquals(268, id.getAddress().getFlatNumber());
    }
}
