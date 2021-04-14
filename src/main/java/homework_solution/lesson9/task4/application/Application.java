package homework_solution.lesson9.task4.application;

import java.util.List;
import java.util.Random;

import homework_solution.lesson9.task4.cookers.Cooker;
import homework_solution.lesson9.task4.distributors.BusyTimeDistributor;
import homework_solution.lesson9.task4.distributors.Distributor;
import homework_solution.lesson9.task4.distributors.RoundRobinDistributor;
import homework_solution.lesson9.task4.food.Food;

public class Application {

    private static final int COOKERS_AMOUNT = new Random().nextInt(6) + 5;
    private static final int FOOD_AMOUNT = 100;

    public static void main(String[] args) {

        List<Cooker> cookers = Generator.generateCookers(COOKERS_AMOUNT);
        List<Food> foods = Generator.generateFood(FOOD_AMOUNT);

        Distributor roundRobinDistributor = new RoundRobinDistributor();
        Distributor busyTimeDistributor = new BusyTimeDistributor();

        for (Food food : foods) {
            roundRobinDistributor.addFood(food, cookers);
        }

        int maxTime = 0;
        for (Cooker cooker : cookers) {
            if (maxTime < cooker.getTotalTime())
                maxTime = cooker.getTotalTime();
        }
        System.out.println("Суммарное время приготовления блюд поварами (Round Robin): " + maxTime);

        for (Cooker cooker : cookers)
            cooker.clear();

        for (Food food : foods) {
            busyTimeDistributor.addFood(food, cookers);
        }

        maxTime = 0;
        for (Cooker cooker : cookers) {
            if (maxTime < cooker.getTotalTime())
                maxTime = cooker.getTotalTime();
        }
        System.out.println("Суммарное время приготовления блюд поварами (Busy Time): " + maxTime);

    }

}
