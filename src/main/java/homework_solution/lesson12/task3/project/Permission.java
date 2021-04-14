package homework_solution.lesson12.task3.project;

import java.util.Objects;

public class Permission {
    private Integer id;
    private String name;

    public Permission setId(Integer id) {
        this.id = id;
        return this;
    }

    public Permission setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Permission that = (Permission) o;

        if (!Objects.equals(id, that.id)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
