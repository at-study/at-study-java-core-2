package tests.lesson11;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lections.lesson11.Person;
import lections.lesson11.excel.Excel;

public class PersonExcelTests {
    private final String PATH = "src/main/java/homework_task/lesson11/persons.xlsx";

    @Test
    public void testExcelPersonRead() {
        List<Person> excelPersons = Excel.getThreeFirstPersons(PATH);

        Assertions.assertEquals(3, excelPersons.size());

        Assertions.assertEquals("Иванов", excelPersons.get(0).getLastName());
        Assertions.assertEquals("Владимир", excelPersons.get(0).getFirstName());
        Assertions.assertEquals("Михайлович", excelPersons.get(0).getPatronymic());
        Assertions.assertEquals(
                LocalDate.of(1990, Month.JANUARY, 14),
                excelPersons.get(0).getBirthDate()
        );
        Assertions.assertEquals("4510", excelPersons.get(0).getSeries());
        Assertions.assertEquals("155442", excelPersons.get(0).getNumber());
    }
}
