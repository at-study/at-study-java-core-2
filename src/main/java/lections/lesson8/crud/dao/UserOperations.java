package lections.lesson8.crud.dao;

import java.util.Collections;
import java.util.List;

import lections.lesson8.crud.dao.crud.Crud;
import lections.lesson8.crud.model.User;

public class UserOperations implements Crud<User> {

    @Override
    public void delete(int id) {
        String query = "DELETE FROM users WHERE id = " + id;
        // Выполнение запроса
    }

    @Override
    public void create(User user) {
        String query = "INSERT INTO users VALUES ......";
        // Выполнение запроса
    }

    @Override
    public void update(int id, User user) {
        String query = "UPDATE ..... WHERE id = " + id;
        // Выполнение запроса
    }

    @Override
    public List<User> get() {
        String query = "SELECT * FROM users";
        // Обработка результатов
        // TODO: Переделать после выполнения задачи
        return Collections.emptyList();
    }

    @Override
    public User get(int id) {
        String query = "SELECT * FROM users WHERE id = " + id;
        // Обработка результата
        return new User();
    }
}
