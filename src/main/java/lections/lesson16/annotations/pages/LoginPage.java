package lections.lesson16.annotations.pages;

@Title("Страница входа")
public class LoginPage extends Page {

    @Name("Логин")
    private String login = "Логин1234";

    @Name("Пароль")
    private String password = "Пароль1234214";
}
