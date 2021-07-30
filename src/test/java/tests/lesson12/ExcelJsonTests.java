package tests.lesson12;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import lections.lesson11.Person;
import lections.lesson11.excel.Excel;

public class ExcelJsonTests {

    @Test
    public void excelToJsonTest() {
        List<Person> persons = Excel.getAllPersons("src/main/java/homework_task/lesson11/persons.xlsx");

        String json = new Gson().toJson(persons);
        System.out.println(json);
    }
}
