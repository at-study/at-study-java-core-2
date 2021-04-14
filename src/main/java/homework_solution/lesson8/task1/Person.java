package homework_solution.lesson8.task1;

import java.util.Objects;
import java.util.Random;

public class Person {
    private String lastName;
    private String firstName;

    public Person() {
        lastName = "Фамилия-" + (new Random().nextInt(20) + 1);
        firstName = "Имя-" + (new Random().nextInt(20) + 1);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!Objects.equals(lastName, person.lastName)) return false;
        return Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s, Имя: %s", lastName, firstName);
    }
}
