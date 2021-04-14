package homework_task.lesson14.model;

import java.util.Set;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Passport passport;
    private Set<Property> properties;
    private Set<Account> accounts;
    private Set<Card> cards;

    public Person() {
    }

    public Person(String lastName, String firstName, String patronymic, Passport passport, Set<Property> properties, Set<Account> accounts, Set<Card> cards) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.passport = passport;
        this.properties = properties;
        this.accounts = accounts;
        this.cards = cards;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Person setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public Person setPassport(Passport passport) {
        this.passport = passport;
        return this;
    }

    public Person setProperties(Set<Property> properties) {
        this.properties = properties;
        return this;
    }

    public Person setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
        return this;
    }

    public Person setCards(Set<Card> cards) {
        this.cards = cards;
        return this;
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

    public Set<Property> getProperties() {
        return properties;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public Set<Card> getCards() {
        return cards;
    }
}
