package homework_solution.lesson6.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            String lastName = NameGenerator.generate();
            String firstName = NameGenerator.generate();
            int age = AgeGenerator.generate();
            String phone = PhoneGenerator.generate();
            Human human = new Human(lastName, firstName, age, phone);
            humans.add(human);
        }

        for (Human human : humans) {
            System.out.println(human.getLastName().length());
            if (human.getAge() == 35)
                System.out.printf("%s %s, возраст %d, тел. %s%n", human.getLastName(), human.getFirstName(), human.getAge(), human.getPhone());
        }
    }

}
