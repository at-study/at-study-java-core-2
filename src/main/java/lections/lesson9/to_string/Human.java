package lections.lesson9.to_string;

public class Human implements ToJson, Comparable<Human> {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Human(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    @Override
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{")
                .append("\"lastName\": \"").append(lastName).append("\", ")
                .append("\"firstName\": \"").append(firstName).append("\", ")
                .append("\"patronymic\": \"").append(patronymic).append("\"")
                .append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        return toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Human human = (Human) o;

        if (lastName != null ? !lastName.equals(human.lastName) : human.lastName != null) {
            return false;
        }
        if (firstName != null ? !firstName.equals(human.firstName) : human.firstName != null) {
            return false;
        }
        return patronymic != null ? patronymic.equals(human.patronymic) : human.patronymic == null;
    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Human o) {
        if (!this.lastName.equals(o.lastName)) {
            return this.lastName.compareTo(o.lastName);
        }
        if (!this.firstName.equals(o.firstName)) {
            return this.firstName.compareTo(o.firstName);
        }
        if (!this.patronymic.equals(o.patronymic)) {
            return this.patronymic.compareTo(o.patronymic);
        }
        return 0;
    }
}
