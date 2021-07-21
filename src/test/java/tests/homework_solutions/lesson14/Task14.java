package tests.homework_solutions.lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.Test;

import homework_solution.lesson14.model.Person;
import homework_task.lesson14.helpers.PersonFilterHelper;

public class Task14 {

    @Test
    public void printSortedPropertyInfo() {
        List<Person> persons = PersonFilterHelper.getFilteredPersons();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        persons.stream()
                .sorted((p1, p2) -> {
                    String passportDate1 = p1.getPassport().getIssueDate();
                    String passportDate2 = p2.getPassport().getIssueDate();
                    try {
                        return sdf.parse(passportDate1).compareTo(sdf.parse(passportDate2));
                    } catch (ParseException e) {
                        throw new RuntimeException();
                    }
                })
                .forEach(person -> System.out.printf("ФИО: %s %s %s, Паспорт: %s %s, Выдан: %s %s%n",
                        person.getLastName(), person.getFirstName(), person.getPatronymic(),
                        person.getPassport().getSeries(), person.getPassport().getNumber(),
                        person.getPassport().getIssueDate(), person.getPassport().getIssuer())
                );

    }

}
