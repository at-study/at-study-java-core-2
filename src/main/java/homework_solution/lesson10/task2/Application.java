package homework_solution.lesson10.task2;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String> generatedContent = new ArrayList<>();

        for (int i = 0; i < Config.LINES_AMOUNT; i++) {
            generatedContent.add(StringHelper.generate());
        }

        FileHelper.write(generatedContent);
    }

}
