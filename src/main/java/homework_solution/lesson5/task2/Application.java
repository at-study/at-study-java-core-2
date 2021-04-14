package homework_solution.lesson5.task2;

public class Application {

    public static void main(String[] args) {
        Cat cat0 = new Cat("Кот0", 0);
        Cat cat1 = new Cat("Кот1", 1);
        Cat cat3 = new Cat("Кот3", 3);
        Cat cat4 = new Cat("Кот4", 4);
        Cat[] cats = {cat0, cat1, null, cat3, cat4};

        for (Cat currentCat : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", currentCat.getName(), currentCat.getAge());
            } catch (NullPointerException exception) {
                System.out.println("Возникла ошибка вывода информации: ссылка на null");
                break;
            }
        }
    }

}
