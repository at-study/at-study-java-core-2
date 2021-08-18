package tests.lesson15;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Account;
import homework_solution.lesson14.model.Card;
import homework_solution.lesson14.model.Passport;
import homework_solution.lesson14.model.Person;
import homework_solution.lesson14.model.Property;

import static java.time.format.DateTimeFormatter.ofPattern;

public class StreamApiTests {

    @Test
    public void testStreamApiMethods1() {
        List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");
        List<Person> limitedPersons = persons.stream()
                .limit(400)
                .skip(100)
                .collect(Collectors.toList());

        Assertions.assertEquals(300, limitedPersons.size());

        long petrovsCount = persons.stream()
                .filter(person -> "Петров".equals(person.getLastName()))
                .count();

        long noPropertiesCount = persons.stream()
                .filter(person -> person.getProperties().size() == 0)
                .peek(person -> System.out.printf("%s %s %s%n",
                        person.getLastName(), person.getFirstName(), person.getLastName()))
                .count();

        long propertiesCount = persons.stream()
                .flatMap(person -> person.getProperties().stream())
                .count();

        long propertiesCount2 = persons.stream()
                .map(person -> person.getProperties().size())
                .reduce((a, b) -> a + b)
                .get();

        List<Person> passportStartsOn50 = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getSeries().startsWith("50"))
                .collect(Collectors.toList());

        double dokukinaTotalPrice = persons.stream()
                .flatMap(p -> p.getProperties().stream())
                .filter(prop -> prop.getAddress().contains("Докукина"))
                .map(Property::getPrice)
                .reduce(Double::sum)
                .orElse(0d);

        Map<Passport, List<Property>> passportToProperties = persons.stream()
                .filter(p -> p.getPassport() != null)
                .collect(Collectors.toMap(
                        Person::getPassport,
                        Person::getProperties
                ));

        boolean isAnyPersonGreaterThan22M = persons.stream()
                .map(Person::getAccounts)
                .map(accounts -> accounts.stream()
                        .map(Account::getAccountBalance)
                        .reduce(Double::sum)
                        .orElse(0d))
                .anyMatch(dbl -> dbl > 22_000_000);

        List<Person> sortedByPassportPersons = persons.stream()
                .sorted((p1, p2) -> {
                            if (p1.getPassport() == null && p2.getPassport() == null) {
                                return 0;
                            }
                            if (p1.getPassport() == null) {
                                return -1;
                            }
                            if (p2.getPassport() == null) {
                                return 1;
                            }
                            return p1.getPassport().getSeries().equals(p2.getPassport().getSeries())
                                    ? p1.getPassport().getNumber().compareTo(p2.getPassport().getNumber())
                                    : p1.getPassport().getSeries().compareTo(p2.getPassport().getSeries());
                        }
                )
                .collect(Collectors.toList());

        Person earliestPassportPerson = persons.stream()
                .filter(p -> p.getPassport() != null)
                .min((p1, p2) -> {
                    LocalDate d1 = LocalDate.parse(p1.getPassport().getIssueDate(), ofPattern("dd.MM.yyyy"));
                    LocalDate d2 = LocalDate.parse(p2.getPassport().getIssueDate(), ofPattern("dd.MM.yyyy"));
                    return d1.compareTo(d2);
                })
                .orElseThrow(() -> new IllegalStateException("В потоке нет людей"));

        persons.stream()
                .flatMap(p -> p.getCards().stream())
                .filter(this::isCardActive)
                .forEach(card -> System.out.println(card.getCardNumber()));

        List<List<Property>> mappedList = persons.stream()
                .map(p -> p.getProperties())
                .collect(Collectors.toList());

        List<Property> flatMappedList = persons.stream()
                .flatMap(p -> p.getProperties().stream())
                .collect(Collectors.toList());

        List<Passport> passports = persons.stream()
                //    .map(person -> person.getPassport())
                .flatMap(person -> Stream.of(person.getPassport()))
                .collect(Collectors.toList());

        Property firstHigherThan8MProperty = persons.stream()
                .flatMap(p -> p.getProperties().stream())
                .filter(prop -> prop.getPrice() > 8_000_000)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Нет недвижимости стоимостью выше 8М"));

        persons.stream()
                .map(Person::getFirstName)
                .distinct()
                .forEach(System.out::println);

        System.out.println();
    }

    private boolean isCardActive(Card card) {
        if (Integer.parseInt(card.getEndDateYear()) > 21) {
            return true;
        }
        if (Integer.parseInt(card.getEndDateYear()) == 21 &&
                Integer.parseInt(card.getEndDateMonth()) > 8) {
            return true;
        }
        return false;
    }

}
