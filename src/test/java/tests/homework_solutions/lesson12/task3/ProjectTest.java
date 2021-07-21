package tests.homework_solutions.lesson12.task3;

import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import homework_solution.lesson12.task3.FileHelper;
import homework_solution.lesson12.task3.project.Permission;
import homework_solution.lesson12.task3.project.Project;

public class ProjectTest {

    private final String PATH = "src\\main\\java\\homework_task\\lesson12\\task3\\project.json";

    @Test
    @DisplayName("Проверка правильности составления модельных классов project")
    void testProjectDeserialization() throws IOException {
        FileHelper<Project> helper = new FileHelper<>();
        Project project = helper.getObjectFromJsonInFile(PATH, Project.class);

        Project expectedParentProject = new Project()
                .setId(19).setStartDate("2020-05-14").setEndDate("2021-10-01")
                .setName("automation")
                .setChildIds(Arrays.asList(154,157,192,198))
                .setPermissions(Arrays.asList(
                        new Permission().setId(17).setName("Обновление данных"),
                        new Permission().setId(18).setName("Создание данных"),
                        new Permission().setId(19).setName("Удаление данных")
                ));
        Project expectedProject = new Project()
                .setId(154).setStartDate("2020-07-14").setEndDate("2020-10-01")
                .setName("automation_current")
                .setChildIds(Arrays.asList(157,192,198))
                .setPermissions(Arrays.asList(
                        new Permission().setId(17).setName("Обновление данных"),
                        new Permission().setId(18).setName("Создание данных"),
                        new Permission().setId(19).setName("Удаление данных")
                ))
                .setParentProject(expectedParentProject);

        Assertions.assertEquals(expectedParentProject, project.getParentProject());
        Assertions.assertEquals(expectedProject, project);
    }
}
