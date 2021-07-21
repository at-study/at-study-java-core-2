package tests.homework_solutions.lesson14;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Person;

public class Task7 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

    @Test
    public void countAccounts() {
        long total = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .count();

        long checkingTotal = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("расчетный"))
                .count();

        long depositTotal = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("депозитный"))
                .count();

        long currentTotal = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("текущий"))
                .count();

        System.out.println(total);
        System.out.println(checkingTotal);
        System.out.println(depositTotal);
        System.out.println(currentTotal);

        Assertions.assertEquals(total, checkingTotal + currentTotal + depositTotal);
    }

}
