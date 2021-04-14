package homework_solution.lesson9.task4.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import homework_solution.lesson9.task4.cookers.Cooker;
import homework_solution.lesson9.task4.food.Buckwheat;
import homework_solution.lesson9.task4.food.Coffee;
import homework_solution.lesson9.task4.food.Fish;
import homework_solution.lesson9.task4.food.Food;
import homework_solution.lesson9.task4.food.Meat;
import homework_solution.lesson9.task4.food.Rice;
import homework_solution.lesson9.task4.food.Tea;

public class Generator {

    public static List<Cooker> generateCookers(int amount) {
        List<Cooker> cookers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            cookers.add(new Cooker());
        }
        return cookers;
    }

    public static List<Food> generateFood(int amount) {
        List<Food> foods = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            foods.add(random());
        }
        return foods;
    }

    private static Food random() {
        switch (new Random().nextInt(6)) {
            case 0:
                return new Meat();
            case 1:
                return new Fish();
            case 2:
                return new Rice();
            case 3:
                return new Buckwheat();
            case 4:
                return new Coffee();
            case 5:
                return new Tea();
        }
        return null;
    }
}
