package lections.lesson9.to_string;

import java.util.Set;
import java.util.TreeSet;

public class HumanApplication {

    public static void main(String[] args) {
        Human human = new Human("Иванов", "Сергей", "Петрович");
        Human human2 = new Human("Васильев", "Петр", "Анатольевич");

        Set<Human> humans = new TreeSet<>();
        humans.add(new Human("Иванов", "Сергей", "Петрович"));
        humans.add(new Human("Иванов", "Андрей", "Михайлович"));
        humans.add(new Human("Иванов", "Владимир", "Петрович"));
        humans.add(new Human("Иванов", "Сергей", "Павлович"));
        humans.add(new Human("Петров", "Иван", "Владимирович"));
        humans.add(new Human("Сидоров", "Валентин", "Михайлович"));
        humans.add(new Human("Васильев", "Владислав", "Петрович"));
        System.out.println(humans);
    }

}
