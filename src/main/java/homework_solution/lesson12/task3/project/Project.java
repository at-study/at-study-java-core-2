package homework_solution.lesson12.task3.project;

import java.util.List;
import java.util.Objects;

public class Project {
    private Integer id;
    private String startDate;
    private String endDate;
    private String name;
    private List<Integer> childIds;
    private List<Permission> permissions;
    private Project parentProject;

    public Project setId(Integer id) {
        this.id = id;
        return this;
    }

    public Project setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public Project setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public Project setChildIds(List<Integer> childIds) {
        this.childIds = childIds;
        return this;
    }

    public Project setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public Project setParentProject(Project parentProject) {
        this.parentProject = parentProject;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getChildIds() {
        return childIds;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public Project getParentProject() {
        return parentProject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (!Objects.equals(id, project.id)) return false;
        if (!Objects.equals(startDate, project.startDate)) return false;
        if (!Objects.equals(endDate, project.endDate)) return false;
        if (!Objects.equals(name, project.name)) return false;
        if (!Objects.equals(childIds, project.childIds)) return false;
        if (!Objects.equals(permissions, project.permissions)) return false;
        return Objects.equals(parentProject, project.parentProject);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (childIds != null ? childIds.hashCode() : 0);
        result = 31 * result + (permissions != null ? permissions.hashCode() : 0);
        result = 31 * result + (parentProject != null ? parentProject.hashCode() : 0);
        return result;
    }
}
