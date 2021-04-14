package homework_solution.lesson8.task4;

import java.util.Arrays;
import java.util.List;

import homework_solution.lesson8.task4.entities.Account;
import homework_solution.lesson8.task4.entities.Branch;
import homework_solution.lesson8.task4.entities.Client;
import homework_solution.lesson8.task4.entities.Entity;
import homework_solution.lesson8.task4.entities.User;

public class Application {

    public static void main(String[] args) {
        // Создаем первого пользователя и валидируем
        Entity user = new User("Иванов Петр", "Программист");
        user.validate();
        // Создаем второго такого же пользователя и валидируем
        // Несмотря на то, что объект другой, uuid возвращается тот же.
        Entity user2 = new User("Иванов Петр", "Программист");
        user2.validate();

        // Создаем третьего пользователя с тем же общим значением name,
        // Но с другим уникальным полем. uuid другой, несмотря на то,
        // что ValidatorStub ничего не знает о реализациях абстрактного класса.
        Entity user3 = new User("Иванов Петр", "Тестировщик");
        user3.validate();

        Entity user4 = new User("Петров Иван", "Тестировщик");
        user4.validate();

        // Проведем аналогичные операции для остальных сущностей
        List<Entity> entities = Arrays.asList(
                new Account("Расчетный счет ФЛ", "40817810412345678901"),
                new Account("Расчетный счет ФЛ", "40817810412345678901"),
                new Account("Расчетный счет ФЛ-2", "40817810412345678901"),
                new Account("Расчетный счет ФЛ", "40817810400000000000"),

                new Branch("Операционный офис", "г. Москва"),
                new Branch("Операционный офис", "г. Москва"),
                new Branch("Операционный филиал", "г. Москва"),
                new Branch("Операционный офис", "г. Саратов"),

                new Client("ООО Рога и копыта", "г. Москва, ул. Миклухо-Маклая, д. 41"),
                new Client("ООО Рога и копыта", "г. Москва, ул. Миклухо-Маклая, д. 41"),
                new Client("ООО Рога и копыта", "г. Москва, ул. Проходчиков, д. 3"),
                new Client("ООО Зеркало", "г. Москва, ул. Миклухо-Маклая, д. 41")
        );

        for (Entity entity : entities)
            entity.validate();

    }
}
