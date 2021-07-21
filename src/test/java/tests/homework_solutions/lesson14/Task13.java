package tests.homework_solutions.lesson14;

import java.util.List;

import org.junit.jupiter.api.Test;

import homework_solution.lesson14.model.Person;
import homework_task.lesson14.helpers.PersonFilterHelper;

public class Task13 {

    @Test
    public void printByPassportSorted() {
        List<Person> persons = PersonFilterHelper.getFilteredPersons();

        persons.stream()
                .sorted((p1, p2) -> {
                    if (!p1.getPassport().getSeries().equals(p2.getPassport().getSeries()))
                        return p1.getPassport().getSeries().compareTo(p2.getPassport().getSeries());
                    return p1.getPassport().getNumber().compareTo(p2.getPassport().getNumber());
                })
                .forEach(person -> System.out.printf("ФИО: %s %s %s, Паспорт: %s %s, Количество объектов недвижимости: %d%n",
                        person.getLastName(), person.getFirstName(), person.getPatronymic(),
                        person.getPassport().getSeries(), person.getPassport().getNumber(),
                        person.getProperties().size()));
    }

}
