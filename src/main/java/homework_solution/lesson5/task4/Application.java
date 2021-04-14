package homework_solution.lesson5.task4;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        int index = 0;

        while (index < cats.length) {
            try {
                cats[index] = new Cat("Созданный кот", new Random().nextInt(100) - 50);
            } catch (AgeTooHighException exception) {
                cats[index] = null;
                System.out.println("Слишком большой возраст для кота");
            } finally {
                index++;
            }
        }

        System.out.println("--- Полученный массив: ---");
        for (Cat cat : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", cat.getName(), cat.getAge());
            } catch (NullPointerException npe) {
                System.out.println("Ошибка вывода данных");
            }
        }
    }

}
