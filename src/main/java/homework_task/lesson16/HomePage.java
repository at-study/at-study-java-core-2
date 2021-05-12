package homework_task.lesson16;

@Name("Домашняя страница")
class HomePage extends AbstractPage {

    @Name("Вход")
    private Element enter;

    @Name("Войти")
    private String enter(String login, String password) {
        return String.format("Попытка войти с логином %s и паролем %s", login, password);
    }

    private HomePage() {
        System.out.println("Created HomePage object without parameters");
    }

    private HomePage(Integer parameter) {
        System.out.println("Created HomePage object with parameter: " + parameter);
    }
}
