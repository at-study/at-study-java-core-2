package homework_solution.lesson8.task3;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Terminal> terminals = Arrays.asList(
                new QiwiTerminal("г. Москва, ул. Проходчиков, д.3"),
                new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2"),
                new EleksnetTerminal("г. Москва, ул. Бакунинская, д.1"),
                new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4"),
                new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15")
        );

        for (Terminal terminal : terminals) {
            terminal.pay("+7(910)000-0150", 50);
            terminal.pay("+7(910)000-0150", 150);
            terminal.pay("+7(910)000-0300", 300);
            terminal.pay("+7(910)000-0450", 450);
            terminal.pay("+7(910)000-0600", 600);
            terminal.pay("+7(910)000-0800", 800);
            terminal.pay("+7(910)000-1000", 1000);
            terminal.pay("+7(910)000-1500", 1500);
        }

    }
}
