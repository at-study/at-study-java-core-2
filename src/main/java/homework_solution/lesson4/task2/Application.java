package homework_solution.lesson4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException, IOException {
        Human[] humans = new Human[2];
        int index = 0;

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку в формате [%s %s %s]:");
            String input = reader.readLine();

            boolean inputValid = Validator.validateInputStringFormat(input);
            if (!inputValid) continue;

            String[] humanFields = Validator.split(input);

            Human human = new Human();
            human.setLastName(humanFields[0]);
            human.setFirstName(humanFields[1]);
            human.setBirthDate(sdf.parse(humanFields[2]));

            boolean isHumanValid = Validator.validateHuman(human);
            if (!isHumanValid) continue;

            humans[index++] = human;

            boolean isArrayFull = Validator.validateHumanArray(humans);
            if (isArrayFull) break;
        }
    }
}
