package homework_solution.lesson3.task5;

import java.util.Random;

public class Names {
    static final String[] HUMAN_NAMES = {"Сергей", "Владимир", "Елена", "Екатерина", "Любовь"};
    static final String[] CAT_NAMES = {"Мурзик", "Барсик", "Леопольд"};
    static final String[] DOG_NAMES = {"Шарик", "Бобик", "Тузик"};

    static String getRandomHumanName() {
        return HUMAN_NAMES[new Random().nextInt(HUMAN_NAMES.length)];
    }

    static String getRandomCatName() {
        return CAT_NAMES[new Random().nextInt(CAT_NAMES.length)];
    }

    static String getRandomDogName() {
        return DOG_NAMES[new Random().nextInt(DOG_NAMES.length)];
    }
}
