package homework_solution.lesson12.task3.person;

import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private Mother mother;
    private List<String> children;
    private Boolean married;
    private Object dog;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Person setMother(Mother mother) {
        this.mother = mother;
        return this;
    }

    public Person setChildren(List<String> children) {
        this.children = children;
        return this;
    }

    public Person setMarried(Boolean married) {
        this.married = married;
        return this;
    }

    public Person setDog(Object dog) {
        this.dog = dog;
        return this;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Mother getMother() {
        return mother;
    }

    public List<String> getChildren() {
        return children;
    }

    public Boolean getMarried() {
        return married;
    }

    public Object getDog() {
        return dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!Objects.equals(name, person.name)) return false;
        if (!Objects.equals(age, person.age)) return false;
        if (!Objects.equals(mother, person.mother)) return false;
        if (!Objects.equals(children, person.children)) return false;
        if (!Objects.equals(married, person.married)) return false;
        return Objects.equals(dog, person.dog);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (mother != null ? mother.hashCode() : 0);
        result = 31 * result + (children != null ? children.hashCode() : 0);
        result = 31 * result + (married != null ? married.hashCode() : 0);
        result = 31 * result + (dog != null ? dog.hashCode() : 0);
        return result;
    }
}
