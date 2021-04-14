package homework_solution.lesson9.task4.distributors;

import java.util.List;

import homework_solution.lesson9.task4.cookers.Cooker;

public interface CookChooser {

    Cooker chooseCooker(List<Cooker> cookers);

}
