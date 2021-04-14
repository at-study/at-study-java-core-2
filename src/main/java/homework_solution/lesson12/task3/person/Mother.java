package homework_solution.lesson12.task3.person;

import java.util.Objects;

public class Mother {
    private String name;
    private Integer age;

    public Mother setName(String name) {
        this.name = name;
        return this;
    }

    public Mother setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mother mother = (Mother) o;

        if (!Objects.equals(name, mother.name)) return false;
        return Objects.equals(age, mother.age);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
