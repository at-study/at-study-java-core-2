package lections.lesson11;

import java.time.LocalDate;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private LocalDate birthDate;
    private String series;
    private String number;

    public Person(String lastName, String firstName, String patronymic, LocalDate birthDate, String series, String number) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.series = series;
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }
}
