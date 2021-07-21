package lections.lesson11;

public class Human {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Passport passport;

    public Human(String lastName, String firstName, String patronymic, Passport passport) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.passport = passport;
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

    public Passport getPassport() {
        return passport;
    }

}
