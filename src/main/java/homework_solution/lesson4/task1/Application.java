package homework_solution.lesson4.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException {
        Human human = new Human();

        human.setLastName("Иванов");
        human.setLastName("Ива");
        human.setLastName("Ив");
        human.setLastName("Ива5");
        human.setLastName("иванов");
        human.setLastName("Иваноff");
        human.setLastName("");

        human.setFirstName("Петр");
        human.setFirstName("Пет");
        human.setFirstName("Пе");
        human.setFirstName("Петр5");
        human.setFirstName("петр");
        human.setFirstName("Петr");
        human.setFirstName("");

        human.setBirthDate(sdf.parse("02.01.2020"));
        String today = sdf.format(new Date());
        human.setBirthDate(sdf.parse(today));
        String tomorrow = sdf.format(new Date(new Date().getTime() + 86_400_000L));
        human.setBirthDate(sdf.parse(tomorrow));
        human.setBirthDate(sdf.parse("02.01.2022"));

        String lastName = human.getLastName();
        String firstName = human.getFirstName();
        Date birthDate = human.getBirthDate();
    }

}
