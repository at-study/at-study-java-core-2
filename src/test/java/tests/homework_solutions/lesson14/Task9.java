package tests.homework_solutions.lesson14;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Account;
import homework_solution.lesson14.model.Person;

public class Task9 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

    @Test
    public void countCards() {
        long accountCount = persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .filter(person -> person.getAccounts().stream()
                        .map(Account::getAccountBalance)
                        .reduce((bal1, bal2) -> bal1 + bal2)
                        .get() > 20_000_000d)
                .count();

        long propertiesCount = persons.stream()
                .filter(person -> !person.getProperties().isEmpty())
                .filter(person -> person.getProperties().stream()
                        .map(property -> property.getPrice())
                        .reduce((price1, price2) -> price1 + price2)
                        .get() > 26_000_000d)
                .count();
        System.out.println(accountCount);
        System.out.println(propertiesCount);

        Assertions.assertEquals(accountCount, propertiesCount);

    }


}
